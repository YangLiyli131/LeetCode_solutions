/* https://leetcode.com/problems/duplicate-emails/
*/

select distinct Email 
from Person
group by Email 
having COUNT(Id) > 1;