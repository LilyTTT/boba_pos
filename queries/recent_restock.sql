--returns all ingredients with their most recent restock date

SELECT name AS ingredient_name, MAX(TO_DATE(restock_date, 'YYYY-MM-DD')) AS most_recent_restock_date FROM ingredients GROUP BY name ORDER BY ingredient_name;
