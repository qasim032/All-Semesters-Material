CREATE DATABASE  AcademicManagementSystem;
USE AcademicManagementSystem;

CREATE TABLE Department (
    dept_id  VARCHAR(100)PRIMARY KEY,
    dept_name VARCHAR(100)
);
CREATE TABLE Instructor (
    instructor_id  VARCHAR(100) PRIMARY KEY,
    name VARCHAR(100),
    dept_id  VARCHAR(100),
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);


CREATE TABLE Course (
    course_id  VARCHAR(100) PRIMARY KEY,
    course_title VARCHAR(100)
);


CREATE TABLE Course_Department (
    course_id  VARCHAR(100),
    dept_id  VARCHAR(100),
    PRIMARY KEY (course_id, dept_id),
    FOREIGN KEY (course_id) REFERENCES Course(course_id),
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);


CREATE TABLE Student (
    student_id  VARCHAR(100) PRIMARY KEY,
    name VARCHAR(100),
    semester VARCHAR(10)
);


CREATE TABLE Enrollment (
    student_id  VARCHAR(100),
    course_id  VARCHAR(100),
    semester VARCHAR(10),
    PRIMARY KEY (student_id, course_id, semester),
    FOREIGN KEY (student_id) REFERENCES Student(student_id),
    FOREIGN KEY (course_id) REFERENCES Course(course_id)
);


CREATE TABLE Course_Instructor (
    course_id  VARCHAR(100),
    instructor_id  VARCHAR(100),
    semester VARCHAR(10),
    PRIMARY KEY (course_id, instructor_id, semester),
    FOREIGN KEY (course_id) REFERENCES Course(course_id),
    FOREIGN KEY (instructor_id) REFERENCES Instructor(instructor_id)
);


CREATE TABLE Assessment (
    assessment_id  VARCHAR(100) PRIMARY KEY,
    course_id  VARCHAR(100),
    assessment_type VARCHAR(50),
    FOREIGN KEY (course_id) REFERENCES Course(course_id)
);


CREATE TABLE Student_Assessment (
    student_id  VARCHAR(100),
    assessment_id  VARCHAR(100),
    score DECIMAL(5,2),
    PRIMARY KEY (student_id, assessment_id),
    FOREIGN KEY (student_id) REFERENCES Student(student_id),
    FOREIGN KEY (assessment_id) REFERENCES Assessment(assessment_id)
);


CREATE TABLE GPA (
    student_id  VARCHAR(100),
    course_id  VARCHAR(100),
    gpa DECIMAL(3,2),
    semester VARCHAR(10),
    PRIMARY KEY (student_id, course_id, semester),
    FOREIGN KEY (student_id) REFERENCES Student(student_id),
    FOREIGN KEY (course_id) REFERENCES Course(course_id)
);
