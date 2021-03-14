DROP SCHEMA IF EXISTS video;
CREATE SCHEMA video;
USE video;

create table video (
	video_id int not null auto_increment,
    video_url varchar(255),
    video_comment varchar(1024),
    primary key(video_id)
);

insert into video (video_url, video_comment) values 
("w3w8TGDNmWs", "any comment"),
("d99S9tLFlrI", "any comment"),
("nuen_bAoimc", "any comment"),
("sbDwmPqCHfQ", "any comment")
;

