drop database if exists loginTest;
create database loginTest;
use loginTest;

create table login_table(
id varchar(255),
password varchar(255)
);

insert into login_table values("test","test");
insert into login_table values("kudo","123");
insert into login_table values("sato","123");
insert into login_table values("kondo","123");