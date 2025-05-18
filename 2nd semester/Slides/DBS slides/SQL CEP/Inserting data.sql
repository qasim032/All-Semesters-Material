-- First insert into tables that don't have foreign key dependencies
INSERT INTO department (dept_id, dept_name) VALUES ("PS", "Basic Science And Related Studies");

-- Then insert into tables that depend on the above
INSERT INTO instructor (instructor_id, name, dept_id) VALUES ("106", "Ms Maryam", "PS");

INSERT INTO student (student_id, name, semester) VALUES ("24BSAI029", "SYED MUHAMMAD QASIM", "2nd");

INSERT INTO course (course_id, course_title) VALUES ("PS106", "Pakistan Studies");

-- Now insert into tables that reference the above
INSERT INTO course_department (course_id, dept_id) VALUES ("PS106", "PS");

INSERT INTO course_instructor (course_id, instructor_id, semester) VALUES ("PS106", "106", "2nd");

INSERT INTO enrollment (student_id, course_id, semester) VALUES ("24BSAI029", "PS106", "2nd");

INSERT INTO assessment (assessment_id, assessment_type, course_id) VALUES ("27", "CEP", "BSSE103");

-- Finally, insert into tables that reference multiple other tables
INSERT INTO gpa (student_id, course_id, gpa, semester) VALUES ("24BSAI029", "PS106", 4, "2nd");

INSERT INTO student_assessment (student_id, assessment_id, score) VALUES ("24BSAI029", "27", 15);


-- weight in table many instructor one time
select * from student_assessment;
