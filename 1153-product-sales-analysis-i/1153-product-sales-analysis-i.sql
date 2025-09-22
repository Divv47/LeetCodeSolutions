# Write your MySQL query statement below
Select product_name ,year , price 
From Product Inner Join Sales
On Product.product_id = Sales.product_id 
