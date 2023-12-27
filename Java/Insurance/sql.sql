CREATE DATABASE entity;
use entity;
CREATE TABLE User (
    userId INT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);

CREATE TABLE Client (
    clientId INT PRIMARY KEY,
    clientName VARCHAR(255) NOT NULL,
    contactInfo VARCHAR(255),
    policy VARCHAR(255) NOT NULL
);

CREATE TABLE Claim (
    claimId INT PRIMARY KEY,
    claimNumber VARCHAR(50) NOT NULL,
    dateFiled DATE,
    claimAmount DECIMAL(10, 2),
    status VARCHAR(50),
    policy VARCHAR(255) NOT NULL,
    client INT,
    FOREIGN KEY (client) REFERENCES Client(clientId)
);

CREATE TABLE Payment (
    paymentId INT PRIMARY KEY,
    paymentDate DATE,
    paymentAmount DECIMAL(10, 2),
    client INT,
    FOREIGN KEY (client) REFERENCES Client(clientId)
);

-- Policy Table
CREATE TABLE Policy (
    policyId INT PRIMARY KEY,
    policyName VARCHAR(255),
    policyType VARCHAR(255),
    coverageAmount DECIMAL(10, 2)
);

SHOW TABLES FROM entity;

INSERT INTO User (userId, username, password, role) 
VALUES (1, 'john_doe', 'pass123', 'admin');
INSERT INTO User (userId, username, password, role) 
VALUES (2, 'jane_smith', 'hello@123', 'user');

INSERT INTO Client (clientId, clientName, contactInfo, policy) 
VALUES (1, 'Stake', '9837458934', 'Policy123');
INSERT INTO Client (clientId, clientName, contactInfo, policy) 
VALUES (2, 'Santa', '9807654366', 'Policy456');

INSERT INTO Claim (claimId, claimNumber, dateFiled, claimAmount, status, policy, client) 
VALUES (1, 'CLM001', '2023-01-15', 5000.00, 'Pending', 'Policy123', 1);
INSERT INTO Claim (claimId, claimNumber, dateFiled, claimAmount, status, policy, client) 
VALUES (2, 'CLM002', '2023-02-20', 8000.00, 'Approved', 'Policy456', 2);

INSERT INTO Payment (paymentId, paymentDate, paymentAmount, client) 
VALUES (1, '2023-03-10', 1500.00, 1);
INSERT INTO Payment (paymentId, paymentDate, paymentAmount, client) 
VALUES (2, '2023-04-05', 2000.00, 2);

INSERT INTO Policy (policyId, policyName, policyType, coverageAmount) 
VALUES 
    (1, 'Policy A', 'Type 1', 10000.00),
    (2, 'Policy B', 'Type 2', 15000.50),
    (3, 'Policy C', 'Type 1', 20000.75);


