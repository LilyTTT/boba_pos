--replace with start and end date

SELECT d.name AS drink_name, SUM(d.price) AS total_sales FROM drinks d JOIN orders o ON d.order_id = o.order_id WHERE TO_DATE(o.transaction_date, 'YYYY-MM-DD') BETWEEN 'start-date' AND 'end-date' GROUP BY d.name ORDER BY total_sales DESC LIMIT 10;
