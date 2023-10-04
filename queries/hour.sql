--Realistic Sales History: select count of orders, sum of order total grouped by hour.

SELECT
    EXTRACT(HOUR FROM TO_TIMESTAMP(timestamp, 'HH24:MI:SS')) AS hour_of_day,
    COUNT(*) AS order_count,
    SUM(payment_amount) AS total_order_amount
FROM orders
GROUP BY hour_of_day
ORDER BY hour_of_day;

