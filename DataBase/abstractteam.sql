/*
SQLyog Enterprise - MySQL GUI v6.5
MySQL - 5.5.28 : Database - abtractteam
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

create database if not exists `abtractteam`;

USE `abtractteam`;

/*Table structure for table `photos` */

DROP TABLE IF EXISTS `photos`;

CREATE TABLE `photos` (
  `id` double NOT NULL AUTO_INCREMENT,
  `url` varchar(100) NOT NULL,
  `desc` varchar(1000) NOT NULL,
  `idRestaurant` double DEFAULT NULL,
  `idPlat` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_photos` (`idRestaurant`),
  KEY `FK_photos2` (`idPlat`),
  CONSTRAINT `FK_photos2` FOREIGN KEY (`idPlat`) REFERENCES `plats` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_photos` FOREIGN KEY (`idRestaurant`) REFERENCES `restaurants` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `photos` */

/*Table structure for table `plats` */

DROP TABLE IF EXISTS `plats`;

CREATE TABLE `plats` (
  `id` double NOT NULL,
  `label` varchar(100) NOT NULL,
  `desc` varchar(1000) NOT NULL,
  `prix` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `plats` */

/*Table structure for table `restaurants` */

DROP TABLE IF EXISTS `restaurants`;

CREATE TABLE `restaurants` (
  `id` double NOT NULL,
  `id_restaurateur` double NOT NULL,
  `nom` varchar(30) NOT NULL,
  `adresse` varchar(100) NOT NULL,
  `mail` varchar(100) NOT NULL,
  `pwd` varchar(1000) NOT NULL,
  `nbrTable` int(4) NOT NULL,
  `specialite` enum('Fast Food','Salon de thé','Resaturant') DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_restaurants` (`id_restaurateur`),
  CONSTRAINT `FK_restaurants` FOREIGN KEY (`id_restaurateur`) REFERENCES `restaurateurs` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `restaurants` */

/*Table structure for table `restaurateurs` */

DROP TABLE IF EXISTS `restaurateurs`;

CREATE TABLE `restaurateurs` (
  `id` double NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `mail` varchar(30) NOT NULL,
  `psw` varchar(1000) NOT NULL,
  `adresse` varchar(80) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `restaurateurs` */

/*Table structure for table `tables` */

DROP TABLE IF EXISTS `tables`;

CREATE TABLE `tables` (
  `id` double NOT NULL,
  `nom` varchar(100) NOT NULL,
  `idRestaurant` double NOT NULL,
  `etat` int(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tables` (`idRestaurant`),
  CONSTRAINT `FK_tables` FOREIGN KEY (`idRestaurant`) REFERENCES `restaurants` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tables` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
