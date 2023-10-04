--highest selling product

SELECT
    d.name AS highest_selling_drink,
    COUNT(*) AS total_orders
FROM
    drinks d
JOIN
    orders o ON d.order_id = o.order_id
GROUP BY
    d.name
ORDER BY
    total_orders DESC
LIMIT 1;

