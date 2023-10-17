--replace with start and end date and also drink name

SELECT d.name AS drink_name, SUM(d.price) AS total_sales FROM drinks d JOIN orders o ON d.order_id = o.order_id WHERE TO_DATE(o.transaction_date, 'YYYY-MM-DD') BETWEEN 'start-date' AND 'end-date' AND LOWER(TRIM(d.name)) ILIKE LOWER(TRIM('drink-anme')) GROUP BY d.name;


