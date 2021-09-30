alter table app_user
    add column role_id int null;

alter table app_user
    add foreign key (role_id) references app_role (id);