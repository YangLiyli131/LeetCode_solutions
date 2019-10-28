/* https://leetcode.com/problems/delete-duplicate-emails/Delete Duplicate Emails
*/
delete from Person
where id not in
    (select t.id from (select min(Id) as id from Person group by Email) t);