/* creación de bdd*/
create database users_db
/* uso de la bdd */
Use users_db

/* Creacion de tabla usuarios*/
create table users(
id_user int primary key identity(1,1),
username varchar(100),
email varchar(100),
passwd varchar(100),
user_category int
)

/* insertar admon en tabla usuarios */
/* password en sha256: sistemas2021 */
insert into users(username,email,passwd,user_category)
values ('Adonis Cortez','adoniscortez98@hotmail.com',
      '42A8871A3ACE4D2419DC47FDAE46C93475EB3C25962281A91B63D2C3D074D41','1');
         
