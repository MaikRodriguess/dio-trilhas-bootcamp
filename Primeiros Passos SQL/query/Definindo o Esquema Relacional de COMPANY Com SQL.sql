CREATE SCHEMA IF NOT EXISTS company;
USE company;

CREATE TABLE employee(
	Fname VARCHAR(15) NOT NULL,
    Minit char,
    Lname VARCHAR(15) NOT NULL,
    Ssn char(9) NOT NULL,
    Bdate DATE,
    Address VARCHAR(30),
    Sex CHAR,
    Salary DECIMAL(10,2),
    Super_ssn char(9),
    Dno INT NOT NULL,
    PRIMARY KEY (Ssn)    
);
CREATE TABLE departament(
	Dname VARCHAR(15) NOT NULL,
    Dnumber INT NOT NULL,
    Mgr_ssn CHAR(9),
    Mgr_start_date DATE,
    PRIMARY KEY (Dnumber),
    UNIQUE (Dname),
    FOREIGN KEY (Mgr_ssn) REFERENCES employee(Ssn)
);

CREATE TABLE dept_locations(
	Dnumber INT NOT NULL,
    Dlocation VARCHAR(15) NOT NULL,
    PRIMARY KEY (Dnumber, Dlocation),
    FOREIGN KEY (Dnumber) REFERENCES departament(Dnumber) 
);
DESC project;
DELETE FROM project where Pnumber IS NULL;

CREATE TABLE project(
	Pname VARCHAR(15) not null,
    Pnumber INT NOT NULL,
    Plocation VARCHAR(15),
    Dnum INT NOT NULL,
    UNIQUE (Pname),
    PRIMARY KEY (Pnumber),
	FOREIGN KEY (Dnum) REFERENCES departament(Dnumber)
);

CREATE TABLE works_on(
	Essn CHAR(9) NOT NULL,
    Pno INT NOT NULL,
    Hours decimal(3,1) not null,
    PRIMARY KEY (Essn, Pno),
    FOREIGN KEY (Essn) REFERENCES employee(Ssn),
    FOREIGN KEY (Pno) REFERENCES project(Pnumber)
);

CREATE TABLE dependent(
	Essn CHAR(9) NOT NULL,
    Dependent_name VARCHAR(15) NOT NULL,
    Sex char, -- F ou M
    Bdate DATE,
    Relationship VARCHAR(8),
    PRIMARY KEY (Essn, Dependent_name),
    FOREIGN KEY (Essn) REFERENCES employee(Ssn)
);
