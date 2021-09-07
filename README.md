# poll-user-task
rest api encuesta usuario

Script para agregar tablas a base de datos:

PostgreSQL
12.5

create user pepito with encrypted password 'pepitoPass';
create database encuesta;
grant all privileges on database encuesta to pepito;

CREATE SEQUENCE seq_tipo_musica;
CREATE SEQUENCE seq_usuario;
CREATE TABLE tipo_musica (id int4 NOT NULL, descripcion varchar(1024), PRIMARY KEY (id));
CREATE TABLE usuario (id int4 NOT NULL, mail varchar(1024), tipo_musicaid int4 NOT NULL, PRIMARY KEY (id));
ALTER TABLE usuario ADD CONSTRAINT FKusuario717501 FOREIGN KEY (tipo_musicaid) REFERENCES tipo_musica (id);


INSERT INTO tipo_musica (id, descripcion) VALUES (1, 'Rap');
INSERT INTO tipo_musica (id, descripcion) VALUES (2, 'Pop');
INSERT INTO tipo_musica (id, descripcion) VALUES (3, 'Jazz');
