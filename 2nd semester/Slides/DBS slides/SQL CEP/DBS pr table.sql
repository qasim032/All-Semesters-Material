CREATE DATABASE CompanyDB;
USE college;

-- Department Table
CREATE TABLE Department (
    DeptID INT PRIMARY KEY,
    DeptName VARCHAR(50)
);

-- Employee Table
CREATE TABLE Employee (
    EmpID INT PRIMARY KEY,
    EmpName VARCHAR(50),
    Job VARCHAR(50),
    ManagerID INT,
    HireDate DATE,
    Salary INT,
    Commission INT,
    DeptID INT,
    FOREIGN KEY (DeptID) REFERENCES Department(DeptID)
);


-- Inserting into Department Table
INSERT INTO Department VALUES
(10, 'ACCOUNTING'),
(20, 'RESEARCH'),
(30, 'SALES'),
(40, 'OPERATIONS');

-- Inserting into Employee Table
INSERT INTO Employee VALUES
(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, NULL, 10),
(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975, NULL, 20),
(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850, NULL, 30),
(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450, NULL, 10),
(7788, 'SCOTT', 'ANALYST', 7566, '1987-07-13', 3000, NULL, 20),
(7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000, NULL, 20),
(7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08', 1500, 0, 30),
(7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950, NULL, 30),
(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30),
(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600, 300, 30),
(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30),
(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300, NULL, 10);


#Display employees whose salary is less than the salary of ALLEN

#SELECT salary from Employee where empname = "Allen";
Select * from employee where salary< (SELECT salary from Employee where empname = "Allen") ;






SELECT * FROM Employee
WHERE Salary < (SELECT Salary FROM Employee WHERE EmpName = 'ALLEN');


#2nd Max Salary from Employee

Select max(salary) from employee where salary < (Select max(salary) from employee where salary <(select max(salary) from employee));

SELECT MAX(Salary) AS SecondMaxSalary
FROM Employee
WHERE Salary < (SELECT MAX(Salary) FROM Employee);

#3rd Maximum Salary

SELECT MAX(Salary) AS ThirdMaxSalary
FROM Employee
WHERE Salary < (
    SELECT MAX(Salary) FROM Employee
    WHERE Salary < (
        SELECT MAX(Salary) FROM Employee
    )
);
SELECT ENAME,EMPNO,DEPTNO,(SELECT DNAME FROM DEPT WHERE
EMP.DEPTNO=DEPT.DEPTNO)DNAME FROM EMP;
#Find employees whose salary is greater than EMPNO 7788
SELECT NOW();



SELECT * FROM Employee
WHERE Salary > (SELECT Salary FROM Employee WHERE EmpID = 7788);

#Display employees earning the highest salary

SELECT * FROM Employee
WHERE Salary = (SELECT MAX(Salary) FROM Employee);