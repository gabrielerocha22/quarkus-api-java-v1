create sequence hibernate_sequence start with 1 increment by 1;
create table Customer (id bigint not null, age varchar(255), email varchar(255), name varchar(255), primary key (id));
insert into Customer (id, name, email, age) values (1, 'Gabi', 'gabi@hotmail.com', 21);
insert into Customer (id, name, email, age) values (2, 'Teste', 'teste2@hotmil.com', 45);
insert into Customer (id, name, email, age) values (3, 'Teste3', 'ssssssss@hotmil.com', 87);
insert into Customer (id, name, email, age) values (4, 'Teste4', 'abcd@hotmil.com', 54);
insert into Customer (id, name, email, age) values (5, 'Teste5', 'abcd@hotmil.com', 16);
insert into Customer (id, name, email, age) values (6, 'Teste6', 'bbbbb@ccccccc.com', 12);