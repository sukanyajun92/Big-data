A = load '/Fall2014_HW-3-Pig/ratings_new.dat ' using PigStorage('#') as (RUSERID:int, RMOVIEID:int, RRATING:double, RTIMESTAMP:chararray);
B = load '/Fall2014_HW-3-Pig/users_new.dat ' using PigStorage('#') as (UUSERID:int, UGENDER:chararray, UAGE:int, UOCCUPATION:chararray, UZIPCODE:chararray);
C = COGROUP A BY RUSERID, B by UUSERID;
D = LIMIT C 11;
DUMP D;
