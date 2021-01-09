create database registro_capacitacion;
use registro_capacitacion;

create table capacitacion(
id_capacitacion INT auto_increment,
fecha date,
constraint pk_capacitacion primary key (id_capacitacion)
);

create table tematica(
id_tematica INT auto_increment,
nombre varchar(50),
descripcion varchar(100),
constraint pk_tematica primary key (id_tematica)
);

create table expositor(
id_expositor INT auto_increment,
run varchar(50),
nombre varchar(50),
apellido varchar(50),
constraint pk_expositor primary key (id_expositor)
);

create table grupo(
id_grupo INT auto_increment,
nombre varchar(50),
descripcion varchar(50),
constraint pk_grupo primary key (id_grupo)
);

create table lugar(
id_lugar INT auto_increment,
nombre varchar(50),
direccion varchar(50),
constraint pk_lugar primary key (id_lugar)
);

create table asistente(
id_asistente INT auto_increment,
run varchar(50),
nombre varchar(50),
apellido varchar(50),
cargo varchar(50),
constraint pk_asistente primary key (id_asistente)
);

create table capacitacion_tematica(
id_tematica INT,
id_capacitacion INT,
constraint pk_capacitacion_tematica primary key (id_tematica, id_capacitacion),
constraint fk_tematica foreign key (id_tematica) references tematica(id_tematica),
constraint fk_capacitacion_tematica foreign key (id_capacitacion) references capacitacion(id_capacitacion)
);

create table capacitacion_expositor(
id_expositor INT,
id_capacitacion INT,
constraint pk_capacitacion_expositor primary key (id_expositor, id_capacitacion),
constraint fk_expositor foreign key (id_expositor) references expositor(id_expositor),
constraint fk_capacitacion_expositor foreign key (id_capacitacion) references capacitacion(id_capacitacion)
);

create table capacitacion_grupo(
id_grupo INT,
id_capacitacion INT,
constraint pk_capacitacion_grupo primary key (id_grupo, id_capacitacion),
constraint fk_grupo foreign key (id_grupo) references grupo(id_grupo),
constraint fk_capacitacion_grupo foreign key (id_capacitacion) references capacitacion(id_capacitacion)
);
create table capacitacion_lugar(
id_lugar INT,
id_capacitacion INT,
constraint pk_capacitacion_lugar primary key (id_lugar, id_capacitacion),
constraint fk_lugar foreign key (id_lugar) references lugar(id_lugar),
constraint fk_capacitacion_lugar foreign key (id_capacitacion) references capacitacion(id_capacitacion)
);
create table capacitacion_asistente(
id_asistente INT,
id_capacitacion INT,
constraint pk_capacitacion_asistente primary key (id_asistente, id_capacitacion),
constraint fk_asistente foreign key (id_asistente) references asistente(id_asistente),
constraint fk_capacitacion_asistente foreign key (id_capacitacion) references capacitacion(id_capacitacion)
);

INSERT INTO `registro_capacitacion`.`asistente` (`run`, `nombre`, `apellido`, `cargo`) VALUES ('18115480-2', 'Ricardo', 'Abarza', 'Programador');
INSERT INTO `registro_capacitacion`.`asistente` (`run`, `nombre`, `apellido`, `cargo`) VALUES ('7259753-2', 'Claudia', 'Villalobos', 'Administrativo');

