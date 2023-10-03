-- most used payment method

SELECT payment_method, COUNT(*) AS payment_count
FROM orders
GROUP BY payment_method
ORDER BY payment_count DESC
LIMIT 1;

