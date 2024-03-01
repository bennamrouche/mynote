use sql11687585;

drop `user`;
 
CREATE TABLE `user` (
    userName VARCHAR(25) PRIMARY KEY,
    firstName VARCHAR(25),
    lastName VARCHAR(25),
    password VARCHAR(25),
    avatarNo INT,
    email VARCHAR(50), 
    gender ENUM('M', 'F')
);

CREATE TABLE `note` (
    userName VARCHAR(25), 
    noteId   VARCHAR(25),
    title  VARCHAR(255),
   	content  TEXT,
    create_at  timestamp,
     CONSTRAINT  FOREIGN KEY (userName) REFERENCES user(userName)
)

CREATE TABLE login (
    UserName VARCHAR(25),
    time TIMESTAMP,
    ip VARCHAR(25),
    platform VARCHAR(30),
    session_id VARCHAR(255),
    CONSTRAINT fk_userName FOREIGN KEY (UserName) REFERENCES `user`(userName)
);


-- Inserting data into the `user` table
INSERT INTO `user` (userName, firstName, lastName, password, avatarNo, email, gender) VALUES
('john_doe', 'John', 'Doe', 'password123', 1, 'john@example.com', 'M'),
('jane_smith', 'Jane', 'Smith', 'secret456', 2, 'jane@example.com', 'F');

-- Inserting data into the `note` table
INSERT INTO `note` (userName, noteId, title, content, create_at) VALUES
('john_doe', 'note1', 'Meeting Notes', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.', CURRENT_TIMESTAMP),
('john_doe', 'note2', 'To-Do List', '1. Finish project\n2. Send email to client', CURRENT_TIMESTAMP),
('jane_smith', 'note3', 'Recipe', 'Ingredients:\n- Eggs\n- Milk\n- Flour\nInstructions:...', CURRENT_TIMESTAMP);

-- Inserting data into the `login` table
INSERT INTO `login` (UserName, time, ip, platform, session_id) VALUES
('john_doe', '2024-02-29 10:15:00', '192.168.1.100', 'Windows', 'abc123xyz'),
('jane_smith', '2024-02-29 08:30:00', '10.0.0.2', 'Linux', 'def456uvw');






-- Inserting more data into the `user` table
INSERT INTO `user` (userName, firstName, lastName, password, avatarNo, email, gender) VALUES
('michael_johnson', 'Michael', 'Johnson', 'pass123', 3, 'michael@example.com', 'M'),
('sarah_miller', 'Sarah', 'Miller', 'sarahpass', 4, 'sarah@example.com', 'F');

-- Inserting more data into the `note` table
INSERT INTO `note` (userName, noteId, title, content, create_at) VALUES
('michael_johnson', 'note4', 'Project Update', 'Progress report for Q1 project...', CURRENT_TIMESTAMP),
('sarah_miller', 'note5', 'Shopping List', '1. Milk\n2. Bread\n3. Eggs', CURRENT_TIMESTAMP),
('sarah_miller', 'note6', 'Travel Plans', 'Booking flights and accommodations...', CURRENT_TIMESTAMP);

-- Inserting more data into the `login` table
INSERT INTO `login` (UserName, time, ip, platform, session_id) VALUES
('michael_johnson', '2024-02-28 15:45:00', '172.16.0.1', 'MacOS', 'ghi789abc'),
('sarah_miller', '2024-02-28 12:00:00', '192.168.0.100', 'iOS', 'jkl012def');