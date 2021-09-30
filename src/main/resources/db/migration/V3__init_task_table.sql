create table task (
    id serial
        constraint task_pk
            primary key ,
    title varchar(30) not null,
    description text,
    done bit
);
