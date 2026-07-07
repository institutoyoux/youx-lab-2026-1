create table cliente (
      idcliente integer not null,
	  nome varchar(50) not null,
	  cpf char(11), --Ja que ta sem 'null' nao e obrigatorio preencher,
	  rg varchar(15),--Ja que ta sem 'null' nao e obrigatorio preencher,
	  data_nascimento date, -- Date e um tipo para data
	  genero char(1),
	  profissao varchar(30),
	  nacionalidade varchar(30),
	  logradouro varchar(30),
	  numero varchar(10),
	  complemento varchar(30),
	  bairro varchar(30),
	  municipio varchar(30),
	  uf varchar (30),
	  observacoes text,
      --primary key
	  constraint pk_cln_idcliente primary key (idcliente) --Traducao = Chave primaria da tabela,especificamente do id de cada cliente
)


insert into cliente (idcliente,nome,cpf,rg,data_nascimento,genero,profissao,nacionalidade,logradouro,numero,complemento,bairro.municipio,uf,observacoes)
values (15,'Jessica',null,,null,null,'F','Estudante',null,nulll,null,null,null,'Uniao da Vitoria','PR',);

select nome,genero,profissao from cliente order by nome desc; --Exercicio 1/ Nomes,profissoes e genero ordenados em decrescente

select nome from cliente where nome like '%r%'; --2/ nomes que tem r 

select nome from cliente where nome like 'C%'; --3/ nomes que comecam com c

select nome from cliente where nome like '%a'; --4/ Nomes que acabam com a 

select nome from cliente where bairro ilike '%centro%'; --5/ clientes que moram no centro

select nome from cliente where complemento like 'A%'; --6/ Clientes que o complemento comeca com A

select nome from cliente where genero like 'F'; --7/Seleciona as clientes femininas 

select nome from cliente where cpf is null; --8/Seleciona os clientes com cpf nulo

select nome,profissao from cliente order by profissao asc; --9/ Clientes organizados pela profissao em ordem crescente

select nome from cliente where nacionalidade ilike 'brasileira'; --10/ Clientes que sao brasileiros

select nome from cliente where numero is not null; --11/ Clientes que informaram seus numeros

select nome from cliente where uf ilike 'SC'; --12/ Clientes que sao de Santa Catarina

select nome from cliente where data_nascimento between '2000-01-01' and '2002-01-01' --13 / Clientes nascidos entre 2000 e 2002

select 'Nome:  '|| nome || ' Logradouro: ' || logradouro || ' Numero: ' || numero || ' Complemento: '|| complemento || ' Bairro: '||bairro || ' Municipio: '||municipio|| ' Uf: '||uf from cliente -- Dados concatenados

select * from cliente;

update cliente set nome = 'teste' where idcliente = '1';
update cliente set nome = 'Adriano',genero = 'M', numero = '241'where idcliente = 4
insert into cliente (idcliente,nome) values (16,'Joao')
delete from cliente where idcliente = 16;


-- Exercicios 
 -- 1 Insira dados novos na tabela
insert into cliente (idcliente,nome,cpf,rg,data_nascimento,genero,profissao,nacionalidade,logradouro,numero,complemento,bairro,municipio,uf) values (16,'Maicon',12349596421,1234,'1965-10-10','F','Empresario',null,null,null,null,null,'Florianopolis','PR'

insert into cliente (idcliente,nome,cpf,rg,data_nascimento,genero,profissao,nacionalidade,logradouro,numero,complemento,bairro,municipio,uf) values (17,'Getulio',null,4361,null,'F','Estudante','Brasileira','Rua Central','343','Apartamento','Centro','Curitiba','SC')

insert into cliente (idcliente,nome,cpf,rg,data_nascimento,genero,profissao,nacionalidade,logradouro,numero,complemento,bairro,municipio,uf) values (18,'Sandra',null,null,null,'M','Professor','Italiana',null,'12','Bloco A',null,null,null)

-- 2 Edite os dados do cliente Maicon

update cliente set cpf = '45390569432' where idcliente = '16';

update cliente set genero = 'M' where idcliente = '16';

update cliente set nacionalidade = 'Brasileira' where idcliente ='16';

update cliente set uf = 'SC' where idcliente = '16';

-- 3 Edite os dados do cliente Getulio

update cliente set data_nascimento = '1978-04-01' where idcliente = '17';

update cliente set genero = 'M' where idcliente = '17';

-- 4 Edite os dados da cliente Sandra 

update cliente set genero = 'F' where idcliente = '18';

update cliente set profissao = 'Professora' where idcliente ='18';

update cliente set numero = '123' where idcliente = '18';

-- 5 Apague o cliente Maicon

delete from cliente where idcliente = '16';

--6 Apague  cliente Sandra 

delete from cliente where idcliente = '18'


--Tabelas

create table profissao (
    idprofissao integer not null,
	nome varchar (30) not null,

	constraint pk_prf_idprofissao primary key (idprofissao),
	constraint un_prf_nome unique (nome)
);

insert into profissao (idprofissao,nome) values (1,'Estudante');
insert into profissao (idprofissao,nome) values (2,'Engenheiro');
insert into profissao (idprofissao,nome) values (3,'Pedreiro');
insert into profissao (idprofissao,nome) values (4,'Jornalista');
insert into profissao (idprofissao,nome) values (5,'Professor');

select * from profissao
select profissao from cliente 

create table nacionalidades (

   idnacionalidade integer not null,
   nome varchar (30) not null,

   constraint pk_ncd_idnacionalidade primary key (idnacionalidade),
   constraint un_ncd_nome unique (nome)
);

insert into nacionalidades (idnacionalidade,nome) values (1,'Brasileira');
insert into nacionalidades (idnacionalidade,nome) values (2,'Italiana');
insert into nacionalidades (idnacionalidade,nome) values (3,'Norte-Americana');
insert into nacionalidades (idnacionalidade,nome) values (4,'Alema')

select * from nacionalidades 

create table complemento (
    idcomplemento integer not null,
	nome varchar (30) not null,

	constraint pk_cpm_idcomplemento primary key (idcomplemento),
	constraint un_cpm_nome unique (nome)
);

create table bairro (
       idbairro integer not null,
	   nome varchar(30) not null,

	   constraint pk_brr_idbairro primary key (idbairro),
	   constraint un_brr_nome unique (nome)
);

select * from cliente

select * from nacionalidades
update cliente set idnacionalidade = 1 where idcliente in (1,2,3,4,6,10,11,14);
update cliente set idnacionalidade = 2 where idcliente in (5,7);
update cliente set idnacionalidade = 3 where idcliente = 8;
update cliente set idnacionalidade = 4 where idcliente in (9,13);

alter table cliente drop complemento;
alter table cliente add idcomplemento integer;
alter table cliente add constraint fk_cln_idcomplemento foreign key (idcomplemento) references complemento(idcomplemento);
update cliente set idcomplemento = 1 where idcliente in (1,4,9,13);
update cliente set idcomplemento = 2 where idcliente in (2,3,7);

alter table cliente drop bairro;
alter table cliente add idbairro integer;
alter table cliente add constraint fk_cln_idbairro foreign key (idbairro) references bairro (idbairro);

select * from bairro;
update cliente set idbairro = 1 where idcliente in (1,12,13);
update cliente set idbairro = 2 where idcliente in (2,3,6,8,9);
update cliente set idbairro = 3 where idcliente in (4,5);
update cliente set idbairro = 4 where idcliente = 7;



create table uf (
    iduf integer not null,
	nome varchar(30) not null,
	sigla char(2) not null,

	constraint pk_ufd_idunidade_federacao primary key (iduf),
	constraint un_ufd_nome unique (nome),
	constraint un_ufd_sigla unique (sigla)
);

insert into uf (iduf,nome,sigla) values (1,'Santa Catarina','SC');
insert into uf (iduf,nome,sigla) values (2,'Parana','PR');
insert into uf (iduf,nome,sigla) values (3,'Sao Paulo','SP');
insert into uf (iduf,nome,sigla) values (4,'Minas Gerais','MG');
insert into uf (iduf,nome,sigla) values (5,'Rio Grande do Sul','RS');
insert into uf (iduf,nome,sigla) values (6,'Rio de Janeiro','RJ');

select * from uf

create table municipio (
       idmunicipio integer not null,
	   nome varchar(30) NOT null,
	   iduf integer not null,

	   constraint pk_mnc_idmunicipio primary key (idmunicipio),
       constraint un_mnc_nome unique (nome),
	   constraint fk_mnc_iduf foreign key (iduf) references uf (iduf)
);


insert into municipio (idmunicipio,nome,iduf) values (1,'Porto Uniao',1);
insert into municipio (idmunicipio,nome,iduf) values (2,'Canoinhas',1);
insert into municipio (idmunicipio,nome,iduf) values (3,'Porto Vitoria ',2);
insert into municipio (idmunicipio,nome,iduf) values (4,'General Carneiro',2);
insert into municipio (idmunicipio,nome,iduf) values (5,'Sao Paulo',3);
insert into municipio (idmunicipio,nome,iduf) values (6,'Rio de Janeiro',6);
insert into municipio (idmunicipio,nome,iduf) values (7,'Uberlandia',4);
insert into municipio (idmunicipio,nome,iduf) values (8,'Porto Alegre',5);
insert into municipio (idmunicipio,nome,iduf) values (9,'Uniao da Vitoria',3);
select * from municipio

alter table cliente drop municipio;
alter table cliente drop uf;
alter table cliente add idmunicipio integer;
alter table cliente add constraint fk_cliente_idmunicipio foreign key (idmunicipio) references municipio (idmunicipio)

update cliente set idmunicipio = 1 where idcliente in (1,2,10,11); 
update cliente set idmunicipio = 2 where idcliente in (3,12);
update cliente set idmunicipio = 3 where idcliente = 4;
update cliente set idmunicipio = 4 where idcliente = 5;
update cliente set idmunicipio = 5 where idcliente in (6,13);
update cliente set idmunicipio = 6 where idcliente = 7;
update cliente set idmunicipio = 7 where idcliente = 8;
update cliente set idmunicipio = 8 where idcliente = 9;
update cliente set idmunicipio = 9 where idcliente in (14,15);

select * from cliente


-- EXERCICIO 
-- Tabela do Fornecedor
create table Fornecedor (
      idfornecedor integer not null,
	  nome varchar(50) not null,

	  constraint pk_forn_idfornecedor primary key (idfornecedor),
	  constraint un_forn_nome unique (nome)
)

insert into Fornecedor (idfornecedor,nome) values (1,'Cap.Computadores' );
insert into Fornecedor (idfornecedor,nome) values (2,'AA. Computadores' );
insert into Fornecedor (idfornecedor,nome) values (3,'BB Maquinas' )

select * from fornecedor



-- Tabela do Vendedor
create table Vendedor (
       idVendedor integer not null,
	   nome varchar (50)not null,

	   constraint pk_vend_idvendedor primary key (idvendedor),
	   constraint un_vend_nome unique (nome)
)

insert into vendedor (idvendedor,nome) values (1,'Andre');
insert into vendedor (idvendedor,nome) values (2,'Alisson');
insert into vendedor (idvendedor,nome) values (3,'Jose');
insert into vendedor (idvendedor,nome) values (4,'Ailton');
insert into vendedor (idvendedor,nome) values (5,'Maria');
insert into vendedor (idvendedor,nome) values (6,'Suellen');
insert into vendedor (idvendedor,nome) values (7,'Aline');
insert into vendedor (idvendedor,nome) values (8,'Silvana');

select * from vendedor


--Tabela da Transportadora 
create table Transportadora (
       idTransportadora integer not null,
	   idMunicipio integer,
       nome varchar(50) not null,
	   logradouro varchar(50),
	   numero varchar(50),

	   constraint pk_trans_idtransportadora primary key (idtransportadora),
	   constraint fk_trans_idmunicipio foreign key (idmunicipio) references municipio (idmunicipio),
	   constraint un_trans_nome unique (nome)

);

insert into Transportadora (idtransportadora,idmunicipio,nome,logradouro,numero) values (1,9,'Bs.Transportes','Rua das Limas','O1')
insert into Transportadora (idtransportadora,idmunicipio,nome,logradouro,numero) values (2,5,'Uniao Transportes',null,null);



select * from Transportadora


-- Tabela de Produtos 
create table Produto (
       idproduto integer not null,
	   idfornecedor integer not null,
	   nome varchar(50) not null,
	   valor float not null,


	  constraint pk_prd_idproduto primary key (idproduto),
	  constraint fk_prd_idfornecedor foreign key (idfornecedor) references fornecedor (idfornecedor),
	  constraint un_prd_nome unique (nome)
	   
);

insert into Produto (idproduto,idfornecedor,nome,valor)  values (1,1,'Microcomputador','800');
insert into Produto (idproduto,idfornecedor,nome,valor)  values (2,1,'Monitor','500');
insert into Produto (idproduto,idfornecedor,nome,valor)  values (3,2,'Placa Mae','200');
insert into Produto (idproduto,idfornecedor,nome,valor)  values (4,2,'HD','150');
insert into Produto (idproduto,idfornecedor,nome,valor)  values (5,2,'Placa de Video','200');
insert into Produto (idproduto,idfornecedor,nome,valor)  values (6,3,'Memoria RAM','100');
insert into Produto (idproduto,idfornecedor,nome,valor)  values (7,3,'Gabinete','35');

select * from Produto

-- Tabela de Pedidos 

create table Pedidos (
       idpedido integer not null,
	   idcliente integer not null,
	   idtransportadora integer,
	   idvendedor integer not null,
	   data_pedido date not null,
	   valor_total float not null,

	   constraint pk_pdd_idpedido primary key (idpedido),
	   constraint fk_pdd_idcliente foreign key (idcliente) references cliente (idcliente),
       constraint fk_pdd_idtransportadora foreign key (idtransportadora) references transportadora (idtransportadora),
	   constraint fk_pdd_idvendedor foreign key (idvendedor) references vendedor (idvendedor)
);
select * from cliente
update cliente set nome = 'Manoel' where idcliente = 1 

insert into Pedidos (idpedido,data_pedido,valor_total,idcliente,idtransportadora,idvendedor)
values (1,'2008-04-01',1300,1,1,1);
insert into Pedidos (idpedido,data_pedido,valor_total,idcliente,idtransportadora,idvendedor)
values (2,'2008-04-01',500,1,1,1);
insert into Pedidos (idpedido,data_pedido,valor_total,idcliente,idtransportadora,idvendedor)
values (3,'2008-04-02',300,11,2,5);
insert into Pedidos (idpedido,data_pedido,valor_total,idcliente,idtransportadora,idvendedor)
values (4,'2008-04-05',1000,8,1,7);
insert into Pedidos (idpedido,data_pedido,valor_total,idcliente,idtransportadora,idvendedor)
values (5,'2008-04-06',200,9,2,6);
insert into Pedidos (idpedido,data_pedido,valor_total,idcliente,idtransportadora,idvendedor)
values (6,'2008-04-06',1985,10,1,6);
insert into Pedidos (idpedido,data_pedido,valor_total,idcliente,idtransportadora,idvendedor)
values (7,'2008-04-06',800,3,1,7);
insert into Pedidos (idpedido,data_pedido,valor_total,idcliente,idtransportadora,idvendedor)
values (8,'2008-04-06',175,3,null,7);
insert into Pedidos (idpedido,data_pedido,valor_total,idcliente,idtransportadora,idvendedor)
values (9,'2008-04-07',1300,12,null,8);
insert into Pedidos (idpedido,data_pedido,valor_total,idcliente,idtransportadora,idvendedor)
values (10,'2008-04-10',200,6,1,8);
insert into Pedidos (idpedido,data_pedido,valor_total,idcliente,idtransportadora,idvendedor)
values (11,'2008-04-15',300,15,2,1);
insert into Pedidos (idpedido,data_pedido,valor_total,idcliente,idtransportadora,idvendedor)
values (12,'2008-04-20',300,15,2,5);
insert into Pedidos (idpedido,data_pedido,valor_total,idcliente,idtransportadora,idvendedor)
values (13,'2008-04-20',350,9,1,7);
insert into Pedidos (idpedido,data_pedido,valor_total,idcliente,idtransportadora,idvendedor)
values (14,'2008-04-23',300,2,1,5);
insert into Pedidos (idpedido,data_pedido,valor_total,idcliente,idtransportadora,idvendedor)
values (15,'2008-04-25',200,11,null,5);

 select * from pedidos

--  TABELA DE PEDIDO 
create table Pedido (
     idpedido integer not null,
	 idcliente integer not null,
	 idtransportadora integer not null,
	 idvendedor integer not null,
	 data_pedido date not null,
	 valor float not null,

	 constraint pk_pdi_idpedido primary key (idpedido),
	 constraint fk_pdi_idcliente foreign key (idcliente) references cliente (idcliente),
	 constraint fk_pdi_idtransportadora foreign key (idtransportadora) references transportadora (idtransportadora),
	 constraint fk_pdi_idvendedor foreign key (idvendedor) references vendedor (idvendedor)
)

--Pedido produto 

create table Pedido_Produto (
      idpedido integer not null,
	  idproduto integer not null,
	  quantidade integer not null,
	  valor_unitario float not null,

	  constraint pk_pdp_idpedidoproduto primary key (idpedido,idproduto),
	  constraint fk_pdp_idpedido foreign key (idpedido) references pedidos (idpedido),
	  constraint fk_pdp_idproduto foreign key (idproduto) references produto (idproduto)
);

drop table pedido_produto

select * from pedido_produto

insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (1,1,1,800);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (1,4,1,500);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (2,2,1,500);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (3,4,2,150);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (4,1,1,800);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (4,3,1,200);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (1,2,1,500);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (5,3,1,200);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (6,1,2,800);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (6,7,1,35);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (6,5,1,200);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (6,4,1,150);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (7,1,1,800);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (8,7,5,35);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (9,1,1,800);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (9,2,1,500);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (10,5,1,200);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (11,5,1,200);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (11,6,1,100);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (12,2,1,500);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (13,3,1,200);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (13,4,1,150);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (14,6,3,100);
insert into pedido_produto (idpedido,idproduto,quantidade,valor_unitario) values (15,3,1,200);


---------------------------------- 	EXERCICIOS	 ------------------------------------------------------------------ 


select nome from vendedor order by nome asc; --Nome dos clientes em ordem alfabetica.

select valor,nome from produto where valor >200 order by valor asc; -- Valores maiores que 200 reais em ordem crescente

select nome,valor, valor + (valor * 10) / 100 as Reajustes from produto order by nome  -- Valores com reajustes de 10% 

select * from municipio where iduf = 5; -- Municipios do Rio Grande do Sul

select idpedido,data_pedido from pedidos where data_pedido between '2008-04-10' and '2008-04-25' order by valor_total; -- Pedidos de quem nasceu entre 10/04/2008 e 25/04/2008;

select idpedido,valor_total from pedidos where valor_total between '1000' and '1500'; -- Pedidos que estejam entre 1000 e 1500 R$

select idpedido,valor_total from pedidos where valor_total  not between '100' and '500'; -- Pedidos que nao estejam entre 100 e 500 R$

select * from pedidos where idvendedor = 1 order by valor_total desc -- Pedidos do vendedor andre (idvendedor 1)

select * from pedidos where idcliente = 1 order by valor_total-- Pedidos do cliente Manoel (idcliente 1)

select * from pedidos where idcliente = 15 and idvendedor = 1 -- Os pedidos da cliente Jessica com o vendedor andre

select * from pedidos where idtransportadora = 2 --Pedidos da Uniao Transporte

select * from pedidos where idvendedor = 5 or idvendedor = 7 order by valor_total desc -- Pedidos das vendedoras Maria e Aline

select * from cliente where idmunicipio = 1 or idmunicipio = 9 -- Clientes de Uniao da Vitoria ou Porto Uniao

select * from cliente where idmunicipio <> 1 and idmunicipio <> 9 -- Clientes que nao sao de Uniao da Vitoria e Porto Uniao

select * from cliente where logradouro like 'Av%' -- Clientes que moram em uma Avenida 

select nome from vendedor where nome  like 'S%' -- Vendedores com a inicial S

select nome from vendedor where nome like '%a' -- Vendedores com a ultima letra sendo a 'a'

select * from municipio where nome like 'P%' and iduf = 1

select * from transportadora where logradouro is not null;

select * from pedido_produto where idpedido = 1

select * from pedido_produto where idpedido = 6 or idpedido = 10



------------------------------------- Funcoes Agregadas ------------------------------------------------------------------------------



select avg(valor_total) from pedidos -- Faz as medias dos precos dos produtos

select count (idmunicipio) from municipio --Serviu pra contar os municipios

select count (logradouro) from transportadora --Serviu pra contar os municipios

select count (idmunicipio) from municipio where iduf = 2  --Serviu pra contar os municipios (agora nos estados especificos)

select max(valor_total) from pedidos -- Seleciona o valor mais caro/maximo do produto

select min(valor_total),max(valor_total) from pedidos -- Seleciona o valor mais caro/maximo do produto e o minimo

select sum(valor_total) from pedidos -- Soma todos os valores

select idcliente,sum(valor_total) from pedidos group by idcliente -- Precos somados e ordenados em grupos

select idcliente,sum(valor_total) from pedidos group by idcliente having sum(valor_total) >  500  -- Precos acima de 500R$ somados e ordenados em grupos






----------------------------------------- EXERCICIOS  FUNCOES AGREGADAS -------------------------------------------------


select * from pedidos
select idvendedor,avg(valor_total) from pedidos group by idvendedor having sum(valor_total) > 200 -- 1) Media dos valores dos vendedores que venderam acima de 200R$

select idvendedor,sum(valor_total) from pedidos group by idvendedor having sum(valor_total) > 1500 -- 2) Os Vendedores que venderam acima de 100 Reais

select idvendedor,sum(valor_total) from pedidos group by idvendedor -- 3) Soma os valores de cada vendedor

select count(idmunicipio) from municipio -- 4) A quantidade de municipios 

select count(idmunicipio) from municipio where iduf = 1 or iduf = 2 -- 5) A Quantidade de municipios de Santa Catarina ou Parana

select * from municipio
select iduf,count(idmunicipio) from municipio group by iduf -- 6) Quantidade de municipios por estados 

select count(idcliente) from cliente where logradouro is not null -- 7) Quantidade de clientes que informaram seus logradouros 

select idmunicipio,count(idcliente) from cliente group by idmunicipio --8) Quantidade de clientes organizados por municipios 

select count(idfornecedor) as Quantidade from fornecedor --9) Quantidade de fornecedores

select idfornecedor,count(idproduto) from produto group by idfornecedor --!0) Quantidade de produtos por fornecedor

select * from fornecedor
select avg(valor) from produto where idfornecedor = 1 -- 11) Media dos valores do fornecedor Cap.Computadores

select sum(valor) from produto -- 12) Soma dos valores de todos os produtos

select nome,valor from produto order by valor desc limit 1 -- 13  o nome e valor mais caro dos produtos 

select nome,valor from produto order by valor asc limit 1  --14  o nome e o valor mais baratos dos produtos

select avg(valor) from produto; -- 15) Media dos precos de todos os produtos 

select count (idtransportadora) as Quantidade_Transportadoras from transportadora; -- 16) Quantidade de Transportadoras 

select avg(valor_total) from pedidos; --17) Media dos valores de todos os pedidos 

select idcliente,sum(valor_total) from pedidos group by idcliente; -- 18) Soma dos valores agrupados por cliente 

select idvendedor,sum(valor_total) from pedidos group by idvendedor; -- 19) Soma dos valores agrupados por vendedores 

select idtransportadora,sum(valor_total) from pedidos group by idtransportadora; -- 20) Soma dos valores agrupados por transportadoras 

select data_pedido,sum(valor_total) from pedidos group by data_pedido; --21) Soma dos valores agrupados pelas datas de nascimentos



select idcliente,idvendedor,idtransportadora,sum(valor_total) from pedidos group by idcliente,idvendedor,idtransportadora; -- Soma dos valores agrupados por cliente,vendedor,transportadora


select sum(valor_total) from pedidos where data_pedido between '2008-04-01' and '2009-12-10' and valor_total > 200; -- 23) Soma dos pedidos que as datas estao entre 01/04/2008 e 10/12/2008 e sejam acima de 200R$

select * from vendedor
select avg (valor_total) from pedidos where idvendedor = 1; -- 24) Media dos pedidos do vendedor andre 

select * from cliente
select avg(valor_total) from pedidos where idcliente = 15; -- 25)c Media dos pedidos da ilustre cliente Jessicca

select * from transportadora
select idtransportadora, count(idpedido) from pedidos where idtransportadora = 1 group by idtransportadora; -- 26) Conta quantos pedidos tem a BS.Transporte e agrupa

select idvendedor,count(idpedido) from pedidos group by idvendedor; -- 27) Conta quantos pedidos cada vendedor tem e agrupa-os respectivamente em seus devidos lugares 

select idcliente,count(idpedido) from pedidos group by idcliente; -- 28) Conta quantos pedidos cada cliente realizou e agrupa os respectivamente em seus devidos lugares

select count(idpedido) from pedidos where data_pedido between '2008-04-15' and '2008-04-25'; -- 29) Contagem de pedidos que a faixa de tempo estejam posicionadas entre 15/04/2008 e 25/04/2008

select count(idpedido) from pedidos where valor_total > 1000; -- 30) Quantidade de Pedidos que por observacao rigorosa estao acima de mil reais brasileiros

select * from produto
select count (idpedido) from pedido_produto where idproduto = 1; -- 31) Contagem a respeito dos pedidos feitos sobre Microcomputadores

select idproduto, count(idpedido) from pedido_produto group by idproduto; -- 32) Quantidade de produtos vendidos agrupados pelos produtos

select idpedido,sum(valor_unitario) from pedido_produto group by idpedido; -- 33) O Somatorio do valor dos produtos dos pedidos,agrupados por pedidos.

select idpedido,count(idproduto) from pedido_produto group by idpedido; -- 34) Quantidade de produtos agrupados por pedidos.

select sum(valor_unitario) from pedido_produto; -- 35) Soma dos valores unitarios de todos produtos

select avg(valor_unitario) from pedido_produto where idpedido = 6; -- 36) Media dos produtos 6 

select idpedido,max(valor_unitario) from pedido_produto group by idpedido; --37) Maior valor de cada pedido

select idpedido,min(valor_unitario) from pedido_produto group by idpedido ; --38) Menor valor de cada pedido

select   idpedido, sum(valor_unitario) as total_produtos from pedido_produto group by idpedido; --39) O somatório da quantidade de produtos por pedido.

select sum (valor_unitario) as total_geral_produto from pedido_produto; -- 40) O somatório da quantidade de todos os produtos do pedido.


--  RELACIONAMENTO COM JOINS 
select
     cliente.nome,
	 profissao.nome
from 
     cliente -- Tabela de base
left outer join -- Esta usando a tabela ao lado de base (nesse exemplo esta acima mas e apenas identacao)
     profissao on cliente.idprofissao = profissao.idprofissao -- Tabela que queremos importar a profissao


select
     cliente.nome,
	 profissao.nome
from 
     cliente -- Tabela de base
inner join -- Esta usando a tabela ao lado de base (nesse exemplo esta acima mas e apenas identacao) 
     profissao on cliente.idprofissao = profissao.idprofissao -- e linka a tabela profissao pra onde e 'cliente.idprofissao' ficar com os dados da key primaria de profissao e portanto os nomes

-- EXERCICIOS 
--1) O nome do cliente, a profissão, a nacionalidade, o logradouro, o número, o complemento, o bairro, o município e a unidade de federação.
select cliente.nome,
       profissao.nome as profissao,
	   nacionalidades.nome as nacionalidades,
	   cliente.logradouro,
	   cliente.numero,
	   complemento.nome as complemento,
	   bairro.nome as bairro,
	   municipio.nome as municipio,
	   uf.nome as uf
from cliente
left outer join 
     profissao on cliente.idprofissao = profissao.idprofissao
left outer join
     nacionalidades on cliente.idnacionalidade = nacionalidades.idnacionalidade 
left outer join
     complemento on cliente.idcomplemento = complemento.idcomplemento 
left outer join 
    bairro on cliente.idbairro = bairro.idbairro 
left outer join 
    municipio on cliente.idmunicipio = municipio.idmunicipio 
left outer join
     uf on municipio.iduf = uf.iduf


--2) O nome do produto, o valor e o nome do fornecedor.

select 
      produto.nome,
	  produto.valor,
	  fornecedor.nome as Fornecedor
from produto
left outer join 
      fornecedor on produto.idfornecedor = fornecedor.idfornecedor

--3) O nome da transportadora e o município.

select 
     transportadora.nome,
	 municipio.nome
from transportadora 
left outer join 
      Municipio on transportadora.idmunicipio = municipio.idmunicipio
	  
--4) A data do pedido, o valor, o nome do cliente, o nome da transportadora e o nome do vendedor.

select 
     pedidos.data_pedido,
	 pedidos.valor_total,
	 cliente.nome as Nome_Do_Cliente,
	 transportadora.nome as Nome_Transportadora,
	 vendedor.nome as Vendedor
from pedidos
left outer join 
    Cliente on pedidos.idcliente = cliente.idcliente
left outer join 
    Transportadora on pedidos.idtransportadora = transportadora.idtransportadora
left outer join
    Vendedor on pedidos.idvendedor = vendedor.idvendedor


--5)O nome do produto, a quantidade e o valor unitário dos produtos do pedido.

select 
     produto.nome,
	 pedido_produto.quantidade,
	 pedido_produto.valor_unitario
from pedido_produto 
left outer join 
    Produto on pedido_produto.idproduto = produto.idproduto

--6) O nome dos clientes e a data do pedido dos clientes que fizeram algum pedido (ordenado pelo nome do cliente).

select 
    cln.nome,
	 pdd.data_pedido
from cliente cln
inner join
     pedidos pdd on pdd.idcliente = cln.idcliente 
order by 
      cln.nome


--7) O nome dos clientes e a data do pedido de todos os clientes, independente se tenham feito pedido (ordenado pelo nome do cliente).

select 
    cln.nome,
	 pdd.data_pedido
from cliente cln
left outer join
     pedidos pdd on pdd.idcliente = cln.idcliente 
order by 
      cln.nome

-- 8) O nome da cidade e a quantidade de clientes que moram naquela cidade.-- 
select 
     mnc.nome,
	 count(cln.idcliente)
from 
     cliente cln
inner join 
     municipio mnc on cln.idmunicipio = mnc.idmunicipio
group by mnc.nome

-- 9) O nome do fornecedor e a quantidade de produtos de cada fornecedor.
select 
     frn.nome as fornecedor,
	 count(pdd.idproduto)
from 
   produto pdd 
left outer join 
   fornecedor frn on pdd.idfornecedor = frn.idfornecedor
group by frn.nome

--10) O nome do cliente e o somatório do valor do pedido (agrupado por cliente).
select 
      cln.nome as cliente,
	  sum(valor_total)
from pedidos
left outer join 
     cliente cln on pedidos.idcliente = cln.idcliente
	group by cln.nome

--11) O nome do vendedor e o somatório do valor do pedido (agrupado por vendedor).

select 
    vnd.nome as vendedor,
	sum(valor_total)
from pedidos 
left outer join 
     vendedor vnd on pedidos.idvendedor = vnd.idvendedor
	group by vnd.nome

--12) O nome da transportadora e o somatório do valor do pedido (agrupado por transportadora).

select 
     trn.nome as transportadora,
	 sum(valor_total)
from pedidos 
left outer join 
      transportadora trn on pedidos.idtransportadora = trn.idtransportadora
	 group by trn.nome

--13) O nome do cliente e a quantidade de pedidos de cada um (agrupado por cliente).

select 
    cln.nome as cliente,
	count(idpedido)
from pedidos
left outer join 
      cliente cln on pedidos.idcliente = cln.idcliente
	group by cln.nome-- Extrai apenas o ano da data de nascimento da pessoa

-- 14) O nome do produto e a quantidade vendida (agrupado por produto).

 select 
      pdt.nome as produto,
	  sum(pdp.quantidade)
from pedido_produto pdp
left outer join 
     produto pdt on pdp.idproduto = pdt.idproduto
group by pdt.nome

-- 15) A data do pedido e o somatório do valor dos produtos do pedido (agrupado pela data do pedido).
   select 
   pdd.data_pedido,
   sum(pdp.valor_unitario)
   from pedido_produto pdp
   left outer join 
   pedidos pdd on pdp.idpedido = pdd.idpedido
 group by pdd.data_pedido 

--16) A data do pedido e a quantidade de produtos do pedido (agrupado pela data do pedido).
    select 
   pdd.data_pedido,
   sum(pdp.quantidade) as quantidade
   from pedido_produto pdp
   left outer join 
   pedidos pdd on pdp.idpedido = pdd.idpedido
 group by pdd.data_pedido

 -- COMANDO ADICIONAIS 
 select * from pedidos
 select
 data_pedido,
 extract(day from data_pedido) as Dia, -- Extrai apenas o dia da data do pedido da pessoa
 extract(year from data_pedido) as Ano, -- Extrai apenas o ano da data do pedido da pessoa
 extract(month from data_pedido) as Mes  -- Extrai apenas o mes da data do pedido da pessoa
 from pedidos 


 select nome,substring(nome from 1 for 5 ) from cliente -- Nomes de 5 letras 
 select nome,substring(nome,3) from cliente -- Os nomes a partir da terceira letra
 select nome,upper(nome) from cliente -- TUDO MAIUSCULO
 select nome,cpf,coalesce(cpf,'Tem que ver pq cpf nao e brincadeira nao') from cliente -- Deixa uma mensagem a onde nao foi digitado o cpf


 select 
      case sigla 
	    when 'PR' then 'Parana'
	    when 'SC' then 'Santa Catarina'
	  else 'outros'
	  end 
from uf -- Serve tipo o if com print do pythonn

