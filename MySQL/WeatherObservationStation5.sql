/*
Weather Observation Station 5
Enter your query here.
*/
SELECT * FROM (
    SELECT city, LENGTH(city) FROM station ORDER BY LENGTH(city) ASC, city ASC limit 1
) temp1
UNION ALL
SELECT * FROM (
    SELECT city, LENGTH(city) FROM station ORDER BY LENGTH(city) DESC, city ASC limit 1
) temp2
