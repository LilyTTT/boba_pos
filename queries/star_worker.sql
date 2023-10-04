-- star worker

-- this query finds the staff_id associated with the most amount of all orders made

SELECT staff.*
FROM staff
JOIN (
	SELECT staff_id, COUNT(*) AS order_count
	FROM orders
	GROUP BY staff_id
	ORDER BY order_count DESC
	LIMIT 1
) AS most_orders
ON staff.staff_id = most_orders.staff_id;
