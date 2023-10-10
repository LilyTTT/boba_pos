--returns total number of counts per rating 

SELECT rating AS rating, COUNT(customer_id) AS customer_count FROM feedback WHERE rating BETWEEN 1 AND 5 GROUP BY rating ORDER BY rating;
