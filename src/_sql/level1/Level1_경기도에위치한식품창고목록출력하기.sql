SELECT FW.WAREHOUSE_ID,
       FW.WAREHOUSE_NAME,
       FW.ADDRESS,
       IFNULL(FW.FREEZER_YN,'N')
FROM FOOD_WAREHOUSE AS FW
WHERE 1 = 1
 AND FW.ADDRESS LIKE '경기도%'
 ORDER BY FW.WAREHOUSE_ID ASC;