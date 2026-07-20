
select * from usuario where id = 10;
select * from rel_disciplina_turma
select * from turma
select * from professor
select * from usuario
select * from disciplina 

(select nome from disciplina)

select usuario.nome as professor,
       disciplina.nome as disciplina 
	   from aluno 
	   inner join
	   turma on aluno.id_turma = turma.id 
	   inner join
	   rel_disciplina_turma on turma.id = rel_disciplina_turma.id_turma
       inner join
	   disciplina on  rel_disciplina_turma.id_disciplina  = disciplina.id
	   inner join
	   professor on disciplina.id_professor = professor.id
	   inner join
	   usuario on professor.id_usuario = usuario.id where aluno.id = 41