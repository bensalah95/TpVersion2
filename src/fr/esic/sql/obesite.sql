drop schema  if exists obesite;
create schema  if not exists obesite;
CREATE TABLE `obesite`.`historique_cnx_dec` (
    `login` VARCHAR(45),
    `date_cnx` VARCHAR(45),
    `nb_cnx` int(20)
);

 

 

CREATE TABLE `obesite`.`imc` (
  `poids` double NOT NULL,
  `taille` int(11) NOT NULL
) ;

 


CREATE TABLE `obesite`.`regime_perdre_poids` (
  `poids_actuel` double DEFAULT NULL,
  `poids_final` double DEFAULT NULL,
  `Nombre_kilo` int(11) DEFAULT NULL,
  `periode_regime` int(11) DEFAULT NULL,
  `cadence` varchar(45) DEFAULT NULL,
  `type_activité` varchar(45) DEFAULT NULL,
  `nbre_heure` int(11) DEFAULT NULL
) ;

 


drop table if exists`obesite`.`sportif`  ;
CREATE TABLE `obesite`.`sportif` (
  `id` int(11),
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45)  NOT NULL,
  `sex` varchar(45)  NULL,
  `login` varchar(45)  NOT NULL,
  `mdp` varchar(45)  NOT NULL,
  `mdp2` varchar(45) NOT NULL,
  `poids` double  NULL,
  `age` int(11)  NULL,
  `taille`int(11) NULL,
  `dateConx` date  NULL,
  `dateInscrip` date  NULL
) ;

 


ALTER TABLE `obesite`.`sportif` 
CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT ,
ADD PRIMARY KEY (`id`);
;


ALTER TABLE `obesite`.`sportif` 
DROP COLUMN `dateInscrip`,
DROP COLUMN `dateConx`;

ALTER TABLE `obesite`.`regime_perdre_poids` 
ADD COLUMN `tempspasse` VARCHAR(45) NULL AFTER `nbre_heure`;
