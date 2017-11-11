/*
Weather Observation Station 9
Enter your query here.
*/
SELECT DISTINCT CITY FROM STATION WHERE CITY regexp '^[^aeiou].*' ORDER BY CITY
