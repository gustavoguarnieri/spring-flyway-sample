--DDL | Create table
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

create table ingredient (
	id uuid not null default uuid_generate_v4() primary key,
	product_id bigint not null,
	ingredient_name varchar (255) not null,
    portion varchar (255) not null
);

--Insert Data
insert into ingredient (product_id, ingredient_name, portion) values (1, 'Queijo', '300 gramas');
insert into ingredient (product_id, ingredient_name, portion) values (1, 'Presunto', '250 gramas');