show databases;
use mumbai;

create table s(S char(2),sname char(25),status char(2), city char(20) );

insert into s (S, sname, status, city)values
('S1','Supplier1', '10', 'London'),
('S2','Supplier2', '20', 'Athenes'),
('S3','Supplier3', '70', 'Paris'),
('S4','Supplier4', '20', 'London'),
('S5','Supplier5', '30', 'Athenes'),
('S6','Supplier6', '40', 'London'),
('S7','Supplier7', '80', 'London');

select * from s;

create table p(P char(2),pname char(25),color char(20), weight float, city char(20) );

insert into p (P, pname, color, weight, city)values
('P1','Part1', 'Voilet',40, 'London'),
('P2','Part2', 'Indigo', 20,'Athenes'),
('P3','Part3', 'Blue',60, 'Paris'),
('P4','Part4', 'Grey',100, 'London'),
('P5','Part5', 'Orange',200, 'Athenes'),
('P6','Part6', 'Yellow',500, 'London'),
('P7','Part7', 'Red',700, 'Athenes');

select * from p;

create table j(J char(2),jname char(25), city char(20) );

create table j(J char(2),jname char(25), city char(20) );
('J1','Project1', 'London'),
('J2','Project2','Athenes'),
('J3','Project3', 'Paris'),
('J4','Project4', 'London'),
('J5','Project5', 'Paris'),
('J6','Project6', 'London'),
('J7','Project7', 'Athenes');

select * from j;

create table spj(s char(2),p char(2), j char(2) ,Qty float );

insert into spj (s, p, j, qty)values
('S1','P1', 'J1',50 ),
('S2','P2', 'J2', 40),
('S3','P3', 'J3',6 ),
('S4','P4', 'J4',10),
('S5','P5', 'J5',20),
('S6','P6', 'J6',50),
('S7','P7', 'J7',870);

select * from spj;

select * from s;
select s,sname from s;

select pname,color from p
where city ='London';

select sname from s
where city ='Athenes' or 'Paris';

select pname from p
where city ='Athenes';

select pname from p
where weight >=60 and weight <=700;

select s,sname from s
where Status >=30;

select s,sname,city from s
where city !='London' ;

select distinct city from s;

select weight/1000 as "KILOGRAMS", weight as "GRAMS",weight*1000 as "MILLIGRAMS" from p;