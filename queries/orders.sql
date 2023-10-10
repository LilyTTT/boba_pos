SELECT * FROM orders ORDER BY TO_TIMESTAMP(transaction_date || ' ' || timestamp, 'YYYY-MM-DD HH24:MI:SS') DESC;
