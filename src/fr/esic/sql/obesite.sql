-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  Dim 07 fév. 2021 à 17:43
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `obesite`
--

-- --------------------------------------------------------

--
-- Structure de la table `historique_cnx_dec`
--

DROP TABLE IF EXISTS `historique_cnx_dec`;
CREATE TABLE IF NOT EXISTS `historique_cnx_dec` (
  `login` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `date_cnx` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `historique_cnx_dec`
--

INSERT INTO `historique_cnx_dec` (`login`, `date_cnx`) VALUES
('bensalah', NULL),
('bensalah', NULL),
('bensalah', NULL),
('1', NULL),
('1', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `imc`
--

DROP TABLE IF EXISTS `imc`;
CREATE TABLE IF NOT EXISTS `imc` (
  `poids` double NOT NULL,
  `taille` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `imc`
--

INSERT INTO `imc` (`poids`, `taille`) VALUES
(0, 0),
(60, 163);

-- --------------------------------------------------------

--
-- Structure de la table `regime_perdre_poids`
--

DROP TABLE IF EXISTS `regime_perdre_poids`;
CREATE TABLE IF NOT EXISTS `regime_perdre_poids` (
  `poids_actuel` double DEFAULT NULL,
  `poids_final` double DEFAULT NULL,
  `Nombre_kilo` int(11) DEFAULT NULL,
  `periode_regime` int(11) DEFAULT NULL,
  `cadence` varchar(45) DEFAULT NULL,
  `type_activité` varchar(45) DEFAULT NULL,
  `nbre_heure` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `regime_perdre_poids`
--

INSERT INTO `regime_perdre_poids` (`poids_actuel`, `poids_final`, `Nombre_kilo`, `periode_regime`, `cadence`, `type_activité`, `nbre_heure`) VALUES
(20.3, 12.2, 45, 2, 'journalier', 'marche', 10),
(500, 420, 50, 5, 'Hebdomadaire', 'Course', 20),
(52, 20, 52, 52, 'Hebdomadaire', 'Marche', 5);

-- --------------------------------------------------------

--
-- Structure de la table `sportif`
--

DROP TABLE IF EXISTS `sportif`;
CREATE TABLE IF NOT EXISTS `sportif` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) COLLATE utf8_bin NOT NULL,
  `prenom` varchar(45) COLLATE utf8_bin NOT NULL,
  `sex` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `login` varchar(45) COLLATE utf8_bin NOT NULL,
  `mdp` varchar(45) COLLATE utf8_bin NOT NULL,
  `mdp2` varchar(45) COLLATE utf8_bin NOT NULL,
  `poids` double DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `dateConx` date DEFAULT NULL,
  `dateInscrip` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `mail_UNIQUE` (`login`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `sportif`
--

INSERT INTO `sportif` (`id`, `nom`, `prenom`, `sex`, `login`, `mdp`, `mdp2`, `poids`, `age`, `dateConx`, `dateInscrip`) VALUES
(1, 'bensalah', 'mariem', 'feminin', 'bensalah', 'mariem', 'mariem', 25, 19, NULL, NULL),
(8, 'dylan', 'alll', 'masculin', '1', '1', '1', 99, 21, NULL, NULL),
(7, 'bb', 'bb', 'feminin', 'aza', 'rrr', 'rrr', 78, 74, NULL, NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
