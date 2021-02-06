-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: obesite
-- ------------------------------------------------------
-- Server version	5.6.10
drop schema IF EXISTS obesite;
create schema IF not EXISTS obesite;

--
-- Table structure for table `avancement_du_poids`
--

DROP TABLE IF EXISTS `avancement_du_poids`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `avancement_du_poids` (
  `poids_initial` double NOT NULL,
  `poids_final` double NOT NULL,
  `nom` varchar(45) NOT NULL,
  `taille` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `avancement_du_poids`
--

LOCK TABLES `avancement_du_poids` WRITE;
/*!40000 ALTER TABLE `avancement_du_poids` DISABLE KEYS */;
/*!40000 ALTER TABLE `avancement_du_poids` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `imc`
--

DROP TABLE IF EXISTS `imc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `imc` (
  `poids` double NOT NULL,
  `taille` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `imc`
--

LOCK TABLES `imc` WRITE;
/*!40000 ALTER TABLE `imc` DISABLE KEYS */;
INSERT INTO `imc` VALUES (0,0),(60,163);
/*!40000 ALTER TABLE `imc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sportif`
--

DROP TABLE IF EXISTS `sportif`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sportif` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `login` varchar(45) NOT NULL,
  `mdp` varchar(45) NOT NULL,
  `mdp2` varchar(45) NOT NULL,
  `poids` double DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `dateConx` date DEFAULT NULL,
  `dateInscrip` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `mail_UNIQUE` (`login`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sportif`
--

LOCK TABLES `sportif` WRITE;
/*!40000 ALTER TABLE `sportif` DISABLE KEYS */;
INSERT INTO `sportif` VALUES (1,'bensalah','mariem','feminin','bensalah','mariem','mariem',25,19,NULL,NULL),(2,'aaa','aaaaaa','feminin','azaz','azaz','azaz',77,14,NULL,NULL),(3,'aaa','aaa','feminin','aa','zaz','zaz',12,4447,NULL,NULL);
/*!40000 ALTER TABLE `sportif` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-06  6:25:04

