
create table editora (
	ideditora serial not null,
	nome varchar(50)  not null,

	constraint pk_edt_ideditora primary key (ideditora),
	constraint pk_edt_nome unique (nome)
	

);

insert into editora(nome) values ('Bookman')
insert into editora(nome) values ('Edgard Blusher')
insert into editora(nome) values ('Nova Terra')
insert into editora(nome) values ('Brasport')

select * from editora

create table categoria (
	idcategoria serial  not null,
	nome varchar(50) not null,

	constraint pk_ctg_idcategoria primary key (idcategoria),
	constraint pk_ctg_nome unique (nome)

);

insert into categoria(nome) values ('Banco de Dados');
insert into categoria(nome) values ('HTML');
insert into categoria(nome) values ('Java');
insert into categoria(nome) values ('PHP');

select * from categoria 

create table autor (
	idautor serial not null,
	nome varchar(50) not null,

	constraint pk_aut_idautor primary key (idautor),
	constraint pk_aut_nome unique (nome)

);

insert into autor(nome) values ('Waldemar Setzer');
insert into autor(nome) values ('Flavio Soares');
insert into autor(nome) values ('John Watson');
insert into autor(nome) values ('Rui Rossi dos Santos');
insert into autor(nome) values ('Antonio Pereira de Resende');
insert into autor(nome) values ('Claudiney Calixto Lima');
insert into autor(nome) values ('Evandro Carlos Teruel');
insert into autor(nome) values ('Ian Graham');
insert into autor(nome) values ('Fabricio Xavier');
insert into autor(nome) values ('Pablo Dalloglio');

select * from autor

drop table livro

create table livro (
	idlivro serial not null,
	ideditora integer not null,
	idcategoria integer not null,
	nome varchar(100) not null,

	constraint pk_lvr_idlivro primary key (idlivro),
	constraint fk_edt_ideditora foreign key (ideditora) references editora (ideditora),
	constraint fk_ctg_idcategoria foreign key (idcategoria) references  categoria (idcategoria),
	constraint pk_lvr_nome unique (nome)
);

insert into livro(ideditora,idcategoria, nome) values (4, 1, 'Banco de Dados- 1 Edição');
insert into livro(ideditora,idcategoria, nome) values (1, 1, 'Oracle Database 11G Adiministracao');
insert into livro(ideditora,idcategoria, nome) values (5, 3, 'Programacao de Computadores em Java');
insert into livro(ideditora,idcategoria, nome) values (6, 3, ' Programacao Orientada a Aspectos em Java');
insert into livro(ideditora,idcategoria, nome) values (6, 2, ' HTML5-Guia Pratico');
insert into livro(ideditora,idcategoria, nome) values (5, 2, ' XHTML: Guia de Referencia para Desenvolvimento na Web');
insert into livro(ideditora,idcategoria, nome) values (1, 4, ' PHP para Desenvolvimento Profissional');
insert into livro(ideditora,idcategoria, nome) values (4, 4, ' PHP com Programacao Orientada a Objetos');


create table livro_autor (
	idlivro integer not null,
	idautor integer not null,

	constraint pk_lva_idlivroautor primary key (idlivro, idautor),
	constraint fk_lvr_idlivro foreign key (idlivro) references livro (idlivro),
	constraint fk_aut_idautor foreign key (idautor) references autor (idautor)
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


create table aluno (
	idaluno serial not null,
	nome varchar(100) not null,

	constraint pk_aln_idaluno primary key (idaluno)
);
insert into aluno(nome) values ('Mario');
insert into aluno(nome) values ('João');
insert into aluno(nome) values ('Paulo');
insert into aluno(nome) values ('Pedro');
insert into aluno(nome) values ('Maria');

select * from aluno

create table emprestimo (
	
	idemprestimo serial not null,
	idaluno integer not null,
	data_emprestimo date not null default now(),
	data_devolucao date not null,
	valor decimal(10,2) not null,
	devolvido varchar(1) not null,

	constraint pk_emp_idemprestimo prim


create table editora (
	ideditora serial not null,
	nome varchar(50)  not null,

	constraint pk_edt_ideditora primary key (ideditora),
	constraint pk_edt_nome unique (nome)
	

);

insert into editora(nome) values ('Bookman')
insert into editora(nome) values ('Edgard Blusher')
insert into editora(nome) values ('Nova Terra')
insert into editora(nome) values ('Brasport')

select * from editora

create table categoria (
	idcategoria serial  not null,
	nome varchar(50) not null,

	constraint pk_ctg_idcategoria primary key (idcategoria),
	constraint pk_ctg_nome unique (nome)

);

insert into categoria(nome) values ('Banco de Dados');
insert into categoria(nome) values ('HTML');
insert into categoria(nome) values ('Java');
insert into categoria(nome) values ('PHP');

select * from categoria 

create table autor (
	idautor serial not null,
	nome varchar(50) not null,

	constraint pk_aut_idautor primary key (idautor),
	constraint pk_aut_nome unique (nome)

);

insert into autor(nome) values ('Waldemar Setzer');
insert into autor(nome) values ('Flavio Soares');
insert into autor(nome) values ('John Watson');
insert into autor(nome) values ('Rui Rossi dos Santos');
insert into autor(nome) values ('Antonio Pereira de Resende');
insert into autor(nome) values ('Claudiney Calixto Lima');
insert into autor(nome) values ('Evandro Carlos Teruel');
insert into autor(nome) values ('Ian Graham');
insert into autor(nome) values ('Fabricio Xavier');
insert into autor(nome) values ('Pablo Dalloglio');

select * from autor

drop table livro

create table livro (
	idlivro serial not null,
	ideditora integer not null,
	idcategoria integer not null,
	nome varchar(100) not null,

	constraint pk_lvr_idlivro primary key (idlivro),
	constraint fk_edt_ideditora foreign key (ideditora) references editora (ideditora),
	constraint fk_ctg_idcategoria foreign key (idcategoria) references  categoria (idcategoria),
	constraint pk_lvr_nome unique (nome)
);

insert into livro(ideditora,idcategoria, nome) values (4, 1, 'Banco de Dados- 1 Edição');
insert into livro(ideditora,idcategoria, nome) values (1, 1, 'Oracle Database 11G Adiministracao');
insert into livro(ideditora,idcategoria, nome) values (5, 3, 'Programacao de Computadores em Java');
insert into livro(ideditora,idcategoria, nome) values (6, 3, ' Programacao Orientada a Aspectos em Java');
insert into livro(ideditora,idcategoria, nome) values (6, 2, ' HTML5-Guia Pratico');
insert into livro(ideditora,idcategoria, nome) values (5, 2, ' XHTML: Guia de Referencia para Desenvolvimento na Web');
insert into livro(ideditora,idcategoria, nome) values (1, 4, ' PHP para Desenvolvimento Profissional');
insert into livro(ideditora,idcategoria, nome) values (4, 4, ' PHP com Programacao Orientada a Objetos');


create table livro_autor (
	idlivro integer not null,
	idautor integer not null,

	constraint pk_lva_idlivroautor primary key (idlivro, idautor),
	constraint fk_lvr_idlivro foreign key (idlivro) references livro (idlivro),
	constraint fk_aut_idautor foreign key (idautor) references autor (idautor)
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


create table aluno (
	idaluno serial not null,
	nome varchar(100) not null,

	constraint pk_aln_idaluno primary key (idaluno)
);
insert into aluno(nome) values ('Mario');
insert into aluno(nome) values ('João');
insert into aluno(nome) values ('Paulo');
insert into aluno(nome) values ('Pedro');
insert into aluno(nome) values ('Maria');

select * from aluno

create table emprestimo (
	
	idemprestimo serial not null,
	idaluno integer not null,
	data_emprestimo date not null default now(),
	data_devolucao date not null,
	valor decimal(10,2) not null,
	devolvido varchar(1) not null,

	constraint pk_emp_idemprestimo primary key (idemprestimo),
	constraint fk_aln_idaluno foreign key (idaluno) references aluno (idaluno)
	
);

insert into emprestimo(idaluno,data_emprestimo,data_devolucao, valor, devolvido) values(1,'02-05-2012', '12-05-2012', 10.00, 'S');
insert into emprestimo(idaluno,data_emprestimo,data_devolucao, valor, devolvido) values(1,'23-04-2012', '23-04-2012', 5.00, 'N');
insert into emprestimo(idaluno,data_emprestimo,data_devolucao, valor, devolvido) values(2, '10-05-2012', '20-05-2012', 12.00, 'N');
insert into emprestimo(idaluno,data_emprestimo,data_devolucao, valor, devolvido) values(3, '10-05-2012', '20-05-2012', 8.00, 'S');
insert into emprestimo(idaluno,data_emprestimo,data_devolucao, valor, devolvido) values(4, '05-05-2012', '15-05-2012', 15.00, 'N');
insert into emprestimo(idaluno,data_emprestimo,data_devolucao, valor, devolvido) values(4, '07-05-2012', '17-05-2012', 20.00, 'S');
insert into emprestimo(idaluno,data_emprestimo,data_devolucao, valor, devolvido) values(4, '08-05-2012', '18-05-2012', 5.00, 'S');

select * from emprestimo

create table emprestimo_livro (
	idemprestimo integer not null,
	idlivro integer not null,

	constraint pk_eml_idemprestimolivro primary key (idemprestimo, idlivro),
	constraint fk_emp_idemprestimo foreign key (idemprestimo) references emprestimo(idemprestimo),
	constraint fk_lvr_idlivro foreign key (idlivro) references livro(idlivro)
);
select * from emprestimo_livro
select * from aluno;
SELECT *
select * from emprestimo where idaluno = 4;
select * from livro;

insert into emprestimo_livro(idemprestimo, idlivro) values (1,1);
insert into emprestimo_livro(idemprestimo, idlivro) values (2,4);
insert into emprestimo_livro(idemprestimo, idlivro) values (2,3);
insert into emprestimo_livro(idemprestimo, idlivro) values (3,2);
insert into emprestimo_livro(idemprestimo, idlivro) values (3,7);
insert into emprestimo_livro(idemprestimo, idlivro) values (4,5);
insert into emprestimo_livro(idemprestimo, idlivro) values (5,6);
insert into emprestimo_livro(idemprestimo, idlivro) values (6,1);
insert into emprestimo_livro(idemprestimo, idlivro) values (6,6);
insert into emprestimo_livro(idemprestimo, idlivro) values (7,8);

create index idx_emp_dtemp on emprestimo (data_emprestimo);
create index idx_emp_dtdev on emprestimo (data_devolucao);

select * from editora
select * from categoria
select nome from autor order by nome asc;
select * from aluno where nome like 'P%';
select * from livro where idcategoria = 1 or idcategoria = 3;
select * from livro where ideditora = 1;
select * from emprestimo where data_emprestimo between '05-05-2012' and '10-05-2012';
select * from emprestimo where data_emprestimo not between '05-05-2012' and '10-05-2012';
select * from emprestimo where devolvido = 'S';

select * from emprestimo
select count(*) from livro;
select sum(valor) from emprestimo;
select avg(valor) from emprestimo;
select min(valor) from emprestimo;
select max(valor) from emprestimo;
select sum(valor) from emprestimo where data_emprestimo between '05-05-2012' and '10-05-2012';
select count(*) from emprestimo where data_emprestimo between '01-05-2012' and '05-05-2012';

create view view_livro as 
select 
	l.nome as livro,
	c.nome as categoria,
	e.nome as editora
	
from
	livro l
left outer join 
	editora e on e.ideditora = l.ideditora
left outer join 
	categoria c on c.idcategoria = l.idcategoria
	
create view view_lva as 
select 
	lv.nome as livro,
	aut.nome as autor
from 
	livro_autor lva
left outer join
	livro lv on lv.idlivro = lva.idlivro
left outer join 
	autor aut on aut.idautor = lva.idautor

	--
	
select 
 	lvr.nome as livro
from 
 livro_autor la
left outer join 
	autor aut on la.idautor = aut.idautor
left outer join 
	livro lvr on la.idlivro = lvr.idlivro
where la.idautor = 8
---

select 
	al.nome as aluno,
	emp.data_emprestimo,
	emp.data_devolucao
from 
	emprestimo emp
left outer join 
	aluno al on al.idaluno = emp.idaluno
--

select
	lvr.nome as livro
from
	emprestimo_livro el

left outer join 
	livro lvr on lvr.idlivro = el.idlivro
	

select * from editora
--
select 
	ed.nome as editora,
	count(lvr.idlivro) as quantidade
	
from 
	livro lvr
left outer join 
	editora ed on ed.ideditora = lvr.idlivro
group by 
	ed.nome
---
select 
	ctg.nome as categoria,
	sum(lvr.idlivro) as quantidade
from 
	livro lvr
left outer join 
	categoria ctg on ctg.idcategoria = lvr.idlivro
group by 
	ctg.nome
---
select * from livro
select * from categoria
select * from livro_autor

select 
 	aut.nome as autor ,
	count(lvr.idlivro) as quantidade
	 
from 
 livro_autor la
left outer join 
	autor aut on aut.idautor = la.idautor
left outer join 
	livro lvr on lvr.idlivro = la.idlivro
group by 
	aut.nome
---

select * from aluno
select * from emprestimo
select 
	al.nome as aluno,
	count(eml.idemprestimo)
from 
	emprestimo_livro eml
left outer join 
	aluno al on al.idaluno = eml.idemprestimo
group by
	al.nome
---
select 
	al.nome as aluno,
	sum(emp.valor) as total
from 
 emprestimo emp
left outer join 
	aluno al on al.idaluno = emp.idaluno
group by 
	al.nome
---
select 
	aln.nome as aluno,
	sum(emp.valor ) 
from 
 	emprestimo emp 

left outer join 
 aluno aln on aln.idaluno = emp.idaluno
where(select sum(valor) from emprestimo) > 7

group by 
	aln.nome
---
select * from emprestimo

select lower(nome) from aluno order by nome desc 
select * from emprestimo
where 

	extract(month from data_emprestimo) = 04 and
	extract( year from data_emprestimo) = 2012
	
---	
select * from 
select 
	
	idemprestimo,
	idaluno,
	data_emprestimo,
	data_devolucao,
	valor,
	case devolvido
	when 'S' then 'Devolucao Completa' 
	when 'N' then 'Em Atraso'
	end as devolvido
from 
	emprestimo
---

select nome, substring(nome from 5 for 10) from autor
---
select 
	valor,
	case extract(month from data_emprestimo)
	when '05' then 'Maio'
	when '04' then 'abril'
	end as mes
from emprestimo

---
select 
	data_emprestimo,
	valor
from 
	emprestimo
where 
	valor > (select avg(valor) from emprestimo)
---
select
	emp.data_emprestimo,
	emp.valor
from 
	emprestimo as emp 
where
	(select count(idlivro) from emprestimo_livro el where emp.idemprestimo = el.idemprestimo) > 1
---
select * from emprestimo_livro

select 
	data_emprestimo,
	valor
from 
	emprestimo
where valor < (select sum(valor) from emprestimo)
	


	
	
	



























































