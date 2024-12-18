CREATE TABLE EMPLOYEE (
    EMPLOYEE_ID INT PRIMARY KEY,          -- Employee ID, unique for each employee
    FIRST_NAME VARCHAR(50),               -- First name of the employee
    LAST_NAME VARCHAR(50),                -- Last name of the employee
    CITY VARCHAR(100),                    -- City where the employee is located
    DEPARTMENT VARCHAR(100),              -- Department where the employee works
    SALARY DECIMAL(10, 2),                -- Salary of the employee (up to 10 digits with 2 decimal places)
    HIRE_DATE DATE                        -- Date the employee was hired
);

INSERT INTO EMPLOYEE (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, CITY, DEPARTMENT, SALARY, HIRE_DATE)
VALUES
(101, 'John', 'Doe', 'Bangalore', 'IT', 75000.00, '2023-01-15'),
(102, 'Jane', 'Smith', 'Mumbai', 'HR', 65000.00, '2022-11-20'),
(103, 'Michael', 'Brown', 'Delhi', 'Finance', 85000.00, '2021-03-10'),
(104, 'Emily', 'Davis', 'Chennai', 'IT', 72000.00, '2023-06-25'),
(105, 'David', 'Wilson', 'Pune', 'Marketing', 60000.00, '2022-07-19'),
(106, 'Linda', 'Johnson', 'Hyderabad', 'Sales', 69000.00, '2020-10-12'),
(107, 'Robert', 'Moore', 'Bangalore', 'Finance', 88000.00, '2019-08-05'),
(108, 'Patricia', 'Taylor', 'Mumbai', 'HR', 70000.00, '2021-12-30'),
(109, 'James', 'Anderson', 'Delhi', 'Operations', 73000.00, '2023-02-14'),
(110, 'Mary', 'Thomas', 'Chennai', 'IT', 78000.00, '2022-09-22');

use test;

SELECT * FROM  EMPLOYEE;
SELECT * FROM EMPLOYEE WHERE CITY='Bangalore';
SELECT * FROM EMPLOYEE WHERE SALARY IN(63000.00,69000.00);
SELECT * FROM EMPLOYEE WHERE SALARY >=3;
SELECT CITY,COUNT(*) FROM EMPLOYEE group by CITY;
SELECT max(SALARY) FROM EMPLOYEE group by CITY;
SELECT min(SALARY),CITY FROM EMPLOYEE GROUP BY CITY;
SELECT * FROM EMPLOYEE ORDER BY EMPLOYEE_ID DESC;
SELECT * FROM EMPLOYEE ORDER BY EMPLOYEE_ID DESC LIMIT 5;
-- HIGHEST SALARY IN DESCENDING ORDER
SELECT * FROM EMPLOYEE ORDER BY SALARY;

-- TOP 5 SALARIES
SELECT * FROM EMPLOYEE ORDER BY SALARY DESC LIMIT 5;

-- third maximum salary
SELECT * FROM EMPLOYEE ORDER BY SALARY DESC LIMIT 1 offset 2;

-- upper case
SELECT ucase(fIRST_NAME) FROM EMPLOYEE ;
-- lower case
SELECT lcase(fIRST_NAME) FROM EMPLOYEE ;


-- mid query with alias operater and group by
SELECT mid(CITY,1,3) as city ,count(*) As CITY_COUNT FROM EMPLOYEE group by CITY ;


-- city start with b
SELECT * FROM EMPLOYEE WHERE CITY LIKE 'B%';

-- city ends with e
SELECT * FROM EMPLOYEE WHERE CITY LIKE '%e';

-- city consist of word or
SELECT * FROM EMPLOYEE WHERE CITY LIKE '%or%';

-- city consist of only 4 words
SELECT *
FROM EMPLOYEE
WHERE CITY LIKE '% % % %' AND CITY NOT LIKE '%  %';

-- current time
SELECT NOW();

-- distnict query
SELECT distinct SALARY FROM EMPLOYEE;

-- CONCAT SALARY WITH CITY
SELECT concat(CITY,'--',SALARY) as CONCAT_SALARY FROM EMPLOYEE;

-- update query
UPDATE EMPLOYEE
SET SALARY=75001.00
WHERE SALARY=75000.00;

-- LENGTH QUERY
select LENGTH("i WILL KILL YOU");

-- TRIM THE LEFT WHIET SPACES
select ltrim("  i WILL KILL YOU");

-- TRIME THE RIGHT WHITE SPACES
SELECT rtrim("I WILL KILL YOU     ");

-- TRIM  THE LEFT AND RIGHT SPACES
SELECT TRIM("   I WILL KILL YOU   ");

-- USEING SUB QUERY GIVE ME THE SECOND LARGEST QUERY
SELECT max(SALARY) FROM EMPLOYEE WHERE SALARY< (SELECT max(SALARY) FROM EMPLOYEE);

-- using sub query give me the third maximum salary
SELECT max(SALARY) FROM EMPLOYEE WHERE SALARY<(SELECT max(SALARY)
FROM EMPLOYEE WHERE SALARY <(SELECT max(SALARY) FROM EMPLOYEE));

CREATE TABLE PET(
NAME INT NOT NULL auto_increment primary KEY,
OWNER varchar(256),
BIRTH_DATE DATE,
PID int
);

SELECT * FROM PET;
INSERT INTO PET VALUES(
5,'dhurga',now(),1);

INSERT INTO PET(NAME,OWNER,BIRTH_DATE,PID)
VALUES(6,'sandhya',now(),2),
(7,'sandhya',now(),2),
(8,'sandhya',now(),2),
(9,'sandhya',now(),2),
(10,'sandhya',now(),2);


describe table PET;

CREATE TABLE ATTENDANCE(
ATT_ID INT NOT NULL auto_increment PRIMARY KEY,
EMP_ID INT NOT NULL,
STATUS ENUM('PRESENT','ABSENT'),
foreign key (EMP_ID) references EMPLOYEE(EMPLOYEE_ID)
);


SELECT * FROM ATTENDANCE;
SELECT EMPLOYEE_ID FROM EMPLOYEE;

INSERT INTO ATTENDANCE(EMP_ID,STATUS)
values(105,'PRESENT'),
(106,'PRESENT'),
(107,'PRESENT'),
(108,'ABSENT');

SELECT * FROM ATTENDANCE;

SELECT * FROM EMPLOYEE e
INNER JOIN ATTENDANCE a
ON e.EMPLOYEE_ID=a.EMP_ID;

-- SELECT ATTENDENCE IS ABSENT
SELECT * FROM EMPLOYEE e
INNER JOIN ATTENDANCE a
ON e.EMPLOYEE_ID=a.EMP_ID WHERE a.STATUS='ABSENT';


SELECT * FROM EMPLOYEE e
LEFT JOIN ATTENDANCE a
ON e.EMPLOYEE_ID=a.EMP_ID WHERE a.STATUS='ABSENT';


SELECT * FROM EMPLOYEE e
RIGHT JOIN ATTENDANCE a
ON e.EMPLOYEE_ID=a.EMP_ID WHERE a.STATUS='PRESENT';

SELECT e.FIRST_NAME FROM EMPLOYEE e
RIGHT JOIN ATTENDANCE a
ON e.EMPLOYEE_ID=a.EMP_ID WHERE a.STATUS='PRESENT';

SELECT e.FIRST_NAME FROM EMPLOYEE e, ATTENDANCE a WHERE e.EMPLOYEE_ID=a.EMP_ID
AND a.STATUS='PRESENT';