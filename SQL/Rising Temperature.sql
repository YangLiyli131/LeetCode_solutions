/* problem link
https://leetcode.com/problems/rising-temperature/
*/

select w1.id 
from Weather w1, Weather w2
where w1.Temperature > w2.temperature
    and datediff(w1.RecordDate,w2.RecordDate) = 1;