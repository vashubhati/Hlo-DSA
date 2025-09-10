# Write your MySQL query statement below
SELECT 
    s.user_id,
    COALESCE(
        ROUND(
            SUM(CASE WHEN c.action = 'confirmed' THEN 1 ELSE 0 END) * 1.0 /
            NULLIF(SUM(CASE WHEN c.action IN ('confirmed', 'timeout') THEN 1 ELSE 0 END), 0)
        , 2)
    , 0) AS confirmation_rate
FROM Signups s
LEFT JOIN Confirmations c
    ON s.user_id = c.user_id
GROUP BY s.user_id;