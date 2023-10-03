-- lowest worker

SELECT staff.* FROM staff
JOIN (
	SELECT staff_id, COUNT(*) AS order_count
	FROM orders
	GROUP BY staff_id
	ORDER BY order_count ASC
	LIMIT 1
) AS least_orders
ON staff.staff_id = least_orders.staff_id;
