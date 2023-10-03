--highest selling product

SELECT name AS product_name
SUM(price) AS total_sales
FROM drinks
GROUP BY name
ORDER BY total_sales DESC
LIMIT 1;
