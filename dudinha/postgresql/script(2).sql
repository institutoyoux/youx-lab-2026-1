create table cliente (
		idCliente integer not null,
		Nome varchar(50) not null,
		CPF char(11),
		RG varchar(15),
		Data_Nascimento date,
		Genero char(1),
		Profissao varchar(30),
		Nacionalidade varchar(30),
 		Logradouro varchar(30),
		Numero_residencia varchar(18),
		Complemento varchar(30),
		Bairro varchar(30),
		Municipio varchar(30),
		UF varchar(30),
		Obsevacoes text,

		constraint pk_cln_idcliente primary key (idcliente)
)