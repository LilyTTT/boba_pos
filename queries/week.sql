-- 52 Weeks of Sales History: select count of orders grouped by week

SELECT
    DATE_TRUNC('week', TO_DATE(transaction_date, 'YYYY-MM-DD')) AS week_start,
    COUNT(*) AS order_count
FROM orders
GROUP BY week_start
ORDER BYweek_start;
