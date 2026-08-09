create table users (
	id uuid not null primary key,
	username varchar(50) unique not null,
	email varchar(100) unique not null,
	password varchar(300) not null,
	userRole varchar not null,
	urlFoto varchar not null
)

create table posts (
	id uuid not null primary key,
	user_id uuid not null references users(id),
	conteudo varchar(500) not null,
	data_criacao TIMESTAMPTZ not null default now()
)