/*
Higher Than 75 Marks
Enter your query here.
*/
SELECT Name FROM STUDENTS WHERE Marks > 75 ORDER BY MID(NAME, LENGTH(NAME)-2, 3), ID
