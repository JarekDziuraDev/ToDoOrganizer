create table app_user (
    id BIGSERIAL not NULL,
    name varchar(30) not null,
    email varchar(50) not null,
    password varchar (50),
    constraint app_user_pkey PRIMARY KEY (id)
);

create unique index app_user_email_uindex
    on app_user (email);