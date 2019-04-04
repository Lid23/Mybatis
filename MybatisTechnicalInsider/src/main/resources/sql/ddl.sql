DROP TABLE Blog;
DROP TABLE Author;
DROP TABLE Post;

create table Blog(
    id int not null comment 'ID',
    title varchar(20) comment '标题',
    author_id int,
    primary key (id)
);

create table Author(
    id int not null comment 'ID',
    username varchar(50) comment '用户姓名',
    password varchar(20) comment '密码',
    email varchar(50) comment '邮箱',
    primary key(id)
);

create table Post(
    id int not null,
    blog_id int,
    content varchar(100),
    primary key(id)
);


