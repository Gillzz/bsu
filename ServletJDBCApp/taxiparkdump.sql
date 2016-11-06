-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.7.16-log - MySQL Community Server (GPL)
-- Операционная система:         Win64
-- HeidiSQL Версия:              9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Дамп структуры базы данных taxipark
CREATE DATABASE IF NOT EXISTS `taxipark` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `taxipark`;

-- Дамп структуры для таблица taxipark.cars
CREATE TABLE IF NOT EXISTS `cars` (
  `car_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `make` varchar(15) NOT NULL,
  `model` varchar(30) NOT NULL,
  `mileage` int(11) unsigned NOT NULL,
  `age` int(10) unsigned NOT NULL,
  PRIMARY KEY (`car_id`),
  KEY `make` (`make`),
  KEY `model` (`model`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- Экспортируемые данные не выделены.
-- Дамп структуры для таблица taxipark.charges
CREATE TABLE IF NOT EXISTS `charges` (
  `charge_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `pickup_id` int(11) unsigned NOT NULL,
  `destination_id` int(11) unsigned NOT NULL,
  `charge_amount` int(11) NOT NULL,
  PRIMARY KEY (`charge_id`),
  KEY `FK_charges_pickup_points` (`pickup_id`),
  KEY `FK_charges_destinations` (`destination_id`),
  CONSTRAINT `FK_charges_destinations` FOREIGN KEY (`destination_id`) REFERENCES `destinations` (`destination_id`),
  CONSTRAINT `FK_charges_pickup_points` FOREIGN KEY (`pickup_id`) REFERENCES `pickup_points` (`pickup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Экспортируемые данные не выделены.
-- Дамп структуры для таблица taxipark.destinations
CREATE TABLE IF NOT EXISTS `destinations` (
  `destination_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `frequent_adress_id` int(11) unsigned NOT NULL,
  `destination_adress` varchar(40) NOT NULL,
  PRIMARY KEY (`destination_id`),
  KEY `FK_destinations_frequent_adresses` (`frequent_adress_id`),
  CONSTRAINT `FK_destinations_frequent_adresses` FOREIGN KEY (`frequent_adress_id`) REFERENCES `frequent_adresses` (`frequent_adress_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Экспортируемые данные не выделены.
-- Дамп структуры для таблица taxipark.drivers
CREATE TABLE IF NOT EXISTS `drivers` (
  `driver_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `car_id` int(11) unsigned NOT NULL,
  `driver_name` varchar(20) NOT NULL,
  `driver_surname` varchar(20) NOT NULL,
  `driver_gender` varchar(7) NOT NULL,
  `driver_age` int(2) unsigned NOT NULL,
  `driver_telephone_number` int(15) unsigned NOT NULL,
  PRIMARY KEY (`driver_id`),
  KEY `FK_drivers_cars` (`car_id`),
  CONSTRAINT `FK_drivers_cars` FOREIGN KEY (`car_id`) REFERENCES `cars` (`car_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Экспортируемые данные не выделены.
-- Дамп структуры для таблица taxipark.frequent_adresses
CREATE TABLE IF NOT EXISTS `frequent_adresses` (
  `frequent_adress_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `adress` varchar(40) NOT NULL,
  `adress_discription` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`frequent_adress_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Экспортируемые данные не выделены.
-- Дамп структуры для таблица taxipark.journeys
CREATE TABLE IF NOT EXISTS `journeys` (
  `journey_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `driver_id` int(11) unsigned NOT NULL,
  `pickup_id` int(11) unsigned NOT NULL,
  `destination_id` int(11) unsigned NOT NULL,
  `journey_cost` int(11) unsigned NOT NULL,
  `journey_date_time` datetime NOT NULL,
  PRIMARY KEY (`journey_id`),
  KEY `FK_journeys_drivers` (`driver_id`),
  KEY `FK_journeys_pickup_points` (`pickup_id`),
  KEY `FK_journeys_destinations` (`destination_id`),
  CONSTRAINT `FK_journeys_destinations` FOREIGN KEY (`destination_id`) REFERENCES `destinations` (`destination_id`),
  CONSTRAINT `FK_journeys_drivers` FOREIGN KEY (`driver_id`) REFERENCES `drivers` (`driver_id`),
  CONSTRAINT `FK_journeys_pickup_points` FOREIGN KEY (`pickup_id`) REFERENCES `pickup_points` (`pickup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Экспортируемые данные не выделены.
-- Дамп структуры для таблица taxipark.pickup_points
CREATE TABLE IF NOT EXISTS `pickup_points` (
  `pickup_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `frequent_adress_id` int(11) unsigned NOT NULL,
  `pickup_adress` varchar(40) NOT NULL,
  `pickup_discription` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`pickup_id`),
  KEY `FK_pickup_points_frequent_adresses` (`frequent_adress_id`),
  CONSTRAINT `FK_pickup_points_frequent_adresses` FOREIGN KEY (`frequent_adress_id`) REFERENCES `frequent_adresses` (`frequent_adress_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Экспортируемые данные не выделены.
-- Дамп структуры для таблица taxipark.regular_customers
CREATE TABLE IF NOT EXISTS `regular_customers` (
  `customer_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `frequent_adress_id` int(11) unsigned NOT NULL,
  `customer_name` varchar(20) NOT NULL,
  `customer_surname` varchar(20) NOT NULL,
  `customer_phone` int(15) unsigned NOT NULL,
  PRIMARY KEY (`customer_id`),
  KEY `FK_regular_customers_frequent_adresses` (`frequent_adress_id`),
  CONSTRAINT `FK_regular_customers_frequent_adresses` FOREIGN KEY (`frequent_adress_id`) REFERENCES `frequent_adresses` (`frequent_adress_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Экспортируемые данные не выделены.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
