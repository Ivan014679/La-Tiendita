--creacion base de datos iucesmag

--tablas 
--tabla usuarios
create table usuarios
(
cedulausu char(10),
nomusu varchar(30),
telusu varchar(12),
contraseñausu char(5)
);

--tabla proveedores
create table proveedores
(
codprov char(10),
nomprov varchar(30),
marcaprov varchar(30),
telprov varchar(12)
);


--tabla productos
create table productos
(
codpro char(14),
nompro varchar(30),
codprov char(10),
cedulausu char(10),
cantpro int,
valorpro int,
stockmax int,
stockmin int
);


--tabla ventas
create table ventas
(
codven char(5),
codpro char(5),
totpag int
);

--llaves primarias
alter table usuarios add constraint pk_codusu primary key (cedulausu);
alter table proveedores add constraint pk_codprov primary key (codprov);
alter table productos add constraint pk_codpro primary key (codpro);
alter table ventas add constraint pk_codvenpro primary key (codven,codpro);

--llaves foráneas 
alter table ventas add foreign key (codven) references productos (codpro);
alter table productos add foreign key (codprov) references proveedores(codprov);
alter table productos add foreign key (cedulausu) references usuarios(cedulausu);
-- Restricciones a nivel de atributo
alter table ventas alter column codven set not null;
alter table productos alter column codprov set not null;
alter table productos alter column cedulausu set not null;
--Valores por defecto
--tabla usuarios
alter table usuarios alter column telusu set default 0;
--tabla productos
alter table productos alter column valorpro set default 0;
alter table productos alter column cantpro set default 0;
alter table productos alter column stockmax set default 0;
alter table productos alter column stockmin set default 0;
--tabla ventas
alter table ventas alter column totpag set default 0;
--Creaciones por defecto
alter table productos add check(cantpro>=0);
alter table productos add check(valorpro>=0);
alter table productos add check(stockmax>=0);
alter table productos add check(stockmin>=0);
alter table ventas add check(totpag>=0);

--INSERT INTO proveedores (codprov,nomprov,marcaprov,telprov) VALUES ('" +nombre+"','"+ marca +"','" + telefono+"','"+codigo+"');

--insert into productos(codpro,nompro,codprov,cedulausu,cantpro,valorpro,stockmax,stockmin) values('12345','az','111','10654897',25,150,40,20);