-- MySQL dump 10.13  Distrib 5.7.25, for Linux (x86_64)
--
-- Host: localhost    Database: Estacionamento
-- ------------------------------------------------------
-- Server version	5.7.25-0ubuntu0.16.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `Estacionamento`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `Estacionamento` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `Estacionamento`;

--
-- Table structure for table `registro`
--

DROP TABLE IF EXISTS `registro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registro` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `entrada` int(11) NOT NULL,
  `saida` int(11) NOT NULL,
  `placa` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro`
--

LOCK TABLES `registro` WRITE;
INSERT INTO `registro` VALUES (1, 14, 16, 'MKY9856'),(2, 14, 17, 'MKY9856'),(3, 13, 16, 'MKY9856'),(4, 12, 18, 'LHJ1285'),(5, 14, 16, 'OPU4980'),(6, 16, 17, 'RAD1337'),(7, 15, 19, 'HOL0001');
/*!40000 ALTER TABLE `registro` DISABLE KEYS */;
/*!40000 ALTER TABLE `registro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `totem`
--

DROP TABLE IF EXISTS `totem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `totem` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rua` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `totem`
--

LOCK TABLES `totem` WRITE;
/*!40000 ALTER TABLE `totem` DISABLE KEYS */;
INSERT INTO `totem` VALUES (1,'Rio Branco'),(2,'Hercílio Luz'),(3,'Tiradentes'),(4,'Felipe Schmit');
/*!40000 ALTER TABLE `totem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `totem_registro`
--

DROP TABLE IF EXISTS `totem_registro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `totem_registro` (
  `tid` int(11) NOT NULL,
  `rid` int(11) NOT NULL,
  PRIMARY KEY (`tid`,`rid`),
  KEY `rid` (`rid`),
  CONSTRAINT `totem_registro_ibfk_1` FOREIGN KEY (`tid`) REFERENCES `totem` (`id`) ON DELETE CASCADE,
  CONSTRAINT `totem_registro_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `registro` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `totem_registro`
--

LOCK TABLES `totem_registro` WRITE;
INSERT INTO `totem_registro` VALUES (1,1),(1,2),(1,3),(2,4),(3,5),(4,6),(2,7);
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-11 15:01:59
