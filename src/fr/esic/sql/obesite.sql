-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Dim 07 Février 2021 à 18:25
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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

CREATE TABLE `historique_cnx_dec` (
  `login` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `date_cnx` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `historique_cnx_dec`
--

INSERT INTO `historique_cnx_dec` (`login`, `date_cnx`) VALUES
('aa', NULL),
('test', NULL),
('test', NULL),
('test', NULL),
('test', NULL),
('test', NULL),
('test', NULL),
('test', NULL),
('test', NULL),
('test', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `imc`
--

CREATE TABLE `imc` (
  `poids` double NOT NULL,
  `taille` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `imc`
--

INSERT INTO `imc` (`poids`, `taille`) VALUES
(0, 0),
(60, 163);

-- --------------------------------------------------------

--
-- Structure de la table `regime_perdre_poids`
--

CREATE TABLE `regime_perdre_poids` (
  `poids_actuel` double DEFAULT NULL,
  `poids_final` double DEFAULT NULL,
  `Nombre_kilo` int(11) DEFAULT NULL,
  `periode_regime` int(11) DEFAULT NULL,
  `cadence` varchar(45) DEFAULT NULL,
  `type_activité` varchar(45) DEFAULT NULL,
  `nbre_heure` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `regime_perdre_poids`
--

INSERT INTO `regime_perdre_poids` (`poids_actuel`, `poids_final`, `Nombre_kilo`, `periode_regime`, `cadence`, `type_activité`, `nbre_heure`) VALUES
(200, 100, 30, 6, 'Journaliére', 'Marche', 9),
(10, 66, 33, 4, 'Journaliére', 'Course', 6);

-- --------------------------------------------------------

--
-- Structure de la table `regime_prendre_poids`
--

CREATE TABLE `regime_prendre_poids` (
  `id_Sportif` int(11) NOT NULL,
  `poids_actuel` double DEFAULT NULL,
  `poids_final` double DEFAULT NULL,
  `Nombre_kilo` int(11) DEFAULT NULL,
  `periode_regime` int(11) DEFAULT NULL,
  `cadence` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `type_activité` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `nbre_heure` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `sportif`
--

CREATE TABLE `sportif` (
  `id` int(11) NOT NULL,
  `nom` varchar(45) COLLATE utf8_bin NOT NULL,
  `prenom` varchar(45) COLLATE utf8_bin NOT NULL,
  `sex` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `login` varchar(45) COLLATE utf8_bin NOT NULL,
  `mdp` varchar(45) COLLATE utf8_bin NOT NULL,
  `mdp2` varchar(45) COLLATE utf8_bin NOT NULL,
  `poids` double DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `dateConx` date DEFAULT NULL,
  `dateInscrip` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Contenu de la table `sportif`
--

INSERT INTO `sportif` (`id`, `nom`, `prenom`, `sex`, `login`, `mdp`, `mdp2`, `poids`, `age`, `dateConx`, `dateInscrip`) VALUES
(1, 'bensalah', 'mariem', 'feminin', 'bensalah', 'mariem', 'mariem', 25, 19, NULL, NULL),
(2, 'aaa', 'aaaaaa', 'feminin', 'azaz', 'azaz', 'azaz', 77, 14, NULL, NULL),
(3, 'aaa', 'aaa', 'feminin', 'aa', 'zaz', 'zaz', 12, 4447, NULL, NULL),
(6, 'test', 'test', 'masculin', 'test', 'test', 'test', 55, 12, NULL, NULL);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `regime_prendre_poids`
--
ALTER TABLE `regime_prendre_poids`
  ADD PRIMARY KEY (`id_Sportif`);

--
-- Index pour la table `sportif`
--
ALTER TABLE `sportif`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_UNIQUE` (`id`),
  ADD UNIQUE KEY `mail_UNIQUE` (`login`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `sportif`
--
ALTER TABLE `sportif`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
