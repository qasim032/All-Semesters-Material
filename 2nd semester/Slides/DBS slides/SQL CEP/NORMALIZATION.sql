SELECT DISTINCT
    s.student_id,
    s.name AS student_name,
    c.course_title,
    e.semester,
    (
        SELECT GROUP_CONCAT(DISTINCT i.name SEPARATOR ', ')
        FROM Course_Instructor ci
        JOIN Instructor i ON ci.instructor_id = i.instructor_id
        WHERE ci.course_id = c.course_id AND ci.semester = e.semester
    ) AS instructors,
    a.assessment_type,
    sa.score,
    g.gpa
FROM 
    Student s
JOIN Enrollment e 
    ON s.student_id = e.student_id
JOIN Course c 
    ON e.course_id = c.course_id
JOIN GPA g 
    ON s.student_id = g.student_id 
    AND g.course_id = c.course_id 
    AND g.semester = e.semester
LEFT JOIN Assessment a 
    ON a.course_id = c.course_id
LEFT JOIN Student_Assessment sa 
    ON sa.assessment_id = a.assessment_id 
    AND sa.student_id = s.student_id
ORDER BY 
    e.semester ASC,
    g.gpa DESC;
    
    
    
    
