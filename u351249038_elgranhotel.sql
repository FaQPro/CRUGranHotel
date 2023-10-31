-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 31-10-2023 a las 14:00:31
-- Versión del servidor: 10.5.19-MariaDB-cll-lve
-- Versión de PHP: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `u351249038_elgranhotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `Numero` int(11) NOT NULL,
  `Tipohabitacion` int(11) NOT NULL,
  `Piso` int(11) NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`Numero`, `Tipohabitacion`, `Piso`, `Estado`) VALUES
(101, 6, 1, 1),
(102, 1, 1, 1),
(103, 1, 1, 1),
(104, 2, 1, 1),
(105, 4, 1, 1),
(106, 5, 1, 1),
(107, 5, 1, 1),
(108, 5, 1, 1),
(109, 6, 1, 0),
(110, 1, 5, 1),
(200, 3, 5, 1),
(201, 2, 2, 1),
(202, 2, 2, 1),
(203, 3, 2, 1),
(204, 4, 2, 1),
(205, 5, 2, 1),
(206, 5, 2, 1),
(207, 5, 2, 1),
(208, 6, 2, 1),
(209, 6, 2, 1),
(303, 5, 3, 1),
(306, 6, 3, 1),
(401, 1, 4, 1),
(402, 1, 4, 1),
(403, 1, 4, 1),
(404, 2, 4, 1),
(405, 2, 4, 1),
(406, 3, 4, 1),
(407, 3, 4, 1),
(408, 4, 4, 1),
(409, 5, 4, 1),
(501, 1, 5, 1),
(502, 2, 5, 1),
(503, 3, 5, 1),
(801, 5, 5, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `idHuesped` int(11) NOT NULL,
  `Dni` int(11) NOT NULL,
  `Apellidoynom` varchar(30) NOT NULL,
  `Direccion` varchar(60) NOT NULL,
  `Correo` varchar(40) NOT NULL,
  `Celular` varchar(20) NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='Datos del Huesped';

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesped`, `Dni`, `Apellidoynom`, `Direccion`, `Correo`, `Celular`, `Estado`) VALUES
(1, 34031678, 'Morales Facundo', 'Salta', 'facupro@gmail.com', '1546987456', 1),
(27, 111111111, 'testeo', 'testeo', 'funciona ', '1122334455', 1),
(29, 12345678, 'Luis', 'Ortuño', 'sasa@gmail', '1654916', 1),
(31, 34031678, 'Pedro Morales', 'Guemes 89', 'pedro@gmail.com', '1549865326', 1),
(32, 891279, 'Lautaro Saucedo', 'AV salta 57', 'sksnss@gmail', '5641651', 1),
(63, 3546456, 'Jose pruebA', 'AV JOSELITO 87', 'jose@gmai.com', '651651', 1),
(64, 145876, 'Pablo Marmol', 'Flinstone 12', 'pablo@hotmail.com', '164616', 1),
(65, 340316789, 'Morales Facundo', 'Salta', 'facupro@gmail.com', '1546987456', 1),
(66, 8411561, 'jose', '5151165', 'dmmnd', '6511911', 1),
(67, 861798, 'Rodrigo', 'Av jose lopez', 'asda4a44', '1611189', 1),
(68, 1981891, 'Belen', 'aedf64af16681', 'rf6f46846', '165165', 1),
(69, 849841, 'prueba', 'asdkfn5', 'edff18', '16186861', 1),
(70, 14684614, 'rodrigo', 'dasf 1771', 'awd61567', '16871671', 1),
(71, 1917164, 'jninn', '4774171', '176716', '61767', 1),
(72, 134031678, 'Morales Facundo', 'Salta', 'facupro@gmail.com', '15469874569', 1),
(73, 3403, 'Morales Facundo', 'Salta', 'facupro@gmail.com', '1546', 1),
(74, 35125890, 'rodri', 'ruta', 'ro', '223', 1),
(75, 35, '34', 'erwe', 'erwe', '654654', 1),
(76, 35, 'hgjh', '7897', 'h78ihy879', '656', 1),
(77, 34, '34', 'erwe', 'erwe', '65465', 1),
(78, 34, '34', 'erwe', 'erwe', '65465', 1),
(79, 35125891, 'Rodrigo Lang', 'Garay 2233', 'rodri@gmail.com', '2235', 1),
(80, 33, '34', 'erwe', 'erwe', '65465', 1),
(81, 45556, 'rodri', 'dfdf41671', 'ffdf45456', '564651', 1),
(82, 25, '34', 'erwe', 'erwe', '654654', 0),
(83, 24, '34', 'erwe', 'erwe', '654654', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(60) NOT NULL,
  `nrohabitacion` int(11) NOT NULL,
  `idHuesped` int(11) NOT NULL,
  `FechaEntrada` date NOT NULL,
  `FechaSalida` date NOT NULL,
  `Personas` int(11) NOT NULL,
  `ImporteTotal` double NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodehabitacion`
--

CREATE TABLE `tipodehabitacion` (
  `Codigo` int(11) NOT NULL,
  `Tipo` varchar(20) NOT NULL,
  `Capacidad` int(11) NOT NULL,
  `Cantidadcamas` int(11) NOT NULL,
  `Tipocamas` varchar(20) NOT NULL,
  `Precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='Tipos de Habitaciones';

--
-- Volcado de datos para la tabla `tipodehabitacion`
--

INSERT INTO `tipodehabitacion` (`Codigo`, `Tipo`, `Capacidad`, `Cantidadcamas`, `Tipocamas`, `Precio`) VALUES
(1, 'Bronce', 1, 1, 'Standar Simple', 12000),
(2, 'Plata', 1, 1, 'Doble', 18000),
(3, 'Gold', 1, 1, 'Queen', 21000),
(4, 'Triple', 3, 3, 'Simple', 25000),
(5, 'Triple', 3, 2, '1 Simple 1 Queen', 28000),
(6, 'Suit Lujo', 2, 1, 'King', 40000);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`Numero`),
  ADD KEY `Tipohabitacion` (`Tipohabitacion`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesped`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `nrohabitacion` (`nrohabitacion`),
  ADD KEY `idHuesped` (`idHuesped`);

--
-- Indices de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  ADD PRIMARY KEY (`Codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=84;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(60) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`Tipohabitacion`) REFERENCES `tipodehabitacion` (`Codigo`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`nrohabitacion`) REFERENCES `habitacion` (`Numero`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesped`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
