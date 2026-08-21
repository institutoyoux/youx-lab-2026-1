create table users (
	id int not null primary key,
	email varchar(150) not null unique,
	data_nascimento date not null,
	password varchar not null,
	user_role varchar not null,
	blocked boolean not null default false
)
create table reset_codes (
	id int not null primary key,
	user_id int not null references users(id),
	code int not null,
	token uuid not null unique
)
create table games (
	id uuid not null primary key,
	user_id int not null references users(id),
	cells varchar not null,
	open_cells varchar,
	value_bet numeric not null,
	status varchar not null
)