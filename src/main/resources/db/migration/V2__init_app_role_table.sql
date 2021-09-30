create table app_role (
    id BIGSERIAL not NULL,
    name varchar(30) not null,
    CONSTRAINT tbl_role_pkey PRIMARY KEY (id)
);

create unique index app_role_name_uindex
    on app_role (name);