create table editora (
	ideditora serial not null,
	nome varchar(50) not null,

	constraint pk_edt_ideditora primary key (ideditora),
	constraint un_edt_nome unique (nome)
);

insert into editora (nome) values ('Bookman');
insert into editora (nome) values ('Edgard Blusher');
insert into editora (nome) values ('Nova Terra');
insert into editora (nome) values ('Brasport');

select * from editora;

create table categoria (
	idcategoria serial not null,
	nome varchar(50) not null,

	constraint pk_ctg_idcategoria primary key (idcategoria),
	constraint un_ctg_nome unique (nome)
);

insert into categoria (nome) values ('Banco de Dados');
insert into categoria (nome) values ('HTML');
insert into categoria (nome) values ('Java');
insert into categoria (nome) values ('PHP');

select * from categoria;

create table autor (
	idautor serial not null,
	nome varchar(50) not null,

	constraint pk_atr_idautor primary key (idautor),
	constraint un_atr_nome unique (nome)
);

insert into autor (nome) values ('Waldemar Setzer');
insert into autor (nome) values ('Flávio Soares');
insert into autor (nome) values ('John Watson');
insert into autor (nome) values ('Rui Rossi dos Santos');
insert into autor (nome) values ('Antonio Pereira de Resende');
insert into autor (nome) values ('Claudiney Calixto Lima');
insert into autor (nome) values ('Evandro Carlos Teruel');
insert into autor (nome) values ('Ian Graham');
insert into autor (nome) values ('Fabrício Xavier');
insert into autor (nome) values ('Pablo Dalloglio');

select * from autor;

create table livro (
	idlivro serial not null,
	ideditora integer not null,
	idcategoria integer not null,
	nome varchar(100) not null,

	constraint pk_lvr_idlivro primary key (idlivro),
	constraint un_lvr_nome unique (nome)
);

alter table livro add constraint fk_lvr_ideditora foreign key (ideditora) references editora (ideditora);
alter table livro add constraint fk_lvr_idcategoria foreign key (idcategoria) references categoria (idcategoria);


select * from editora;
select * from categoria;

insert into livro (ideditora, idcategoria, nome) values (2, 1, 'Banco de Dasos - 1 Edição');
insert into livro (ideditora, idcategoria, nome) values (1, 1, 'Oracle DataBase 11G Administração');
insert into livro (ideditora, idcategoria, nome) values (3, 3, 'Programação de Computadores em Java');
insert into livro (ideditora, idcategoria, nome) values (4, 3, 'Programação Orientada a Aspectos em Java');
insert into livro (ideditora, idcategoria, nome) values (4, 2, 'HTML5 - Guia Pratico');
insert into livro (ideditora, idcategoria, nome) values (3, 2, 'XHTML: Guia de Referência para Desenvolvimento na Web');
insert into livro (ideditora, idcategoria, nome) values (1, 4, 'PHP para Desenvolvimento Profissional');
insert into livro (ideditora, idcategoria, nome) values (2, 4, 'PHP com Programação Orientada a Objetos');

select * from livro;

create table livro_autor (
	idlivro integer not null,
	idautor integer not null
);

alter table livro_autor add constraint fk_lva_idlivro foreign key (idlivro) references livro (idlivro);
alter table livro_autor add constraint fk_lva_idautor foreign key (idautor) references autor (idautor);

select * from livro;
select * from autor;

insert into livro_autor (idlivro, idautor) values (1, 1);
insert into livro_autor (idlivro, idautor) values (1, 2);
insert into livro_autor (idlivro, idautor) values (2, 3);
insert into livro_autor (idlivro, idautor) values (3, 4);
insert into livro_autor (idlivro, idautor) values (4, 5);
insert into livro_autor (idlivro, idautor) values (4, 6);
insert into livro_autor (idlivro, idautor) values (5, 7);
insert into livro_autor (idlivro, idautor) values (6, 8);
insert into livro_autor (idlivro, idautor) values (7, 9);
insert into livro_autor (idlivro, idautor) values (8, 10);

select * from livro_autor;

create table aluno (
	idaluno serial not null,
	nome varchar(70) not null,

	constraint pk_aln_idaluno primary key (idaluno)
);

insert into aluno (nome) values ('Mario');
insert into aluno (nome) values ('João');
insert into aluno (nome) values ('Paulo');
insert into aluno (nome) values ('Pedro');
insert into aluno (nome) values ('Maria');

select * from aluno;

create table emprestimo (
	idemprestimo serial not null,
	idaluno integer not null,
	data_emprestimo date not null,
	data_devolucao date not null,
	valor float not null,
	devolvido varchar(1) not null,

	constraint pk_emp_idemprestimo primary key (idemprestimo)
);

alter table emprestimo alter column data_emprestimo set default current_date;
alter table emprestimo alter column devolvido set default 'N';

insert into emprestimo (idaluno, data_emprestimo, data_devolucao, valor, devolvido) values (1, '2012-05-02', '2012-05-12', 10, 'S');
insert into emprestimo (idaluno, data_emprestimo, data_devolucao, valor, devolvido) values (1, '2012-04-23', '2012-05-03', 5, 'N');
insert into emprestimo (idaluno, data_emprestimo, data_devolucao, valor, devolvido) values (2, '2012-05-10', '2012-05-20', 12, 'N');
insert into emprestimo (idaluno, data_emprestimo, data_devolucao, valor, devolvido) values (3, '2012-05-10', '2012-05-20', 8, 'S');
insert into emprestimo (idaluno, data_emprestimo, data_devolucao, valor, devolvido) values (4, '2012-05-05', '2012-05-15', 15, 'N');
insert into emprestimo (idaluno, data_emprestimo, data_devolucao, valor, devolvido) values (4, '2012-05-07', '2012-05-17', 20, 'S');
insert into emprestimo (idaluno, data_emprestimo, data_devolucao, valor, devolvido) values (4, '2012-05-08', '2012-05-18', 5, 'S');

select * from emprestimo;

create table emprestimo_livro (
	idemprestimo integer not null,
	idlivro integer not null,

	constraint pk_emlv_idemprestimodolivro primary key (idemprestimo, idlivro)
);

alter table emprestimo_livro add constraint fk_emlv_idemprestimo foreign key (idemorestimo) references emprestimo (idemprestimo);
alter table emprestimo_livro add constraint fk_emlv_idlivro foreign key (idlivro) references livro (idlivro);

select * from emprestimo;
select * from aluno;
select * from livro;

insert into emprestimo_livro (idemprestimo, idlivro) values (1, 1);
insert into emprestimo_livro (idemprestimo, idlivro) values (1, 4);
insert into emprestimo_livro (idemprestimo, idlivro) values (1, 3);
insert into emprestimo_livro (idemprestimo, idlivro) values (2, 2);
insert into emprestimo_livro (idemprestimo, idlivro) values (2, 7);
insert into emprestimo_livro (idemprestimo, idlivro) values (3, 5);
insert into emprestimo_livro (idemprestimo, idlivro) values (4, 4);
insert into emprestimo_livro (idemprestimo, idlivro) values (4, 6);
insert into emprestimo_livro (idemprestimo, idlivro) values (4, 1);
insert into emprestimo_livro (idemprestimo, idlivro) values (4, 8);

select * from emprestimo_livro;

create index idx_emp_emprestimo on emprestimo (data_emprestimo);
create index idx_emp_devolucao on emprestimo (data_devolucao);

select nome from autor order by nome;

select nome from aluno where nome like 'P%';

select * from categoria;
select nome from livro where idcategoria = 1 or idcategoria = 3;

select * from emprestimo where data_emprestimo between '2012-05-05' and '2012-05-10';

select * from emprestimo where data_emprestimo not between '2012-05-05' and '2012-05-10';

select * from emprestimo;
select * from emprestimo where devolvido = 'S';

select count(idlivro) from livro;

select sum(valor) from emprestimo;

select avg(valor) from emprestimo;

select max(valor) from emprestimo;

select min(valor) from emprestimo;

select sum(valor) from emprestimo where data_emprestimo between '2012-05-05' and '2012-05-10';

select count(idemprestimo) from emprestimo where data_emprestimo between '2012-05-01' and '2012-05-05';

create view livro_editora as
select
	lvr.nome as livro,
	ctg.nome as categoria,
	edt.nome as editora
from
	livro lvr
left outer join
	categoria ctg on lvr.idcategoria = ctg.idcategoria
left outer join
	editora edt on lvr.ideditora = edt.ideditora;

select * from livro_editora;

create view livro_autores as
select
	lvr.nome as livro,
	atr.nome as autor
from
	livro_autor lvat
left outer join
	livro lvr on lvat.idlivro = lvr.idlivro
left outer join
	autor atr on lvat.idautor = atr.idautor;

select * from livro_autores;

select * from livro_autor;
select * from autor;

select
	lvr.nome as livro,
	atr.nome as autor
from
	livro_autor lvat
left outer join
	livro lvr on lvr.idlivro = lvat.idlivro
left outer join
	autor atr on atr.idautor = lvat.idautor
where
	atr.idautor = 8;

select
	aln.nome as aluno,
	emp.data_emprestimo as emprestimo,
	emp.data_devolucao as devolucao
from
	emprestimo emp
left outer join
	aluno aln on aln.idaluno = emp.idaluno;

select
	lvr.nome as livro
from
	emprestimo_livro emlv
left outer join
	livro lvr on lvr.idlivro = emlv.idlivro;

select
	edt.nome as editora,
	count(idlivro)
from
	livro lvr
left outer join
	editora edt on edt.ideditora = lvr.ideditora
group by
	edt.nome;

select
	ctg.nome as categoria,
	count(idlivro)
from
	livro lvr
left outer join
	categoria ctg on ctg.idcategoria = lvr.idcategoria
group by
	ctg.nome;

select
	atr.nome as autor,
	count(idlivro)
from
	livro_autor lvat
left outer join
	autor atr on atr.idautor = lvat.idautor
group by
	atr.nome;

select
	aln.nome as aluno,
	count(idlivro)
from
	emprestimo_livro emlv
left outer join
	aluno aln on aln.idaluno = emlv.idemprestimo
group by
	aln.nome;

select
	aln.nome as aluno,
	sum(valor) as total
from
	emprestimo emp
left outer join
	aluno aln on aln.idaluno = emp.idaluno
group by
	aln.nome;

select
	aln.nome as aluno,
	count(idlivro)
from
	emprestimo_livro emlv
left outer join
	aluno aln on aln.idaluno = emlv.idemprestimo
group by
	aln.nome;

select
	aln.nome as aluno,
	sum(valor) as total
from
	emprestimo emp
left outer join
	aluno aln on aln.idaluno = emp.idaluno
where
	(select sum(valor) from emprestimo) > 7
group by
	aln.nome;

select upper(nome) from aluno order by nome DESC;

select * from emprestimo where extract(month from data_emprestimo) = 4 and extract(year from data_emprestimo) = 2012;

select *, case emp.devolvido when 'S' then 'Devolução completa' when 'N' then 'Em atraso' end from emprestimo emp;

select valor, case extract(month from data_emprestimo) when 1 then 'Janeiro' when 2 then 'Fevereiro' when 3 then 'Março' when 4 then 'Abril' when 5 then 'Maio' when 6 then 'Junho' when 7 then 'Julho' when 8 then 'Agosto' when 9 then 'Setembro' when 10 then 'Outubro' when 11 then 'Novembro' when 12 then 'Dezembro' end from emprestimo;

select data_emprestimo, valor from emprestimo where valor > (select avg(valor) from emprestimo);


select
	emp.data_emprestimo,
	emp.valor	
from
	emprestimo emp
where
	(select count(elv.idemprestimo)	from emprestimo_livro elv where elv.idemprestimo = emp.idemprestimo) > 1;

select data_emprestimo, valor from emprestimo where valor < (select avg(valor) from emprestimo);