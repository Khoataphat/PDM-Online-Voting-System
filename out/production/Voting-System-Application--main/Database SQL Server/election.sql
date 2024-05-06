Use OnlineVoting
CREATE TABLE elections (
    ElectionID INT IDENTITY(1,1) PRIMARY KEY,
    ElectionName VARCHAR(100) NOT NULL,
    ElectionType VARCHAR(50),
    ElectionDate DATE,
    ElectionStatus VARCHAR(20) DEFAULT 'Upcoming'
);