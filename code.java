import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageResizeApp extends JFrame {
    private JLabel imageLabel;
    private BufferedImage image;

    public ImageResizeApp() {
        setTitle("Image Resizer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        imageLabel = new JLabel();
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        imageLabel.setPreferredSize(new Dimension(400, 300));
        imageLabel.setDropTarget(new DropTarget() {
            public synchronized void drop(DropTargetDropEvent evt) {
                try {
                    evt.acceptDrop(DnDConstants.ACTION_COPY);
                    java.util.List<File> droppedFiles = (java.util.List<File>) evt.getTransferable()
                            .getTransferData(DataFlavor.javaFileListFlavor);
                    if (droppedFiles.size() > 0) {
                        File file = droppedFiles.get(0);
                        loadImage(file);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton exportButton = new JButton("Export Image");
        exportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exportImage();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(exportButton);

        add(imageLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void loadImage(File file) {
        try {
            image = ImageIO.read(file);
            displayImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayImage() {
        ImageIcon icon = new ImageIcon(image);
        imageLabel.setIcon(icon);
    }

    private void exportImage() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File outputFile = fileChooser.getSelectedFile();
            try {
                ImageIO.write(image, "png", outputFile); // Change "png" to desired format
                JOptionPane.showMessageDialog(this, "Image exported successfully!");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error exporting image.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ImageResizeApp();
            }
        });
    }
}

