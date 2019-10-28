/* https://leetcode.com/problems/department-top-three-salaries/
*/
select Department.Name as Department, e1.Name as Employee, e1.Salary as Salary
from Employee e1 join Department on e1.DepartmentId = Department.Id
where (select count(distinct e2.Salary)
      from Employee e2
      where e2.Salary > e1.Salary
      and e1.DepartmentId = e2.DepartmentId) < 3;