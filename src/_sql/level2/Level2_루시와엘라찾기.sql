SELECT AI.ANIMAL_ID,
       AI.NAME,
       AI.SEX_UPON_INTAKE
FROM ANIMAL_INS AS AI
WHERE 1 = 1
  AND AI.NAME IN ('Lucy','Ella','Pickle','Rogan','Sabrina','Mitty')
ORDER BY AI.ANIMAL_ID ASC;