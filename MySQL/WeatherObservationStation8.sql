/*
Weather Observation Station 8
Enter your query here.
*/
SELECT DISTINCT CITY FROM STATION WHERE CITY regexp '^[aeiou].*[aeiou]$' ORDER BY CITY
