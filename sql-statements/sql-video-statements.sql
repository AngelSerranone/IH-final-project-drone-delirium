DROP SCHEMA IF EXISTS video;
CREATE SCHEMA video;
USE video;

create table video (
	video_id int not null auto_increment,
    video_url varchar(255),
    video_comment varchar(255),
    primary key(video_id)
);

