/*
Weather Observation Station 6
Enter your query here.
*/
SELECT DISTINCT CITY FROM STATION WHERE CITY rlike '^(a|e|i|u|o).*' ORDER BY CITY
