-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-06-2021 a las 20:11:47
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel_equipo8`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE `cuentas` (
  `usuario` varchar(45) NOT NULL,
  `contrasenia` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`usuario`, `contrasenia`) VALUES
('Luis31', '872488f88d1b2db54d55bc8bba2fad1b'),
('VictorLuna13', '17a821dfa961c93a6c586ca257750fb2'),
('LaloDavila', 'a4849ea5705eaa21162b7338ee2e9e32'),
('BrayanGaytan', 'b3fb45d7cdac3ff5babbdde65e7c8427'),
('GinaSalazar', 'fa0e62ff4c88ad384523d595cb1ba738');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitaciones`
--

CREATE TABLE `habitaciones` (
  `Hab_id` int(10) NOT NULL,
  `Tipo_id` int(2) NOT NULL,
  `Piso` int(2) NOT NULL,
  `Disponible` int(2) NOT NULL,
  `ocupantes` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `habitaciones`
--

INSERT INTO `habitaciones` (`Hab_id`, `Tipo_id`, `Piso`, `Disponible`, `ocupantes`) VALUES
(101, 1, 1, 0, 3),
(102, 1, 1, 0, 2),
(103, 1, 1, 1, 0),
(104, 1, 1, 0, 1),
(105, 1, 1, 0, 1),
(106, 2, 1, 1, 0),
(107, 2, 1, 1, 0),
(108, 2, 1, 1, 0),
(109, 2, 1, 1, 0),
(110, 2, 1, 1, 0),
(111, 2, 1, 1, 0),
(112, 3, 1, 1, 0),
(113, 3, 1, 1, 0),
(114, 3, 1, 1, 0),
(115, 3, 1, 1, 0),
(201, 1, 2, 1, 0),
(202, 1, 2, 0, 1),
(203, 1, 2, 0, 1),
(204, 2, 2, 1, 0),
(205, 2, 2, 1, 0),
(206, 2, 2, 1, 0),
(207, 2, 2, 1, 0),
(208, 2, 2, 1, 0),
(209, 2, 2, 0, 3),
(210, 2, 2, 0, 2),
(211, 3, 2, 1, 0),
(212, 3, 2, 1, 0),
(213, 3, 2, 1, 0),
(214, 3, 2, 1, 0),
(215, 3, 2, 1, 0),
(301, 1, 3, 0, 1),
(302, 1, 3, 1, 0),
(303, 1, 3, 0, 1),
(304, 1, 3, 0, 3),
(305, 1, 3, 1, 0),
(306, 1, 3, 1, 0),
(307, 2, 3, 1, 0),
(308, 2, 3, 1, 0),
(309, 2, 3, 1, 0),
(310, 3, 3, 1, 0),
(311, 3, 3, 1, 0),
(312, 3, 3, 1, 0),
(313, 3, 3, 1, 0),
(314, 3, 3, 1, 0),
(315, 3, 3, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huespedes`
--

CREATE TABLE `huespedes` (
  `Huesped_id` int(11) NOT NULL,
  `Nombre` varchar(25) NOT NULL,
  `Ap_Paterno` varchar(25) NOT NULL,
  `Ap_Materno` varchar(25) NOT NULL,
  `Ciudad` varchar(50) NOT NULL,
  `Ingreso` date NOT NULL,
  `Salida` date NOT NULL,
  `No_Habitacion` int(10) NOT NULL,
  `Huespedes` int(11) NOT NULL,
  `Activo` int(2) NOT NULL,
  `diasHospedaje` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `huespedes`
--

INSERT INTO `huespedes` (`Huesped_id`, `Nombre`, `Ap_Paterno`, `Ap_Materno`, `Ciudad`, `Ingreso`, `Salida`, `No_Habitacion`, `Huespedes`, `Activo`, `diasHospedaje`) VALUES
(29, 'Brayan', 'Gaytan', 'Sanchez', 'Aguascalientes', '2021-02-09', '2021-02-14', 105, 1, 1, 5),
(32, 'Eduardo', 'Davila', 'Campos', 'Aguascalientes', '2021-05-04', '2021-05-08', 104, 1, 1, 4),
(34, 'Jose Emiliano', 'Sanchez', 'Arias', 'Aguascalientes', '2021-01-22', '2021-01-24', 210, 2, 1, 2),
(36, 'Alan Javier', 'Gonzalez', 'Perez', 'Aguascalientes', '2021-02-01', '2021-02-08', 101, 3, 1, 7),
(37, 'David', 'Gutierres', 'Gutierritos', 'Zacatecas', '2021-03-04', '2021-03-06', 102, 2, 1, 2),
(39, 'Ricardo', 'Rodriguez', 'Almeria', 'Medellin', '2021-06-01', '2021-06-04', 202, 1, 1, 3),
(41, 'David', 'Perez', 'Garcia', 'Nuevo Leon', '2021-06-16', '2021-06-18', 203, 1, 1, 2),
(42, 'Javeri', 'Garcia', 'Perez', 'Aguascalientes', '2021-06-16', '2021-06-18', 301, 1, 1, 2),
(43, 'Javeri', 'Perez', 'Gonzalez', 'Ags', '2021-06-17', '2021-06-19', 304, 3, 1, 2),
(44, 'Andrea', 'Martinez', 'Rosale', 'Guadalajara', '2021-06-17', '2021-06-19', 303, 1, 1, 2),
(45, 'Luis', 'Delgado', 'Luna', 'Ags', '2021-06-19', '2021-06-21', 209, 3, 1, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `info_hotel`
--

CREATE TABLE `info_hotel` (
  `nombre_hotel` varchar(40) NOT NULL,
  `slogan_hotel` varchar(255) NOT NULL,
  `direccion_hotel` varchar(255) NOT NULL,
  `ingresos_hotel` float NOT NULL,
  `hab_sencillas` int(10) NOT NULL,
  `hab_dobles` int(10) NOT NULL,
  `hab_triples` int(10) NOT NULL,
  `imagenes` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `info_hotel`
--

INSERT INTO `info_hotel` (`nombre_hotel`, `slogan_hotel`, `direccion_hotel`, `ingresos_hotel`, `hab_sencillas`, `hab_dobles`, `hab_triples`, `imagenes`) VALUES
('California Suite', 'La mejor experiencia, sólo en el mejor hotel', 'Avenida Cruza el Río, Fraccionamiento Las Hadas, Nuevo Vallarta, Nayarit. ', 88789.4, 14, 12, 11, 'src/imagenes/imagenesGaleria/imagenGaleria');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_hab`
--

CREATE TABLE `tipos_hab` (
  `Tipo_id` int(2) NOT NULL,
  `Tipo_modelo` varchar(50) NOT NULL,
  `Tipo_costo` float NOT NULL,
  `Tipo_cargoExtra` float NOT NULL,
  `Tipo_capacidad` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipos_hab`
--

INSERT INTO `tipos_hab` (`Tipo_id`, `Tipo_modelo`, `Tipo_costo`, `Tipo_cargoExtra`, `Tipo_capacidad`) VALUES
(1, 'Sencilla', 1450.9, 500, 1),
(2, 'Doble', 1795.8, 760, 2),
(3, 'Triple', 2100.85, 945, 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  ADD PRIMARY KEY (`Hab_id`),
  ADD KEY `Tipo_id` (`Tipo_id`);

--
-- Indices de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  ADD PRIMARY KEY (`Huesped_id`),
  ADD KEY `No_Habitacion` (`No_Habitacion`);

--
-- Indices de la tabla `tipos_hab`
--
ALTER TABLE `tipos_hab`
  ADD PRIMARY KEY (`Tipo_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  MODIFY `Hab_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=316;

--
-- AUTO_INCREMENT de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  MODIFY `Huesped_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT de la tabla `tipos_hab`
--
ALTER TABLE `tipos_hab`
  MODIFY `Tipo_id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  ADD CONSTRAINT `habitaciones_ibfk_1` FOREIGN KEY (`Tipo_id`) REFERENCES `tipos_hab` (`Tipo_id`);

--
-- Filtros para la tabla `huespedes`
--
ALTER TABLE `huespedes`
  ADD CONSTRAINT `huespedes_ibfk_1` FOREIGN KEY (`No_Habitacion`) REFERENCES `habitaciones` (`Hab_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
