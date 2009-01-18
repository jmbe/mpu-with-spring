CREATE DATABASE IF NOT EXISTS mpu
	CHARACTER SET utf8
	COLLATE utf8_general_ci;

	
grant all on mpu.* to 'mpu'@'localhost' identified by 'mpu';