create table app_user (
    id serial
        constraint app_user_pk
            primary key ,
    name varchar(30) not null,
    email varchar(50) not null,
    password varchar (50),
    role text
);

create unique index app_user_email_uindex
    on app_user (email);