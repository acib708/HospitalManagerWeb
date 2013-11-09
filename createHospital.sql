CREATE TABLE Doctor(
	clave  	     varchar(10),
	nombre 	     varchar(30),
	direccion    varchar(50),
	especialidad varchar(20),
	telefono	   varchar(10),
	foto         varchar(10),
	PRIMARY KEY(clave)
);
CREATE TABLE Atiende(
	claveDoctor   varchar(10),
	clavePaciente varchar(10),
	fecha 	      varchar(10),
	tratamiento   varchar(50),
	diagnostico   varchar(30),
  fotoDoctor    varchar(10),
  fotoPaciente  varchar(10),
	PRIMARY KEY(claveDoctor,clavePaciente,fecha)
);
CREATE TABLE Paciente(
	clave 	  varchar(10),
	nombre 	  varchar(30),
	direccion varchar(50),
	telefono  varchar(10),
	foto      varchar(10),
	PRIMARY KEY(clave)
);
CREATE TABLE SeRealiza(
	claveAnalisis varchar(10),
	clavePaciente varchar(10),
	fechaAplic    varchar(20),
	fechaEntrega  varchar(30),
  fotoPaciente  varchar(10),
	PRIMARY KEY(clavePaciente,claveAnalisis,fechaAplic)
);
CREATE TABLE AnalisisClinico(
	clave 		varchar(10),
	tipo  		varchar(20),
	descripcion varchar(50),
	PRIMARY KEY(clave)
);

INSERT INTO Doctor VALUES ('D01', 'Jorge Ramirez'   , 'Chichonal #76'        , 'Cardiologia'   , '123456'  , '1.jpg');
INSERT INTO Doctor VALUES ('D02', 'Juan Gomez'      , 'Chichonal #80'        , 'Endocrinologia', '654321'  , '2.jpg');
INSERT INTO Doctor VALUES ('D03', 'Mario Mendez'    , 'Jesus del Monte #85'  , 'Cardiologia'   , '34135131', '3.jpg');
INSERT INTO Doctor VALUES ('D04', 'Jorge Ramirez'   , 'Pico de Orizaba #76'  , 'Endocrinologia', '234131'  , '4.jpg');
INSERT INTO Doctor VALUES ('D05', 'Antonio Gonzalez', 'Morelos #123'         , 'Pediatria'     , '134135'  , '5.jpg');
INSERT INTO Doctor VALUES ('D06', 'Manuel Suarez'   , 'V. Carranza #765'     , 'Cardiologia'   , '432675'  , '6.jpg');
INSERT INTO Doctor VALUES ('D07', 'Milton Lopez'    , 'Los Cusis #2181'	     , 'Endocrinologia', '123456'  , '7.jpg');
INSERT INTO Doctor VALUES ('D08', 'Pedro Gutierrez' , 'Tollocan #32'  		   , 'Pediatria'     , '123456'  , '8.jpg');
INSERT INTO Doctor VALUES ('D09', 'Fernanda Lopez'  , 'Pensador Mexicano #85', 'Pediatria'     , '123456'  , '9.jpg');
INSERT INTO Doctor VALUES ('D10', 'Ana Carbajal'    , 'Reforma #123'         , 'Cardiologia'   , '123456'  , '10.jpg');

INSERT INTO Paciente VALUES('P01', 'Juan Cardenas'    , 'Av. Alemana #23'     , '12312'  , '11.jpg');
INSERT INTO Paciente VALUES('P02', 'Roberto Rios'     , 'Calle Los Pinos #52' , '234234' , '12.jpg');
INSERT INTO Paciente VALUES('P03', 'Nicolas Jimenez'  , 'Miraflores #123'     , '234234' , '13.jpg');
INSERT INTO Paciente VALUES('P04', 'Ruddy Rojo'       , 'Av. V. Carranza #54' , '234234' , '14.jpg');
INSERT INTO Paciente VALUES('P05', 'Samuel Medina'    , 'Real del bosque #323', '234212' , '15.jpg');
INSERT INTO Paciente VALUES('P06', 'Adriana Mendez'   , 'Calle Los Cedros #65', '6542234', '16.jpg');
INSERT INTO Paciente VALUES('P07', 'Miranda Rodriguez', 'Calacoto #234'       , '24578'  , '17.jpg');
INSERT INTO Paciente VALUES('P08', 'Alejandro Arias'  , 'Calle Beni #22'      , '753223' , '18.jpg');
INSERT INTO Paciente VALUES('P09', 'Horacio Perez'    , 'Av. Banzer #443'     , '235687' , '19.jpg');
INSERT INTO Paciente VALUES('P10', 'Guido Nayar'      , 'Av. Landivar #55'    , '234234' , '20.jpg');

INSERT INTO AnalisisClinico VALUES('A01', 'Sangre'			   , 'Toma de muestra de sangre'					);
INSERT INTO AnalisisClinico VALUES('A02', 'Colesterol'		   , 'Analisis de colesterol'						);
INSERT INTO AnalisisClinico VALUES('A03', 'Electrocardiograma', 'El paciente se somete a un electrocardiograma');
INSERT INTO AnalisisClinico VALUES('A04', 'Radiografia'	   , 'Rayos X'										);
INSERT INTO AnalisisClinico VALUES('A05', 'Colesterol'		   , 'Analisis de colesterol'						);
INSERT INTO AnalisisClinico VALUES('A06', 'Radiografia'  	   , 'Rayos X'										);
INSERT INTO AnalisisClinico VALUES('A07', 'Sangre'            , 'Toma de muestra de sangre'					);
INSERT INTO AnalisisClinico VALUES('A08', 'Sangre'            , 'Toma de muestra de sangre'					);
INSERT INTO AnalisisClinico VALUES('A09', 'Electrocardiograma', 'El paciente se somete a un electrocardiograma');
INSERT INTO AnalisisClinico VALUES('A10', 'Colesterol'        , 'Analisis de colesterol');

INSERT INTO Atiende VALUES('D01', 'P01', '01/03/2010', 'Chequeo de rutina', 'Resfrio'     , '1.jpg' , '11.jpg' );
INSERT INTO Atiende VALUES('D01', 'P02', '02/10/2012', 'Fisioterapia'     , 'Infeccion'   , '1.jpg' , '12.jpg' );
INSERT INTO Atiende VALUES('D01', 'P03', '11/10/2009', 'Chequeo de rutina', 'Fractura'    , '1.jpg' , '13.jpg' );
INSERT INTO Atiende VALUES('D02', 'P01', '12/12/2012', 'Fisioterapia'     , 'Resfrio'     , '2.jpg' , '11.jpg' );
INSERT INTO Atiende VALUES('D02', 'P02', '30/05/2011', 'Vistita rutinaria', 'Infeccion'   , '2.jpg' , '12.jpg' );
INSERT INTO Atiende VALUES('D02', 'P03', '12/08/2008', 'Vistita rutinaria', 'Infeccion'   , '2.jpg' , '13.jpg' );
INSERT INTO Atiende VALUES('D03', 'P01', '10/01/2013', 'Fisioterapia'     , 'Fractura'    , '3.jpg' , '11.jpg' );
INSERT INTO Atiende VALUES('D03', 'P02', '20/02/2013', 'Chequeo de rutina', 'Resfrio'     , '3.jpg' , '12.jpg' );
INSERT INTO Atiende VALUES('D03', 'P03', '17/01/2013', 'Vistita rutinaria', 'Fractura'    , '3.jpg' , '13.jpg' );
INSERT INTO Atiende VALUES('D04', 'P04', '15/11/2012', 'Fisioterapia'     , 'Resfrio'     , '4.jpg' , '14.jpg' );
INSERT INTO Atiende VALUES('D04', 'P05', '17/11/2012', 'Fisioterapia'     , 'Resfrio'     , '4.jpg' , '15.jpg' );
INSERT INTO Atiende VALUES('D04', 'P06', '15/09/2010', 'Vistita rutinaria', 'Fractura'    , '4.jpg' , '16.jpg' );
INSERT INTO Atiende VALUES('D05', 'P04', '21/09/2009', 'Chequeo de rutina', 'Resfrio'     , '5.jpg' , '14.jpg' );
INSERT INTO Atiende VALUES('D05', 'P05', '11/11/2011', 'Chequeo de rutina', 'Resfrio'  	  , '5.jpg' , '15.jpg' );
INSERT INTO Atiende VALUES('D05', 'P06', '14/11/2010', 'Vistita rutinaria', 'Fractura'    , '5.jpg' , '16.jpg' );
INSERT INTO Atiende VALUES('D06', 'P04', '11/10/2012', 'Chequeo de rutina', 'Infeccion'   , '6.jpg' , '14.jpg' );
INSERT INTO Atiende VALUES('D06', 'P05', '14/02/2011', 'Vistita rutinaria', 'Inflamacion' , '6.jpg' , '15.jpg' );
INSERT INTO Atiende VALUES('D06', 'P06', '17/01/2013', 'Vistita rutinaria', 'Fractura'    , '6.jpg' , '16.jpg' );
INSERT INTO Atiende VALUES('D07', 'P07', '23/03/2010', 'Vistita rutinaria', 'Resfrio'     , '7.jpg' , '17.jpg' );
INSERT INTO Atiende VALUES('D07', 'P08', '21/09/2009', 'Chequeo de rutina', 'Inflamacion' , '7.jpg' , '18.jpg' );
INSERT INTO Atiende VALUES('D07', 'P09', '15/10/2012', 'Fisioterapia'     , 'Fractura'    , '7.jpg' , '19.jpg' );
INSERT INTO Atiende VALUES('D08', 'P07', '10/10/2010', 'Vistita rutinaria', 'Infeccion'   , '8.jpg' , '17.jpg' );
INSERT INTO Atiende VALUES('D08', 'P08', '10/10/2010', 'Chequeo de rutina', 'Inflamacion' , '8.jpg' , '18.jpg' );
INSERT INTO Atiende VALUES('D08', 'P09', '11/11/2011', 'Vistita rutinaria', 'Inflamacion' , '8.jpg' , '19.jpg' );
INSERT INTO Atiende VALUES('D09', 'P07', '19/05/2009', 'Fisioterapia'     , 'Infeccion'   , '9.jpg' , '17.jpg' );
INSERT INTO Atiende VALUES('D09', 'P08', '16/04/2012', 'Vistita rutinaria', 'Inflamacion' , '9.jpg' , '18.jpg' );
INSERT INTO Atiende VALUES('D09', 'P09', '21/12/2012', 'Fisioterapia'	    , 'Resfrio'     , '9.jpg' , '19.jpg' );
INSERT INTO Atiende VALUES('D10', 'P08', '15/10/2009', 'Vistita rutinaria', 'Inflamacion' , '10.jpg', '18.jpg' );
INSERT INTO Atiende VALUES('D10', 'P09', '12/03/2013', 'Vistita rutinaria', 'Infeccion'   , '10.jpg', '19.jpg' );
INSERT INTO Atiende VALUES('D10', 'P10', '12/03/2013', 'Chequeo de rutina', 'Fractura'    , '10.jpg', '20.jpg' );

INSERT INTO SeRealiza VALUES('A01', 'P01', '15/10/2009', '22/10/2009', '11.jpg');
INSERT INTO SeRealiza VALUES('A01', 'P02', '23/03/2010', '26/03/2010', '12.jpg');
INSERT INTO SeRealiza VALUES('A02', 'P01', '14/11/2010', '19/11/2010', '11.jpg');
INSERT INTO SeRealiza VALUES('A02', 'P02', '15/10/2009', '22/10/2009', '12.jpg');
INSERT INTO SeRealiza VALUES('A03', 'P03', '23/03/2010', '26/03/2010', '13.jpg');
INSERT INTO SeRealiza VALUES('A03', 'P04', '15/10/2009', '22/10/2009', '14.jpg');
INSERT INTO SeRealiza VALUES('A04', 'P03', '14/11/2010', '19/11/2010', '13.jpg');
INSERT INTO SeRealiza VALUES('A04', 'P04', '14/11/2010', '19/11/2010', '14.jpg');
INSERT INTO SeRealiza VALUES('A05', 'P05', '23/03/2010', '26/03/2010', '15.jpg');
INSERT INTO SeRealiza VALUES('A05', 'P06', '15/10/2009', '22/10/2009', '16.jpg');
INSERT INTO SeRealiza VALUES('A06', 'P05', '14/11/2010', '19/11/2010', '15.jpg');
INSERT INTO SeRealiza VALUES('A06', 'P06', '14/11/2010', '19/11/2010', '16.jpg');
INSERT INTO SeRealiza VALUES('A07', 'P07', '14/11/2010', '19/11/2010', '17.jpg');
INSERT INTO SeRealiza VALUES('A07', 'P08', '15/10/2009', '22/10/2009', '18.jpg');
INSERT INTO SeRealiza VALUES('A08', 'P07', '15/10/2009', '22/10/2009', '17.jpg');
INSERT INTO SeRealiza VALUES('A08', 'P08', '23/03/2010', '26/03/2010', '18.jpg');
INSERT INTO SeRealiza VALUES('A09', 'P09', '14/11/2010', '19/11/2010', '19.jpg');
INSERT INTO SeRealiza VALUES('A09', 'P10', '14/11/2010', '19/11/2010', '20.jpg');
INSERT INTO SeRealiza VALUES('A10', 'P09', '15/10/2009', '22/10/2009', '19.jpg');
INSERT INTO SeRealiza VALUES('A10', 'P10', '23/03/2010', '26/03/2010', '20.jpg');

ALTER TABLE Atiende   ADD FOREIGN KEY(clavePaciente) REFERENCES Paciente(clave);
ALTER TABLE Atiende   ADD FOREIGN KEY(claveDoctor)   REFERENCES Doctor(clave);
ALTER TABLE SeRealiza ADD FOREIGN KEY(clavePaciente) REFERENCES Paciente(clave);
ALTER TABLE SeRealiza ADD FOREIGN KEY(claveAnalisis) REFERENCES AnalisisClinico(clave);