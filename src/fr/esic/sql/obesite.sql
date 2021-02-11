
CREATE TABLE `historique_cnx_dec` (
  `login` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `date_cnx` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `nb_cnx` int(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


-- --------------------------------------------------------

--
-- Structure de la table `imc`
--

CREATE TABLE `imc` (
  `poids` double NOT NULL,
  `taille` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;



-- --------------------------------------------------------

--
-- Structure de la table `regime_perdre_poids`
--

CREATE TABLE `regime_perdre_poids` (
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
  `taille` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


--

--
-- Index pour la table `regime_perdre_poids`
--
ALTER TABLE `regime_perdre_poids`
  ADD PRIMARY KEY (`id_Sportif`);

--
-- Index pour la table `sportif`
--
ALTER TABLE `sportif`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `sportif`
--
ALTER TABLE `sportif`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;