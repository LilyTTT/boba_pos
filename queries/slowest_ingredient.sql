--ingredient that last the longest/least used

-- this query finds which ingredient is restocked the least
SELECT name AS min_ingredient
FROM ingredients
WHERE name = (
    SELECT name
    FROM ingredients
    GROUP BY name
    ORDER BY COUNT(restock_date) ASC
    LIMIT 1
);

