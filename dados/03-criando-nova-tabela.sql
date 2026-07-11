create table profissao (
	idprofissao integer not null,
	nome varchar(30) not null,
	
	constraint primaryKey_cliente_idprofissao primary key (idprofissao),
	constraint unique_profissao_nome unique (nome)
);

insert into profissao (idprofissao, nome) values (1, 'Estudante');
insert into profissao (idprofissao, nome) values (2, 'Engenheiro');
insert into profissao (idprofissao, nome) values (3, 'Pedreiro');
insert into profissao (idprofissao, nome) values (4, 'Jornalista');
insert into profissao (idprofissao, nome) values (5, 'Professor');



create table nacionalidade (
	id int not null primary key,
	nome varchar(30) not null unique
 );

select * from nacionalidade;
insert into nacionalidade (id, nome) values (1, 'Brasileira');
insert into nacionalidade (id, nome) values (2, 'Italiana');
insert into nacionalidade (id, nome) values (3, 'Norte-americana');
insert into nacionalidade (id, nome) values (4, 'Alemã');


