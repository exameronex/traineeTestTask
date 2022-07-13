SELECT (SELECT COUNT(order_id) FROM orders WHERE promocode_id IS NOT NULL) / COUNT(order_id) AS Соотношение FROM orders;
