-- most used payment method

-- this query finds which payment method most frequently occurs out of all orders made

SELECT payment_method, COUNT(*) AS payment_count
FROM orders
GROUP BY payment_method
ORDER BY payment_count DESC
LIMIT 1;

