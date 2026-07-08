--EDITORA
create table editora (
	ideditora serial not null,
	nome varchar(50) not null unique,
	
	constraint pk_edt_ideditora primary key (ideditora)
)
insert into editora(nome) values ('Bookman');
insert into editora(nome) values ('Edgard Blusher');
insert into editora(nome) values ('Nova Terra');
insert into editora(nome) values ('Brasport');
select * from editora


--CATEGORIA
create table categoria (
	idcategoria serial not null,
	nome varchar(50) not null unique,

	constraint pk_ctg_idcategoria primary key (idcategoria)
)
insert into categoria(nome) values ('Banco de Dados');
insert into categoria(nome) values ('HTML');
insert into categoria(nome) values ('Java');
insert into categoria(nome) values ('PHP');
select * from categoria


--AUTOR
create table autor (
	idautor serial not null,
	nome varchar(50) not null,

	constraint pk_atr_idautor primary key (idautor)
)
insert into autor(nome) values ('Waldemar Setzer');
insert into autor(nome) values ('Flávio Soares');
insert into autor(nome) values ('John Watson');
insert into autor(nome) values ('Rui Rossi dos Santos');
insert into autor(nome) values ('Antonio Pereira de Resende');
insert into autor(nome) values ('Claudiney Calixto Lima');
insert into autor(nome) values ('Evandro Carlos Teruel');
insert into autor(nome) values ('Ian Graham');
insert into autor(nome) values ('Fabrício Xavier');
insert into autor(nome) values ('Pablo Dalloglio');
select * from autor


--LIVRO
create table livro (
	idlivro serial not null,
	ideditora integer not null,
	idcategoria integer not null,
	nome varchar(100) not null unique,

	constraint pk_lvr_idlivro primary key (idlivro),
	constraint fk_lvr_ideditora foreign key (ideditora) references editora (ideditora),
	constraint fk_lvr_idcategoria foreign key (idcategoria) references categoria (idcategoria)
);
insert into livro(ideditora, idcategoria, nome) values (2, 1, 'Banco de Dados – 1 Edição');
insert into livro(ideditora, idcategoria, nome) values (1, 1, 'Oracle DataBase 11G Administração');
insert into livro(ideditora, idcategoria, nome) values (3, 3, 'Programação de Computadores em Java');
insert into livro(ideditora, idcategoria, nome) values (4, 3, 'Programação Orientada a Aspectos em Java');
insert into livro(ideditora, idcategoria, nome) values (4, 2, 'HTML5 – Guia Prático');
insert into livro(ideditora, idcategoria, nome) values (3, 2, 'XHTML: Guia de Referência para Desenvolvimento na Web');
insert into livro(ideditora, idcategoria, nome) values (1, 4, 'PHP para Desenvolvimento Profissional');
insert into livro(ideditora, idcategoria, nome) values (2, 4, 'PHP com Programação Orientada a Objetos');
select * from livro


--LIVRO_AUTOR
create table livro_autor (
	idlivro integer not null,
	idautor integer not null,

	constraint pk_lvt_idlivroautor primary key (idlivro, idautor),
	constraint fk_lvt_idlivro foreign key (idlivro) references livro (idlivro),
	constraint fk_lvt_idautor foreign key (idautor) references autor (idautor)
);
insert into livro_autor(idlivro, idautor) values (1, 1);
insert into livro_autor(idlivro, idautor) values (1, 2);
insert into livro_autor(idlivro, idautor) values (2, 3);
insert into livro_autor(idlivro, idautor) values (3, 4);
insert into livro_autor(idlivro, idautor) values (4, 5);
insert into livro_autor(idlivro, idautor) values (4, 6);
insert into livro_autor(idlivro, idautor) values (5, 7);
insert into livro_autor(idlivro, idautor) values (6, 8);
insert into livro_autor(idlivro, idautor) values (7, 9);
insert into livro_autor(idlivro, idautor) values (8, 10);


--ALUNO
create table aluno (
	idaluno serial not null,
	nome varchar(30) not null,

	constraint pk_aln_idaluno primary key (idaluno);
);
insert into aluno(nome) values ('Mario');
insert into aluno(nome) values ('João');
insert into aluno(nome) values ('Paulo');
insert into aluno(nome) values ('Pedro');
insert into aluno(nome) values ('Maria');
select * from aluno


--EMPRÉSTIMO
create table emprestimo (
	idemprestimo serial not null,
	idaluno integer not null,
	data_emprestimo date not null default current_date,
	data_devolucao date not null,
	valor float not null default 0,
	devolvido char(1) not null,

	constraint pk_emp_idemprestimo primary key (idemprestimo),
	constraint fk_emp_idaluno foreign key (idaluno) references aluno (idaluno)
);
insert into emprestimo(idaluno, data_emprestimo, data_devolucao, valor, devolvido)
values (1, '2012-05-02', '2012-05-12', '10', 'S');

insert into emprestimo(idaluno, data_emprestimo , data_devolucao, valor, devolvido)
values (1, '2012-04-23', '2012-05-03', '5', 'N');

insert into emprestimo(idaluno, data_emprestimo , data_devolucao, valor, devolvido)
values (2, '2012-05-10', '2012-05-20', '12', 'N');

insert into emprestimo(idaluno, data_emprestimo , data_devolucao, valor, devolvido)
values (3, '2012-05-10', '2012-05-20', '8', 'S');

insert into emprestimo(idaluno, data_emprestimo , data_devolucao, valor, devolvido)
values (4, '2012-05-05', '2012-05-15', '15', 'N');

insert into emprestimo(idaluno, data_emprestimo , data_devolucao, valor, devolvido)
values (4, '2012-05-07', '2012-05-17', '20', 'S');

insert into emprestimo(idaluno, data_emprestimo , data_devolucao, valor, devolvido)
values (4, '2012-05-08', '2012-05-18', '5', 'S');
select * from emprestimo


--EMPRESTIMO_LIVRO
create table emprestimo_livro (
	idemprestimo integer not null,
	idlivro integer not null,

	constraint pk_eml_idemprestimolivro primary key (idemprestimo, idlivro),
	constraint fk_eml_idemprestimo foreign key (idemprestimo) references emprestimo (idemprestimo),
	constraint fk_eml_idlivro foreign key (idlivro) references livro (idlivro)
);
insert into emprestimo_livro(idemprestimo, idlivro) values (1, 1);
insert into emprestimo_livro(idemprestimo, idlivro) values (1, 4);
insert into emprestimo_livro(idemprestimo, idlivro) values (2, 3);
insert into emprestimo_livro(idemprestimo, idlivro) values (2, 2);
insert into emprestimo_livro(idemprestimo, idlivro) values (3, 7);
insert into emprestimo_livro(idemprestimo, idlivro) values (4, 5);
insert into emprestimo_livro(idemprestimo, idlivro) values (4, 4);
insert into emprestimo_livro(idemprestimo, idlivro) values (4, 6);
insert into emprestimo_livro(idemprestimo, idlivro) values (4, 1);
insert into emprestimo_livro(idemprestimo, idlivro) values (4, 8);

--INDEX
create index idx_emp_emprestimo on emprestimo (data_emprestimo);
create index idx_emp_devolucao on emprestimo (data_devolucao);


--consultas simples
--19
select nome from autor order by nome

--20
select nome from aluno where nome like 'P%'

--21
select nome from livro where idcategoria = 1 or idcategoria = 3

--22
select nome from livro where ideditora = 1

--23
select * from emprestimo where data_emprestimo between '2012-05-05' and '2012-05-10'

--24
select * from emprestimo where data_emprestimo not between '2012-05-05' and '2012-05-10'

--25
select * from emprestimo where devolvido = 'S'


--consultas com agrupamentos simples
--26
select count(idlivro) from livro

--27
select sum(valor) from emprestimo

--28
select avg(valor) from emprestimo

--29
select max(valor) from emprestimo

--30
select min(valor) from emprestimo

--31
select sum(valor) from emprestimo where data_emprestimo between '2012-05-05' and '2012-05-10'

--32
select count(idemprestimo) from emprestimo where data_emprestimo between '2012-05-01' and '2012-05-05'


--consultas com join
--33
create view dados_livros as
select
	lvr.nome as livro,
	ctg.nome as categoria,
	edt.nome as editora
from livro lvr
left outer join categoria ctg on lvr.idcategoria = ctg.idcategoria
left outer join editora edt on lvr.ideditora = edt.ideditora

--34
create view livro_autor_view as
select
	lvr.nome as livro,
	atr.nome as autor
from livro_autor lva
left outer join livro lvr on lva.idlivro = lvr.idlivro
left outer join autor atr on lva.idautor = atr.idautor

--35
select * from livro_autor where idautor = 8
select 
	lvr.nome as livro	
from livro_autor ltr
left outer join livro lvr on ltr.idlivro = lvr.idlivro
where ltr.idautor = 8

--36
select
	aln.nome as aluno,
	emp.data_emprestimo,
	emp.data_devolucao
from emprestimo emp
left outer join aluno aln on emp.idaluno = aln.idaluno

--37
select
	distinct(lvr.nome) as livro
from emprestimo_livro elv
left outer join livro lvr on elv.idlivro = lvr.idlivro


--agrupamento + join
--38
select
	edt.nome as editora,
	count(lvr.idlivro) as quantidade
from livro lvr
left outer join editora edt on lvr.ideditora = edt.ideditora
group by edt.nome

--39
select
	ctg.nome as categoria,
	count(lvr.idlivro) as quantidade
from livro lvr
left outer join categoria ctg on lvr.idcategoria = ctg.idcategoria
group by ctg.nome

--40
select
	atr.nome as autor,
	count(lva.idlivro) as quantidade
from livro_autor lva
left outer join autor atr on lva.idautor = atr.idautor
group by atr.nome

--41
select
	aln.nome as aluno,
	count(emp.idemprestimo) as quantidade
from emprestimo emp
left outer join aluno aln on emp.idaluno = aln.idaluno
group by aln.nome

--42
select
	aln.nome as aluno,
	sum(emp.valor) as valor
from emprestimo emp
left outer join aluno aln on emp.idaluno = aln.idaluno
group by aln.nome

--43
select
	aln.nome as aluno,
	sum(emp.valor) as valor
from emprestimo emp
left outer join aluno aln on emp.idaluno = aln.idaluno
group by aln.nome
having sum(emp.valor) > 12






















