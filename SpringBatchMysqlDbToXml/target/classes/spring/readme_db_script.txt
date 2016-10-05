
/* Run below script in MySQL DB before testing this application */

use test_batch;


DROP TABLE IF EXISTS users;


create table users(
id int NOT NULL,
user_login VARCHAR(25) NOT NULL,
user_pass VARCHAR(25) NOT NULL,
age int not null
);



insert into users values(1,'mkyong','password',30);


insert into users values(2,'user_a','password',25);


insert into users values(3,'user_b','password',10);

insert into users values(4,'user_c','password',25);

insert into users values(5,'user_d','password',40);

insert into users values(1,'mkyong','password',30);

insert into users values(2,'user_a','password',25);

insert into users values(3,'user_b','password',10);

insert into users values(4,'user_c','password',25);

insert into users values(5,'user_d','password',40);

