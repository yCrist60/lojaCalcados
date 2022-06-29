create database calcadosdb character set utf8 collate utf8_general_ci;
use calcadosdb;
create table cliente(
idcliente bigint auto_increment primary key,
nomecliente varchar(100) not null,
iddadospessoais bigint not null,
idendereco bigint not null,
idcontato bigint not null
)engine InnoDB character set utf8 collate utf8_general_ci;

create table funcionario(
idfuncionario bigint auto_increment primary key,
nomefuncionario varchar(100) not null,
cargo varchar(30) not null,
setor varchar(30) not null,
gestor bigint,
expediente time not null,
foto varchar(200) not null unique,
iddadospessoais bigint not null,
idendereco bigint not null,
idcontato bigint not null,
idusuario bigint not null
)engine InnoDB character set utf8 collate utf8_general_ci;

create table dadospessoais(
iddadospessoais bigint auto_increment primary key,
cpf varchar(12) not null unique,
datanascimento date not null,
sexo enum ("Masculino", "Feminino","Outros") not null
)engine InnoDB character set utf8 collate utf8_general_ci;

create table usuario(
idusuario bigint auto_increment primary key,
nomeusuario varchar(30) not null unique,
senha varchar(200) not null,
nivelacesso varchar(30) not null,
criadoem timestamp default current_timestamp()
)engine InnoDB character set utf8 collate utf8_general_ci;

create table contato(
idcontato bigint auto_increment primary key,
telefoneresidencial varchar(20),
telefonecelular varchar(20),
telefonecomercial varchar(20),
email varchar(100)
)engine InnoDB character set utf8 collate utf8_general_ci;

create table endereco(
idendereco bigint auto_increment primary key,
tipo enum("Rua","Avenida","Praça","Alameda","Viela","Estrada","Travessa") not null,
logradouro varchar(100) not null,
numero varchar(10) not null,
complemento varchar(50),
cep varchar(10) not null,
bairro varchar(30) not null,
cidade varchar(30) not null,
estado varchar(30) not null
)engine InnoDB character set utf8 collate utf8_general_ci;

create table produto(
idproduto bigint auto_increment primary key,
nomeproduto varchar(50) not null,
descricao text not null,
categoria varchar(20) not null,
marca varchar(30) not null,
cor varchar(20),
tamanho varchar(100) not null,
peso varchar(10),
genero enum("Masculino","Feminino","Unisex") not null,
preco decimal(7,2) not null
)engine InnoDB character set utf8 collate utf8_general_ci;

create table estoque(
idestoque bigint auto_increment primary key,
lote varchar(30) not null,
idproduto bigint not null,
quantidade int not null,
dataentrada timestamp default current_timestamp(),
origem enum("Fornecedor","Troca","Devolucao") not null
)engine InnoDB character set utf8 collate utf8_general_ci;

create table venda(
idvenda bigint auto_increment primary key,
idcliente bigint not null,
idfuncionario bigint not null,
datahora timestamp default current_timestamp()
)engine InnoDB character set utf8 collate utf8_general_ci;

create table detalhevenda(
iddetalhevenda bigint auto_increment primary key,
idvenda bigint not null,
idproduto bigint not null,
quantidade int not null,
observacao text,
subtotal decimal(10,2)
)engine InnoDB character set utf8 collate utf8_general_ci;

create table trocadevolucao(
idtrocadevolucao bigint auto_increment primary key,
idvenda bigint not null,
idproduto bigint not null,
motivo text not null,
datahoratrocadevolucao timestamp default current_timestamp()
)engine InnoDB character set utf8 collate utf8_general_ci;

create table pagamento(
idpagamento bigint auto_increment primary key,
idvenda bigint not null,
formapagamento varchar(30) not null,
valor decimal(10,2) not null,
parcela int not null default 1,
valorparcela decimal(10,2) not null,
observacao text
)engine InnoDB character set utf8 collate utf8_general_ci;


