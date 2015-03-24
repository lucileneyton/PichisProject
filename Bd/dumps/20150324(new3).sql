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
INSERT INTO `dpi` VALUES ('123','test','test','H','2012-01-10','pifpafpouf','T'),('1546','Me','Henry','H','1993-04-24','21, rue des agagous','T');
/*!40000 ALTER TABLE `dpi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `observations`
--

DROP TABLE IF EXISTS `observations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `observations` (
  `id` char(25) NOT NULL DEFAULT '',
  `medecin` char(25) DEFAULT NULL,
  `texte` longtext,
  `patient` char(45) DEFAULT NULL,
  `date` char(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `observations`
--

LOCK TABLES `observations` WRITE;
/*!40000 ALTER TABLE `observations` DISABLE KEYS */;
INSERT INTO `observations` VALUES ('1','1','Patient fragile','123','24-03-2015');
/*!40000 ALTER TABLE `observations` ENABLE KEYS */;
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
  `maintenance` char(5) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personnel`
--

LOCK TABLES `personnel` WRITE;
/*!40000 ALTER TABLE `personnel` DISABLE KEYS */;
INSERT INTO `personnel` VALUES ('1','House','Gregory','123','1','NULL'),('123','Archy','Anne','abc',NULL,NULL),('1234','X','Jean','abcd','1','NULL'),('147','a','b','147','NULL','true'),('2','Marie','Curie','345','1',NULL),('456','Test','Test','def','NULL',NULL),('789','Essai','Essai','ghi','1',NULL);
/*!40000 ALTER TABLE `personnel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prescriptions`
--

DROP TABLE IF EXISTS `prescriptions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prescriptions` (
  `id` char(45) NOT NULL DEFAULT '',
  `patient` char(45) DEFAULT NULL,
  `medecin` char(45) DEFAULT NULL,
  `texte` char(45) DEFAULT NULL,
  `date` char(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prescriptions`
--

LOCK TABLES `prescriptions` WRITE;
/*!40000 ALTER TABLE `prescriptions` DISABLE KEYS */;
/*!40000 ALTER TABLE `prescriptions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestations`
--

DROP TABLE IF EXISTS `prestations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prestations` (
  `id` char(10) NOT NULL,
  `demandeur` char(30) DEFAULT NULL,
  `patient` char(30) DEFAULT NULL,
  `resultat` char(30) DEFAULT NULL,
  `date` char(30) DEFAULT NULL,
  `nature` char(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestations`
--

LOCK TABLES `prestations` WRITE;
/*!40000 ALTER TABLE `prestations` DISABLE KEYS */;
INSERT INTO `prestations` VALUES ('1','1','123','NULL','2015-03-17','injection'),('null','1234','1546','null','20032015','Radio genou');
/*!40000 ALTER TABLE `prestations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resultat`
--

DROP TABLE IF EXISTS `resultat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resultat` (
  `date` char(10) DEFAULT NULL,
  `description` char(255) DEFAULT NULL,
  `medecin` char(30) DEFAULT NULL,
  `prestation` char(10) DEFAULT NULL,
  `id` char(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resultat`
--

LOCK TABLES `resultat` WRITE;
/*!40000 ALTER TABLE `resultat` DISABLE KEYS */;
INSERT INTO `resultat` VALUES ('2015-03-17','taux de leucocytes anormal','1','1','1');
/*!40000 ALTER TABLE `resultat` ENABLE KEYS */;
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
  `dateentree` char(10) DEFAULT NULL,
  `responsable` char(15) DEFAULT NULL,
  `loc` char(50) DEFAULT NULL,
  `datesortie` char(10) DEFAULT NULL,
  `numerochambre` char(10) DEFAULT NULL,
  `placement` char(10) DEFAULT NULL,
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
INSERT INTO `sejour` VALUES ('123','1','2015-02-21','789','1',NULL,NULL,NULL);
/*!40000 ALTER TABLE `sejour` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `service` (
  `id` char(50) NOT NULL,
  `type` char(50) DEFAULT NULL,
  `specialite` char(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `service` FOREIGN KEY (`id`) REFERENCES `personnel` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES ('1','CLINIQUE','CARDIOLOGIE');
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-03-24 11:34:55
