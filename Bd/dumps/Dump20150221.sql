-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: localhost    Database: pichisdatabase
-- ------------------------------------------------------
-- Server version	5.6.22-log

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
-- Table structure for table `dpi`
--

DROP TABLE IF EXISTS `dpi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dpi` (
  `ipp` char(15) NOT NULL,
  `nom` char(30) DEFAULT NULL,
  `prenom` char(30) DEFAULT NULL,
  `sexe` enum('H','F') DEFAULT NULL,
  `dateNaissance` date DEFAULT NULL,
  `adresse` char(50) DEFAULT NULL,
  `ouvert` enum('T','F') DEFAULT NULL,
  PRIMARY KEY (`ipp`),
  UNIQUE KEY `ipp_UNIQUE` (`ipp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dpi`
--

LOCK TABLES `dpi` WRITE;
/*!40000 ALTER TABLE `dpi` DISABLE KEYS */;
INSERT INTO `dpi` VALUES ('123','test','test','H','2012-01-10','pifpafpouf','T');
/*!40000 ALTER TABLE `dpi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personnel`
--

DROP TABLE IF EXISTS `personnel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personnel` (
  `id` char(15) NOT NULL,
  `nom` char(30) DEFAULT NULL,
  `prenom` char(30) DEFAULT NULL,
  `mdp` char(20) DEFAULT NULL,
  `service` char(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personnel`
--

LOCK TABLES `personnel` WRITE;
/*!40000 ALTER TABLE `personnel` DISABLE KEYS */;
INSERT INTO `personnel` VALUES ('1','House','Gregory','123','cardiologie'),('123','Archy','Anne','abc',NULL),('2','Marie','Curie','345','cardiologie'),('456','Test','Test','def','NULL'),('789','Essai','Essai','ghi','Ortho');
/*!40000 ALTER TABLE `personnel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sejour`
--

DROP TABLE IF EXISTS `sejour`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sejour` (
  `ipp` char(15) NOT NULL,
  `id` char(30) NOT NULL,
  `date` date DEFAULT NULL,
  `responsable` char(15) DEFAULT NULL,
  `loc` char(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `id_idx` (`responsable`),
  KEY `ipp_idx` (`ipp`),
  CONSTRAINT `ipp` FOREIGN KEY (`ipp`) REFERENCES `dpi` (`ipp`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `responsable` FOREIGN KEY (`responsable`) REFERENCES `personnel` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sejour`
--

LOCK TABLES `sejour` WRITE;
/*!40000 ALTER TABLE `sejour` DISABLE KEYS */;
INSERT INTO `sejour` VALUES ('123','1','2015-02-21','789','somewhere');
/*!40000 ALTER TABLE `sejour` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-02-21 16:56:00
