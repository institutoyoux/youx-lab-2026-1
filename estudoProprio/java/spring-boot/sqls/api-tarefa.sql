create table tarefas (
	id uuid not null primary key,
	nome varchar(100) not null,
	tipo varchar(30) not null,
	data_cadastro date not null,
	data_termino date not null,
	status varchar(50) not null
)


select * from tarefas
delete from tarefas;
drop table tarefas;
drop table status;
drop table tipo;