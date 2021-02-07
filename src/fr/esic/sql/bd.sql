-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--

drop schema IF EXISTS obesite;
create schema IF not EXISTS obesite;


DROP TABLE IF EXISTS `regime_perdre_poids`;
create  TABLE `obesite`.`regime_perdre_poids` 
 `poids_actuel` DOUBLE NULL ,
`poids_final` DOUBLE NULL ,
 `Nombre_kilo` INT(11) NULL ,
 `periode_regime` INT(11) NULL ,
 `cadence` VARCHAR(45) NULL ,
 `type_activité` VARCHAR(45) NULL ,
 `nbre_heure` INT(11) NULL 

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `imc`;

CREATE TABLE `imc` (
  `poids` double NOT NULL,
  `taille` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


LOCK TABLES `imc` WRITE;

INSERT INTO `imc` VALUES (0,0),(60,163);

UNLOCK TABLES;



DROP TABLE IF EXISTS `sportif`;

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
) ;


;
INSERT INTO `sportif` VALUES (1,'bensalah','mariem','feminin','bensalah','mariem','mariem',25,19,NULL,NULL),(2,'aaa','aaaaaa','feminin','azaz','azaz','azaz',77,14,NULL,NULL),(3,'aaa','aaa','feminin','aa','zaz','zaz',12,4447,NULL,NULL);
;

CREATE TABLE `obesite`.`historique_cnx_dec` (

  `login` VARCHAR(45) NULL,
  `date_cnx` DATE NULL,
  PRIMARY KEY (`id`));
