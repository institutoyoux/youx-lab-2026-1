create table cliente (
	idcliente integer not null,
	nome varchar(50) not null,
	cpf char(11),
	rg varchar(15),
	data_nascimento date,
	genero char(1),
	profissao varchar(30),
	nacionalidade varchar(30),
	logradouro varchar(30),
	numero varchar(10),
	complemento varchar(30),
	bairro varchar(30),
	municipio varchar(30),
	uf varchar(30),
	observacoes text,

	-- Primary key
	constraint pk_cln_idcliente primary key (idcliente)
)


-- inserção de dados

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (1, 'Manoel', '88828383821', '32323', '2001-01-30', 'M', 'Estudante', 'Brasileira', 'Rua Joaquim Nabuco', '23', 'Casa', 'Cidade Nova', 'Porto União', 'SC');

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (2, 'Geraldo', '12343299929', '56565', '1987-01-04', 'M', 'Engenheiro', 'Brasileira', 'Rua das Limas', '200', 'Ap', 'Centro', 'Poro União', 'SC');

-- exercicios

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (3, 'Carlos', '87732323227', '55463', '1967-10-01', 'M', 'Pedreiro', 'Brasileira', 'Rua das Laranjeiras', '300', 'Apart.', 'Cto.', 'anoinhas', 'SC');

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (4, 'Adriana', '12321222122', '98777', '1989-09-10', 'F', 'Jornalista', 'Brasileira', 'Rua das Limas', '240', 'Casa', 'São Pedro', 'Porto Vitória', 'PR');

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (5, 'Amanda', '99982838828', '28382', '1991-03-04', 'F', 'Jorn.', 'Italiana', 'Av. Central', '100', null, 'São Pedro', 'Genral Carneiro', 'PR');

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (6, 'Ângelo', '99982828181', '12323', '2000-01-01', 'M', 'Professor', 'Brasileiro', 'Av. Beiramar', '300', null, 'Ctr.', 'São Paulo', 'SP');

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (7, 'Anderson', null, null, null, 'M', 'Prof.', 'Italiano', 'Av. Brasil', '100', 'Apartamento', 'Santa Rosa', 'Rio de Janeiro', 'RJ');

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (8, 'Camila', '9998282828', null, '2001-10-10', 'F', 'Professora', 'Norte americana', 'Rua Central', '4333', null, 'Centro', 'Uberlândia', 'MG');

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (9, 'Cristiano', null, null, null, 'M', 'Estudante', 'Alemã', 'Rua do Centro', '877', 'Casa', 'Centro', 'Porto Alegre', 'RS');

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (10, 'Fabrício', '8828282828', '32323', null, 'M', 'Estudante', 'Brasileiro', null, null, null, null, 'PU', 'SC');

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (11, 'Fernanda', null, null, null, 'F', null, 'Brasileira', null, null, null, null, 'Porto União', 'SC');

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (12, 'Gilmar', '88881818181', '888', '2000-02-10', 'M', 'Estud.', null, 'Rua das Lanranjeiras', '200', null, 'C. Nova', 'Canoinhas', 'SC');

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (13, 'Diego', '1010191919', '111939', null, 'M', 'Professor', 'Alemão', 'Rua Central', '455', 'Casa', 'Cidade. N', 'São Paulo', 'SP');

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (14, 'Jeferson', null, null, '1983-07-01', 'M', null, 'Brasileiro', null, null, null, null, 'União da Vitoria', 'PR');

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf)
values (15, 'Jessica', null, null, null, 'F', 'Estudante', null, null, null, null, null, 'União da Vitória', 'PR');

-- Consulta Simples

select * from cliente;

select nome, data_nascimento from cliente;

select nome, data_nascimento as "Data de nascimento" from cliente;

select 'CPF: ' || cpf ||' RG ' || rg as "CPF e RG" from cliente;

select * from cliente limit 3

select nome, data_nascimento from cliente where data_nascimento > '2000-01-01';

select nome from cliente where nome like 'C%';

select nome from cliente where nome like '%c%';

select nome, data_nascimento from cliente where data_nascimento between '1991-01-01' and '1998-01-01';

select nome, rg from cliente where rg is null;

select nome from cliente order by nome; -- asc

select nome from cliente order by nome desc;

-- Exercicios

select nome, genero, profissao from cliente order by nome;

select nome from cliente where nome like '%r%';

select nome from cliente where nome like 'C%';

select nome from cliente where nome like '%a';

select nome, bairro from cliente where bairro like 'Centro';

select nome, complemento from cliente where complemento like 'A%';

select nome, genero from cliente where genero like 'F';

select nome, cpf from cliente where cpf is null;

select nome, profissao from cliente order by profissao;

select nome, nacionalidade from cliente where nacionalidade like 'Brasileira';

select nome, numero from cliente where numero is not null;

select nome, uf from cliente where uf like 'Santa Catarina';

select nome, data_nascimento from cliente where data_nascimento between '2000-01-01' and '2002-01-01';

select nome, 'Logradouro: ' || logradouro || ' Número: ' || numero || ' Complemento: ' || complemento || ' Bairro: ' || bairro || ' Municipio: ' || municipio || ' UF: ' || uf from cliente;

-- Comandos update e delete

select * from cliente;

update cliente set nome = 'Teste' where idcliente = 1;

update cliente set nome = 'Adriano', genero = 'M', numero = '241' where idcliente = 4;

insert into cliente (idcliente, nome) values (16, 'João');
delete from cliente where idcliente = 16;

update cliente set nome = 'Manoel' where idcliente = 1;

-- Exercicios
insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf) values (16, 'Maicon', '12349596421', '1234', '1965-10-10', 'F', 'Empresário', null, null, null, null, null, 'Florianópolis', 'PR')

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf) values (17, 'Getúlio', null, '4631', null, 'F', 'Estudante', 'Brasileria',  'Rua Central', '343', 'Apartamento', 'Centro', 'Curitiba', 'SC')

insert into cliente (idcliente, nome, cpf, rg, data_nascimento, genero, profissao, nacionalidade, logradouro, numero, complemento, bairro, municipio, uf) values (18, 'Sandra', null, null, null, 'M', 'Professor', 'Italiana', null, '12', 'Bloco A', null, null, null)

update cliente set cpf = '45390569432', genero = 'M', nacionalidade = 'Brasileira', uf = 'SC' where idcliente = 16

update cliente set data_nascimento = '1978-04-01', genero = 'M' where idcliente = 17;

update cliente set genero = 'F', profissao = 'Professora', numero = '123' where idcliente = 18;

delete from cliente where idcliente = 16;

delete from cliente where idcliente = 18;

-- Criação de mais tabelas

create table profissao (
	idprofissao integer not null,
	nome varchar(30) not null,

	constraint pk_prf_idprofissao primary key (idprofissao),
	constraint un_prf_nome unique (nome)
)

select profissao from cliente

insert into profissao (idprofissao, nome) values (1, 'Estudante');
insert into profissao (idprofissao, nome) values (2, 'Engenheiro');
insert into profissao (idprofissao, nome) values (3, 'Pedreiro');
insert into profissao (idprofissao, nome) values (4, 'Jornalista');
insert into profissao (idprofissao, nome) values (5, 'Professor');

select * from profissao;

create table nacionalidade (
	idnacionalidade integer not null,
	nome varchar(30) not null,

	constraint pk_ncn_idnacionalidade primary key (idnacionalidade),
	constraint un_ncn_nome unique (nome)
)

select nacionalidade from cliente

insert into nacionalidade (idnacionalidade, nome) values (1, 'Brasileira');
insert into nacionalidade (idnacionalidade, nome) values (2, 'Italiana');
insert into nacionalidade (idnacionalidade, nome) values (3, 'Norte-americana');
insert into nacionalidade (idnacionalidade, nome) values (4, 'Alemã');

select * from nacionalidade

create table complemento (
	idcomplemento integer not null,
	nome varchar(30) not null,

	constraint pk_cpl_idcomplemento primary key (idcomplemento),
	constraint un_cpl_nome unique (nome)
)

insert into complemento (idcomplemento, nome) values (1, 'Casa');
insert into complemento (idcomplemento, nome) values (2, 'Apartamento');

select * from complemento;

create table bairro (
	idbairro integer not null,
	nome varchar (30) not null,

	constraint pk_brr_idbairro primary key (idbairro),
	constraint un_brr_nome unique (nome)
);

insert into bairro (idbairro, nome) values (1, 'Cidade Nova');
insert into bairro (idbairro, nome) values (2, 'Centro');
insert into bairro (idbairro, nome) values (3, 'São Pedro');
insert into bairro (idbairro, nome) values (4, 'Santa Rosa');

select * from bairro

-- Chaves estrangeiras foreign key fk

select * from cliente;

alter table cliente rename column profissao to idprofissao;

-- Estudante > 1, 9, 10, 12, 15
-- Engenheiro > 2
-- Pedreiro > 3
-- Jornalista > 4, 5
-- Professor > 6, 7, 8, 13
-- Null > 11, 14

alter table cliente drop idprofissao;
alter table cliente add idprofissao integer;

alter table cliente add constraint fk_cln_idprofissao foreign key (idprofissao) references profissao (idprofissao);

update cliente set idprofissao = 1 where idcliente in (1, 9, 10, 12, 15, 17);
update cliente set idprofissao = 2 where idcliente = 2;
update cliente set idprofissao = 3 where idcliente = 3; 
update cliente set idprofissao = 4 where idcliente in (4, 5);
update cliente set idprofissao = 5 where idcliente in (6, 7, 8, 13);

alter table cliente drop nacionalidade;
alter table cliente add idnacionalidade integer;
alter table cliente add constraint fk_cln_nacionalidade foreign key (idnacionalidade) references nacionalidade (idnacionalidade);

update cliente set idnacionalidade = 1 where idcliente in (1, 2, 3, 4, 6, 10, 11, 14);
update cliente set idnacionalidade = 2 where idcliente in (5, 7);
update cliente set idnacionalidade = 3 where idcliente = 8;
update cliente set idnacionalidade = 4 where idcliente in (9, 13);

alter table cliente drop complemento;
alter table cliente add idcomplemento integer;
alter table cliente add constraint fk_cln_idcomplemento foreign key (idcomplemento) references complemento(idcomplemento);

update cliente set idcomplemento = 1 where idcliente in (1, 4, 9, 13);
update cliente set idcomplemento = 2 where idcliente in (2, 3, 7);

alter table cliente drop bairro;
alter table cliente add idbairro integer;
alter table cliente add constraint fk_cln_idbairro foreign key (idbairro) references bairro (idbairro);

update cliente set idbairro = 1 where idcliente in (1, 12, 13);
update cliente set idbairro = 2 where idcliente in (2, 3, 6, 8, 9);
update cliente set idbairro = 3 where idcliente in (4, 5);
update cliente set idbairro = 4 where idcliente = 7;

create table uf (
	iduf integer not null,
	nome varchar(30) not null,
	sigla char(2) not null,

	constraint pk_ufd_idunidade_federcao primary key (iduf),
	constraint un_ufd_nome unique (nome),
	constraint un_ufd_sigla unique (sigla)
);


insert into uf (iduf, nome, sigla) values (1, 'Santa Catarina', 'SC');
insert into uf (iduf, nome, sigla) values (2, 'Paraná', 'PR');
insert into uf (iduf, nome, sigla) values (3, 'São Paulo', 'SP');
insert into uf (iduf, nome, sigla) values (4, 'Minas Gerais', 'MG');
insert into uf (iduf, nome, sigla) values (5, 'Rio Grande do Sul', 'RS');
insert into uf (iduf, nome, sigla) values (6, 'Rio de Janeiro', 'RJ');
select * from uf;

create table municipio (
	idmunicipio integer not null,
	nome varchar (30) not null,
	iduf integer not null,

	constraint pk_mnc_idmunicipio primary key (idmunicipio),
	constraint un_mnc_nome unique (nome),
	constraint fk_mnc_iduf foreign key (iduf) references uf (iduf)
);

insert into municipio (idmunicipio, nome, iduf) values (1, 'Porto União', 1);
insert into municipio (idmunicipio, nome, iduf) values (2, 'Canoinhas', 1);
insert into municipio (idmunicipio, nome, iduf) values (3, 'Porto Vitória', 2);
insert into municipio (idmunicipio, nome, iduf) values (4, 'General Carneiro', 2);
insert into municipio (idmunicipio, nome, iduf) values (5, 'São Paulo', 3);
insert into municipio (idmunicipio, nome, iduf) values (6, 'Rio de Janeiro', 6);
insert into municipio (idmunicipio, nome, iduf) values (7, 'Uberladia', 4);
insert into municipio (idmunicipio, nome, iduf) values (8, 'Porto Alegre', 5);
insert into municipio (idmunicipio, nome, iduf) values (9, 'União da Vitória', 2);

select * from municipio;

select * from cliente;

alter table cliente drop municipio;
alter table cliente drop uf;

alter table cliente add idmunicipio integer;
alter table cliente add constraint fk_cliente_idmunicipio foreign key (idmunicipio) references municipio (idmunicipio);

update cliente set idmunicipio = 1 where idcliente in (1, 2, 10, 11);
update cliente set idmunicipio = 2 where idcliente in (3, 12);
update cliente set idmunicipio = 3 where idcliente = 4;
update cliente set idmunicipio = 4 where idcliente in (5);
update cliente set idmunicipio = 5 where idcliente in (6, 13);
update cliente set idmunicipio = 6 where idcliente in (7);
update cliente set idmunicipio = 7 where idcliente in (8);
update cliente set idmunicipio = 8 where idcliente in (9);
update cliente set idmunicipio = 9 where idcliente in (14, 15);

-- Exercicios

create table fornecedor (
	idfornecedor integer not null,
	nome varchar(50) not null,

	constraint pk_fncd_idfornecedor primary key (idfornecedor),
	constraint un_fncd_nome unique (nome)
);

insert into fornecedor (idfornecedor, nome) values (1, 'Cap. Computadores');
insert into fornecedor (idfornecedor, nome) values (2, 'AA. Computadores');
insert into fornecedor (idfornecedor, nome) values (3, 'BB. Máquinas');

select * from fornecedor;

create table vendedor (
	idvendedor integer not null,
	nome varchar(50) not null,

	constraint pk_vdd_idvendedor primary key (idvendedor),
	constraint un_vdd_nome unique (nome)
);

insert into vendedor (idvendedor, nome) values (1, 'André');
insert into vendedor (idvendedor, nome) values (2, 'Alisson');
insert into vendedor (idvendedor, nome) values (3, 'José');
insert into vendedor (idvendedor, nome) values (4, 'Ailton');
insert into vendedor (idvendedor, nome) values (5, 'Maria');
insert into vendedor (idvendedor, nome) values (6, 'Suelem');
insert into vendedor (idvendedor, nome) values (7, 'Aline');
insert into vendedor (idvendedor, nome) values (8, 'Silvana');

select * from vendedor;

create table transportadora (
	idtransportadora integer not null,
	idmunicipio integer,
	nome varchar (50) not null,
	logradouro varchar(50),
	numero varchar (10),

	constraint pk_trnsp_idtransportadora primary key (idtransportadora),
	constraint un_trsnp_nome unique (nome),
	constraint fk_trnsp_idmunicipio foreign key (idmunicipio) references municipio (idmunicipio)
);

insert into transportadora (idtransportadora, idmunicipio, nome, logradouro, numero) values (1, 9, 'BS. Transportes', 'Rua das limas', '01');
insert into transportadora (idtransportadora, idmunicipio, nome, logradouro, numero) values (2, 5, 'União Transportes', null, null);

create table produto (
	idproduto integer not null,
	idfornecedor integer not null,
	nome varchar(50) not null,
	valor float not null,

	constraint pk_prdt_idproduto primary key (idproduto),
	constraint fk_prdt_ifornecedor foreign key (idfornecedor) references fornecedor (idfornecedor)
);

insert into produto (idproduto, idfornecedor, nome, valor) values (1, 1, 'Microcomputador', 800);
insert into produto (idproduto, idfornecedor, nome, valor) values (2, 1, 'Monitor', 500);
insert into produto (idproduto, idfornecedor, nome, valor) values (3, 2, 'Placa mãe', 200);
insert into produto (idproduto, idfornecedor, nome, valor) values (4, 2, 'HD', 150);
insert into produto (idproduto, idfornecedor, nome, valor) values (5, 2, 'Placa de vídeo', 200);
insert into produto (idproduto, idfornecedor, nome, valor) values (6, 3, 'Mémoria RAM', 100);
insert into produto (idproduto, idfornecedor, nome, valor) values (7, 1, 'Gabinete', 35);

select * from produto;

-- Tabela de pedidos 1

create table pedido (
	idpedido integer not null,
	idcliente integer not null,
	idtransportadora integer,
	idvendedor integer not null,
	data_pedido date not null,
	valor float not null,

	constraint pk_pdd_idpedido primary key (idpedido),
	constraint fk_pdd_idcliente foreign key (idcliente) references cliente (idcliente),
	constraint fk_pdd_idtranportadora foreign key (idtransportadora) references transportadora (idtransportadora),
	constraint fk_pdd_idvendedor foreign key (idvendedor) references vendedor (idvendedor)
);

select * from cliente;
select * from transportadora;
select * from vendedor;

insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (1, '2008-04-01', 1300, 1, 1, 1);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (2, '2008-04-01', 500, 1, 1, 1);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (3, '2008-04-02', 300, 11, 2, 5);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (4, '2008-04-05', 1000, 8, 1, 7);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (5, '2008-04-06', 200, 9, 2, 6);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (6, '2008-04-06', 1985, 10, 1, 6);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (7, '2008-04-06', 800, 3, 1, 7);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (8, '2008-04-06', 175, 3, null, 7);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (9, '2008-04-07', 1300, 12, null, 8);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (10, '2008-04-10', 200, 6, 1, 8);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (11, '2008-04-15', 300, 15, 2, 1);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (12, '2008-04-20', 500, 15, 2, 5);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (13, '2008-04-20', 350, 9, 1, 7);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (14, '2008-04-23', 300, 2, 1, 5);
insert into pedido (idpedido, data_pedido, valor, idcliente, idtransportadora, idvendedor) values (15, '2008-04-25', 200, 11, null, 5);

select * from pedido;

-- Tabela de pedidos 2

create table pedido_produto (
	idpedido integer not null,
	idproduto integer not null,
	quantidade integer not null,
	valor_unitario float not null,

	constraint pk_pdp_idpedidodoproduto primary key (idpedido, idproduto),
	constraint fk_pdp_idpedido foreign key (idpedido) references pedido (idpedido),
	constraint fk_pdp_idproduto foreign key (idproduto) references produto (idproduto)
);

select * from pedido_produto;

insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (1, 1, 1, 800);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (1, 2, 1, 500);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (2, 2, 1, 500);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (3, 4, 2, 150);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (4, 1, 1, 800);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (4, 3, 1, 200);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (5, 3, 1, 200);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (6, 1, 2, 800);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (6, 7, 1, 35);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (6, 5, 1, 200);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (6, 4, 1, 150);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (7, 1, 1, 800);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (8, 7, 5, 35);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (9, 1, 1, 800);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (9, 2, 1, 500);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (10, 5, 1, 200);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (11, 5, 1, 200);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (11, 6, 1, 100);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (12, 2, 1, 500);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (13, 3, 1, 200);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (13, 4, 1, 150);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (14, 6, 3, 100);
insert into pedido_produto (idpedido, idproduto, quantidade, valor_unitario) values (15, 3, 1, 200);

-- Exercios
-- 1

select nome from vendedor order by nome;

-- 2

select nome, valor from produto where valor > 200;

-- 3

select nome, valor from produto;

-- 4
select * from uf;

select nome from municipio where iduf = 5;

-- 5

select * from pedido where data_pedido between '2008-04-10' and '2008-04-25';

-- 6

select * from pedido where valor between 1000 and 1500;

-- 7

select * from pedido where valor not between 100 and 500;

-- 8

select * from pedido where idvendedor = 1 order by valor desc;

-- 9

select * from pedido where idcliente = 1 order by valor;

-- 10
select * from cliente;
select * from vendedor;
select * from pedido where idcliente = 15 and idvendedor = 1;

-- 11
select * from transportadora;

select * from pedido where idtransportadora = 2;

-- 12
select *from vendedor;

select * from pedido where idvendedor in (5, 7);

-- 13
select * from municipio;

select nome, idmunicipio from cliente where idmunicipio = 9 or idmunicipio = 1;

-- 14

select nome, idmunicipio from cliente where idmunicipio not in (9, 1);

-- 15
select nome, logradouro from cliente;

select nome, logradouro from cliente where logradouro is null;

-- 16

select nome, logradouro from cliente where logradouro like 'Av%';

-- 17

select nome from vendedor where nome like 'S%';

-- 18

select nome from vendedor where nome like '%a';

-- 19

select nome from vendedor where nome not like 'A%';

-- 20
select * from municipio;
select * from uf;

select nome from municipio where nome like 'P%' and iduf = 1;

-- 21
select * from transportadora;

select nome, logradouro from transportadora where logradouro is not null;

-- 22

select * from pedido_produto where idpedido = 1;

-- 23

select * from pedido_produto where idpedido = 6 or idpedido = 10;

-- Funções agregadas

select * from pedido;

select avg(valor) from pedido; -- media

select count(*) from municipio; -- contar

select * from transportadora;
select count(logradouro) from transportadora;
select count(idtransportadora) from transportadora;

select * from municipio;
select count(idmunicipio) from municipio where iduf = 2;

select max(valor) from pedido;
select min(valor) , max(valor) from pedido;

select sum(valor) from pedido;

select idcliente, sum(valor) from pedido group by idcliente;

select idcliente, sum(valor) from pedido group by idcliente having sum(valor) > 500;

-- Exercicios
-- 1

select avg(valor), idvendedor from pedido group by idvendedor;

-- 2

select sum(valor), idvendedor from pedido group by idvendedor having sum(valor) > 1500;

-- 3

select sum(valor), idvendedor from pedido group by idvendedor;

-- 4

select count(idmunicipio) from municipio;

-- 5
select * from uf;

select count(*) from municipio where iduf = 2 or iduf = 1;

-- 6
select * from municipio;

select count(nome), iduf from municipio group by iduf;

-- 7
select * from cliente;

select count(nome) from cliente group by logradouro is not null;

-- 8

select count(nome), idmunicipio from cliente group by idmunicipio;

-- 9
select * from fornecedor;

select count(idfornecedor) from fornecedor;

-- 10

select count(idproduto), idfornecedor from produto group by idfornecedor;

-- 11

select avg(valor), idfornecedor from produto where idfornecedor = 1;

-- 12

select sum(valor) from produto;

-- 13 

select nome, max(valor) from produto group by nome;

-- 14 

select nome, min(valor) from produto group by nome;

-- 15

select avg(valor) from produto;

-- 16

select count(idtransportadora) from transportadora;

-- 17

select avg(valor) from pedido;

-- 18

select idcliente, sum(valor) from pedido group by idcliente;

-- 19

select idvendedor, sum(valor) from pedido group by idvendedor;

-- 20

select idtransportadora, sum(valor) from pedido group by idtransportadora;

-- 21

select data_pedido, sum(valor) from pedido group by data_pedido;

-- 22

select idcliente, idvendedor, idtransportadora, sum(valor) from pedido group by idcliente, idvendedor, idtransportadora;

-- 23

select sum(valor) from pedido group by data_pedido between '2008-04-01' and '2009-12-10' having sum(valor) > 200;

-- 24
select * from vendedor;

select avg(valor) from pedido where idvendedor = 1;

-- 25
select * from cliente;

select avg(valor) from pedido where idcliente = 15;

-- 26
select * from transportadora;
 
select count(idpedido) from pedido where idtransportadora = 1;

-- 27

select count(idpedido) from pedido group by idvendedor;


-- 28

select idcliente, count(idpedido) from pedido group by idcliente;

-- 29

select count(idpedido) from pedido where data_pedido between '2008-04-15' and '2008-04-25';

-- 30

select count(idpedido) from pedido where valor > 1000;

-- 31
select * from produto;

select count(idpedido) from pedido_produto where idproduto = 1;

-- 32

select sum(idproduto) from pedido_produto group by idproduto;

-- 33

select sum(valor_unitario) from pedido_produto group by idpedido;

-- 34

select count(idproduto) from pedido_produto group by idpedido;

-- 35

select sum(valor) from produto;

-- 36

select avg(valor_unitario) from pedido_produto where idpedido = 6;

-- 37

select max(valor) from pedido;

-- 38

select min(valor) from pedido;

-- 39

select sum(idproduto) from pedido_produto group by idpedido;

-- 40

select sum(idproduto) from pedido_produto;

-- Relacinamento com joins

-- todos os dados
select cln.nome as cliente, prf.nome as profissao from cliente as cln left outer join profissao as prf on cln.idprofissao = prf.idprofissao; 
 

-- não mostra dados nulos
select cln.nome as cliente, prf.nome as profissao from cliente as cln inner join profissao as prf on cln.idprofissao = prf.idprofissao; 

select cln.nome as cliente, prf.nome as profissao from cliente as cln right outer join profissao as prf on cln.idprofissao = prf.idprofissao;

-- Exercicios
-- 1

select cln.nome as cliente, prf.nome as profissao, ncn.nome as nacionalidade, cln.logradouro, cln.numero, cmp.nome as complemento, brr.nome as bairro, mnc.nome as municipio from cliente as cln left outer join profissao as prf on cln.idprofissao = prf.idprofissao left outer join nacionalidade as ncn on cln.idnacionalidade = ncn.idnacionalidade left outer join complemento as cmp on cln.idcomplemento = cmp.idcomplemento left outer join bairro as brr on cln.idbairro = brr.idbairro left outer join municipio as mnc on cln.idmunicipio = mnc.idmunicipio

-- 2
select * from produto;

select prod.nome, frn.nome as fornecedor, prod.valor from produto as prod left outer join fornecedor as frn on prod.idfornecedor = frn.idfornecedor

-- 3
select * from transportadora;

select trns.nome, mnc.nome as municipio from transportadora as trns left outer join	municipio as mnc on trns.idmunicipio = mnc.idmunicipio;

-- 4

select pd.data_pedido, pd.valor, cln.nome as cliente, trns.nome as transportadora, vdd.nome as vendedor from pedido as pd left outer join cliente as cln on pd.idcliente = cln.idcliente left outer join transportadora as trns on pd.idtransportadora = trns.idtransportadora left outer join vendedor as vdd on pd.idvendedor = vdd.idvendedor;

-- 5

select pd.nome as produto, pdp.quantidade, pdp.valor_unitario from pedido_produto as pdp left outer join produto as pd on pdp.idproduto = pd.idproduto;

-- 6

select cln.nome as cliente, pd.data_pedido from pedido as pd left outer join cliente as cln on pd.idcliente = cln.idcliente order by nome;

-- 7

select cln.nome as cliente, pd.data_pedido from pedido as pd left outer join cliente as cln on pd.idcliente = cln.idcliente order by nome;

-- 8

select mnc.nome as municipio, count(cln.idcliente) from cliente as cln left outer join municipio as mnc on cln.idmunicipio = mnc.idmunicipio group by mnc.nome;

-- 9

select frn.nome as forncedor, count(pd.idproduto) from produto as pd left outer join fornecedor as frn on pd.idfornecedor = frn.idfornecedor group by frn.nome;

-- 10

select cln.nome as cliente, sum(valor) as valor_total from pedido as pd left outer join cliente as cln on pd.idcliente = cln.idcliente group by cln.nome;

-- 11

select vdd.nome as vendedor, sum(valor) as valor_total from pedido as pd left outer join vendedor as vdd on pd.idvendedor = vdd.idvendedor group by vdd.nome;

-- 12

select trns.nome as transportadora, sum(pd.valor) as valor_total from pedido as pd left outer join transportadora as trns on pd.idtransportadora = trns.idtransportadora group by trns.nome;

-- 13

select cln.nome as cliente, count(idpedido) as quantidade from pedido as pd left outer join cliente as cln on pd.idcliente = cln.idcliente group by cln.nome;

-- 14

select pd.nome as produto, count(pdp.idproduto) as quantidade from pedido_produto as pdp left outer join produto as pd on pdp.idproduto = pd.idproduto group by pd.nome;

-- 15

select pd.data_pedido, sum(pd.valor) as somatorio from pedido as pd group by pd.data_pedido;

-- 16

select data_pedido, count(idpedido) as somatorio from pedido group by data_pedido;

-- Comandos adicionais

select * from pedido;

select data_pedido, extract(day from data_pedido), extract(month from data_pedido), extract(year from data_pedido) from pedido;

select nome, substring(nome from 1 for 5), substring(nome, 2) from cliente

select nome, upper(nome) from cliente;

select nome, cpf, coalesce(cpf, 'Não informado') from cliente;

select case sigla when 'PR' then 'Paraná' when 'SC' then 'Santa Catarina' else 'Outros' end as uf from uf;

-- Exercicios
-- 1
select * from cliente;

select nome, coalesce(extract(month from data_nascimento), 0) from cliente;

-- 2

select nome, case extract(month from data_nascimento) when 1 then 'Janeiro' when 2 then 'Fevereiro' when 3 then 'Março' when 4 then 'Abril' when 5 then 'Maio' when 6 then 'Junho' when 7 then 'Julho' when 8 then 'Agosto' when 9 then 'Setembro' when 10 then 'Outubro' when 11 then 'Novembro' when 12 then 'Dezembro' else 'Não informado' end as mes from cliente;

-- 3

select nome, coalesce(extract(year from data_nascimento), 0) from cliente;

-- 4

select substring(nome from 5 for 10) from municipio;

-- 5

select upper(nome) from municipio;

-- 6

select nome, case genero when 'M' then 'Masculino' when 'F' then 'Feminino' end as genero from cliente;

-- 7
select * from produto;

select nome, case when valor > 500 then 'Acima de 500' when valor < 500 then 'Abaixo de 500' else '500' end from produto;

-- Subconsultas

-- Selecionar a data do pedido e o valor onde o valor seja maior que a média dos valores pedidos

select
	data_pedido,
	valor
from
	pedido
where
	valor > (select avg(valor) from pedido);

-- exemplo com count

select 
	pdd.data_pedido,
	pdd.valor,
	(select sum(quantidade) from pedido_produto as pdp where pdp.idpedido = pdd.idpedido) as total
from
	pedido as pdd;

-- Exemplo com update
select * from pedido;

select avg(valor) from pedido;

update pedido set valor = valor + (valor * 5) / 100 where valor > (select avg(valor) from pedido);

-- Exercicios
-- 1

select nome from cliente where idmunicipio = 1 and idcliente;

-- 2
select avg(valor) from pedido;

select data_pedido, valor from pedido where valor < (select avg(valor) from pedido);

-- 3
select * from pedido;

select pdd.data_pedido, pdd.valor, cln.nome as nome, vdd.nome as vendedor from pedido as pdd left outer join cliente as cln on pdd.idcliente = cln.idcliente left outer join vendedor as vdd on pdd.idvendedor = vdd.idvendedor where (select count(pdd.idvendedor) from pedido as pdd) >= 2 or (select count(pdd.idcliente) from pedido as pdd) >= 2;

-- 4
select * from transportadora;

select nome from cliente where idmunicipio = 9;

-- 5

select cln.nome, mnc.nome from cliente as cln left outer join municipio as mnc on cln.idmunicipio = mnc.idmunicipio where cln.idmunicipio = 9 or cln.idmunicipio = 5;

-- 6
select * from pedido;

update
	pedido
set
	valor = valor + ((valor * 5) / 100)
where
	(select sum(pdp.valor_unitario) from pedido_produto as pdp where pdp.idpedido = idpedido) > (select avg(valor_unitario) from pedido_produto);

-- 7

select cln.nome, count(idpedido) from pedido as pdd left outer join cliente as cln on pdd.idcliente = cln.idcliente group by cln.idcliente;

-- 8

select
	cln.nome as cliente,
	count(pdd.idpedido) as total
from
	pedido pdd
left outer join
	cliente cln on pdd.idcliente = cln.idcliente
group by
	cln.nome;

--  Views
create view cliente_profissao as
select 
	cln.nome as cliente,
	cln.cpf,
	prf.nome as profissao
from 
	cliente cln
left outer join
	profissao prf on cln.idprofissao = prf.idprofissao;


select * from cliente_profissao;
select * from cliente_profissao where profissao = 'Professor';

-- Exercicios
-- 1

create view cliente_dados as
select
	cln.nome as cliente,
	prf.nome as profissao,
	ncn.nome as nacionalidade,
	cpm.nome as complemento,
	mnc.nome as municipio,
	uf.nome as uf,
	brr.nome as bairro,
	cln.cpf,
	cln.rg,
	cln.data_nascimento,
	cln.genero,
	cln.logradouro,
	cln.numero,
	cln.observacoes
from
	cliente cln
left outer join
	profissao prf on cln.idprofissao = prf.idprofissao
left outer join
	nacionalidade ncn on cln.idnacionalidade = ncn.idnacionalidade
left outer join
	complemento cpm on cln.idcomplemento = cpm.idcomplemento
left outer join
	municipio mnc on cln.idmunicipio = mnc.idmunicipio
left outer join
	uf uf on cln.idmunicipio = mnc.iduf
left outer join
	bairro brr on cln.idbairro = brr.idbairro;

select * from cliente_view;
-- 2

create view municipio_uf as
select
	mnc.nome,
	uf.sigla
from
	municipio mnc
left outer join
	uf uf on mnc.idmunicipio = uf.iduf;

select * from municipio_uf;

-- 3
create view produto_fornecedoras as
select
	pdt.nome as produto,
	pdt.valor as valor,
	frn.nome as fornecedor
from
	produto as pdt
left outer join
	fornecedor as frn on pdt.idfornecedor = frn.idfornecedor;

select * from produto_fornecedoras;

-- 4
create view transportadora_view as
select
	trns.nome as transportadora,
	trns.logradouro,
	trns.numero,
	uf.nome as uf,
	uf.sigla as sigla
from
	transportadora trns
left outer join
	uf uf on trns.idmunicipio = uf.iduf;

select * from transportadora_view;

-- 5

create view dados_pedidos as
select
	pdd.data_pedido,
	pdd.valor,
	trns.nome as transportadora,
	cln.nome as cliete,
	vdd.nome as vendedor
from
	pedido pdd
left outer join
	transportadora trns on pdd.idtransportadora = trns.idtransportadora
left outer join
	cliente cln on pdd.idcliente = cln.idcliente
left outer join
	vendedor vdd on pdd.idvendedor = vdd.idvendedor;

select * from pedidos;

-- 6
select * from pedido_produto;

create view pedidos_total as
select
	prd.nome as produto,
	pdp.quantidade,
	pdp.valor_unitario
from
	pedido_produto pdp
left outer join
	produto prd on pdp.idproduto = prd.idproduto
group by
	prd.nome, pdp.quantidade;


-- Campos Autoincremento

select * from cliente;

create table exemplo (
	idexemplo serial not null,
	nome varchar(50) not null,

	constraint pk_exemplo_idexemplo primary key (idexemplo)
);

insert into exemplo (nome) values ('Exemplo 1');
insert into exemplo (nome) values ('Exemplo 2');
insert into exemplo (nome) values ('Exemplo 3');
insert into exemplo (nome) values ('Exemplo 4');
insert into exemplo (nome) values ('Exemplo 5');

select * from exemplo;

select * from bairro;

select max(idbairro) + 1 from bairro;
create sequence bairro_id_seq minvalue 5;
alter table bairro alter idbairro set default nextval('bairro_id_seq');
alter sequence bairro_id_seq owned by bairro.idbairro;
insert into bairro(nome) values ('Teste 1');
insert into bairro(nome) values ('Teste 2');

-- Exercicios
-- a
select max(idcliente) + 1 from cliente;
create sequence cliente_id_seq minvalue 18;
alter table cliente alter idcliente set default nextval('cliente_id_seq');
alter sequence cliente_id_seq owned by cliente.idcliente;

-- b
select max(idcomplemento) + 1 from complemento;
create sequence complemento_id_seq minvalue 3;
alter table complemento alter idcomplemento set default nextval('complemento_id_seq');
alter sequence complemento_id_seq owned by complemento.idcomplemento;

-- c
select max(idfornecedor) + 1 from fornecedor;
create sequence fornecedor_id_seq minvalue 4;
alter table fornecedor alter idfornecedor set default nextval('fornecedor_id_seq');
alter sequence fornecedor_id_seq owned by fornecedor.idfornecedor;

-- d
select max(idmunicipio) + 1 from municipio;
create sequence municipio_id_seq minvalue 10;
alter table municipio alter idmunicipio set default nextval('municipio_id_seq');
alter sequence municipio_id_seq owned by municipio.idmunicipio;

-- e
select max(idnacionalidade) from nacionalidade;
create sequence nacionalidade_id_seq minvalue 4;
alter table nacionalidade alter idnacionalidade set default nextval('nacionalidade_id_seq');
alter sequence nacionalidade_id_seq owned by nacionalidade.idnacionalidade;

-- f
select max(idpedido) + 1 from pedido;
create sequence pedido_id_seq minvalue 16;
alter table pedido alter idpedido set default nextval('pedido_id_seq');
alter sequence pedido_id_seq owned by pedido.idpedido;

-- g

-- h
select max(idprofissao) + 1 from profissao;
create sequence profissao_id_seq minvalue 6;
alter table profissao alter idprofissao set default nextval('profissao_id_seq');
alter sequence profissao_id_seq owned by profissao.idprofissao;

-- i
select max(idtransportadora) + 1 from transportadora;
create sequence transportadora_id_seq minvalue 3;
alter table transportadora alter idtransportadora set default nextval('transportadora_id_seq');
alter sequence transportadora_id_seq owned by transportadora.idtransportadora;

-- j
select max(iduf) + 1 from uf;
create sequence uf_id_seq minvalue 7;
alter table uf alter iduf set default nextval('uf_id_seq');
alter sequence uf_id_seq owned by uf.iduf;

-- k
select max(idvendedor) + 1 from vendedor;
create sequence vendedor_id_seq minvalue 9;
alter table vendedor alter idvendedor set default nextval('vendedor_id_seq');
alter sequence vendedor_id_seq owned by vendedor.idvendedor;


select max(idproduto) + 1 from produto;
create sequence produto_id_seq minvalue 8;
alter table produto alter idproduto set default nextval('produto_id_seq');
alter sequence produto_id_seq owned by produto.idproduto;



-- Campos default

alter table pedido alter column data_pedido set default current_date;
alter table pedido alter column valor set default 0;

insert into pedido (idcliente, idvendedor, data_pedido, valor) values (1, 1);
insert into pedido (idcliente, idvendedor, data_pedido, valor) values (1, 1, '2022-10-10', 234);

select * from pedido;

-- Exercicio
-- 1 a
alter table pedido_produto alter column quantidade set default 1;

-- b
alter table pedido_produto alter column valor_unitario set default 0;

-- 2
alter table produto alter column valor set default 0;

-- Indicies

create index idx_cln_nome on cliente (nome);

-- Exercicios
-- 1 a
create index idx_pdd_data_pedido on pedido (data_pedido);

-- b
create index idx_prd_nome on produto (nome);

-- Funções

select valor, concat('R$ ', rouvalor, 2)) from pedido;

create function formata_moeda(valor float) returns varchar(20) language plpgsql as
$$
begin
	return concat('R$ ', rouvalor, 2)) from pedido;
end;
$$;

select valor, formata_moeda(valor) from pedido;
select valor, formata_moeda(valor) from produto;

create get_nome_by_id(idc integer) returns varchar(50) language plpgsql as
$$
declare r varchar(50);
begin
	select nome into r from cliente where idcliente = idc;
	return r
end;
$$;

select data_pedido, valor, idcliente, get_nome_by_id(idcliente) from pedido;
-- Exercicios
-- 1

select * from pedido;

create function get_valor_pedido(idpdd integer) returns varchar(20) language plpgsql as 
$$
begin
	return (select sum(pdd.valor) from pedido pdd where pdd.idpedido = idpdd;
end;
$$;

select get_valor_pedido(idpedido) from pedido;

-- 2

create function get_maior_valor() returns varchar(20) language plpgsql as
$$
begin
	return (select idpedido from pedido where valor = (select max(valor) from pedido));
end;
$$;

select get_maior_valor();

-- Stored procedoures

create procedure insere_bairro(nome_bairro varchar(30)) language sql as
$$
	insert into bairro (nome) values (nome_bairro);
$$;

call insere_bairro('teste procedure');

select * from bairro;

-- Exercícios
-- 1
create procedure reajuste(idprd integer, percentual integer) language sql as
$$
	update produto set valor = valor + ((valor * percentual) / 100) where idproduto = idprd;
$$;

select * from produto;
call reajuste(1, 10);

-- 2
create procedure excluir_produto(idprd integer) language sql as
$$
	delete from produto where idproduto = idprd;
$$;

insert into produto (idfornecedor, nome) values (1, 'teste');
select * from produto;
call excluir_produto(8);

-- Triggers

create table bairro_auditoria (
	idbairro integer not null,
	data_criacao timestamp not null
);


create or replace function bairro_log() returns trigger language plpgsql as
$$
begin
	insert into bairro_auditoria (idbairro, data_criacao) values (new.idbairro, current_timestamp);
	return new;
end;
$$;


create or replace trigger log_bairro_trigger after insert on bairro for each row execute procedure bairro_log(); 

call insere_bairro('Teste 10');
call insere_bairro('Teste 20');
call insere_bairro('Teste 30');
select * from bairro;
select * from bairro_auditoria;

-- Ecercícios
-- 1

create table pedidos_apagados (
	idpedido integer not null,
	idcliente integer not null,
	idtransportadora integer not null,
	idvendedor integer not null,
	data_pedido date not null,
	valor float not null,
	data_apagado date not null
);

alter table pedidos_apagados alter column data_apagados type timestamp;

-- 2

create or replace function pedidos_apagados_log() returns trigger language plpgsql as
$$
begin
	insert into pedidos_apagados(idpedido, idcliente, idtransportadora, idvendedor, data_pedido, valor, data_apagado) values (old.idpedido, old.idcliente, old.idtransportadora, old.idvendedor, old.data_pedido, old.valor, current_timestamp);
	return old;
end;
$$;

create trigger log_pedido_apagado before delete on pedido for each row execute procedure pedidos_apagados_log();

select * from pedido;
select * from pedido_produto;
select idpedido from pedido where idpedido not in (select idpedido from pedido_produto);

delete from pedido where idpedido = 16;
select * from pedidos_apagados;

-- Domínios

-- IDs
create domain idcurso as smallint;
create domain idmedio as integer;
create domain idlongo as bigint;

-- Caracteres
create domain sigla as char(3);
create domain codigo as varchar(10);
create domain nome_curto as varchar(15);
create domain nome_medio as varchar(50);
create domain nome_longo as varchar(70);

-- Data e hora
create domain data as date;
create domain horas as time;
create domain data_hora as timestamp;

-- Númerios
create domain moeda as numeric(10,2);
create domain float_curto as numeric(6,2);
create domain float_medio as numeric(10,2);
create domain float_longo as numeric(15,2);

alter table bairro alter column nome type nome_medio;

drop view cliente_dados;

-- Exercícios
drop view cliente_profissao;

alter table cliente alter column nome type nome_medio;

alter table complemento alter column nome type nome_medio;

drop view produto_fornecedoras;
alter table fornecedor alter column nome type nome_medio;

drop view municipio_uf;
alter table municipio alter column nome type nome_medio;

alter table nacionalidade alter column nome type nome_medio;

alter table pedido alter column data_pedido type data;

alter table pedido_produto alter column valor_unitario type moeda;

alter table produto alter column nome type nome_medio;

alter table profissao alter column nome type nome_medio;

alter table transportadora alter column nome type nome_medio;

alter table transportadora alter column logradouro type nome_medio;

alter table uf alter column nome type nome_medio;

alter table uf alter column sigla type sigla;

alter table vendedor alter column nome type nome_medio;

-- Usuários e permissões

create role gerente;
create role estagiario;

grant select, insert, delete, update on bairro, cliente, complemento, fornecedor, municipio, nacionalidade, pedido,pedido_produto, produto, profissao, transportadora, uf, vendedor to gerente with grant option;
grant all on all sequences in schema public to gerente;
-- revoke tirar permiçoes

grant select on cliente_dados, dados_pedidos to estagiario;

create role maria login password '123' in role gerente;
create role pedro login password '321' in role estagiario;

-- Exercicios
-- 1
create role atendente;

-- 2
grant select, insert on pedido, pedido_produto to atendente with grant option;

-- 3
create role Vinicius login password '987654321' in role atendente;
grant all on all sequences in schema public to atendente;

-- 4
select * from pedido where idpedido = 18;
delete from pedido where idpedido = 18;

-- Transaçoes
create table conta (
	idconta serial not null,
	cliente nome_medio not null,
	saldo moeda not null default 0,

	constraint pk_cnt_idconta primary key (idconta)
);

insert into conta (cliente, saldo) values ('Cliente 1', 1000);
insert into conta (cliente, saldo) values ('Cliente 2', 500);

select * from conta;

update conta set saldo = saldo - 100 where idconta = 1;
update conta set saldo = saldo + 100 where idconta = 2;

begin;
update conta set saldo = saldo - 100 where idconta = 1;
update conta set saldo = saldo + 100 where idconta = 2;
rollback;

begin;
update conta set saldo = saldo - 100 where idconta = 1;
update conta set saldo = saldo + 100 where idconta = 2;
commit;

-- Backup e restore








create table cliente_teste (
	nome varchar(50) not null,
	cpf char(11),
	-- Primary key
	constraint pk_cln_idcliente primary key (nome)
)

insert into cliente_teste (nome, cpf) values ('Vinicius', '784956');

select * from cliente_teste;

insert into cliente_teste (cpf, nome) values ('123456', 'Vinicius Rodrigues');

alter table cliente_teste drop cpf;

DROP DATABASE cliente_teste;