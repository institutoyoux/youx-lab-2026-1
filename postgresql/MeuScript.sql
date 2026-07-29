
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

select from * bairro;

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
update cliente set idnacionalidade = 2 where  idcliente in (5,7);
update cliente set idnacionalidade = 3 where idcliente = 8;
update cliente set idnacionalidade = 4 where idcliente in (9,13);

select * from cliente;
alter table cliente drop complemento;
alter table cliente add idcomplemento integer; 
alter table cliente add constraint fk_cln_idcomplemento foreign key (idcomplemento) references complemento (idcomplemento);
update cliente set idcomplemento = 1 where idcliente in (1,4,9,13);
update cliente set idcomplemento = 2 where idcliente in (2,3,7);

alter table cliente drop bairro;
alter table cliente add idbairro integer;
alter table cliente add constraint fk_cln_idbairro foreign key (idbairro) references bairro (idbairro);

update cliente set idbairro = 1 where idcliente in (1,12,13);
update cliente set idbairro = 2 where idcliente in (2,3,6,8,9);
update cliente set idbairro = 3 where idcliente in (1,12,13);
update cliente set idbairro = 4 where idcliente = 7;

select * from cliente
create table uf (
	iduf integer not null,
	nome varchar(30) not null,
	sigla char(2) not null,

	constraint pk_ufd_idunidade_federacao primary key (iduf),
	constraint un_ufd_nome unique (nome),
	constraint un_ufd_sigla unique (sigla)

);
insert into uf (iduf,nome,sigla) values (1, 'Santa Catrina', 'SC');
insert into uf (iduf, nome , sigla) values (2,'Paraná', 'PR');
insert into uf (iduf, nome , sigla) values (3,'São Paulo', 'SP');
insert into uf (iduf, nome , sigla) values (4,'Minas Gerais', 'MG');
insert into uf (iduf, nome , sigla) values (5,'Rio Grande do Sul', 'RS');
insert into uf (iduf, nome, sigla) values (6, 'Rio de Janeiro', 'RJ');
select * from uf

create table municipio (
	idmunicipio integer not null,
	nome varchar(30) not null,
	iduf integer not null,

	constraint pk_mnc_idmunicipio primary key (idmunicipio),
	constraint un_mnc_nome unique (nome),
	constraint fk_mnc_iduf foreign key (iduf) references uf (iduf)
	
);
insert into municipio (idmunicipio,nome, iduf) values (1, 'Porto União', 1);
insert into municipio (idmunicipio, nome, iduf) values (2, 'Canoinhas', 1);
insert into municipio (idmunicipio, nome, iduf ) values (3, 'Porto Vitória', 2);
insert into municipio (idmunicipio, nome, iduf ) values (4, 'General Carneiro', 2);
insert into municipio (idmunicipio, nome, iduf ) values (5, 'São Paulo', 3);
insert into municipio (idmunicipio, nome, iduf ) values (6, 'Rio de Janeiro', 6);
insert into municipio (idmunicipio, nome, iduf ) values (7, 'Porto Alegre', 5);
insert into municipio (idmunicipio, nome, iduf ) values (8, 'União da Vitoria', 2);
insert into municipio (idmunicipio, nome, iduf ) values (9, 'Uberlandia', 4);
select * from municipio

select * from cliente
alter table cliente drop municipio;
alter table cliente drop uf;
alter table cliente add idmunicipio integer;
alter table cliente add constraint fk_cliente_idmunicipio foreign key (idmunicipio) references municipio (idmunicipio);

update cliente set idmunicipio = 1 where idcliente in (1,2,10,11);
update cliente set idmunicipio = 2 where idcliente in (3,12);
update cliente set idmunicipio = 3 where idcliente = 4;
update cliente set idmunicipio = 4 where idcliente in (5);
update cliente set idmunicipio = 5 where idcliente in (6,13);
update cliente set idmunicipio = 6 where idcliente in (7);
update cliente set idmunicipio = 7 where idcliente in (8);
update cliente set idmunicipio = 8 where idcliente in (9);
update cliente set idmunicipio = 9 where idcliente in (14, 15);

select * from cliente

create table fornecedor (
	idfornecedor integer not null,
	nome varchar(50) not null,

	constraint pk_fnd_idfornecedor primary key (idfornecedor),
	constraint un_fnd_nome unique (nome)
);

insert into fornecedor (idfornecedor, nome )  values (1, 'Cap.Computadores');
insert into fornecedor (idfornecedor, nome )  values (2, 'AA.Computadores');
insert into fornecedor (idfornecedor, nome )  values (3, 'BB.Maquinas');


create table vendedor(
	idvendedor integer not null,
	nome varchar(50) not null,

	constraint pk_vdr_idvendedor primary key (idvendedor),
	constraint un_vdr_nome unique (nome)
	
);

insert into vendedor (idvendedor, nome) values (1, 'André');
insert into vendedor (idvendedor, nome) values (2, 'Alisson');
insert into vendedor (idvendedor, nome) values (3, 'José');
insert into vendedor (idvendedor, nome) values (4, 'Ailton');
insert into vendedor (idvendedor, nome) values (5, 'Maria');
insert into vendedor (idvendedor, nome) values (6, 'Suelem');
insert into vendedor (idvendedor, nome) values (7, 'Aline');
insert into vendedor (idvendedor, nome) values (8, 'Silvana');

create table transportadora(
	idtransportadora integer not null,
	idmunicipio integer,
	nome varchar(50) not null,
	logrdouro varchar(50),
	numero varchar(10),

	
    constraint pk_tpd_idtransportadora primary key (idtransportadora),
	constraint fk_tpd_idmunicipio foreign key (idmunicipio) references municipio (idmunicipio),
	constraint un_tpd_nome unique (nome)

);

insert into transportadora (idtransportadora, idmunicipio, nome, logrdouro, numero) values (1,9, 'BS.Transportes', 'Rua das Limas', '01');
insert into transportadora (idtransportadora, idmunicipio, nome, logrdouro, numero) values (2,5, 'União Transportes', null, null);

create table Produto(
	idproduto integer not null,
	idfornecedor integer not null,
	nome varchar(50) not null,
	valor numeric(10,2) not null,
	

	
    constraint pk_pdt_idproduto primary key (idproduto),
	constraint fk_fnc_idfornecedor foreign key (idfornecedor) references fornecedor (idfornecedor)
	
	
);

insert into Produto (idproduto, idfornecedor, nome, valor) values (1,1, 'Microcomputador', '800');
insert into Produto (idproduto, idfornecedor, nome, valor) values (2,1, 'Monitor', '500');
insert into Produto (idproduto, idfornecedor, nome, valor) values (3,2, 'Placa mãe', '200');
insert into Produto (idproduto, idfornecedor, nome, valor) values (4,2, 'HD', '150');
insert into Produto (idproduto, idfornecedor, nome, valor) values (5,2, 'Placa de video', '200');
insert into Produto (idproduto, idfornecedor, nome, valor) values (6,3, 'Memória RAM', '100');
insert into Produto (idproduto, idfornecedor, nome, valor) values (7,1, 'Gabinete', '35');
select * from fornecedor;

create table pedido(

	idpedido integer not null, 
	idcliente integer not null,
	idtransportadora integer,
	idvendedor integer not null,
	data_pedido date not null,
	valor float not null,

	constraint pk_pdd_idpedido primary key (idpedido),
	constraint fk_pdd_idcliente foreign key (idcliente) references cliente (idcliente),
	constraint fk_pdd_idtransportadora foreign key (idtransportadora) references  transportadora (idtransportadora),
	constraint fk_pdd_idvendedor foreign key (idvendedor) references vendedor (idvendedor)
	
);
select * from cliente
select * from transportadora 
select * from vendedor 
update cliente set nome = 'Manoel' where idcliente =1
insert into pedido(idpedido,data_pedido,valor,idcliente,idtransportadora,idvendedor) values (1, '2000-04-01', 1300, 1, 1, 1);
insert into pedido(idpedido,data_pedido,valor,idcliente,idtransportadora,idvendedor) values (2, '2008-04-01', 500, 1 ,1, 1);
insert into pedido(idpedido,data_pedido,valor,idcliente,idtransportadora,idvendedor) values (3, '2008-04-02', 300, 11,2,5);
insert into pedido(idpedido,data_pedido,valor,idcliente,idtransportadora,idvendedor) values (4, '2008-04-05', 1000, 8,1,7);
insert into pedido(idpedido,data_pedido,valor,idcliente,idtransportadora,idvendedor) values (5, '2008-04-06', 200, 9,2,6);
insert into pedido(idpedido,data_pedido,valor,idcliente,idtransportadora,idvendedor) values (6, '2008-04-06', 1985, 10,1,6);
insert into pedido(idpedido,data_pedido,valor,idcliente,idtransportadora,idvendedor) values (7, '2008-04-06', 800, 3,1,7);
insert into pedido(idpedido,data_pedido,valor,idcliente,idtransportadora,idvendedor) values (8, '2008-04-06', 175, 3,null,7);
insert into pedido(idpedido,data_pedido,valor,idcliente,idtransportadora,idvendedor) values (9, '2008-04-07', 1300,12,null,8);
insert into pedido(idpedido,data_pedido,valor,idcliente,idtransportadora,idvendedor) values (10, '2008-04-10', 200,6,1,8);
insert into pedido(idpedido,data_pedido,valor,idcliente,idtransportadora,idvendedor) values (11, '2008-04-15', 300,15,2,1);
insert into pedido(idpedido,data_pedido,valor,idcliente,idtransportadora,idvendedor) values (12, '2008-04-20', 300,15,2,5);
insert into pedido(idpedido,data_pedido,valor,idcliente,idtransportadora,idvendedor) values (13, '2008-04-20', 350,9,1 ,7);
insert into pedido(idpedido,data_pedido,valor,idcliente,idtransportadora,idvendedor) values (14, '2008-04-23', 300,2,1,5);
insert into pedido(idpedido,data_pedido,valor,idcliente,idtransportadora,idvendedor) values (15, '2008-04-25', 200,11,null,5);
select * from pedido

create table pedido_produto(
	idpedido integer not null, 
	idproduto integer not null,
	quantidade integer not null,
	valor_unitario float not null,

	constraint pk_pdp_idpedidoproduto primary key (idpedido, idproduto),
	constraint fk_pdp_idpedido foreign key (idpedido) references pedido (idpedido),
	constraint fk_pdp_idproduto foreign key (idproduto) references produto (idproduto)
);
select * from produto
select * from pedido_produto
insert into pedido_produto(idpedido, idproduto,quantidade, valor_unitario) values (1, 1, 1, 800);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (1, 2, 1, 500);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (2, 2, 1, 500);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (3, 4, 2, 150);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (4, 1, 1, 800);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (4, 3, 1, 200);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (5, 3, 1, 200);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (6, 1, 2, 800);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (6, 7, 1, 35);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (6, 5, 1, 200);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (6, 4, 1, 150);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (7, 1, 1, 800);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (8, 7, 5, 35);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (9, 1, 1, 500);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (9, 2, 1, 500);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (10, 5, 1, 200);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (11, 5, 1, 200);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (11, 6, 1, 100);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (12, 2, 1, 500);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (13, 3, 1, 200);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (13, 4, 1, 150);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (14, 6, 3, 100);
insert into pedido_produto(idpedido,idproduto,quantidade,valor_unitario) values (15, 3, 1, 200);

select nome from vendedor order by nome asc 
select nome , valor from produto where valor > 200 order by valor 
select nome, valor, (valor * 10 ) / 100 as Reajuste from produto order by nome 
select * from uf
select * from municipio where iduf = 5
select * from pedido where data_pedido between '2008-04-10' and '2008-04-25'
select * from pedido where valor not between 100 and 500
select * from vendedor
select * from  pedido where idvendedor = 1 order by valor desc
select * from cliente 
select * from pedido where idcliente = 1 order by valor 
select * from pedido where idcliente = 15 and idvendedor  = 1
select * from transportadora = 2
select * from vendedor
select * from pedido where idvendedor = 5 or idvendedor = 7
select * from municipio
select * from cliente where idmunicipio = 1 or idmunicipio = 9 
select * from cliente where idmunicipio = <> 1  or idmunicipio <> 9
select * from cliente where logradouro is null
select * from cliente where logradouro like 'Av%'
select * from vendedor where nome like 'S%'
select * from vendedor where nome like '%a'
select * from vendedor where nome not  like 'A%'
select * from uf 
select * from municipio where nome like 'P%' and iduf = 1
select * from transportadora where logrdouro is not null
select * from pedido_produto where idpedido = 1 
select * from pedido_produto where idpedido = 6 or idpedido = 10

--funcoes agregadas
select avg(valor) from pedido

select count(idmunicipio) from municipio

select count(*) from municipio

select * from transportadora
select count (logrdouro) from transportadora
select count (idtransportadora) from transportadora

select * from municipio
select count(idmunicipio) from municipio where iduf = 2
select max(valor) from pedido
select min(valor), max(valor) from pedido
select sum(valor) from pedido
select idcliente, sum(valor) from pedido group by idcliente
select idcliente, sum(valor) from pedido group by idcliente having sum(valor) > 500

select * from pedido

select idvendedor, avg(valor) from pedido group by idvendedor having sum(valor) > 200

select idvendedor, sum(valor) from pedido group by idvendedor having sum(valor) > 1500

select idvendedor, sum(valor) from pedido group by idvendedor

select * from transportadora
select count(idmunicipio) from municipio

select count(idmunicipio) from municipio where iduf = 2 or iduf = 1;
select iduf, count(*) as qtd_cidades from municipio group by iduf
select count(idcliente), from cliente where logradouro is not null
select count(idmunicipio) from cliente where logradouro is not null
select count(idfornecedor) from fornecedor
select count idfornecedor, count(idproduto) from produto group by idfornecedor
select avg(valor) from produto where idfornecedor = 1
select sum(valor) from produto
select nome, valor from produto order by valor desc limit 1
select nome, valor from produto order by valor asc limit 1
select idfornecedor, avg(valor) from produto group by idfornecedor 
select avg(valor) from produto
select count(idtransportadora) from transportadora
select avg(valor) from pedido
select idcliente, sum(valor) from pedido group by idcliente
select idvendedor , sum(valor) from pedido group by idvendedor
select idtransportadora, sum(valor) from pedido group by idtransportadora
select data_pedido, sum(valor) from pedido group by data_pedido
select idcliente, idvendedor, idtransportadora, sum(valor) from pedido group by idcliente,idvendedor, idtransportadora
select sum(valor) from pedido where data_pedido between '2008-04-01' and '2009-12-10' and valor > 200
select avg(valor) from pedido where idvendedor = 1
select avg(valor) from pedido where  idcliente = 15
select count(idpedido), from pedido where idtransportadora = 1
select idvendedor,count(idpedido) from pedido group by idvendedor
select idcliente, count(idpedido) from pedido group by idcliente
select count(idpedido) from pedido where data_pedido between '2008-04-15' and '2008-04-25'
select count(idpedido) from pedido where valor > 1000
select count(idproduto) from produto where idproduto = 1
select count(idproduto) from produto group by idproduto
select idpedido, sum(valor_unitario) from pedido_produto group by idpedido
select idpedido, sum(quantidade) from pedido_produto group by idpedido
select sum(valor_unitario) from pedido_produto
select avg (valor_unitario) from pedido_produto where idpedido = 6
select max(valor_unitario) from pedido_produto
select idpedido, sum(quantidade) from pedido_produto group by idpedido
select sum(valor_unitario) from pedido_produto
--select count(*)  from pedido where valor > 200
--select idvendedor, sum(valor) / count(*) from pedido group by idvendedor having sum(valor) > 200

--relacionamento com joins
select
	cln.nome as cliente,
	prf.nome as profissao
from 
	cliente as cln
left outer join
	profissao as prf on cln.idprofissao = prf.idprofissao

select
	cln.nome as cliente,
	prf.nome as profissao
from 
	cliente as cln
right outer join
	profissao as prf on cln.idprofissao = prf.idprofissao


select
	cln.nome as cliente,
	prf.nome as profissao
from 
	cliente as cln
inner join
	profissao as prf on cln.idprofissao = prf.idprofissao

--exercicio--
--1-- 
select 
	cln.nome as cliente,
	prf.nome as profissao,
	ncn.nome as nacionalidade,
	cln.logradouro,
	cmp.nome as complemento,
	brr.nome as bairro,
	mnc.nome as municipio,
	uf.nome as estado,
	uf.sigla 
from 
	cliente  as cln 
left outer join 
	profissao as prf on cln.idprofissao = prf.idprofissao
left outer join 
	nacionalidade ncn on cln.idnacionalidade = ncn.idnacionalidade
left outer join
	complemento cmp on cln.idcomplemento = cmp.idcomplemento
left outer join
	bairro brr on cln.idbairro = brr.idbairro
left outer join
	municipio mnc on cln.idmunicipio = mnc.idmunicipio
left outer join
	uf on mnc.iduf = uf.iduf

--2--
select 
	prd.nome as produto,
	prd.valor,
	frn.nome as fornecedor
from 
	produto prd
left outer join
	fornecedor frn on prd.idfornecedor = frn.idfornecedor
--3--
select 
	trs.nome as transportadora,
	mnc.nome as municipio
from 
	transportadora trs
left outer join
	municipio mnc on trs.idmunicipio = mnc.idmunicipio
--4-- 
select 
	pdd.data_pedido,
	pdd.valor,
	cln.nome as cliente, 
	trn.nome as transportadora
from 
	pedido pdd
left outer  join
	cliente cln on pdd.idcliente = cln.idcliente
left outer join
	transportadora trn on pdd.idtransportadora = trn.idtransportadora
left outer join 
	vendedor vnd on pdd.idvendedor = vnd.idvendedor
--5--
select 
	pdt.nome as produto,
	pdp.quantidade,
	pdp.valor_unitario
from 
	pedido_produto pdp
left outer join
	produto pdt on pdp.idproduto = pdt.idproduto

--6--
select
	cln.nome,
	pdd.data_pedido
from
	cliente cln
left outer join 
	pedido pdd on cln.idcliente = pdd.idcliente
order by 
	cln.nome

--7--
select
	cln.nome,
	pdd.data_pedido
from
	cliente cln
left outer join 
	pedido pdd on cln.idcliente = pdd.idcliente
order by 
	cln.nome
--8--
select
	mnc.nome as municipio,
	count(cln.idcliente) as quantidade
from 
	cliente cln
inner join
	municipio mnc on cln.idmunicipio = mnc.idmunicipio
group by
	mnc.nome 
--9--
select 
	frn.nome as fornecedor,
	count(pdd.idproduto)
from 
	produto pdd
left outer join
	fornecedor frn on pdd.idfornecedor = frn.idfornecedor
group by 
	frn.nome
--10--
select
	cln.nome as cliente,
	sum(pdd.valor) as total
from
	pedido pdd
left outer join
	cliente cln on pdd.idcliente = cln.idcliente
group by 
	cln.nome
--11--
select 
	vnd.nome as vendedor,
	sum(pdd.valor) as total
from
	pedido pdd
left outer join
	vendedor vnd on pdd.idvendedor = vnd.idvendedor
group by 
	vnd.nome
--12--
select 
	trn.nome as transportadora,
	sum(pdd.valor) as total
from
	pedido pdd
inner join
	transportadora trn on pdd.idtransportadora = trn.idtransportadora
group by 
	trn.nome

--13--
select 
	cln.nome as cliente,
	count(pdd.idpedido) as total
from
	pedido pdd
left outer join
	cliente cln on pdd.idcliente = cln.idcliente

group by
	cln.nome
--14--
select
	pdt.nome as produto,
	sum(pdp.quantidade) as total
from
	pedido_produto pdp
left outer join 
	produto pdt on pdp.idproduto = pdt.idproduto
group by 
	pdt.nome

--15--
select 
	pdd.data_pedido,
	sum(pdp.valor_unitario) as total
from
	pedido_produto pdp
left outer join
	pedido pdd on pdp.idpedido = pdd.idpedido
group by
	pdd.data_pedido

--16--
select 
	pdd.data_pedido,
	sum(pdp.valor_unitario) as quantidade
from
	pedido_produto pdp
left outer join
	pedido pdd on pdp.idpedido = pdd.idpedido
group by
	pdd.data_pedido
--comando adicionais--
select  * from pedido
select
	data_pedido,

	extract(day from data_pedido),
	extract(month from data_pedido),
	extract(year from data_pedido)
from
	pedido

select nome, substring(nome from 1 for 5), substring(nome, 2) from cliente

select nome, upper(nome) from cliente

select nome, cpf, coalesce(cpf,'Não informado') from cliente

select
	 case sigla 
	 when 'PR' then 'Paraná'
	 when 'SC' then 'Santa Catarina'
	 else 'Outros'
	 end as uf
	 
from 
	uf

--exercicios--
--1--
select * from cliente

select
	nome,
	extract(month from data_nascimento)
from 
	cliente

--2--
select
	nome,
	case extract(month from data_nascimento)
	when 1 then 'Janeiro'
	when 2 then 'Fevereiro'
	when 3 then 'Março'
	when 4 then 'Abril'
	when 5 then 'Maio'
	when 6 then 'Junho'
	when 7 then 'Julho'
	when 8 then 'Agosto'
	when 9 then 'Setembro'
	when 10 then 'Outubro'
	when 11 then 'Novembro'
	when 12 then 'Dezembro'
else 
	'Não informado'

end as mes
from 
	cliente
--3--
select 
	nome,
	coalesce(extract(year from data_nascimento),0)
from 
	cliente

--4--
select nome, substring(nome from 5 for 10) from municipio

--5--
select nome,upper(nome) from municipio
--6--
select 
	nome,
	case genero
	    when 'M' then 'Masculino'
		when 'F' then 'Feminino'
	end as genero 
from 
	cliente
--7--
select 
	nome,
	valor,
	case
		when valor > 500 then 'Acima de 500'
		else
			'Abaixo de 500'
	end as faixa
from 
	produto
--subconsultas--
select 
	data_pedido,
	valor
from 
	pedido
where
	 valor > (select avg(valor) from pedido)

--exemplo com count 
select 
	pdd.data_pedido,
	pdd.valor,
	(select sum(quantidade) from pedido_produto pdp where pdp.idpedido = pdd.idpedido) as total
from 
	pedido pdd

select * from pedido_produto
-- Exemplo com update
select * from pedido

update pedido set valor = valor + ((valor * 5) / 100)
where valor > (select avg(valor) from pedido)
	

--exercicios--
--1
select * from cliente
select 
	 nome,
	 cliente.idmunicipio
from 
	cliente
where 
	idmunicipio = (select idmunicipio from cliente where nome = 'Manoel')
and 
	idcliente <> 1 
--2
select * from pedido
select 
	data_pedido,
	valor
from 
	pedido
where
	valor < (select avg(valor)  from pedido)
--3
select * from pedido
cliente
select 
	pdd.data_pedido,
	pdd.valor,
	cln.nome as cliente,
	vnd.nome as vendedor,
	(select count(quantidade) from pedido_produto pdp)
from 
	pedido pdd
left outer join 
	cliente cln on pdd.idcliente = cln.idcliente
left outer join 
	vendedor vnd on pdd.idcliente = cln.idcliente
 
--4
select 
	nome,
	idmunicipio 
from 
	cliente
where 
	idmunicipio = (select idmunicipio from transportadora where idtransportadora = 1)
	
--5
select 
	nome,
	idmunicipio
from 
	cliente
where 
	idmunicipio in (select idmunicipio from transportadora)
	
--6
update 
	pedido 
set 
	valor = valor + ((valor * 5) / 100)
where	
	(select sum(pdp.valor_unitario) from pedido_produto pdp where pdp.idpedido = pedido.idpedido) > (select a)
	
select 
	idpedido
from 
	pedido pdd
select avg(valor_unitario) from pedido_produto pdp where pdp.idpedido = pedido.idpedido) >(select avg(valor_unitario) from pedido_prduto)

select * from pedido
select * from pedido_produto 
	
--7
select 
	cln.nome,
	(select count(idpedido) from pedido pdd where pdd.idcliente = cln.idcliente) as total

from 
	cliente cln
	
--8
select 	
	pdd.idcliente
	count(pdd.idpedido)
from
	pedido pdd
left outer join
	cliente cln on pdd.idcliente = cln.idcliente
group by
	pdd.idcliente
--Views
drop view cliente_profissao;

create view cliente_profissao as 
select 
	cln.nome as cliente,
	cln.cpf,
	prf.nome as profissao
from 
	cliente cln 
left outer join 
	profissao prf  on cln.idprofissao = prf.idprofissao

select cliente from cliente_profissao where profissao = 'Professor'
select * from cliente_profissao

--exercicios
--1
create or replace view dados_cliente as 
select 
	cln.nome as cliente, 
	prf.nome as profissao,
	nac.nome as nacionalidade,
	cmp.nome as complemento, 
	mcp.nome as municipio, 
	uf.nome as uf,
	brr.nome as bairro,
	cln.cpf,
	cln.rg,
	cln.data_nascimento,
	cln.genero,
	cln.logradouro,
	cln.numero_residencia,
	cln.observacoes
from 
	cliente as cln
left outer join 
	profissao as prf on cln.idprofissao = prf.idprofissao
left outer join
	nacionalidade as nac on cln.idnacionalidade = nac.idnacionalidade
left outer join 
	complemento as cmp on cln.idcomplemento = cmp.idcomplemento
left outer join 
	municipio as mcp on cln.idmunicipio = mcp.idmunicipio 
left outer join 
	uf on mcp.iduf = uf.iduf
left outer join 
	bairro as brr on cln.idbairro = brr.idbairro
	
	
	
select * from cliente
select * from municipio
select * from dados_cliente
--2
create view municipio_uf as 
select 
	mcp.nome as municipio,
	uf.nome as uf
from municipio as mcp
left outer join 
	uf on mcp.iduf = uf.iduf
select * from municipio_uf
--3
select * from produto
select * from fornecedor
create view produto_fornecdor as 
select 
	pdt.nome as produtos,
	fnc.nome as fornecedor,
	pdt.valor as valor 
	
from 
	 produto  as pdt 
left outer join 
	fornecedor as fnc on pdt.idfornecedor = fnc.idfornecedor
select * from produto_fornecdor
--4
select * from transportadora
select * from municipio
create or replace view dados_transportadora as 
select 
	tpd.nome as transportadora,
	tpd.logrdouro as logradouro,
	tpd.numero as numero,
	uf.nome as unidade_federacao,
	uf.sigla
	
from 
	transportadora as tpd
left outer join 
	municipio as m on tpd.idmunicipio = m.idmunicipio
left outer join
	uf on m.iduf = uf.iduf
	

	
select * from dados_transportadora

--5
select * from vendedor
create view Dados_pedido as 
select 
	pdd.data_pedido,
	pdd.valor,
	trn.nome as transportadora,
	cln.nome as cliente,
	vnd.nome as vendedor
from 
	pedido pdd
left outer join 
	transportadora trn on pdd.idtransportadora = trn.idtransportadora
left outer join 
	cliente cln on pdd.idcliente = cln.idcliente
left outer join 
	vendedor vnd on pdd.idvendedor = vnd.idvendedor
select * from Dados_pedido

--6
select * from pedido_produto
create view produto_pedido as
select 
	prd.nome as produto,
	pdp.quantidade,
	pdp.valor_unitario
from
	pedido_produto pdp
left outer join 
	produto prd on pdp.idproduto = prd.idproduto
--campos autoincremento 
create table exemplo ( 
	idexemplo serial not null,
	nome varchar(50) not null, 
	
	constraint pk_exemplo_idexemplo primary key (idexemplo)
	
);
insert into exemplo (nome) values ('exemplo 1');
insert into exemplo (nome) values ('exemplo 2');
insert into exemplo (nome) values ('exemplo 3');
insert into exemplo (nome) values ('exemplo 4');
insert into exemplo (nome) values ('exemplo 5');

select * from exemplo 

select max(idbairro) + 1 from bairro
create sequence bairro_id_seq minvalue 5
alter table bairro alter idbairro set default nextval('bairro_id_seq')
alter sequence 	bairro_id_seq owned by bairro.idbairro
insert into bairro (nome) values ('teste 1');
insert into bairro (nome) values ('teste 2');
select * from bairro
	
select * from cliente order by idcliente;

select max(idcliente) + 1 from cliente
create sequence cliente_id_seq minvalue 18
alter table cliente alter idcliente set default nextval('cliente_id_seq')
alter sequence cliente_id_seq owned by cliente.idcliente
insert into cliente (nome) values ('teste 1')


select * from complemento;

select max(idcomplemento) + 1 from complemento 
create sequence complemento_id_seq minvalue 3
alter table complemento alter idcomplemento  set default nextval('complemento_id_seq')
alter sequence complemento_id_seq owned by complemento.idcomplemento
insert into complemento (nome) values ('teste 1')


select * from fornecedor;

select max(idfornecedor) + 1 from fornecedor 
create sequence fornecedor_id_seq minvalue 4
alter table fornecedor alter idfornecedor  set default nextval('fornecedor_id_seq')
alter sequence fornecedor_id_seq owned by fornecedor.idfornecedor
insert into fornecedor(nome) values ('teste')

select * from municipio;

select max(idmunicipio) + 1 from municipio
create sequence municipio_id_seq minvalue 10 
alter table municipio alter idmunicipio set default nextval('municipio_id_seq')
alter sequence municipio_id_seq owned by municipio.idmunicipio
insert into municipio(nome) values ('teste')

select * from nacionalidade
  
select max(idnacionalidade) + 1 from nacionalidade
create sequence nacionalidade_id_seq minvalue 5
alter table nacionalidade alter idnacionalidade set default nextval('nacionalidade_id_seq')
alter sequence nacionalidade_id_seq owned by nacionalidade.idnacionalidade
insert into nacionalidade(nome) values ('teste')


select * from pedido;

select max (idpedido) + 1 from pedido 
create sequence pedido_id_seq minvalue 16
alter table pedido alter idpedido set default nextval('pedido_id_seq')
alter sequence pedido_id_seq owned by pedido.idpedido



select * from pedido_produto
select * from profissao

select max(idprofissao) + 1 from profissao 
create sequence profissao_id_seq minvalue 6
alter table profissao alter idprofissao set default nextval('profissao_id_seq')
alter sequence profissao_id_seq owned by profissao.idprofissao


select * from transportadora 

select max(idtransportadora ) + 1  from transportadora 
create sequence transportadora_id_seq minvalue 3
alter table transportadora alter idtransportadora set default nextval('transportadora_id_seq')
alter sequence transportadora_id_seq owned by transportadora.idtransportadora

select * from uf

select max (iduf) + 1 from uf
create sequence uf_id_seq minvalue 7
alter table uf alter iduf set default nextval('uf_id_seq')
alter sequence uf_id_seq owned by uf.iduf

select * from vendedor 

select max(idvendedor) + 1 from vendedor 
create sequence vendedor_id_seq minvalue 9
alter table vendedor alter idvendedor  set default nextval('vendedor_id_seq')
alter sequence vendedor_id_seq  owned by vendedor.idvendedor

--campos default 
select * from pedido

alter table pedido alter column data_pedido set default current_date;
alter table pedido alter column valor set default 0;
insert into pedido(idcliente, idvendedor, data_pedido,valor)
values (1, 1, '2022-10-10', 234 )

--exercicios
select * from pedido_produto
alter table pedido_produto alter column quantidade set default 1;
alter table pedido_produto alter column valor_unitario set default 0;
insert into pedido_produto(idpedido,idproduto) values (18,2);

select * from produto
alter table produto alter column valor set default 0;
insert into produto(nome, idfornecedor, idproduto) values ('teste', 2, 89);

--indices
create index idx_cln_nome on cliente (nome);

select * from cliente

create index idx_pdd_data_pedido on pedido (data_pedido)
create index idx_pdr_nome on produto (nome)



