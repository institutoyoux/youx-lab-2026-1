CREATE TABLE clientes (
    idcliente INTEGER NOT NULL,
    nome VARCHAR(2253),
    cpf CHAR(11),
    rg VARCHAR(20),
    data_nascimento DATE,
    genero CHAR(1),
    profissao VARCHAR(29),
    nacionalidade VARCHAR(32),
    logradouro VARCHAR(179),
    numero VARCHAR(15),
    complemento VARCHAR(200),
    bairro VARCHAR(150),
    municipio VARCHAR(300),
    uf VARCHAR(5),
    observacoes TEXT,

	--Primary key
    CONSTRAINT pk_cln_idcliente PRIMARY KEY (idcliente)
);

INSERT INTO clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
VALUES (1, 'Manoel', '88828383821', '32323', '10/10/2001', 'M', 'Estudante', 'Brasileira', 'Rua Joaquim Nabuco', '23', 'Casa', 'Cidade Nova', 'Porto União', 'SC');

INSERT INTO clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
VALUES (2, 'Geraldo', '12343299291', '56565', '04/01/1987', 'M', 'Engenheiro', 'Brasileira', 'Rua das Limas', '200', 'AP.', 'Cientro', 'P. União', 'SC');

INSERT INTO clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
VALUES (3, 'Carlos', '87732323227', '55463', '01/10/1967', 'M', 'Pedreiro', 'Brasileira', 'Rua das Laranjeiras', '300', 'Apart.', 'Cto.', 'Canoinhas', 'SC');

INSERT INTO clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
VALUES (4, 'Adriana', '12321222122', '98777', '10/09/1989', 'F', 'Jornalista', 'Brasileira', 'Rua das Limas', '240', 'Casa', 'São Pedro', 'Porto Vitória', 'PR');

INSERT INTO clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
VALUES (5, 'Amanda', '99982838828', '28382', '04/03/1991', 'F', 'Jorn.', 'Italiana', 'Av.Central', '100', NULL, 'São Pedro', 'General Carneiro', 'PR');

INSERT INTO clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
VALUES (6, 'Ângelo', '99982828181', '12323', '01/01/2000', 'M', 'Professor', 'Brasileiro', 'Av. Beira Mar', '300', NULL, 'Ctr.', 'São Paulo', 'SP');

INSERT INTO clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
VALUES (7, 'Anderson', NULL, NULL, NULL, 'M', 'Prof.', 'Italiano', 'Av.Brasil', '100', 'Apartamento', 'Santa Rosa', 'Rio de Janeiro', 'SP');

INSERT INTO clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
VALUES (8, 'Camila', '9998282828', NULL, '10/10/2001', 'F', 'Professora', 'Norte americana', 'Rua da Central', '4333', NULL, 'Centro', 'Uberlância', 'MG');

INSERT INTO clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
VALUES (9, 'Cristiano', NULL, NULL, NULL, 'M', 'Estudante', 'Alemã', 'Rua do Centro', '877', 'Casa', 'Centro', 'Porto Alegre', 'RS');

INSERT INTO clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
VALUES (10, 'Fabricio', '8828282828', '32323', NULL, 'M', 'Estudante', 'Brasileiro', NULL, NULL, NULL, NULL, 'PU', 'SC');

INSERT INTO clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
VALUES (11, 'Fernanda', NULL, NULL, NULL, 'F', NULL, 'Brasileira', NULL, NULL, NULL, NULL, 'Porto União', 'SC');

INSERT INTO clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
VALUES (12, 'Gilmar', '88881818181', '888', '10/02/2000', 'M', 'Estud.', NULL, 'Rua das Laranjeiras', '200', NULL, 'Cidade N.', 'Canoinhas', 'SC');

INSERT INTO clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
VALUES (13, 'Diego', '1010191919', '111939', NULL, 'M', 'Professor', 'Alemão', 'Rua Central', '455', 'Casa', 'Cidade N.', 'São Paulo', 'SP');

INSERT INTO clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
VALUES (14, 'Jeferson', NULL, NULL, '01/07/1983', 'M', NULL, 'Brasileiro', NULL, NULL, NULL, NULL, 'União da Vitória', 'PR');

INSERT INTO clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
VALUES (15, 'Jessica', NULL, NULL, NULL, 'F', 'Estudante', NULL, NULL, NULL, NULL, NULL, 'União da Vitória', 'PR');

select * from clientes;

select nome, cpf from clientes;

select nome, data_nascimento as "Data de Nascimento" from clientes;

select 'CPF :' || cpf || 'RG: ' || rg as "CPF e RG" from clientes;

select * from clientes limit 3;


select nome, data_nascimento from clientes where data_nascimento > '2000-01-01';

select nome from clientes;

select nome from clientes where nome like 'C%';

select nome from clientes where nome like '%c%';

select nome, data_nascimento from clientes where data_nascimento between '1990-01-01' and '1998-01-01';

select nome, rg from clientes where rg is null;

select nome from clientes order by "nome";

select nome from clientes order by "nome" desc;

select nome from clientes order by "nome" asc;

select nome, genero, profissao from clientes order by "nome" asc;
select nome, genero, profissao from clientes order by "nome" desc;
select nome from clientes where nome like '%r%';
select nome from clientes where nome like 'C%';
select nome from clientes where nome like '%a';
select nome, bairro from clientes where bairro like 'Centro';
select nome, complemento from clientes where complemento like 'A%';
select nome, genero from clientes where genero like 'F';
select nome, cpf from clientes where cpf is null;
select nome, profissao from clientes order by "profissao" asc;
select nome, nacionalidade from clientes where nacionalidade like 'Brasileira';
select nome, numero from clientes where numero  is not null;
select nome, uf from clientes where uf like 'SC';
select nome, data_nascimento from clientes where data_nascimento between '01-01-2000' and '01-01-2002';
select nome|| '-' ||  logradouro||  '-' ||  numero ||  '-' || complemento|| '-' ||  bairro||  '-' ||  municipio||  '-' ||  uf as "Cliente concatenado" from clientes;

select * from clientes;
update clientes set nome = 'Teste' where idcliente = 1;
update clientes set nome = 'Adriano', genero = 'M', numero = '241'  where idcliente= 4;
insert into clientes (idcliente, nome ) values (16, 'João');
delete from clientes where idcliente = 16;

insert into clientes (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, municipio, uf) values ('16', 'Maicon', '12349596421', '1234', '10-10-1995', 'F', 'Empresário', 'Florianópolis', 'PR');
insert into clientes (idcliente, nome, rg, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro,  municipio, uf) values ('17', 'Getúlio', '4631', 'F', 'Estudante', 'Brasileira', 'Rua central', '343', 'Apartamento', 'Centro', 'Curitiba', 'SC');
insert into clientes (idcliente, nome, genero, profissao, nacionalidade, numero, complemento) values ('18', 'Sandra', 'M', 'Professor', 'Italiana', '12', 'Bloco A');
update clientes set cpf = '45390569432' where idcliente = 16;
update clientes set genero = 'M', nacionalidade = 'Brasileira', uf = 'SC' where  idcliente = 16;
update clientes set genero = 'M', data_nascimento = '01-04-1978' where idcliente = 17;
update clientes set genero = 'F', profissao= 'Professora', numero= '123' where idcliente = 18;
select * from clientes;
delete from clientes where idcliente = '16';
select * from clientes;
delete from clientes where idcliente= '18';
select * from clientes;

create table profissao(
	idprofissao integer not null,
	nome varchar(30) not null,

	constraint pk_prf_idprofissao primary key (idprofissao),
	constraint un_prf_nome unique (nome)
);
select profissao from clientes;
insert into profissao (idprofissao, nome) values (1, 'Engenheiro');
insert into profissao (idprofissao, nome) values (2, 'Pedreiro');
insert into profissao (idprofissao, nome) values (3, 'Jornalista');
insert into profissao (idprofissao, nome) values (4, 'Professor');
insert into profissao (idprofissao, nome) values (6, 'Professora');
insert into profissao (idprofissao, nome) values (7, 'Estudante');

create table nacionalidade(
	idnacionalidade integer not null,
	nome varchar(30) not null,

	constraint pk_nac_idnacionalidade primary key (idnacionalidade),
	constraint un_nac_nome unique (nome)
);
select nacionalidade from clientes;
insert into nacionalidade (idnacionalidade, nome) values (1, 'Brasileira');
insert into nacionalidade (idnacionalidade, nome) values (2, 'Italiana');
insert into nacionalidade (idnacionalidade, nome) values (3, 'Brasileiro');
insert into nacionalidade (idnacionalidade, nome) values (4, 'Italiano');
insert into nacionalidade (idnacionalidade, nome) values (5, 'Norte americana');
insert into nacionalidade (idnacionalidade, nome) values (6, 'Alemã');
insert into nacionalidade (idnacionalidade, nome) values (7, 'Alemão');

create table complemento(
	idcomplemento integer not null,
	nome varchar(30) not null,

	constraint pk_compl_idcomplemento primary key (idcomplemento),
	constraint un_compl_nome unique (nome)
);
select complemento from clientes;
insert into complemento (idcomplemento, nome) values (1, 'Apartamento');
insert into complemento (idcomplemento, nome) values (2, 'Casa');

create table bairro(
	idbairro integer not null,
	nome varchar(30) not null,

	constraint pk_brr_idbairro primary key (idbairro),
	constraint un_brr_nome unique (nome)
);
select bairro from clientes;
insert into bairro (idbairro, nome) values (1, 'Centro');
insert into bairro(idbairro, nome) values (2, 'São Pedro');
insert into bairro(idbairro, nome) values (3, 'Santa Rosa');
insert into bairro (idbairro, nome) values (4, 'Cidade Nova');

alter table clientes rename column "idprofissao;" to "idprofissao";
select * from clientes;
alter table clientes drop idprofissao;
alter table clientes add idprofissao integer;
alter table clientes add constraint fk_cln_idprofissao foreign key (idprofissao) references profissao(idprofissao);
update clientes set idprofissao = 1 where idcliente in (1,9, 10, 12,15,17);
update clientes set idprofissao = 2 where idcliente= 2;
update clientes set idprofissao = 3 where idcliente = 3;
update clientes set idprofissao = 4 where idcliente in (4, 5);
update clientes set idprofissao = 6 where idcliente in (6, 7, 8, 13);
select * from profissao;

select * from clientes;
--Brasileira - 2, 3, 6, 10, 11, 14,, 17, 4, 1 
--Italiana - 3, 7
--Alemã - 9, 13
--Norte Americana -  8
alter table clientes drop nacionalidade;
alter table clientes add idnacionalidade integer;
alter table clientes add constraint fk_cln_idnacionalidade foreign key (idnacionalidade) references nacionalidade(idnacionalidade);
update clientes set idnacionalidade = 1 where idcliente in (2, 3, 6, 10, 11, 14, 17, 4, 1);
update clientes set idnacionalidade = 2 where idcliente in (3, 7);
update clientes set idnacionalidade = 5 where idcliente in (8);
update clientes set idnacionalidade = 6 where idcliente in (9, 13);

select * from nacionalidade

select * from complemento;
select * from clientes;
--Apartamento - 2, 3, 7, 17
--Casa - 4, 13, 15, 16
alter table clientes drop complemento;
alter table clientes add idcomplemento integer;
alter table clientes add constraint fk_cln_idcomplemento foreign key (idcomplemento) references complemento(idcomplemento);
update clientes set idcomplemento = 1 where idcliente in (2, 3, 7, 17);
update clientes set idcomplemento = 2 where idcliente in (4, 13, 15, 16);
select * from clientes;

select * from bairro;
select * from clientes;
--São Pedro - 5, 4
--Centro - 6, 8, 9, 2, 17, 3
--Cidade Nova - 1, 12, 13
--Santa Rosa - 7
alter table clientes drop bairro;
alter table clientes add idbairro integer;
alter table clientes add constraint fk_cln_idbairro foreign key (idbairro) references bairro(idbairro);
update clientes set idbairro = 1 where idcliente in (6, 8, 9, 2, 17, 3);
update clientes set idbairro = 2 where idcliente in (5, 4);
update clientes set idbairro = 3 where idcliente = 7;
update clientes set idbairro = 4 where idcliente in (1, 12, 13);

create table uf(
	iduf integer not null,
	nome varchar(30),
	sigla char(2),
	constraint pk_uf_iduf primary key (iduf),
	constraint un_uf_nome unique (nome),
	constraint un_uf_sigla unique(sigla)
);
select * from clientes;
--PR - 5, 4, 14, 15
--SP - 7, 13, 6
--SC- 1, 12, 11, 10, 2, 17, 3
--MG- 12
--RJ- 
insert into uf (iduf, nome, sigla) values (1, 'Paraná', 'PR');
insert into uf (iduf, nome, sigla) values (2, 'São Paulo', 'SP');
insert into uf (iduf, nome, sigla) values (3, 'Santa Catarina', 'SC');
insert into uf (iduf, nome, sigla) values (4, ' Minas Gerais', 'MG');
insert into uf (iduf, nome, sigla) values (5, 'Rio de Janeiro', 'RJ');
insert into uf(iduf, nome, sigla) values (6, 'Rio Grande do Sul', 'RS');
alter table clientes drop uf;
alter table clientes add iduf integer;
alter table clientes add constraint fk_cln_iduf foreign key (iduf) references uf (iduf);
update clientes set iduf = 1 where idcliente in (5, 4, 14, 15);
update clientes set iduf = 2 where idcliente in ( 13, 6);
update clientes set iduf = 3 where idcliente in (1, 12, 11, 10, 2, 17, 3);
update clientes set iduf = 4 where idcliente = 8;
update clientes set iduf = 5 where idcliente =7;
update clientes set iduf = 6 where idcliente = 9;
select * from clientes

create table municipio(
	idmunicipio integer not null,
	nome varchar(30),
	iduf integer not null,

	constraint pk_mun_idmunicipio primary key (idmunicipio),
	constraint un_mun_nome unique (nome),
	constraint fk_mun_iduf foreign key (iduf) references uf (iduf)
);

select * from clientes;
--General Carneiro - 5
--União da vitoria - 14,15
--Rio de Janeiro - 7
--São Paulo - 13, 6
--Porto União - 1, 11, 10, 2
--Canoinhas - 12, 3
--Curitiba - 17
--Porto Vitória - 4
--Uberlandia - 8 (mudar o nome pra uberlandia)
--Porto alegre - 9

insert into municipio (idmunicipio, nome, iduf) values (1, 'General Carneiro', 1);
insert into municipio (idmunicipio, nome, iduf) values (2, 'União da vitoria',  1);
insert into municipio (idmunicipio, nome, iduf) values (3, 'Rio de Janeiro',    5 );
insert into municipio (idmunicipio, nome, iduf) values (4, 'São Paulo',          2);
insert into municipio (idmunicipio, nome, iduf) values (5, 'Porto união',         3);
insert into municipio (idmunicipio, nome, iduf) values (6, 'Canoinhas',            3);
insert into municipio (idmunicipio, nome, iduf) values (7,  'Curitiba',             3);
insert into municipio (idmunicipio, nome, iduf) values (8,   'Porto Vitória',        1);
insert into municipio (idmunicipio, nome, iduf) values (9,    'Uberlandia',          4);
insert into municipio (idmunicipio, nome, iduf) values (10,   'Porto alegre',        6);

alter table clientes drop municipio;
alter table clientes add idmunicipio integer;
alter table clientes add constraint fk_cliente_idmunicipio foreign key (idmunicipio) references municipio (idmunicipio);
update clientes set idmunicipio = 1 where idcliente = 5;
update clientes set idmunicipio = 2 where idcliente in (14, 15);
update clientes set idmunicipio = 3 where idcliente = 7;
update clientes set idmunicipio = 4 where idcliente in (13, 6);
update clientes set idmunicipio = 5 where idcliente in (1, 11, 10, 2);
update clientes set idmunicipio = 6 where idcliente in (12, 3);
update clientes set idmunicipio = 7 where idcliente = 17;
update clientes set idmunicipio = 8 where idcliente = 4;
update clientes set idmunicipio = 9 where idcliente = 8;
update clientes set idmunicipio = 10 where idcliente = 9;

select * from clientes;
select * from municipio;
select * from uf;


create table fornecedor(
	id integer not null,
	nome varchar(50),
	constraint pk_forn_id primary key (id),
	constraint un_forn_nome unique (nome)
	
);
insert into fornecedor (id, nome) values (1, 'André');
insert into fornecedor (id, nome) values (2, 'Alisson');
insert into fornecedor (id, nome) values (3, 'José');



select * from fornecedor;

update fornecedor set nome = 'Cap.Computadores' where id = 1;
update fornecedor set nome = 'AA.Computadores' where id = 2;
update fornecedor set nome = 'BB.Máquinas' where id = 3;

create table vendedor(
	id integer not null,
	nome varchar(50),

	constraint pk_vend_id primary key(id),
	constraint un_vend_nome unique (nome)
);
insert into vendedor (id, nome) values (1, 'André');
insert into vendedor (id, nome) values (2, 'Alisson');
insert into vendedor (id, nome) values (3, 'José');
insert into vendedor (id, nome) values (4, 'Ailton');
insert into vendedor (id, nome) values (5, 'Maria');
insert into vendedor (id, nome) values (6, 'Suelem');
insert into vendedor (id, nome) values (7, 'Aline');
insert into vendedor (id, nome) values (8, 'Silvana');
select * from vendedor;

create table transportadora(
	id integer not null,
	idmunicipio integer not null,
	nome varchar (50) not null,
	logradouro varchar(40),
	numero varchar(10),

	constraint pk_transp_id primary key(id),
	constraint fk_transp_idmunicipio foreign key (idmunicipio) references municipio(idmunicipio),
	constraint un_transp_nome unique(nome)	
);
select * from municipio;
insert into transportadora (id, idmunicipio, nome, logradouro, numero) values (1, 2, 'BS. Transportes', 'Rua das limas', '01' );
insert into transportadora (id, idmunicipio, nome, logradouro, numero) values (2, 4, 'União Transportes', null, null);

select * from municipio

create table produto(
	idproduto integer not null,
	idfornecedor integer not null,
	nome varchar (50) not null,
	valor numeric(10,2) not null,
	constraint pk_prod_idproduto primary key (idproduto),
	constraint fk_prod_idfornecedor foreign key (idfornecedor) references fornecedor (id)
);
select * from fornecedor;
insert into produto (idproduto, idfornecedor, nome, valor) values (1, 1, 'Microcomputador', 800);
insert into produto (idproduto, idfornecedor, nome, valor) values (2, 1, 'Monitor', 500);
insert into produto (idproduto, idfornecedor, nome, valor) values (3, 2, 'Placa mãe', 200);
insert into produto (idproduto, idfornecedor, nome, valor) values (4, 2, 'HD', 150);
insert into produto (idproduto, idfornecedor, nome, valor) values (5, 2, 'Placa de Vídeo', 200);
insert into produto (idproduto, idfornecedor, nome, valor) values (6, 3,  'Mémoria RAM', 100);
insert into produto(idproduto, idfornecedor, nome, valor) values (7, 1, 'Gabinete', 35);

select * from produto;
select * from transportadora;
select * from vendedor;
insert into pedido(idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (1, '01-04-2008', 1300, 1,  1, 1);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (2, '01-04-2008', 500, 1, 1, 1);
insert into pedido(idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (3, '02-04-2008', 300, 11, 2,  5);
insert into pedido(idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (4, '05-04-2008', 1000, 8, 1, 7);
insert into pedido(idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (5, '06-04-2008', 200, 9, 2, 6);
insert into pedido(idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (6, '06-04-2008', 1985, 10, 1, 6 );
insert into pedido(idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (7, '06-04-2008', 800, 3, 1, 7 );
insert into pedido(idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (8, '06-04-2008', 175, 3, null, 7);
insert into pedido(idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (9, '07-04-2008', 1300, 12, null, 8);
insert into pedido(idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (10, '10-04-2008', 200, 6, 1,  8);
insert into pedido(idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (11, '15-04-2008', 300, 15, 2, 1);
insert into pedido(idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (12, '20-04-2008', 500, 15, 2, 7);
insert into pedido(idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (13, '20-04-2008', 350, 9, 1, 7);
insert into pedido(idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (14, '23-04-2008', 300, 2, 1, 5);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (15, '25-04-2008', 200, 11, null, 5);
select * from pedido;

create table pedido_produto(
	idpedido integer not null,
	idproduto integer not null,
	quantidade integer not null,
	valor_unitario decimal(10, 2) not null,
	constraint pk_pdp_idpedidoproduto primary key (idpedido, idproduto),
	constraint fk_pdp_idpedido foreign key (idpedido) references pedido(idpedido),
	constraint fk_pdp_idproduto foreign key (idproduto) references produto(idproduto)
);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (1, 1, 1, 800);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (1, 2, 1, 500);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (2, 2, 1, 500);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (3, 4, 2, 150);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (4, 1, 1, 800);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (4, 3, 1, 200);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (5, 3, 1, 200);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (6, 1, 2, 800);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (6, 7, 1, 35);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (6, 5, 1, 200);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (6, 4, 1, 150);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (7, 1, 1, 800);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (8, 7, 5, 35);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (9, 1, 1, 800);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (9, 2, 1, 500);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (10, 5, 1, 200);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (11, 5, 1, 200);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (11, 6, 1, 100);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (12, 2, 1, 500);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (13, 3, 1, 200);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (13, 4, 1, 150);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (14, 6, 3, 100);
insert into pedido_produto(idpedido, idproduto, quantidade, valor_unitario) values (15, 3, 1, 200);

select * from vendedor order by nome asc;
select * from produto where valor > 200 order by valor asc;
select nome, valor, round (valor * 1.10) from produto; 
select nome from municipio where iduf = 6;
select * from pedido where data_pedido between '10-04-2008' and '25-04-2008';
select * from pedido where valor between 1000 and 1500;
select * from pedido where valor not between 100 and 500;
select * from vendedor;
select * from pedido where idvendedor = 1 order by valor desc; 
select * from pedido where idcliente = 1 order by valor asc;
select * from clientes;
select * from pedido where idvendedor =1 and idcliente= 15; 
select * from pedido where idtransportadora = 2;
select * from vendedor;
select * from pedido where idvendedor = 5 or idvendedor = 7;
select * from municipio;
select * from clientes where idmunicipio = 2 or idmunicipio = 8;
select * from clientes where idmunicipio not in (2, 8);
select * from clientes where logradouro is null;
select * from clientes;
select * from clientes where logradouro like 'Av%';
select * from vendedor;
select * from vendedor where nome like 'S%';
select * from vendedor where nome like '%a';
select * from vendedor where nome not like 'A%';
select * from municipio;
select * from uf;
select * from municipio where nome like 'P%' and iduf = 3;
select * from transportadora where logradouro is not null;
select * from pedido_produto where idpedido= 1;
select * from pedido_produto where idpedido = 6 or idpedido= 10;
select avg(valor) from pedido;
select count(idmunicipio) from municipio;
select * from municipio;
select count(logradouro) from transportadora;
select count (id) from transportadora;
select count(*) from transportadora;
select count (idmunicipio) from municipio where iduf = 2;
select max(valor) from pedido;
select min(valor), max(valor) from pedido;
select sum(valor) from pedido;
select idcliente, sum(valor) from pedido group by idcliente having sum(valor) > 500;
select  round(avg(valor)), idvendedor from pedido group by idvendedor having sum(valor) > 200;
select sum(valor), idvendedor from pedido group by idvendedor;
select idvendedor, sum(valor) from pedido group by idvendedor having sum(valor) > 1500;
select * from municipio;
select count(idmunicipio) from municipio where iduf = 1 or iduf= 3;
select count(idmunicipio) from municipio group by iduf;
select count(idcliente) from clientes where logradouro is not null;
select count(idcliente) from clientes group by idmunicipio;
select count(id) from fornecedor;
select count(idproduto) from produto group by idfornecedor;
select round(avg(valor)) from produto where idfornecedor = 1;
select * from produto;
select sum(valor) from produto;
select nome, valor from produto where idproduto=1;
select nome, valor from produto where idproduto= 7;
select round(avg(valor)) from produto;
select * from pedido;
select idcliente, sum(valor) from pedido group by idcliente;
select idvendedor, sum(valor) from pedido group by idvendedor;
select idtransportadora, sum(valor) from pedido group by idtransportadora having idtransportadora is not null;
select data_pedido, sum(valor) from pedido group by data_pedido;
select sum(valor) from pedido group by data_pedido between '01-04-2008' and '10-12-2009' having sum(valor) > 200;
select * from vendedor;
select round(avg(valor)) from pedido where idvendedor = 1;
select * from clientes;
select round(avg(valor)) from pedido where idcliente = 15;
select * from pedido;
select count(idpedido) from pedido group by idtransportadora having idtransportadora = 1; 
select idvendedor, count(idpedido) from pedido group by idvendedor;
select idcliente, count(idpedido) from pedido group by idcliente;
select count(idpedido) from pedido where data_pedido between '15-04-2008' and '25-04-2008';
select count(idpedido) from pedido where valor > 1000;
select * from produto;
select * from pedido_produto;
select count(idpedido) from pedido_produto where idproduto = 1;
select idproduto, count(idpedido) from pedido_produto group by idproduto;
select idpedido, sum(valor_unitario) from pedido_produto group by idpedido;
select idpedido, count(idproduto) from pedido_produto group by idpedido;
select round(sum(valor_unitario)) from pedido_produto;
select round(avg(valor_unitario)) from pedido_produto where idpedido= 6;
select max(valor_unitario) from pedido_produto where idpedido=6;
select min(valor_unitario) from pedido_produto where idpedido=6;
select idpedido, sum(quantidade) from pedido_produto group by idpedido order by idpedido asc; 
select idproduto, sum(quantidade) from pedido_produto where idpedido= 6 group by idproduto order by sum(quantidade) asc;
select * from clientes;
select clientes.nome, profissao.nome from clientes left outer join profissao on clientes.idprofissao = profissao.idprofissao
select clientes.nome, profissao.nome, nacionalidade.nome, complemento.nome, bairro.nome, municipio.nome, uf.nome from clientes left outer join  profissao on clientes.idprofissao = profissao.idprofissao left outer join nacionalidade on clientes.idnacionalidade = nacionalidade.idnacionalidade left outer join  complemento on clientes.idcomplemento = complemento.idcomplemento left outer join bairro on clientes.idbairro= bairro.idbairro left outer join municipio on clientes.idmunicipio = municipio.idmunicipio left outer join uf on clientes.iduf = uf.iduf;
select prd.nome as produto, valor, forn.nome as fornecedor from produto as prd left outer join fornecedor as forn on prd.idfornecedor = forn.id;
select trans.nome as transportadora, mun.nome as municipio from transportadora as trans left outer join municipio as micipio = mun.idmunicipio;un on trans.idmun
select
	data_pedido as data, 
	valor,
	cln.nome as cliente,
	trans.nome as transportadora,
	vend.nome as vendedor
from pedido as ped
left outer join clientes		as cln		on ped.idcliente = cln.idcliente
left outer join transportadora as trans		on ped.idtransportadora = trans.id
left outer join vendedor 		as vend		on ped.idvendedor = vend.id;

select
	idpedido,
	prod.nome as produto,
	quantidade,
	valor_unitario
from pedido_produto as pedpro
left outer join produto	as prod		on pedpro.idproduto = prod.idproduto
order by idpedido asc;
select
	cln.nome as cliente,
	idpedido,
	data_pedido
from pedido as ped
inner join clientes as cln		on ped.idcliente = cln.idcliente
order by cliente asc;

select
	cln.nome as cliente,
	idpedido,
	data_pedido
from pedido as ped
full outer join clientes as cln  on ped.idcliente = cln.idcliente
order by cliente asc;

select
	count(cln.idcliente) as quantidade,
	mun.nome as municipio
from clientes as cln
left outer join municipio as mun		on cln.idmunicipio = mun.idmunicipio
group by mun.nome;

select
	count(prod.idproduto) as produto,
	forn.nome as fornecedor
from produto as prod
left outer join fornecedor as forn		on prod.idfornecedor = forn.id
group by forn.nome;

select
	sum(valor) as valor,
	cln.nome as cliente
from pedido as ped
left outer join clientes as cln		on ped.idcliente = cln.idcliente
group by cln.nome;

select * from pedido;

select
	sum(valor) as valor,
	vend.nome as vendedor
from pedido as ped
left outer join vendedor as vend	on ped.idvendedor = vend.id
group by vend.nome;

select
	sum(valor) as valor,
	trans.nome as transportadora
from pedido as ped
inner join transportadora as trans		on ped.idtransportadora = trans.id
group by transportadora;

select
	count(idpedido) as quantidade,
	cln.nome as cliente
from pedido as ped
left outer join clientes as cln		on ped.idcliente = cln.idcliente
group by cln.nome;


select
	sum(quantidade) as quantidade,
	prod.nome as produto
from pedido_produto as pedpro
left outer join produto as prod		on pedpro.idproduto = prod.idproduto
group by prod.nome;

select 
	data_pedido as data,
	sum(valor) as valor
from pedido
group by data_pedido;


select
	data_pedido as data,
	count(quantidade) as quantidade
from pedido as ped
left outer join pedido_produto as pedpro	on pedpro.idpedido = ped.idpedido
group by data_pedido;
select * from clientes;
select 
	nome, coalesce(extract(month from data_nascimento), 0)
from clientes;

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
		else 'Não informado'
		end as mês
from clientes

select
	nome, coalesce(extract(year from data_nascimento), 0)
from clientes;

select
	substring (nome, 4, 7)
from municipio;

select
	upper(nome)
from municipio;

select
	nome,
	genero,
	case genero
		when 'M' then 'Masculino'
		else 'Feminino'
		end as Genero
from clientes;

select
	nome,
	valor,
	case
		when valor >= 500 then 'Acima ou igual a 500'
		else 'Abaixo de 500'
		end as padrão
from produto;

select
	data_pedido,
	valor
from 
	pedido
where
	valor> (select avg(valor) from pedido);

select
	pdd.data_pedido,
	pdd.valor,
	(select sum(quantidade) from pedido_produto as pdp where pdp.idpedido = pdd.idpedido)
from pedido as pdd;
update pedido set valor = valor + (valor * 5) / 100
where valor > (select avg(valor) from pedido);
