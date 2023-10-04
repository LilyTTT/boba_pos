-- most common topping

--SELECT toppings.*, COUNT(*) AS topping_count
--FROM toppings
--JOIN drinks on toppings.drink_id = drinks.drink_id
--JOIN orders on drinks.order_id = orders.order_id
--GROUP BY toppings.topping_id, toppings.name
--ORDER BY topping_count DESC
--LIMIT 1;


SELECT
    toppings.name AS topping_name,
    COUNT(*) AS topping_count
FROM
    toppings
JOIN
    drinks ON toppings.drink_id = drinks.drink_id
JOIN
    orders ON drinks.order_id = orders.order_id
GROUP BY
    toppings.name
ORDER BY
    topping_count DESC
LIMIT 1;
