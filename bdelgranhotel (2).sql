-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-11-2023 a las 23:49:56
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
-- Base de datos: `bdelgranhotel`
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
(2, 3, 2, 1),
(3, 5, 1, 1),
(4, 6, 1, 1),
(5, 7, 1, 1),
(6, 4, 3, 1),
(7, 5, 4, 1),
(8, 7, 5, 0),
(10, 2, 2, 1),
(66, 2, 1, 1),
(105, 3, 6, 1);

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
(27, 111111111, 'testeo', 'testeo', 'funciona ', '1122334455', 0),
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
(75, 35, '34', 'erwe', 'erwe', '654654', 0),
(79, 35125891, 'Rodrigo Lang', 'Garay 2233', 'rodri@gmail.com', '2235', 1),
(80, 33, '34', 'erwe', 'erwe', '65465', 0),
(81, 45556, 'rodri', 'dfdf41671', 'ffdf45456', '564651', 1),
(82, 25, 'Luis Crack', 'Av Siempre crack 25', 'crack@luisito', '65465455', 0),
(83, 24, 'Pedro PicaPiedras', 'erwe65', 'picapie@gmail', '65465489', 0),
(84, 34031678, 'Morales Facundo', 'Salta', 'facupro@gmail.com', '1546987456', 1),
(85, 34, 'luis vera', 'av salta 59', 'luisi@gmail.com', '65465554', 1),
(86, 3403665, 'Jose del main', 'Direccion', 'Correo', 'Celular', 0),
(87, 34031678, 'Morales Facundo', 'Salta', 'facupro@gmail.com', '1546987456', 1),
(89, 34031678, 'Morales Facundo', 'Salta', 'facupro@gmail.com', '1546987456', 0),
(90, 25, 'Luis Crack', 'Av Siempre crack 25', 'crack@luisito', '65465455', 0),
(91, 34031678, 'Morales Facundo', 'Salta', 'facupro@gmail.com', '1546987456', 1),
(92, 35698, 'Hector', 'erwe', 'erwe', '654654', 1),
(93, 34, 'luis vera', 'av salta 58', 'luisi@gmail.com', '65465554', 0),
(94, 32156, 'Vilma Picapiedras', 'prehistoria 154', 'vilma@gm.com', '9814', 1),
(95, 8617871, 'Roxana Cortez', 'San Luis 85', 'rox@gma', '61878', 0),
(96, 25, 'Luis Crack', 'Av Siempre crack 25', 'crack@luisito', '65465455', 0);

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

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idReserva`, `nrohabitacion`, `idHuesped`, `FechaEntrada`, `FechaSalida`, `Personas`, `ImporteTotal`, `Estado`) VALUES
(6, 10, 91, '2023-11-28', '2023-11-30', 2, 10000, 1),
(8, 3, 93, '2023-11-03', '2023-11-04', 2, 400, 1),
(9, 6, 96, '2023-11-03', '2023-11-04', 2, 300, 1);

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
(2, 'BRONCE2', 1, 1, 'Simple', 100.1),
(3, 'MEDIUM', 1, 1, 'Doble', 120),
(4, 'ORO', 1, 1, 'King', 150),
(5, 'BASIC', 2, 2, 'Simple', 200),
(6, 'PLATINUM', 2, 2, 'King', 250),
(7, 'DIAMANTE', 4, 1, 'King Sice ', 300),
(8, 'ORO', 2, 1, 'KING ', 800);

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
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=97;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(60) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  MODIFY `Codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

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
