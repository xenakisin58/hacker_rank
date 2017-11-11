/*
Weather Observation Station 7
Enter your query here.
*/
SELECT DISTINCT CITY FROM STATION WHERE CITY regexp  '(a|e|i|o|u)$' ORDER BY CITY
