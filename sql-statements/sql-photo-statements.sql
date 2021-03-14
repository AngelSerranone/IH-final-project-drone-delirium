DROP SCHEMA IF EXISTS photo;
CREATE SCHEMA photo;
USE photo;

create table photo (
	photo_id int not null auto_increment,
    photo_url varchar(255),
    photo_comment varchar(1024),
    primary key(photo_id)
);

insert into photo (photo_url, photo_comment) values 
("square1.jpg", "The dark side of the cow"),
("square2.jpg", "Filomena rules"),
("square3.jpg", "Monasterio de San Lorenzo de El Escorial"),
("square4.jpg", "Industrial sky"),
("square5.jpg", "Valle de los caídos"),
("square6.jpg", "Chromo Houses"),
("square7.jpg", "Hey! whats up!"),
("square8.jpg", "Country roads, take me home"),
("square9.jpg", "Filomena rules, again"),
("square10.jpg", "When the sun goes down"),
("pano1.jpg", "When the sun goes down"),
("pano2.jpg", "When the sun goes down"),
("pano3.jpg", "When the sun goes down"),
("pano4.jpg", "When the sun goes down"),
("pano5.jpg", "When the sun goes down");
