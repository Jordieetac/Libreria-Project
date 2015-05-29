source librodb-schema.sql;
insert into usuarios values('admin', MD5('admin'), 'admin');
insert into user_roles values ('admin', 'Administrador');

insert into usuarios values('test', MD5('test'), 'Test');
insert into user_roles values ('test', 'registered');

insert into usuarios values('jordi', MD5('pepe'), 'otal');
insert into user_roles values ('burdo', 'sereno');

insert into autores values('Autor0');
insert into autores values('Autor1');
insert into autores values('Autor2');
insert into autores values('Autor3');
insert into autores values('Autor4');
insert into autores values('Autor5');
insert into autores values('Autor6');


insert into libros (titulo, autor, lengua ,edicion,fechaedicion,fechaimpresion, editorial) values ('titulo0', 'autor0', 'lengua1', "10", '10-12-19' ,'10-12-01','editorial1');
insert into libros (titulo, autor, lengua ,edicion,fechaedicion,fechaimpresion, editorial) values ('titulo1', 'autor1', 'lengua1', "13", '10-12-19' ,'10-12-19','editorial2');
insert into libros (titulo, autor, lengua ,edicion,fechaedicion,fechaimpresion, editorial) values ('titulo2', 'autor2', 'lengua2', "5", '10-12-19' ,'10-12-01','editorial3');
insert into libros (titulo, autor, lengua ,edicion,fechaedicion,fechaimpresion, editorial) values ('titulo3', 'autor3', 'lengua2', "1", '10-12-19' ,'10-12-01','editorial5');
insert into libros (titulo, autor, lengua ,edicion,fechaedicion,fechaimpresion, editorial) values ('titulo4', 'autor4', 'lengua1', "1",'10-12-19' ,'10-12-01', 'editorial1');



insert into resena (idlibro, creador, datos, fecha) values ("1", 'test', 'libro1','10-12-00');
insert into resena (idlibro, creador, datos, fecha) values ("2", 'test', 'libro1','10-12-00');
