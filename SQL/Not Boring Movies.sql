/* https://leetcode.com/problems/not-boring-movies/
*/

SELECT *
FROM cinema
WHERE id % 2 != 0 and description not like 'boring'
ORDER BY rating DESC;