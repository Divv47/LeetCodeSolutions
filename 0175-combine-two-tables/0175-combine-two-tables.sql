# Write your MySQL query statement below
Select p.firstname , p.lastname , s.city , s.state
From Person p
LEFT JOIN Address s
ON p.personID = s.personID