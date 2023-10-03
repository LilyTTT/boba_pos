--drinks commonly ordered together

WITH DrinkPairs AS (
	SELECT d1.drink_id AS drink1_id, d2.drink_id AS drink2_id, COUNT(*) AS pair_count
	FROM drinks d1
	JOIN drinks d2 ON d1.order_id = d2.order_id AND d1.drink_id < d2.drink_id
	GROUP BY d1.drink_id, d2.drink_id
	HAVING COUNT(*) >= 2
)

SELECT d1.name AS drink1_name, d2.name AS drink2_name, dp.pair_count
FROM DrinkPairs dp
JOIN drinks d1 ON dp.drink1_id = d1.drink_id
JOIN drinks d2 ON dp.drink2_id = d2.drink_id
ORDER BY dp.pair_count DESC; 

--we can limit to number we want?
