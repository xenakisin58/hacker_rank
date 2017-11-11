/*
Weather Observation Station 12
Enter your query here.
*/
SELECT DISTINCT CITY
  FROM STATION
WHERE CITY regexp '^[^aeiou]' AND CITY regexp '[^aeiou]$';
