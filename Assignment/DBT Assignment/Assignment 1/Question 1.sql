show databases;
use mumbai;
show tables;

create table SEMP;

insert into SEMP
values(EMPNO CHAR(4), EMPNAME CHAR(20), BASIC FLOAT, DEPTNO CHAR(2) , DEPTHEAD CHAR(4));

desc SEMP;
create table SEMP (EMPNO CHAR(4), EMPNAME CHAR(20), BASIC FLOAT, DEPTNO CHAR(2) , DEPTHEAD CHAR(4));
desc SEMP;
create table SDEPT(DEPTNO CHAR(2), DEPTNAME CHAR(15));

insert into SDEPT 
values ('10', 'Development'),
values ('20', 'Training');

desc SDEPT;
insert into SDEPT values ('10', 'Development');
insert into SDEPT values ('20', 'Training');

select * from SDEPT;

insert into SEMP (EMPNO,EMPNAME,BASIC,DEPTNO,DEPTHEAD)values
(0001, SUNIL, 6000, 10),
(0002, HIREN, 8000, 20);
desc SEMp;
insert into SEMP (EMPNO,EMPNAME,BASIC,DEPTNO,DEPTHEAD) values ('0001', 'SUNIL', 6000, '10',null);
insert into SEMP (EMPNO,EMPNAME,BASIC,DEPTNO) values ('0002', 'HIREN', 8000, '20');
select * from SEMP;

insert into SEMP(EMPNO,EMPNAME,BASIC,DEPTNO,DEPTHEAD) values 
('0003', 'ALI', 4000, '10', '0001' ),
('0004', 'GEORGE', 6000,null, '0002');
select * from SEMP;