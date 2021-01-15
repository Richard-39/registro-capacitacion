create database registro_capacitacion;
use registro_capacitacion;

create table capacitacion(
id_capacitacion INT auto_increment,
nombre varchar(200),
fecha date,
hora varchar(5),
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
INSERT INTO `registro_capacitacion`.`asistente` (`run`, `nombre`, `apellido`, `cargo`) VALUES ('98765432-1', 'Fulanito', 'Perez', 'Operario');
INSERT INTO `registro_capacitacion`.`asistente` (`run`, `nombre`, `apellido`, `cargo`) VALUES ('11243465-7', 'Maria de las mercedes', 'Castro', 'Operario');
INSERT INTO `registro_capacitacion`.`asistente` (`run`, `nombre`, `apellido`, `cargo`) VALUES ('22333444-5', 'Felipe', 'Choncha', 'Operario');
INSERT INTO `registro_capacitacion`.`asistente` (`run`, `nombre`, `apellido`, `cargo`) VALUES ('33444555-6', 'Golondrina', 'Feliz', 'Operario');

INSERT INTO `registro_capacitacion`.`tematica` (`nombre`, `descripcion`) VALUES ('Manejo de residuos', 'Cómo manejar los desechos para ser sustentables');
INSERT INTO `registro_capacitacion`.`tematica` (`nombre`, `descripcion`) VALUES ('Biodiversidad', 'Las diferentes vidas que existen en el ecosistema');
INSERT INTO `registro_capacitacion`.`tematica` (`nombre`, `descripcion`) VALUES ('Planes de acción', 'Actividades a realizar en el momento indicado');
INSERT INTO `registro_capacitacion`.`tematica` (`nombre`, `descripcion`) VALUES ('Monitoreo del agua', 'Formas de medir el rendimiento del uso del agua');

INSERT INTO `registro_capacitacion`.`lugar` (`nombre`, `direccion`) VALUES ('Cultivo norte', 'Subiendo por el pasillo a la derecha');
INSERT INTO `registro_capacitacion`.`lugar` (`nombre`, `direccion`) VALUES ('Cultivo sur', 'Bajando la escalera, primera puerta a la izquierda');
INSERT INTO `registro_capacitacion`.`lugar` (`nombre`, `direccion`) VALUES ('Cultivo este', 'Entrando por la manpara, ascensor al subterraneo');
INSERT INTO `registro_capacitacion`.`lugar` (`nombre`, `direccion`) VALUES ('Cultivo oeste', 'Desde la terraza hacia la zona de residuos');
INSERT INTO `registro_capacitacion`.`lugar` (`nombre`, `direccion`) VALUES ('Oficina', 'Tercer piso, departamento 304');

INSERT INTO `registro_capacitacion`.`grupo` (`nombre`, `descripcion`) VALUES ('Supervisores', 'Empoderados empleados');
INSERT INTO `registro_capacitacion`.`grupo` (`nombre`, `descripcion`) VALUES ('Externos', 'Gente de visita');

INSERT INTO `registro_capacitacion`.`expositor` (`run`, `nombre`, `apellido`) VALUES ('12345678-9', 'Fabian', 'Abarza');
INSERT INTO `registro_capacitacion`.`expositor` (`run`, `nombre`, `apellido`) VALUES ('23456789-0', 'Pancho', 'Correa');

INSERT INTO `registro_capacitacion`.`capacitacion` (`nombre`, `fecha`, `hora`) VALUES ('Gestion de residuos en planta', '2021-01-12', '08:45');
INSERT INTO `registro_capacitacion`.`capacitacion` (`nombre`, `fecha`, `hora`) VALUES ('Manejo de los recursos en crisis', '2021-01-13', '18:00');
INSERT INTO `registro_capacitacion`.`capacitacion` (`nombre`, `fecha`, `hora`) VALUES ('Cómo mantener a los salmones felices', '2021-01-14', '15:30');

-- capacitacion expositor --
INSERT INTO `registro_capacitacion`.`capacitacion_expositor` (`id_expositor`, `id_capacitacion`) VALUES ('1', '1');
INSERT INTO `registro_capacitacion`.`capacitacion_expositor` (`id_expositor`, `id_capacitacion`) VALUES ('1', '2');
INSERT INTO `registro_capacitacion`.`capacitacion_expositor` (`id_expositor`, `id_capacitacion`) VALUES ('2', '2');
INSERT INTO `registro_capacitacion`.`capacitacion_expositor` (`id_expositor`, `id_capacitacion`) VALUES ('2', '3');

-- capacitacion grupo --
INSERT INTO `registro_capacitacion`.`capacitacion_grupo` (`id_grupo`, `id_capacitacion`) VALUES ('1', '1');
INSERT INTO `registro_capacitacion`.`capacitacion_grupo` (`id_grupo`, `id_capacitacion`) VALUES ('1', '2');
INSERT INTO `registro_capacitacion`.`capacitacion_grupo` (`id_grupo`, `id_capacitacion`) VALUES ('2', '2');
INSERT INTO `registro_capacitacion`.`capacitacion_grupo` (`id_grupo`, `id_capacitacion`) VALUES ('2', '3');

-- capacitacion lugar --
INSERT INTO `registro_capacitacion`.`capacitacion_lugar` (`id_lugar`, `id_capacitacion`) VALUES ('2', '1');
INSERT INTO `registro_capacitacion`.`capacitacion_lugar` (`id_lugar`, `id_capacitacion`) VALUES ('3', '2');
INSERT INTO `registro_capacitacion`.`capacitacion_lugar` (`id_lugar`, `id_capacitacion`) VALUES ('1', '3');
INSERT INTO `registro_capacitacion`.`capacitacion_lugar` (`id_lugar`, `id_capacitacion`) VALUES ('4', '3');

-- capacitacion tematica --
INSERT INTO `registro_capacitacion`.`capacitacion_tematica` (`id_tematica`, `id_capacitacion`) VALUES ('1', '1');
INSERT INTO `registro_capacitacion`.`capacitacion_tematica` (`id_tematica`, `id_capacitacion`) VALUES ('2', '1');
INSERT INTO `registro_capacitacion`.`capacitacion_tematica` (`id_tematica`, `id_capacitacion`) VALUES ('3', '1');
INSERT INTO `registro_capacitacion`.`capacitacion_tematica` (`id_tematica`, `id_capacitacion`) VALUES ('4', '1');
INSERT INTO `registro_capacitacion`.`capacitacion_tematica` (`id_tematica`, `id_capacitacion`) VALUES ('2', '2');
INSERT INTO `registro_capacitacion`.`capacitacion_tematica` (`id_tematica`, `id_capacitacion`) VALUES ('3', '2');
INSERT INTO `registro_capacitacion`.`capacitacion_tematica` (`id_tematica`, `id_capacitacion`) VALUES ('4', '2');
INSERT INTO `registro_capacitacion`.`capacitacion_tematica` (`id_tematica`, `id_capacitacion`) VALUES ('3', '3');
INSERT INTO `registro_capacitacion`.`capacitacion_tematica` (`id_tematica`, `id_capacitacion`) VALUES ('4', '3');

-- capacitacion asistente --
INSERT INTO `registro_capacitacion`.`capacitacion_asistente` (`id_asistente`, `id_capacitacion`) VALUES ('2', '1');
INSERT INTO `registro_capacitacion`.`capacitacion_asistente` (`id_asistente`, `id_capacitacion`) VALUES ('3', '1');
INSERT INTO `registro_capacitacion`.`capacitacion_asistente` (`id_asistente`, `id_capacitacion`) VALUES ('4', '1');
INSERT INTO `registro_capacitacion`.`capacitacion_asistente` (`id_asistente`, `id_capacitacion`) VALUES ('5', '1');
INSERT INTO `registro_capacitacion`.`capacitacion_asistente` (`id_asistente`, `id_capacitacion`) VALUES ('1', '2');
INSERT INTO `registro_capacitacion`.`capacitacion_asistente` (`id_asistente`, `id_capacitacion`) VALUES ('3', '2');
INSERT INTO `registro_capacitacion`.`capacitacion_asistente` (`id_asistente`, `id_capacitacion`) VALUES ('4', '2');
INSERT INTO `registro_capacitacion`.`capacitacion_asistente` (`id_asistente`, `id_capacitacion`) VALUES ('4', '3');
INSERT INTO `registro_capacitacion`.`capacitacion_asistente` (`id_asistente`, `id_capacitacion`) VALUES ('5', '3');
INSERT INTO `registro_capacitacion`.`capacitacion_asistente` (`id_asistente`, `id_capacitacion`) VALUES ('6', '3');

select * from capacitacion 
join capacitacion_asistente 
on capacitacion_asistente.id_capacitacion=capacitacion.id_capacitacion
join asistente
on asistente.id_asistente = capacitacion_asistente.id_asistente
where capacitacion.id_capacitacion=1;

select capacitacion.id_capacitacion, count(asistente.nombre) from capacitacion 
join capacitacion_asistente 
on capacitacion_asistente.id_capacitacion=capacitacion.id_capacitacion
join asistente
on asistente.id_asistente = capacitacion_asistente.id_asistente
group by capacitacion.id_capacitacion;