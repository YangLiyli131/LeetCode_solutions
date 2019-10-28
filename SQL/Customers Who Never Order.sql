/* https://leetcode.com/problems/customers-who-never-order/
*/

SELECT Name as Customers 
FROM Customers
WHERE Id not in (SELECT distinct CustomerId from Orders);