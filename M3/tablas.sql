
create table usuarios (
id int not null primary key,
usuario varchar(255) not null unique,
contrasena varchar(255)
);

create table contacto(
id_contacto int not null primary key,
nombre varchar(255) not null,
email varchar(255) not null,
fono varchar(255) not null,
asunto varchar(50) not null,
comentario varchar(255) not null
);

create table creacapacitacion(
id_capa int not null primary key,
nombreapellido varchar(255) not null,
lugar varchar(255) not null,
email varchar(255) not null,
duracion varchar(255) not null,
comentario varchar(255) not null
);

create table registrarusuario(
id_reg int not null primary key,
nombres varchar(50) not null,
apellidos varchar(50) not null,
fecha_nac varchar(255) not null,
tipo_usuario varchar(255) not null
run varchar(10),
email varchar(20),
area varchar(20),
fono varchar(10),
titulo varchar(40),
proyecto varchar(40),
afp varchar(20),
sissalud varchar(20),
direccion varchar(30),
comuna varchar(20),
edad int(2)
);


Evaluacion_4_Java_jsp_servlet