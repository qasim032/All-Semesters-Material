SELECT 
     c.course_title AS "Course Title",
     e.semester AS "Semester",
     GROUP_CONCAT(DISTINCT i.name SEPARATOR ", ") AS "Instructor Names",
     GROUP_CONCAT(CONCAT(a.assessment_type, ": ", sa.score) ORDER BY a.assessment_type SEPARATOR " | ") AS "Assessment Summary",
     g.gpa AS "GPA Value"
 FROM 
     enrollment e
 JOIN student s 
     ON e.student_id = s.student_id
 JOIN course c 
     ON e.course_id = c.course_id
 LEFT JOIN course_instructor ci 
     ON e.course_id = ci.course_id AND e.semester = ci.semester
 LEFT JOIN instructor i 
     ON ci.instructor_id = i.instructor_id
LEFT JOIN assessment a 
     ON a.course_id = c.course_id
 LEFT JOIN student_assessment sa 
     ON sa.assessment_id = a.assessment_id AND sa.student_id = s.student_id
 LEFT JOIN gpa g 
     ON g.student_id = s.student_id AND g.course_id = c.course_id AND g.semester = e.semester
 WHERE 
     s.student_id = '24BSAI029'
 GROUP BY 
     c.course_title, e.semester, g.gpa
 ORDER BY 
    e.semester ASC, g.gpa DESC;