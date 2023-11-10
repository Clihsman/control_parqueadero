CREATE DATABASE control_parquadero;
USE control_parquadero;

CREATE TABLE IF NOT EXISTS clientes (
  id int(11) NOT NULL AUTO_INCREMENT,
  codigo int(11),
  nombres varchar(50),
  apellidos varchar(50),
  documento bigint(20),
  correo varchar(70),
  telefono varchar(20),
  PRIMARY KEY (id)
);

DELIMITER //
CREATE PROCEDURE actualizar_cliente(IN in_id INT, IN in_nombres VARCHAR(50), IN in_apellidos VARCHAR(50),
	IN in_documento BIGINT,	IN in_correo VARCHAR(70),	IN in_telefono VARCHAR(20))
BEGIN
	UPDATE clientes SET nombres=in_nombres, apellidos=in_apellidos, documento=in_documento, correo=in_correo, telefono=in_telefono WHERE codigo=in_id;
END//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE crear_cliente(IN codigo INT,IN nombres VARCHAR(50),	IN apellidos VARCHAR(50),
	IN documento BIGINT,	IN correo VARCHAR(70),	IN telefono VARCHAR(20))
BEGIN
	DECLARE existe_cliente INT;
	SET existe_cliente = (SELECT COUNT(*) FROM clientes as c WHERE c.documento = documento);
	IF(NOT existe_cliente) THEN
		INSERT INTO clientes VALUES (NULL, codigo, nombres, apellidos, documento, correo, telefono);
	END IF;
END//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE eliminar_cliente(IN in_id INT)
BEGIN
	DELETE FROM clientes WHERE codigo = in_id;
END//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE obtener_cliente(IN in_id INT)
BEGIN
 	SELECT codigo, nombres, apellidos, documento, correo, telefono FROM clientes WHERE codigo = in_id;
END//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE obtener_id_cliente()
BEGIN
	SELECT AUTO_INCREMENT
	FROM information_schema.TABLES
	WHERE TABLE_SCHEMA = 'control_parquadero'
	AND TABLE_NAME = 'clientes';
END//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE obtener_lista_clientes()
BEGIN
	SELECT codigo, nombres, apellidos, documento, correo, telefono FROM clientes;
END//
DELIMITER ;
