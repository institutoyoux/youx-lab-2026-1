alter table cliente drop nacionalidade;
alter table cliente add idnacionalidade int;
alter table cliente add constraint fk_cln_idnacionalidade foreign key (idnacionalidade) references nacionalidade (id);
select * from cliente;

update cliente set idnacionalidade = 1 where idcliente in (1,2,3,4,6,10,11,14);
update cliente set idnacionalidade = 2 where idcliente in (5,7);
update cliente set idnacionalidade = 3 where idcliente = 8;
update cliente set idnacionalidade = 4 where idcliente in (9,13);



alter table cliente drop complemento;
alter table cliente add idcomplemento int;
alter table cliente add constraint fk_cln_idcomplemento foreign key (idcomplemento) references complemento (id);
update cliente set idcomplemento = 1 where idcliente in (1,4,9,13);
update cliente set idcomplemento = 2 where idcliente in (2,3,7);

alter table cliente drop bairro
alter table cliente add idbairro int
alter table cliente add constraint fk_cln_bairro foreign key (idbairro) references bairro (id)

update cliente set idbairro = 1 where idcliente in (1,12,13);
update cliente set idbairro = 2 where idcliente in (2,3,6,8,9);
update cliente set idbairro = 3 where idcliente in (4,5);
update cliente set idbairro = 4 where idcliente in (7);
select * from bairro