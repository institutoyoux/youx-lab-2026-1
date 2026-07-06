create table cliente (
	idcliente integer not null,
	nome varchar(50),
	cpf char(11),
	rg varchar(15),
	data_nascimento date, 
	genero char(1),
	profissao varchar(30),
	nacionalidade varchar(30),
	logradouro varchar(30),
	numero_residencia varchar(10),
	complemento varchar(30),
	bairro varchar(30),
	municipio varchar(30),
	uf varchar(30),
	observacoes text,

	-- pk = primary key
	constraint pk_cln_idcliente primary key (idcliente)
);

insert into cliente(idcliente, Nome, CPF, RG, Data_nascimento, Genero, Profissao, Nacionalidade, Logradouro, Numero_residencia, Complemento, Bairro, Municipio, UF)
values (1, 'Manoel', '88828383821', '32323', '2001-10-10', 'M', 'Estudante','Brasileiro', 'Rua joaquim nabuco', '23', 'Casa', 'Cidade Nova', 'Porto Uniao', 'SC');

insert into cliente(idcliente, Nome, CPF, RG, Data_nascimento, Genero, Profissao, Nacionalidade, Logradouro, Numero_residencia, Complemento, Bairro, Municipio, UF)
values (2, 'Geraldo', '12343299291', '56565', '1987-01-04', 'M', 'Engenheiro','Brasileiro', 'Rua das Limas', '200', 'Ap.', 'Centro', 'Poro Uniao', 'SC');

insert into cliente(idcliente, Nome, CPF, RG, Data_nascimento, Genero, Profissao, Nacionalidade, Logradouro, Numero_residencia, Complemento, Bairro, Municipio, UF)
values (3, 'Carlos', '87732323227', '55463', '1967-10-01', 'M', 'Pedreiro','Brasileiro', 'Rua das Laranjeiras', '300', 'Apart.', 'Ctr.', 'Canoinhas', 'SC');

insert into cliente(idcliente, Nome, CPF, RG, Data_nascimento, Genero, Profissao, Nacionalidade, Logradouro, Numero_residencia, Complemento, Bairro, Municipio, UF)
values (4, 'Adriana', '12321222122', '98777', '1989-09-10', 'F', 'Jornalista','Brasileira', 'Rua das Limas', '240', 'Casa', 'Sao Pedro', 'Porto Vitoria', 'PR');

insert into cliente(idcliente, Nome, CPF, RG, Data_nascimento, Genero, Profissao, Nacionalidade, Logradouro, Numero_residencia, Complemento, Bairro, Municipio, UF)
values (5, 'Amanda', '99982838828', '28382', '1991-03-04', 'F', 'Jorn.','Italiana', 'Rua Av.Central', '100', null, 'Sao pedro', 'Cameiro', 'PR');

insert into cliente(idcliente, Nome, CPF, RG, Data_nascimento, Genero, Profissao, Nacionalidade, Logradouro, Numero_residencia, Complemento, Bairro, Municipio, UF)
values (6, 'Agelo', '99982828181', '12323', '200-01-01', 'M', 'Pedreiro','Brasileiro', 'Rua Av.Beira Mar', '300', null, 'Ctr.', 'Sao Paulo', 'SP');

insert into cliente(idcliente, Nome, CPF, RG, Data_nascimento, Genero, Profissao, Nacionalidade, Logradouro, Numero_residencia, Complemento, Bairro, Municipio, UF)
values (7, 'Anderson', null, null, null, 'M', 'Prof.','Italiano', 'Av.Brasil', '100', 'Apartamento', 'Santa Rosa', 'Rio de Janeiro', 'SP');

insert into cliente(idcliente, Nome, CPF, RG, Data_nascimento, Genero, Profissao, Nacionalidade, Logradouro, Numero_residencia, Complemento, Bairro, Municipio, UF)
values (8, 'Camila', '9998282828', null, '2001-10-10', 'F', 'Professora','Norte Americana', 'Rua Central', '4333', null, 'Centro.', 'Uberlancia', 'MG');

insert into cliente(idcliente, Nome, CPF, RG, Data_nascimento, Genero, Profissao, Nacionalidade, Logradouro, Numero_residencia, Complemento, Bairro, Municipio, UF)
values (9, 'Cristiano', null, null, null, 'M', 'Estudante','Alemã', 'Rua do centro', '877','Casa', 'Centro.', 'Porto Alegre', 'RS');


insert into cliente(idcliente, Nome, CPF, RG, Data_nascimento, Genero, Profissao, Nacionalidade, Logradouro, Numero_residencia, Complemento, Bairro, Municipio, UF)
values (10, 'Fabricio', '8828282828', '32323', null, 'M', 'Estudante','Brasileiro', null, null,null, null, 'PU', 'SC');

insert into cliente(idcliente, Nome, CPF, RG, Data_nascimento, Genero, Profissao, Nacionalidade, Logradouro, Numero_residencia, Complemento, Bairro, Municipio, UF)
values (11, 'Fernanda',null , null, null,'F', null,'Brasileira', null,null,null,null,'Porto Uniao','SC');


insert into cliente(idcliente, Nome, CPF, RG, Data_nascimento, Genero, Profissao, Nacionalidade, Logradouro, Numero_residencia, Complemento, Bairro, Municipio, UF)
values (12, 'Gilmar', '88881818181', '888', '2000-02-10', 'M', 'Estud.', null,'Rua das Laranjeiras', '200', 'null', 'C.Nova', 'Cnoninhas', 'SC');

insert into cliente(idcliente, Nome, CPF, RG, Data_nascimento, Genero, Profissao, Nacionalidade, Logradouro, Numero_residencia, Complemento, Bairro, Municipio, UF)
values (13, 'Diego', '1010191919', '111939', null, 'M', 'Professor', 'alemao','Rua central', '455', null , 'Cidade N.', 'São Paulo', 'SP');

insert into cliente(idcliente, Nome, CPF, RG, Data_nascimento, Genero, Profissao, Nacionalidade, Logradouro, Numero_residencia, Complemento, Bairro, Municipio, UF)
values (14, 'Jeferson', null, null, '1983-01-07', 'M', null, 'Brasileiro',null, null, null , null, 'Uniao da Vitoria', 'PR');

insert into cliente(idcliente, Nome, CPF, RG, Data_nascimento, Genero, Profissao, Nacionalidade, Logradouro, Numero_residencia, Complemento, Bairro, Municipio, UF)
values (15, 'Jessica', null, null, null, 'F', 'Estudante', null,null, null, null , null, 'Uniao da Vitoria', 'PR');

select * from cliente;
--exercicio-01--
select nome,genero,profissao from cliente order by nome desc;
select nome from cliente where nome like '%r%';
select nome from cliente where nome like 'C%';
select nome from cliente where nome like '%a';
select nome, bairro from cliente where bairro like 'Cen%';
select nome, complemento from cliente where complemento like 'A%';
select nome, genero from cliente where genero like 'F'
select nome, cpf from cliente where cpf is null;
select nome, profissao from cliente order by profissao;
select nome, nacionalidade from cliente where nacionalidade like 'Brasil'
select nome, numero from cliente where numero is not null;
select nome, uf from cliente where uf like 'SC';
select nome, data_nascimento from cliente where data_nascimento between '2000-01-01' and '2002-01-01';
select nome || ' - '  || logradouro || ' - ' || numero_residencia  || ' - '  || complemento || ' - ' || bairro || ' - ' || municipio || ' - ' || uf from cliente;
--exercicio02--
select * from cliente;
update cliente set nome = 'Manoel' where idcliente = 1;
update cliente set nome = 'Geraldo' where idcliente = 2;
update cliente set nome = 'Adriana', genero = 'F', numero_residencia = '240' where idcliente = 4;
delete from cliente where idcliente = 16;
insert into cliente(idcliente, nome, CPF,RG, Data_nascimento, genero, Profissao, Municipio,UF ) values (16,'Maicon','12349596421','1234','1985-10-10','F','Empresario','Florianopolis','PR' );
update cliente set CPF = '45390569432' where idcliente = 16;
update cliente set genero = 'M' where idcliente =16;
update cliente set nacionalidade ='Brasileira' where idcliente =16;
update cliente set UF = 'SC' where idcliente =16;
insert into cliente(idcliente, nome, RG, genero, Profissao, nacionalidade, logradouro, numero_residencia,complemento,bairro,municipio,UF) values (17,'Getulio', '4631','F','Estudante','Brasileira', 'Rua Central','343','Apartamento','Centro','Curitiba','SC');
update cliente set Data_nascimento = '1988-01-04' where idcliente=17;
update cliente set genero ='M' where idcliente=17;
insert into cliente(idcliente,nome,genero,Profissao,Nacionalidade,numero_residencia,complemento) values (18,'Sandra','M','Professor','Italiana','12','Bloco A');
update cliente set genero='F' where idcliente=18;
update cliente set Profissao ='Professora' where idcliente=18;
update cliente set numero_residencia ='123' where idcliente=18;
delete from cliente where idcliente=16;
delete from cliente where idcliente=18;
--criando novas tabelas--

create table profissao (	
	idprofissao integer not null,
	nome varchar(30) not null,

    constraint pk_prf_idprofissao primary key (idprofissao),
	constraint un_prf_nome unique (nome)
	
);
insert into profissao (idprofissao, nome) values (1,'Estudante');
insert into profissao (idprofissao, nome) values (2,'Engenheiro');
insert into profissao (idprofissao, nome) values (3,'Pedreiro');
insert into profissao (idprofissao, nome) values (4,'Jornalista');
insert into profissao (idprofissao, nome) values (5, 'Professor');

select * from profissao;

create table nacionalidade (
	idnacionalidade integer not null,
	nome varchar(30) not null,

	constraint pk_ncn_idnaciolidade primary key (idnacionalidade),
	constraint un_ncn_nome unique (nome)
);
select nacionalidade from cliente;

insert into nacionalidade (idnacionalidade,nome) values (1,'Brasileira');
insert into nacionalidade (idnacionalidade,nome) values (2, 'Italiana');
insert into nacionalidade (idnacionalidade,nome) values (3, 'Norte-Americana');
insert into nacionalidade (idnacionalidade,nome) values (4, 'Alemã');

select * from nacionalidade;

create table complemento (
	idcomplemento integer not null,
	nome varchar(30) not null,

	constraint pk_cpl_idcomplemento primary key (idcomplemento),
	constraint un_cpl_nome unique (nome)

);

insert into complemento (idcomplemento, nome) values (1,'Casa');
insert into complemento(idcomplemento, nome) values (2,'Apartamento');

select * from complemento;

create table bairro (
	idbairro interger not null,
	nome varchar(30) not null

	constraint pk_brr_idbairro primary key (idbairro),
	constraint un_brr_nome unique (nome)
);

insert into bairro (idbairro, nome) values (1, 'Cidade Nova');
insert into bairro (idbairro, nome) values (2, 'Centro');
insert into bairro (idbairro, nome) values (3, 'São Pedro');
insert into bairro (idbairro, nome) values (4, 'Santa Rosa');

select * from  bairro;

select * from cliente;

alter table cliente rename column profissao to idprfissao;
alter table cliente alter column idprofissao type integer;

--estudante-> 1,9,10,12,15,17
--engenheiro -> 2
-- pedreiro -> 3
-- jornalista-> 4, 5
--professor -> 6,7,8, 13
--Null -> 11,14

alter table cliente drop idprfissao;
alter table cliente add idprofissao integer;
alter table cliente add constraint fk_cln_idprofissao foreign key(idprofissao) references profissao(idprofissao); 

update cliente set idprofissao = 2 where idcliente = 2;
update cliente set idprofissao = 3 where  idcliente =3;
update cliente set idprofissao = 4 where idcliente in (4, 5);
update cliente set idprofissao = 5 where idcliente in (6,7,8,13);
update cliente set idprofissao = 1 where idcliente in (1,9,10,12,15, 17);
select * from profissao;
delete from profissao where idprofissao =1
insert into profissao (idprofissao, nome) values (10, 'Teste');

select * from cliente;
alter table cliente drop nacionalidade;  
alter table cliente add idnacionalidade integer;
alter table cliente add constraint fk_cln_idnacionalidade foreign key (idnacionalidade) references nacionalidade (idnacionalidade);
select * from nacionalidade
update cliente set idnacionalidade = 1 where idcliente in (1,2,3,4,6,10,11,14);
update cliente set idnacionalidade = 2 where  idcliente in (5,7));
update cliente set idnacionalidade = 3 where idcliente 





