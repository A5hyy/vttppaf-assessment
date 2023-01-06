create database eshop;
use eshop;

create table customers (
    name char(32) not null,
    address varchar(128) not null,
    email varchar(128) not null
);

insert into customers 
(name, address, email)
values 
("fred", "201 Cobblestone Lane", "fredflintstone@bedrock.com");

insert into customers 
(name, address, email)
values 
("sherlock", "221B Baker Street, London", "sherlock@consultingdetective.org");

insert into customers 
(name, address, email)
values 
("spongebob", "124 Conch Street, Bikini Bottom", "spongebob@yahoo.com");

insert into customers 
(name, address, email)
values 
("jessica", "698 Candlewood Land, Cabot Cove", "fletcher@gmail.com");

insert into customers 
(name, address, email)
values 
("dursley", "4 Privet Drive, Little Whinging, Surrey", "dursley@gmail.com");