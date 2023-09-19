create table employee
(
	id int not null,
	name varchar(255),
	primary key (id)
);
insert into employee(id, name) values(1, 'Puneet');
insert into employee(id, name) values(2, 'Vineet');

create table course
(
	id bigint not null,
	name varchar(255) not null,
	author varchar(255) not null,
	primary key(id)
);
insert into course(id, name, author) values(1, 'Learn AWS', 'Ranga');
insert into course(id, name, author) values(2, 'Learn Azure', 'Ranga');