/*
Weather Observation Station 11
Enter your query here.
*/
SELECT DISTINCT CITY FROM STATION WHERE CITY regexp '^[^aeiou].*' OR CITY regexp '[^aeiou]$' ORDER BY CITY
