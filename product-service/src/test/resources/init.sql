create table product
(
    price       numeric(38, 2),
    description varchar(255),
    id          varchar(255) not null
        primary key,
    name        varchar(255)
);