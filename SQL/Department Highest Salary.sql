/* https://leetcode.com/problems/department-highest-salary/
*/
select Department.Name as Department, Employee.Name as Employee, Employee.Salary as Salary
from Employee join Department on Employee.DepartmentId = Department.Id
where (Salary,DepartmentId) in 
    (select max(Salary),DepartmentId 
    from Employee
    group by DepartmentId);