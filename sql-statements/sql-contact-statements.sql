DROP SCHEMA IF EXISTS contact;
CREATE SCHEMA contact;
USE contact;

create table contact (
	id int not null auto_increment,
    name varchar(255),
    last_name varchar(255),
    telephone_number varchar(255),
    email varchar(255),
    message varchar(1024),
    primary key(id)
);


