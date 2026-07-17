-- # STATION

-- ----------------------------
-- | Field    | Type          |
-- |----------|---------------|
-- | ID       | NUMBER        |
-- | CITY     | VARCHAR2(21)  |
-- | STATE    | VARCHAR2(2)   |
-- | LAT_N    | NUMBER        |
-- | LONG_W   | NUMBER        |
-- ----------------------------

-- [1] Query a list of CITY names from STATION for cities that have an even ID number. Print the results in any order, but exclude duplicates from the answer.

SELECT DISTINCT CITY  
FROM STATION  
WHERE MOD(ID, 2) = 0;

-- ---------------------------------------------------------------------------------------------------------------------------------------------
-- ---------------------------------------------------------------------------------------------------------------------------------------------

-- [2] Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.

SELECT COUNT(CITY) - COUNT(DISTINCT CITY)
FROM STATION;

-- ---------------------------------------------------------------------------------------------------------------------------------------------
-- ---------------------------------------------------------------------------------------------------------------------------------------------

-- [3] 	Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths 
-- (i.e.: number of characters in the name). If there is more than one smallest or largest city, 
-- choose the one that comes first when ordered alphabetically.

SELECT CITY, LENGTH(CITY)
FROM STATION
ORDER BY LENGTH(CITY), CITY
FETCH FIRST 1 ROW ONLY;

SELECT CITY, LENGTH(CITY)
FROM STATION
ORDER BY LENGTH(CITY) DESC, CITY
FETCH FIRST 1 ROW ONLY;


-- ---------------------------------------------------------------------------------------------------------------------------------------------
-- ---------------------------------------------------------------------------------------------------------------------------------------------

-- [4] Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.
SELECT DISTINCT CITY
FROM STATION
WHERE LOWER(CITY) LIKE 'a%'
   OR LOWER(CITY) LIKE 'e%'
   OR LOWER(CITY) LIKE 'i%'
   OR LOWER(CITY) LIKE 'o%'
   OR LOWER(CITY) LIKE 'u%';








