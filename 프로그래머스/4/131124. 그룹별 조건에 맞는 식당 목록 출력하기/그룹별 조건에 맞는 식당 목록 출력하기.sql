WITH TBL AS (
            SELECT MEMBER_ID, COUNT(*) AS CNT
            FROM REST_REVIEW
            GROUP BY MEMBER_ID
            ORDER BY CNT DESC
            LIMIT 1)

SELECT P.MEMBER_NAME, R.REVIEW_TEXT, DATE_FORMAT(R.REVIEW_DATE, '%Y-%m-%d') as REVIEW_DATE
FROM REST_REVIEW AS R
JOIN MEMBER_PROFILE AS P ON R.MEMBER_ID = P.MEMBER_ID
WHERE R.MEMBER_ID IN (
            SELECT MEMBER_ID
            FROM TBL
        )
ORDER BY 3, 2;