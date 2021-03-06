DROP SCHEMA IF EXISTS photo;
CREATE SCHEMA photo;
USE photo;

create table photo (
	photo_id int not null auto_increment,
    photo_url varchar(255),
    photo_comment varchar(1024),
    primary key(photo_id)
); primary key(id)
);

insert into 