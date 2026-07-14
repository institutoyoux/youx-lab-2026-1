CREATE table editora (
     ideditora serial not null,
	 nome varchar not null,

	 constraint pk_edt_ideditora primary key(ideditora),
	 constraint un_edt_nome unique(nome)
) 


insert into editora (nome) values ('Bookman') 
insert into editora (nome) values ('Edgard Blusher')
insert into editora (nome) values ('Nova Terra')
insert into editora (nome) values ('Brasport')

create table Categoria (
      idcategoria serial not null,
	  nome varchar 

	  constraint pk_ctg_idcategoria primary key (idcategoria),
	  constraint un_ctg_nome unique(nome)
)

insert into categoria (nome) values ('Banco de Dados')
insert into categoria (nome) values ('Html')
insert into categoria (nome) values ('Java')
insert into categoria (nome) values ('PHP')

create table autor (
      idautor serial not null,
	  nome varchar not null,

	  constraint pk_aut_idautor primary key (idautor)
)


insert into autor (nome) values ('Waldemar Setzer')
insert into autor (nome) values ('Flavio Soares')
insert into autor (nome) values ('John Watson')
insert into autor (nome) values ('Rui Rossi dos Santos')
insert into autor (nome) values ('Antonio de Pereira Rezende')
insert into autor (nome) values ('Claudiney Calixto Lima')
insert into autor (nome) values ('Evandro Carlos Teruel')
insert into autor (nome) values ('Ian Graham')
insert into autor (nome) values ('Fabricio Xavier')
insert into autor (nome) values ('Pabro Dalloglio')
select * from autor 

create table Livro (
       idlivro serial not null,
	   ideditora integer not null,
	   idcategoria integer not null,
	   nome varchar not null,

	   constraint pk_lvr_idlivro primary key (idlivro),
	   constraint fk_lvr_ideditora foreign key (ideditora) references editora(ideditora),
	   constraint fk_lvr_idcategoria foreign key (idcategoria) references categoria (idcategoria)
)

select * from categoria
select * from editora
insert into Livro(ideditora,nome,idcategoria) values ('2','Banco de Dados -1 Edicao','1')

insert into Livro(ideditora,nome,idcategoria) values ('1','Oracle DataBase 11G Admnistracao','1')

insert into Livro(ideditora,nome,idcategoria) values ('3','Progrmacao de computadores em Java','3')

insert into Livro(ideditora,nome,idcategoria) values ('4','Programacao Orientada e Aspectos em Java','3')

insert into Livro(ideditora,nome,idcategoria) values ('4','HTML5-GUIA PRATICO','2')

insert into Livro(ideditora,nome,idcategoria) values ('3','XHTML-Guia de referencias para desenvolvimento na web','2')

insert into Livro(ideditora,nome,idcategoria) values ('1','PHP para desenvolvimento pessoal','4')

insert into Livro(ideditora,nome,idcategoria) values ('1','PHP com Programacao Orientada a objetos','4')


create table Livro_Autor (
       idlivro integer not null,
	   idautor integer not null,

       constraint fk_lva_idlivro foreign key (idlivro) references livro(idlivro),
	   constraint fk_lva_idautor foreign key (idautor) references autor(idautor),
	   constraint pk_lva_idlivroautor primary key (idlivro,idautor)
)

select * from autor
select * from livro
insert into Livro_Autor (idlivro,idautor) values ('1','1' )
insert into Livro_Autor (idlivro,idautor) values ('1','2' )
insert into Livro_Autor (idlivro,idautor) values ('2','2')
insert into Livro_Autor (idlivro,idautor) values ('3','4' )
insert into Livro_Autor (idlivro,idautor) values ('4','5' )
insert into Livro_Autor (idlivro,idautor) values ('4','6' )
insert into Livro_Autor (idlivro,idautor) values ('5','7' )
insert into Livro_Autor (idlivro,idautor) values ('6','8' )
insert into Livro_Autor (idlivro,idautor) values ('7','9' )
insert into Livro_Autor (idlivro,idautor) values ('8','10')

create table aluno (
       idaluno serial not null,
	   nome varchar not null,

	   constraint pk_aln_idaluno primary key (idaluno)
)

insert into aluno(nome) values ('Mario')
insert into aluno(nome) values ('Joao')
insert into aluno(nome) values ('Paulo')
insert into aluno(idaluno,nome) values ('4','Pedro')
insert into aluno(idaluno,nome) values ('5','Maria')
select * from aluno

create table emprestimo (
        idemprestimo serial not null,
		idaluno serial not null,
		data_emprestimo date not null,
		data_devolucao date not null,
		valor decimal not null,
		devolvido varchar(1),

		constraint pk_emp_idemprestimo primary key (idemprestimo),
		constraint fk_emp_idaluno foreign key (idaluno) references aluno(idaluno)
) 

alter table emprestimo alter column data_emprestimo set default current_date

insert into emprestimo (idaluno,data_emprestimo,data_devolucao,valor,devolvido) values ('1','02-05-2012','12-05-2012','10','S')
insert into emprestimo (idaluno,data_emprestimo,data_devolucao,valor,devolvido) values ('1','23-04-2012','03-05-2012','5','N')
insert into emprestimo (idaluno,data_emprestimo,data_devolucao,valor,devolvido) values ('2','10-05-2012','20-05-2012','12','N')
insert into emprestimo (idaluno,data_emprestimo,data_devolucao,valor,devolvido) values ('3','10-05-2012','20-05-2012','8','S')
insert into emprestimo (idaluno,data_emprestimo,data_devolucao,valor,devolvido) values ('4','05-05-2012','15-05-2012','15','N')
insert into emprestimo (idaluno,data_emprestimo,data_devolucao,valor,devolvido) values ('4','06-05-2012','17-05-2012','20','S')
insert into emprestimo (idaluno,data_emprestimo,data_devolucao,valor,devolvido) values ('4','07-05-2012','18-05-2012','5','S')

select * from emprestimo

create table emprestimo_livro (
            idemprestimo integer not null,
			idlivro integer not null,

			constraint fk_eml_idemprestimo foreign key (idemprestimo) references emprestimo(idemprestimo),
			constraint fk_eml_idlivro foreign key (idlivro) references livro(idlivro),
			constraint pk_eml_idemprestimolivro primary key (idemprestimo,idlivro)
)

select * from categoria;
select * from aluno;
select * from livro;
select * from editora;
insert into emprestimo_livro(idemprestimo,idlivro) values ('1','1')
insert into emprestimo_livro(idemprestimo,idlivro) values ('2','3')
insert into emprestimo_livro(idemprestimo,idlivro) values ('3','2')
insert into emprestimo_livro(idemprestimo,idlivro) values ('3','7')
insert into emprestimo_livro(idemprestimo,idlivro) values ('4','5')
insert into emprestimo_livro(idemprestimo,idlivro) values ('5','4')
insert into emprestimo_livro(idemprestimo,idlivro) values ('6','6')
insert into emprestimo_livro(idemprestimo,idlivro) values ('6','1')
insert into emprestimo_livro(idemprestimo,idlivro) values ('7','8');

select * from emprestimo_livro;


create index idx_emp_emprestimo on emprestimo(idemprestimo);
create index idx_emp_devolucao on emprestimo (devolvido);

select * from autor order by nome asc;
select * from aluno where nome like 'P%';
select nome from livro where idcategoria = '1' or  idcategoria = '3';
select nome from livro where ideditora = '1';
select * from emprestimo where data_emprestimo between '2012-05-05' and '2012-05-10';
select * from emprestimo where data_emprestimo not between '2012-05-05' and '2012-05-10';
select * from emprestimo where devolvido = 'S';

select count(idlivro) from livro group by idlivro;
select sum(valor) from emprestimo;
select avg(valor) from emprestimo;
select max(valor) from emprestimo;
select min(valor) from emprestimo;
select sum(valor) from emprestimo where data_emprestimo between '05-05-2012' and '10-05-2012';
select count(idemprestimo) from emprestimo where data_emprestimo between '01-05-2012' and '05-05-2012';

----------------------------------------
create view livro_dados
as select lv.nome as livro,
          edt.nome as editora,
		  ctg.nome as categoria 
		  from livro lv 
		  left outer join 
		  editora edt on lv.ideditora = edt.ideditora
		  left outer join
		  categoria ctg on lv.idcategoria = ctg.idcategoria;
------------------------------------------
select * from livro_dados;

------------------------------------------
create view livro_autor_dados
as select lv.nome as livro,
          au.nome as autor
		  from livro_autor lva
		  left outer join
		  livro lv on lva.idlivro = lv.idlivro
		  left outer join
		  autor au on lva.idautor = au.idautor;
-------------------------------------------
select * from livro_autor_dados;

select livro,autor from livro_autor_dados where autor = 'Ian Graham';

--___________________________________________
create view emprestimo_dados as select 
      aln.nome as aluno,
	  emp.data_emprestimo,
	  emp.data_devolucao,
	  emp.valor

	  from emprestimo emp

	  left outer join
	  aluno aln on emp.idaluno = aln.idaluno ;
--_____________________________________________
select * from emprestimo_dados;

select * from emprestimo_livro;
_____________________________________________
create view emprestimo_livro_nome as select 
       lv.nome as livro
	   from emprestimo_livro
	   left outer join
	   livro lv on emprestimo_livro.idlivro = lv.idlivro;
--______________________________________________
select * from emprestimo_livro_nome;
--______________________________________________
select editora,count(livro) from livro_dados group by editora;

select categoria,count(livro) from livro_dados group by categoria;

select autor,count(livro) from livro_autor_dados group by autor;

select aluno,count(data_emprestimo) from emprestimo_dados group by aluno;

select aluno,sum(valor) from emprestimo_dados group by aluno;

select aluno,sum(valor) from emprestimo_dados group by aluno  having sum(valor) > '7' ; 

select upper(aluno) from emprestimo_dados order by aluno desc;

select idemprestimo,data_emprestimo from emprestimo where extract (month from data_emprestimo) = '4';

select * ,
       case devolvido 
	   when 'S' then 'Devolucao Completa'
	   else 'Em atraso'
end 
from emprestimo;

select nome,substring(nome from 5 for 10) from autor;

----------------------- INTERDITADO ----------------------
select valor,case extract(month from data_emprestimo)
             when 1 then 'Janeiro'
			 when 2 then 'Fevereiro'
			 when 3 then 'Marco'
			 when 4 then 'Abril'
			 when 5 then 'Maio'
			 when 6 then 'Junho'
			 when 7 then 'Julho'
			 when 8 then 'Agosto'
			 when 9 then 'Setembro'
			 when 10  then 'Outubro'
			 when 11 then 'Novembro'
			 when 12 then 'Dezembro'
			end from emprestimo;      

select data_emprestimo,valor from emprestimo where valor > (select avg(valor) from emprestimo);

select data_emprestimo,valor from emprestimo where (select count(idlivro) from emprestimo_livro) > 1;

select data_emprestimo,valor from emprestimo where valor < (select sum(valor) from emprestimo);