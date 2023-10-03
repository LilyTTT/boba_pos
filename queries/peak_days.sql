--2 Peak Days: select top 10 sums of order total grouped by day in descending order.

SELECT
    transaction_date AS order_day,
    SUM(payment_amount) AS total_order_amount
FROM orders
GROUP BY transaction_date
ORDER BY total_order_amount DESC
LIMIT 10;
