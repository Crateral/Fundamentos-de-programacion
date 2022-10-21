INSERT INTO COLEGIO.IDENTIFICACION (idIDENTIFICACION, NombreIdentificacion) VALUES (1, 'CEDULA DE CIUDADANIA');
INSERT INTO COLEGIO.IDENTIFICACION (idIDENTIFICACION, NombreIdentificacion) VALUES (2, 'TARJETA DE IDENTIDAD');
INSERT INTO COLEGIO.IDENTIFICACION (idIDENTIFICACION, NombreIdentificacion) VALUES (3, 'CONTRASEÑA');
INSERT INTO COLEGIO.IDENTIFICACION (idIDENTIFICACION, NombreIdentificacion) VALUES (4, 'CEDULA EXTRANGERIA');


INSERT INTO COLEGIO.ESTUDIANTE (idESTUDIANTE, NombresEs, ApellidosEs, GeneroEs, FechaNacimientoEs, DireccionEs, TelefonoEs, CelularEs, CorreoElectronicoEs, IDENTIFICACION_idIDENTIFICACION) VALUES (1, 'LUIS', 'MATEUS', 'M', '2010-01-01', 'CLL 123', '722', '311', 'LUIS@MATEUS.ORG', 1);
INSERT INTO COLEGIO.ESTUDIANTE (idESTUDIANTE, NombresEs, ApellidosEs, GeneroEs, FechaNacimientoEs, DireccionEs, TelefonoEs, CelularEs, CorreoElectronicoEs, IDENTIFICACION_idIDENTIFICACION) VALUES (2, 'ALEJANDRO', 'RESTREPO', 'M', '2010-02-02', 'CRA 456', '732', '300', 'ALEJANDRO@RESTREPO.ORG', 1);


INSERT INTO COLEGIO.CLASE (idCLASE, NombreClase) VALUES (1, 'EDFISICA3RO');
INSERT INTO COLEGIO.CLASE (idCLASE, NombreClase) VALUES (2, 'MATEMATICAS3RO');
INSERT INTO COLEGIO.CLASE (idCLASE, NombreClase) VALUES (3, 'QUIMICA5TO');

INSERT INTO COLEGIO.ESTUDIANTE_has_CLASE (ESTUDIANTE_idESTUDIANTE, CLASE_idCLASE, Salon) VALUES (1, 1, 2);
INSERT INTO COLEGIO.ESTUDIANTE_has_CLASE (ESTUDIANTE_idESTUDIANTE, CLASE_idCLASE, Salon) VALUES (1, 2, 2);
INSERT INTO COLEGIO.ESTUDIANTE_has_CLASE (ESTUDIANTE_idESTUDIANTE, CLASE_idCLASE, Salon) VALUES (2, 1, 3);


INSERT INTO COLEGIO.PROFESOR (idPROFESOR, NombresPr, ApellidosPr, GeneroPr, FechaNacimientoPr, TarjetaProfesionalPr, TelefonoPr, CelularPr, CorreoElectronicoPr, IDENTIFICACION_idIDENTIFICACION) VALUES ('1', 'JUAN', 'PEREZ', 'M', '1990-01-01', '2002525', '733', '300', 'JUAN@PEREZ.ORG', 1);


INSERT INTO COLEGIO.NOTA (idNOTA, ESTUDIANTE_has_CLASE_ESTUDIANTE_idESTUDIANTE, ESTUDIANTE_has_CLASE_CLASE_idCLASE, NotaFinal) VALUES ('1', '1', '1', '5');
