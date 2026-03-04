# Write your MySQL query statement below
DELETE p1 # delete a whole row 
FROM Person p1 # delete from Person
JOIN Person p2 on p1.email = p2.email
WHERE p1.id > p2.id

