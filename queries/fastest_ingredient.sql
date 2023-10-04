--ingredients that run out fastest

-- this query is used to find the ingredient that has the most frequent stock date (therfore runs out the fastest)

SELECT name AS max_ingredient
FROM ingredients
WHERE name = (
    SELECT name
    FROM ingredients
    GROUP BY name
    ORDER BY COUNT(restock_date) DESC
    LIMIT 1
);
