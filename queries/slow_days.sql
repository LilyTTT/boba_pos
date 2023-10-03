--slow days

SELECT transaction_date, SUM(payment_amount) AS total_sales
FROM orders
GROUP BY transaction_date
ORDER BY total_sales ASC
LIMIT 10;
