`V0`

using hardcoded credentials (not from db)

[https://www.youtube.com/watch?v=TNt3GHuayXs&list=PLqq-6Pq4lTTYTEooakHchTGglSvkZAjnE&index=8]



drop database springsecurity;
create database springsecurity;
use springsecurity;
CREATE TABLE `springsecurity`.`user` (
  `id` INT NOT NULL,
  `active` TINYINT NULL,
  `password` VARCHAR(45) NULL,
  `roles` VARCHAR(45) NULL,
  `user_name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

select * from user;
select * from hibernate_sequence;

INSERT INTO `springsecurity`.`user` (`id`, `active`, `password`, `roles`, `user_name`) VALUES ('1', '1', 'pass', 'ROLE_USER', 'user');

