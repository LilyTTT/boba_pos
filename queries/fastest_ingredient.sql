--ingredients that run out fastest

SELECT name AS max_ingredient
FROM ingredients
WHERE name = (
    SELECT name
    FROM ingredients
    GROUP BY name
    ORDER BY COUNT(restock_date) DESC
    LIMIT 1
);
