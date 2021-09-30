create table app_role (
    id serial
        constraint app_role_pk
            primary key ,
    name varchar(30) not null

);

create unique index app_role_name_uindex
    on app_role (name);