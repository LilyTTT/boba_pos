-- most common topping

SELECT toppings.*, COUNT(*) AS topping_count
FROM toppings
JOIN drinks on toppings.drink_id = drinks.drink_id
JOIN orders on drinks.order_id = orders.order_id
GROUP BY toppings.topping_id, toppings.name
ORDER BY topping_count DESC
LIMIT 1;
