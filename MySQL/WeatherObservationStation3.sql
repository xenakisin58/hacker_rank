/* 
Weather Observation Station 3
Enter your query here.
*/
SELECT DISTINCT CITY
FROM STATION
WHERE ID%2=0 /* MOD(ID,2)=0 */
