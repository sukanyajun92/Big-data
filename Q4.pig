REGISTER /home/004/s/sx/sxs136330/homework#3/PigUDFjar.jar
A = LOAD '/Fall2014_HW-3-Pig/movies_new.dat' using PigStorage('#') as (MOVIEID: chararray, TITLE: chararray, GENRES: chararray);
B = FOREACH A GENERATE MOVIEID, TITLE, FORMAT_GENRE(GENRES);
DUMP B;
