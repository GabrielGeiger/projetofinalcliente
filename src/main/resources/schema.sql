drop table if exists cliente;

create table cliente(
    id_cliente bigint  auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null,

    telefone varchar(12) not null,
    cpf varchar (11) not null,
    primary key(id_cliente)
    );