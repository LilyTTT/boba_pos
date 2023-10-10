--total income per cashier

SELECT s.name AS cashier_name, SUM(o.payment_amount) AS total_revenue FROM staff s JOIN orders o ON s.staff_id = o.staff_id WHERE s.role = 'Cashier' GROUP BY s.name ORDER BY cashier_name;
