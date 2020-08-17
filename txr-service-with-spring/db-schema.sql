

create database bank_db;
use bank_db;

create table bank_db.accounts(
num varchar(12) primary key,
balance double
);

insert into bank_db.accounts values ('1',1000.00);
insert into bank_db.accounts values ('2',1000.00);

select * from bank_db.accounts;

