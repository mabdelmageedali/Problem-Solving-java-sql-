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

-- -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- -----------------------------------------------------------------------------------------------------------------------------------------------------------------------


-- [1] Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters.
--  Your result cannot contain duplicates.

SELECT DISTINCT CITY
FROM STATION
WHERE LOWER(LEFT(CITY, 1)) IN ('a', 'e', 'i', 'o', 'u')
  AND LOWER(RIGHT(CITY, 1)) IN ('a', 'e', 'i', 'o', 'u');


-- -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

-- [2] Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.

SELECT DISTINCT CITY 
FROM STATION 
WHERE LOWER(LEFT(CITY, 1)) NOT IN ('a', 'e', 'i', 'o', 'u');


-- -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

-- [3] Query the list of CITY names from STATION that do not end with vowels. Your result cannot contain duplicates.

SELECT DISTINCT CITY
FROM STATION 
WHERE LOWER(RIGHT(CITY, 1)) NOT IN ('a', 'e', 'i', 'o', 'u');