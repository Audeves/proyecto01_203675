
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para clubnautico
CREATE DATABASE IF NOT EXISTS `clubnautico` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `clubnautico`;

-- Volcando estructura para tabla clubnautico.barco
CREATE TABLE IF NOT EXISTS `barco` (
  `matriculaBarco` varchar(50) NOT NULL DEFAULT '',
  `idSocio` int(50) NOT NULL DEFAULT 0,
  `amarreBarco` int(50) DEFAULT NULL,
  `cuotaBarco` int(50) DEFAULT NULL,
  PRIMARY KEY (`matriculaBarco`),
  KEY `idSocio` (`idSocio`),
  CONSTRAINT `idSocio` FOREIGN KEY (`idSocio`) REFERENCES `socios` (`id_Socio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla clubnautico.salida
CREATE TABLE IF NOT EXISTS `salida` (
  `id_Salida` varchar(50) NOT NULL,
  `matriculaBarco` varchar(50) NOT NULL,
  `fecha` varchar(50) DEFAULT NULL,
  `destino` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_Salida`),
  KEY `matricula` (`matriculaBarco`),
  CONSTRAINT `matricula` FOREIGN KEY (`matriculaBarco`) REFERENCES `barco` (`matriculaBarco`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla clubnautico.socios
CREATE TABLE IF NOT EXISTS `socios` (
  `id_Socio` int NOT NULL AUTO_INCREMENT,
  `DNI` varchar(50) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id_Socio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- La exportación de datos fue deseleccionada.barcosalidasociosid_Sociosocios

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
