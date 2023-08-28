-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-08-2023 a las 07:31:52
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `laboratoriopoo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `es_codigo` int(11) NOT NULL,
  `es_cedula` int(10) NOT NULL,
  `es_apellido` varchar(15) NOT NULL,
  `es_nombre` varchar(15) NOT NULL,
  `es_email` varchar(20) NOT NULL,
  `es_telefono` int(10) NOT NULL,
  `es_direccion` varchar(20) NOT NULL,
  `es_materia` varchar(15) NOT NULL,
  `es_estado` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`es_codigo`, `es_cedula`, `es_apellido`, `es_nombre`, `es_email`, `es_telefono`, `es_direccion`, `es_materia`, `es_estado`) VALUES
(1, 235008451, 'Velez', 'Ana', 'sd234@gmail.com', 987456, 'Av. Rio Verde', 'POO', 'Aprobado'),
(2, 15641546, 'Bautista', 'Dayanara', 'db11@gmail.com', 9846561, 'San Ignacio', 'Calculo', 'Aprobado'),
(3, 15462345, ' Vaca', ' Juan', ' vaca@gmail.com', 98546213, ' Av. Rio Toachi', 'POO', 'Aprobado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horarios`
--

CREATE TABLE `horarios` (
  `h_codigo` int(11) NOT NULL,
  `h_materia` varchar(20) NOT NULL,
  `h_laboratorio` varchar(10) NOT NULL,
  `h_docente` varchar(40) NOT NULL,
  `h_hora` varchar(20) NOT NULL,
  `h_fecha` varchar(20) NOT NULL,
  `h_capacidad` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `horarios`
--

INSERT INTO `horarios` (`h_codigo`, `h_materia`, `h_laboratorio`, `h_docente`, `h_hora`, `h_fecha`, `h_capacidad`) VALUES
(1, ' POO', 'L03', ' Ing. Javier Cevallos', '09h00AM a 11h00AM', ' 25/08/2023', 30);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `pro_codigo` int(11) NOT NULL,
  `pro_cedula` int(15) NOT NULL,
  `pro_apellido` varchar(20) NOT NULL,
  `pro_nombre` varchar(20) NOT NULL,
  `pro_titulo` varchar(40) NOT NULL,
  `pro_email` varchar(30) NOT NULL,
  `pro_estado` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`pro_codigo`, `pro_cedula`, `pro_apellido`, `pro_nombre`, `pro_titulo`, `pro_email`, `pro_estado`) VALUES
(1, 2350045, ' Benites', ' Lucio', 'Ing. Sistemas ', ' lucitotupapi@gmail.com', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reporte`
--

CREATE TABLE `reporte` (
  `repo_laboratorio` varchar(30) NOT NULL,
  `repo_hora` varchar(30) NOT NULL,
  `repo_fecha` varchar(30) NOT NULL,
  `repo_dia` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reporte`
--

INSERT INTO `reporte` (`repo_laboratorio`, `repo_hora`, `repo_fecha`, `repo_dia`) VALUES
('L03', '11h00AM A 13h00PM', '29/08/2023', 'Miercoles'),
('L05', '09h00AM a 11h00AM', '30/08/2023', 'Lunes');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`es_codigo`);

--
-- Indices de la tabla `horarios`
--
ALTER TABLE `horarios`
  ADD PRIMARY KEY (`h_codigo`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`pro_codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `es_codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `horarios`
--
ALTER TABLE `horarios`
  MODIFY `h_codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `profesor`
--
ALTER TABLE `profesor`
  MODIFY `pro_codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
