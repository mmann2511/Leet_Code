# Write your MySQL query statement below
SELECT w.id
FROM Weather w
JOIN Weather d ON DATEDIFF(w.recordDate, d.recordDate) = 1
WHERE w.temperature > d.temperature