drop user 'libro'@'localhost';
create user 'libro'@'localhost' identified by 'libro1iglesias';
grant all privileges on librosdb.* to 'libro'@'localhost';
grant all privileges on realmdb.* to 'libro'@'localhost';
flush privileges;