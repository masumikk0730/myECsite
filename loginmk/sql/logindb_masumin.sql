set names utf8;
set foreign_key_checks=0;
drop database if exists logindb_masumin;
create database logindb_masumin;
use logindb_masumin;

create table user(
id int,
user_name varchar(255),
password varchar(255)
);

insert into user values
(1,"masumi","0730"),
(2,"tosi","0228"),
(3,"youko","0212"),
(4,"mitsuru","1110"),
(5,"yoshiki","0730");