-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: bbjc4roj8rkbqtydu6tq-mysql.services.clever-cloud.com:3306
-- Generation Time: Feb 11, 2023 at 11:50 AM
-- Server version: 8.0.22-13
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bbjc4roj8rkbqtydu6tq`
--

-- --------------------------------------------------------

--
-- Table structure for table `experiences`
--

CREATE TABLE `experiences` (
  `id` int NOT NULL,
  `empresa` varchar(255) NOT NULL,
  `end` varchar(50) DEFAULT NULL,
  `herramientas` varchar(255) DEFAULT NULL,
  `imglog` varchar(150) DEFAULT NULL,
  `persona_id` int DEFAULT NULL,
  `puesto1` varchar(255) DEFAULT NULL,
  `puesto2` varchar(255) DEFAULT NULL,
  `puesto3` varchar(255) DEFAULT NULL,
  `puesto4` varchar(255) DEFAULT NULL,
  `start` varchar(50) DEFAULT NULL,
  `tarea` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experiences`
--

INSERT INTO `experiences` (`id`, `empresa`, `end`, `herramientas`, `imglog`, `persona_id`, `puesto1`, `puesto2`, `puesto3`, `puesto4`, `start`, `tarea`) VALUES
(1, 'MECOLUZ Iluminación:', 'Diciembre de 1975', NULL, './assets/IMG/logoIluminacion1.png', 1, 'Operario de tornería con material aluminio (tulipas).', 'Armado y diseño de artefactos electrolumínicos.', NULL, NULL, 'Mayo de 1975', NULL),
(2, 'Cumbre Coop. Arg. de Seguros Ltda:', 'Octubre de 1999', NULL, './assets/IMG/logoCumbre2.png', 1, 'Auxiliar Contable.', 'Encargado de Tesorería.', 'Subjefe Departamento de Cobranzas.', 'Encargado General Delegación Morón.', 'Diciembre de 1977', NULL),
(3, 'Edición de Video:', 'Diciembre de 2022', 'Manejo de Photoshop, Adobe Premier y Sony Vegas.', './assets/IMG/logoEdicion.png', 1, 'Editor', NULL, NULL, NULL, 'Abril de 2000', 'Editor de video independiente para eventos empresariales y particulares.');

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

CREATE TABLE `persona` (
  `id` int NOT NULL,
  `about` text,
  `apellido` varchar(50) NOT NULL,
  `banner` varchar(255) DEFAULT NULL,
  `nombre` varchar(50) NOT NULL,
  `profesion` varchar(255) DEFAULT NULL,
  `urlperfil` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `persona`
--

INSERT INTO `persona` (`id`, `about`, `apellido`, `banner`, `nombre`, `profesion`, `urlperfil`) VALUES
(1, 'Hola, soy un apasionado del conocimiento, mi motor, la curiosidad, me gustan las ciencias, las matematicas , la fisica y tener una cultura general adecuada.  Adentrarme en el mundo del desarrollo web lo considero un desafio personal que estoy dispuesto a asumir, y utilizarlo como herramienta para evolucionar profesionalmente, es mi objetivo.', 'Morello', 'Acerca de Mi', 'Luis José', 'Desarrolador Full Stack Jr', 'https://i.ibb.co/Qms18HX/imagen-EDU.png');

-- --------------------------------------------------------

--
-- Table structure for table `projects`
--

CREATE TABLE `projects` (
  `id` int NOT NULL,
  `imglog` varchar(150) DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  `persona_id` int DEFAULT NULL,
  `text` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `projects`
--

INSERT INTO `projects` (`id`, `imglog`, `name`, `persona_id`, `text`) VALUES
(1, './assets/IMG/imagesCV.jpg', 'Mi Porfolio', 1, 'Actualmente desarrollando mi curriculum vitae, atravesando todas las tecnologias necesarias para obtener un proyecto final integrador, que me permita sumar experiencia y conocimiento.');

-- --------------------------------------------------------

--
-- Table structure for table `redes`
--

CREATE TABLE `redes` (
  `id` int NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `persona_id` int DEFAULT NULL,
  `urlred` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `redes`
--

INSERT INTO `redes` (`id`, `nombre`, `persona_id`, `urlred`) VALUES
(1, 'instagram', 1, 'https://www.instagram.com/'),
(2, 'facebook', 1, 'https://www.facebook.com/'),
(3, 'linkedin', 1, 'https://ar.linkedin.com/'),
(4, 'github', 1, 'https://github.com/');

-- --------------------------------------------------------

--
-- Table structure for table `schools`
--

CREATE TABLE `schools` (
  `id` int NOT NULL,
  `career` varchar(255) DEFAULT NULL,
  `end` varchar(50) DEFAULT NULL,
  `imglog` varchar(150) DEFAULT NULL,
  `instituto` varchar(255) NOT NULL,
  `level` varchar(255) DEFAULT NULL,
  `persona_id` int DEFAULT NULL,
  `start` varchar(50) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `schools`
--

INSERT INTO `schools` (`id`, `career`, `end`, `imglog`, `instituto`, `level`, `persona_id`, `start`, `title`) VALUES
(1, 'Comercial', 'Diciembre de 1975', './assets/IMG/logoSecundaria.jpg', 'Escuela de Enseñanza Media 5 \'Dr. José Ingenieros\'', 'Secundario:', 1, 'Marzo de 1971', 'Perito Mercantil'),
(2, 'Ingeniería', 'Diciembre de 1982', './assets/IMG/logoUTN(a).png', 'Universidad Tecnológica Nacional Regional BA', 'Universitario:', 1, 'Marzo de 1978', 'Ingeniería Mecánica'),
(3, 'Licenciatura en Sistemas', 'Diciembre de 1985', './assets/IMG/logoISMM.jpg', 'Instituto Superior \'Mariano Moreno\'', 'Terciario:', 1, 'Abril de 1983', 'Licenciado en Sistemas Administrativos');

-- --------------------------------------------------------

--
-- Table structure for table `skils`
--

CREATE TABLE `skils` (
  `id` int NOT NULL,
  `habilidad` varchar(50) NOT NULL,
  `persona_id` int DEFAULT NULL,
  `porcentaje` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `skils`
--

INSERT INTO `skils` (`id`, `habilidad`, `persona_id`, `porcentaje`) VALUES
(1, 'HTML', 1, 70),
(2, 'CSS3', 1, 55),
(3, 'BS', 1, 55),
(4, 'JS', 1, 40),
(5, 'SB', 1, 45),
(6, 'JAVA', 1, 40);

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `id` int NOT NULL,
  `email` tinytext,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id`, `email`, `password`) VALUES
(1, 'oculto', 'oculto');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `experiences`
--
ALTER TABLE `experiences`
  ADD PRIMARY KEY (`id`),
  ADD KEY `experiences_ibfk_1` (`persona_id`);

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `projects`
--
ALTER TABLE `projects`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `redes`
--
ALTER TABLE `redes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `schools`
--
ALTER TABLE `schools`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `skils`
--
ALTER TABLE `skils`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `experiences`
--
ALTER TABLE `experiences`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `persona`
--
ALTER TABLE `persona`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `projects`
--
ALTER TABLE `projects`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `redes`
--
ALTER TABLE `redes`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `schools`
--
ALTER TABLE `schools`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `skils`
--
ALTER TABLE `skils`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `experiences`
--
ALTER TABLE `experiences`
  ADD CONSTRAINT `experiences_ibfk_1` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
