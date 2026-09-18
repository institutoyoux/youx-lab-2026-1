create table resumos (
	id uuid not null primary key,
	data date not null unique,
	ganhos numeric not null,
	perdas numeric not null
);