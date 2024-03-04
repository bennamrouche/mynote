/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mynote.gui;

import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.BoxLayout;

/**
 *
 * @author ebennamr
 */
public class notePanel extends javax.swing.JPanel implements 
        ComponentListener{

    /**
     * Creates new form notePanel
     */
    public notePanel() {
        initComponents();
        addComponentListener(this);
   
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitle = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        lblView = new javax.swing.JLabel();
        lblDelete = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(89, 180, 195)));
        setForeground(new java.awt.Color(239, 243, 150));
        setMaximumSize(new java.awt.Dimension(32767, 40));
        setMinimumSize(new java.awt.Dimension(0, 40));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(400, 40));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        txtTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(0, 0, 153));
        txtTitle.setText("How to Hack nasa");
        add(txtTitle);

        txtDate.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        txtDate.setForeground(new java.awt.Color(0, 0, 153));
        txtDate.setText("2024-2537");
        add(txtDate);

        lblView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/view.png"))); // NOI18N
        add(lblView);

        lblDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/delete.png"))); // NOI18N
        add(lblDelete);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblView;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables

    @Override
    public void componentResized(ComponentEvent e) 
    {

        int width = (getWidth() - 80) / 2;
        if (width < 100)
             return;
        txtDate.setSize(width, txtDate.getHeight());
        txtDate.setMinimumSize(new Dimension(width, txtDate.getMaximumSize().height));
        txtDate.setMaximumSize(new Dimension(width, txtDate.getMaximumSize().height));
        
        txtTitle.setSize(width, txtTitle.getHeight());
        txtTitle.setMinimumSize(new Dimension(width, txtTitle.getMaximumSize().height));
        txtTitle.setMaximumSize(new Dimension(width, txtTitle.getMaximumSize().height));
     
                System.err.println("resize Component ***");
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        
    }

    @Override
    public void componentShown(ComponentEvent e) {
      
    }

    @Override
    public void componentHidden(ComponentEvent e) {
       
    }
}