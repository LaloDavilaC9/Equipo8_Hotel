-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-05-2021 a las 20:05:36
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
-- Estructura de tabla para la tabla `habitaciones`
--

CREATE TABLE `habitaciones` (
  `Hab_id` int(10) NOT NULL,
  `Tipo_id` int(2) NOT NULL,
  `Piso` int(2) NOT NULL,
  `Disponible` int(2) NOT NULL,
  `Ocupantes` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `habitaciones`
--

INSERT INTO `habitaciones` (`Hab_id`, `Tipo_id`, `Piso`, `Disponible`, `Ocupantes`) VALUES
(100, 1, 1, 1, 0),
(101, 1, 1, 0, 1),
(102, 1, 1, 0, 2),
(103, 1, 1, 0, 2),
(104, 1, 1, 0, 1),
(105, 2, 1, 1, 0),
(106, 2, 1, 1, 0),
(107, 2, 1, 1, 0),
(108, 2, 1, 1, 0),
(109, 2, 1, 1, 0),
(110, 2, 1, 1, 0),
(111, 3, 1, 1, 0),
(112, 3, 1, 1, 0),
(113, 3, 1, 1, 0),
(114, 3, 1, 1, 0),
(200, 1, 2, 1, 0),
(201, 1, 2, 1, 0),
(202, 1, 2, 1, 0),
(203, 2, 2, 1, 0),
(204, 2, 2, 1, 0),
(205, 2, 2, 1, 0),
(206, 2, 2, 1, 0),
(207, 2, 2, 1, 0),
(208, 2, 2, 1, 0),
(209, 2, 2, 1, 0),
(210, 3, 2, 1, 0),
(211, 3, 2, 1, 0),
(212, 3, 2, 1, 0),
(213, 3, 2, 1, 0),
(214, 3, 2, 1, 0),
(300, 1, 3, 1, 0),
(301, 1, 3, 1, 0),
(302, 1, 3, 1, 0),
(303, 1, 3, 1, 0),
(304, 1, 3, 1, 0),
(305, 1, 3, 1, 0),
(306, 2, 3, 1, 0),
(307, 2, 3, 1, 0),
(308, 2, 3, 1, 0),
(309, 3, 3, 1, 0),
(310, 3, 3, 1, 0),
(311, 3, 3, 1, 0),
(312, 3, 3, 1, 0),
(313, 3, 3, 1, 0),
(314, 3, 3, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huespedes`
--

CREATE TABLE `huespedes` (
  `huesped_id` int(11) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `Ap_Paterno` varchar(25) NOT NULL,
  `Ap_Materno` varchar(25) NOT NULL,
  `Ciudad` varchar(50) NOT NULL,
  `Ingreso` date NOT NULL,
  `Salida` date NOT NULL,
  `No_Habitacion` int(10) NOT NULL,
  `Activo` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `huespedes`
--

INSERT INTO `huespedes` (`huesped_id`, `nombre`, `Ap_Paterno`, `Ap_Materno`, `Ciudad`, `Ingreso`, `Salida`, `No_Habitacion`, `Activo`) VALUES
(2, 'Brayan', 'Gaytán', 'Sánchez', 'México', '2021-05-12', '2021-05-20', 102, 1),
(3, 'Victor Emilio', 'Delgado', 'Luna', 'Torreón', '2021-05-21', '2021-05-31', 101, 1),
(4, 'Luis', 'Beltrán', 'Arroyo', 'México', '2021-05-23', '2021-05-27', 103, 1),
(5, 'Alfredo', 'del Mazo', 'González', 'México', '2021-05-23', '2021-05-27', 104, 1);

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
  `hab_triples` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `info_hotel`
--

INSERT INTO `info_hotel` (`nombre_hotel`, `slogan_hotel`, `direccion_hotel`, `ingresos_hotel`, `hab_sencillas`, `hab_dobles`, `hab_triples`) VALUES
('California Suite', 'La mejor experiencia, sólo en el mejor hotel', 'Avenida Cruza el Río, Fraccionamiento Las Hadas, Nuevo Vallarta, Nayarit. ', 99.33, 14, 12, 11);

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
  ADD PRIMARY KEY (`huesped_id`),
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
  MODIFY `Hab_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=315;

--
-- AUTO_INCREMENT de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  MODIFY `huesped_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

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
