-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-06-2021 a las 04:23:40
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.6

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
(28, 'Victor Emilio', 'Delgado', 'Luna', 'Aguascalientes', '2021-01-19', '2021-01-22', 305, 1, 1, 3),
(29, 'Brayan', 'Gaytan', 'Sanchez', 'Aguascalientes', '2021-02-09', '2021-02-14', 105, 1, 1, 5),
(30, 'Luis', 'Beltran', 'Arroyo', 'CDMX', '2021-01-11', '2021-01-12', 302, 1, 1, 1),
(31, 'Roberto', 'Mendez', 'Correa', 'CDMX', '2021-04-01', '2021-04-11', 201, 1, 1, 10),
(32, 'Eduardo', 'Davila', 'Campos', 'Aguascalientes', '2021-05-04', '2021-05-08', 104, 1, 1, 4),
(33, 'Julio de Jesus', 'Gonzales', 'Rangel', 'Jalisco', '2021-04-24', '2021-04-28', 103, 2, 1, 4),
(34, 'Jose Emiliano', 'Sanchez', 'Arias', 'Aguascalientes', '2021-01-22', '2021-01-24', 210, 2, 1, 2),
(35, 'Paco', 'Gonzales', 'Arispe', 'Aguascalientes', '2021-02-15', '2021-02-27', 211, 2, 1, 12),
(36, 'Alan Pedro', 'Pedrada', 'Pedrazo', 'Aguascalientes', '2021-02-01', '2021-02-08', 101, 3, 1, 7),
(37, 'David', 'Gutierres', 'Gutierritos', 'Zacatecas', '2021-03-04', '2021-03-06', 102, 2, 1, 2),
(38, 'Luisancio', 'Martinez', 'Oropeza', 'Monterrey', '2021-03-04', '2021-03-11', 310, 3, 1, 7),
(39, 'Ricardo', 'Rodriguez', 'Almeria', 'Medellin', '2021-06-01', '2021-06-04', 202, 1, 1, 3),
(40, 'Alberto', 'Gutierres', 'Davila', 'Aguascalientes', '2021-06-01', '2021-06-05', 203, 2, 1, 4);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  ADD PRIMARY KEY (`Huesped_id`),
  ADD KEY `No_Habitacion` (`No_Habitacion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  MODIFY `Huesped_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `huespedes`
--
ALTER TABLE `huespedes`
  ADD CONSTRAINT `huespedes_ibfk_1` FOREIGN KEY (`No_Habitacion`) REFERENCES `habitaciones` (`Hab_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
