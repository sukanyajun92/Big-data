All hive scripts are present in the folder /home/004/s/sx/sxs136330/homework#3/hive 

To run hive script,

From hive prompt, type
1) source Q1_sxs136330.hive;
2) source Q2_sxs136330.hive;
3) source Q3_sxs136330.hive;
4) source Q4_sxs136330.hive;
5) add jar /home/004/s/sx/sxs136330/HW3/HiveUDF.jar;
	CREATE TEMPORARY FUNCTION FORMAT_GENRE as 'HiveUDF';
	select TITLE,FORMAT_GENRE(GENRE) from MOVIES;