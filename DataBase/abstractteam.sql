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

/*Table structure for table `restaurateurs` */

DROP TABLE IF EXISTS `restaurateurs`;

CREATE TABLE `restaurateurs` (
  `id` double NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `mail` varchar(30) NOT NULL,
  `psw` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `restaurateurs` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
