CREATE DATABASE  IF NOT EXISTS `carport` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `carport`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 188.166.61.197    Database: carport
-- ------------------------------------------------------
-- Server version	8.0.20-0ubuntu0.19.10.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bom`
--

DROP TABLE IF EXISTS `bom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bom` (
  `order_id` int NOT NULL,
  `mv_id` int NOT NULL,
  `quantity` float NOT NULL,
  `description` varchar(45) NOT NULL,
  KEY `fk_mv_id_bom_idx` (`mv_id`),
  KEY `fk_order_id_bom_idx` (`order_id`),
  CONSTRAINT `fk_mv_id_bom` FOREIGN KEY (`mv_id`) REFERENCES `material_variants` (`mv_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_order_id_bom` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bom`
--

LOCK TABLES `bom` WRITE;
/*!40000 ALTER TABLE `bom` DISABLE KEYS */;
INSERT INTO `bom` VALUES (1,1,4,'understernbrædder til for & bagende'),(1,1,4,'understernbrædder til siderne'),(1,7,2,'oversternbrædder til forenden'),(1,7,4,'oversternbrædder til siderne'),(1,19,2,'Remme i sider, sadles ned i stolper'),(1,19,4,'Spær, monteres på rem '),(1,25,4,'Stolper nedgraves 90 cm i jorden'),(1,31,4,'vandbrædt på stern i sider'),(1,31,2,'vandbrædt på stern i forende'),(1,55,3,'Skruer til tagplader'),(1,56,2,'Til vindkryds på spær'),(1,57,15,'Til montering af spær på rem'),(1,58,15,'Til montering af spær på rem'),(1,59,1,'Til montering af stern og vandbrædt'),(1,60,3,'Til montering af universalbeslag + hulbånd'),(1,60,18,'Til montering af rem på stolper'),(1,61,12,'Til montering af rem på stolper'),(1,62,2,'Til montering af yderste beklædning'),(1,63,2,'Til montering af inderste beklædning'),(2,3,4,'understernbrædder til for & bagende'),(2,4,4,'understernbrædder til siderne'),(2,9,2,'oversternbrædder til forenden'),(2,10,4,'oversternbrædder til siderne'),(2,21,2,'Remme i sider, sadles ned i stolper'),(2,23,11,'Spær, monteres på rem '),(2,25,4,'Stolper nedgraves 90 cm i jorden'),(2,34,4,'vandbrædt på stern i sider'),(2,34,2,'vandbrædt på stern i forende'),(2,55,3,'Skruer til tagplader'),(2,56,2,'Til vindkryds på spær'),(2,57,15,'Til montering af spær på rem'),(2,58,15,'Til montering af spær på rem'),(2,59,1,'Til montering af stern og vandbrædt'),(2,60,3,'Til montering af universalbeslag + hulbånd'),(2,60,18,'Til montering af rem på stolper'),(2,61,12,'Til montering af rem på stolper'),(2,62,2,'Til montering af yderste beklædning'),(2,63,2,'Til montering af inderste beklædning'),(3,4,4,'understernbrædder til for & bagende'),(3,4,4,'understernbrædder til siderne'),(3,10,2,'oversternbrædder til forenden'),(3,10,4,'oversternbrædder til siderne'),(3,13,1,'til z på bagside af dør'),(3,41,0,'Løsholte til skur gavle'),(3,22,2,'Remme i sider, sadles ned i stolper'),(3,24,13,'Spær, monteres på rem '),(3,25,8,'Stolper nedgraves 90 cm i jorden'),(3,35,4,'vandbrædt på stern i sider'),(3,34,2,'vandbrædt på stern i forende'),(3,55,3,'Skruer til tagplader'),(3,56,2,'Til vindkryds på spær'),(3,57,15,'Til montering af spær på rem'),(3,58,15,'Til montering af spær på rem'),(3,59,1,'Til montering af stern og vandbrædt'),(3,60,3,'Til montering af universalbeslag + hulbånd'),(3,60,18,'Til montering af rem på stolper'),(3,61,12,'Til montering af rem på stolper'),(3,62,2,'Til montering af yderste beklædning'),(3,63,2,'Til montering af inderste beklædning'),(3,64,1,'Til lås på dør i skur'),(3,65,2,'Til skurdør'),(3,66,32,'Til montering af løsholter i skur'),(4,1,4,'understernbrædder til for & bagende'),(4,1,4,'understernbrædder til siderne'),(4,7,2,'oversternbrædder til forenden'),(4,7,4,'oversternbrædder til siderne'),(4,13,1,'til z på bagside af dør'),(4,38,6,'Løsholte til skur gavle'),(4,37,6,'Løsholte til skur sider'),(4,19,2,'Remme i sider, sadles ned i stolper'),(4,19,4,'Spær, monteres på rem '),(4,25,4,'Stolper nedgraves 90 cm i jorden'),(4,31,4,'vandbrædt på stern i sider'),(4,31,2,'vandbrædt på stern i forende'),(4,55,3,'Skruer til tagplader'),(4,56,2,'Til vindkryds på spær'),(4,57,15,'Til montering af spær på rem'),(4,58,15,'Til montering af spær på rem'),(4,59,1,'Til montering af stern og vandbrædt'),(4,60,3,'Til montering af universalbeslag + hulbånd'),(4,60,18,'Til montering af rem på stolper'),(4,61,12,'Til montering af rem på stolper'),(4,62,2,'Til montering af yderste beklædning'),(4,63,2,'Til montering af inderste beklædning'),(4,64,1,'Til lås på dør i skur'),(4,65,2,'Til skurdør'),(4,66,32,'Til montering af løsholter i skur'),(5,46,2,'Vindskeder på rejsning'),(5,45,2,'Sternbrædder til siderne carport'),(5,45,1,'Sternbrædder til siderne skur'),(5,25,6,'Stolper nedgraves 90 cm i jorden'),(5,20,8,'Spær, monteres på rem '),(5,20,2,'Remme i sider, sadles ned i stolper'),(5,37,6,'Løsholte til skur sider'),(5,38,6,'Løsholte til skur gavle'),(5,35,2,'Vandbræt på vindskeder'),(5,70,3,'Til montering oven på tagfodslægte'),(5,13,1,'til z på bagside af dør'),(5,50,21,'Til montering på spær'),(5,49,2,'Til montering af rygsten'),(5,57,15,'Til montering af spær på rem'),(5,58,15,'Til montering af spær på rem'),(5,64,1,'Til lås på dør i skur'),(5,65,2,'Til skurdør'),(5,66,32,'Til montering af løsholter i skur'),(5,59,1,'Til montering af stern og vandbrædt'),(5,60,3,'Til montering af universalbeslag + hulbånd'),(5,67,2,'Til taglægter'),(5,60,18,'Til montering af rem på stolper'),(5,61,12,'Til montering af rem på stolper'),(5,59,1,'Til montering af stern og vandbrædt'),(5,63,2,'Til montering af inderste beklædning'),(5,75,214,'Monteres på taglægter'),(5,76,15,'Monteres på toplægte'),(5,79,2,'Til montering af tagsten'),(6,1,4,'understernbrædder til for & bagende'),(6,2,4,'understernbrædder til siderne'),(6,7,2,'oversternbrædder til forenden'),(6,8,4,'oversternbrædder til siderne'),(6,20,2,'Remme i sider, sadles ned i stolper'),(6,19,7,'Spær, monteres på rem '),(6,25,4,'Stolper nedgraves 90 cm i jorden'),(6,33,4,'vandbrædt på stern i sider'),(6,31,2,'vandbrædt på stern i forende'),(6,55,3,'Skruer til tagplader'),(6,56,2,'Til vindkryds på spær'),(6,57,15,'Til montering af spær på rem'),(6,58,15,'Til montering af spær på rem'),(6,59,1,'Til montering af stern og vandbrædt'),(6,60,3,'Til montering af universalbeslag + hulbånd'),(6,60,18,'Til montering af rem på stolper'),(6,61,12,'Til montering af rem på stolper'),(6,62,2,'Til montering af yderste beklædning'),(6,63,2,'Til montering af inderste beklædning'),(7,1,4,'understernbrædder til for & bagende'),(7,1,4,'understernbrædder til siderne'),(7,7,2,'oversternbrædder til forenden'),(7,7,4,'oversternbrædder til siderne'),(7,19,2,'Remme i sider, sadles ned i stolper'),(7,19,4,'Spær, monteres på rem '),(7,25,4,'Stolper nedgraves 90 cm i jorden'),(7,31,4,'vandbrædt på stern i sider'),(7,31,2,'vandbrædt på stern i forende'),(7,55,3,'Skruer til tagplader'),(7,56,2,'Til vindkryds på spær'),(7,57,15,'Til montering af spær på rem'),(7,58,15,'Til montering af spær på rem'),(7,59,1,'Til montering af stern og vandbrædt'),(7,60,3,'Til montering af universalbeslag + hulbånd'),(7,60,18,'Til montering af rem på stolper'),(7,61,12,'Til montering af rem på stolper'),(7,62,2,'Til montering af yderste beklædning'),(7,63,2,'Til montering af inderste beklædning'),(8,1,4,'understernbrædder til for & bagende'),(8,1,4,'understernbrædder til siderne'),(8,7,2,'oversternbrædder til forenden'),(8,7,4,'oversternbrædder til siderne'),(8,19,2,'Remme i sider, sadles ned i stolper'),(8,19,4,'Spær, monteres på rem '),(8,25,4,'Stolper nedgraves 90 cm i jorden'),(8,31,4,'vandbrædt på stern i sider'),(8,31,2,'vandbrædt på stern i forende'),(8,55,3,'Skruer til tagplader'),(8,56,2,'Til vindkryds på spær'),(8,57,15,'Til montering af spær på rem'),(8,58,15,'Til montering af spær på rem'),(8,59,1,'Til montering af stern og vandbrædt'),(8,60,3,'Til montering af universalbeslag + hulbånd'),(8,60,18,'Til montering af rem på stolper'),(8,61,12,'Til montering af rem på stolper'),(8,62,2,'Til montering af yderste beklædning'),(8,63,2,'Til montering af inderste beklædning'),(9,1,4,'understernbrædder til for & bagende'),(9,1,4,'understernbrædder til siderne'),(9,7,2,'oversternbrædder til forenden'),(9,7,4,'oversternbrædder til siderne'),(9,19,2,'Remme i sider, sadles ned i stolper'),(9,19,4,'Spær, monteres på rem '),(9,25,4,'Stolper nedgraves 90 cm i jorden'),(9,31,4,'vandbrædt på stern i sider'),(9,31,2,'vandbrædt på stern i forende'),(9,55,3,'Skruer til tagplader'),(9,56,2,'Til vindkryds på spær'),(9,57,15,'Til montering af spær på rem'),(9,58,15,'Til montering af spær på rem'),(9,59,1,'Til montering af stern og vandbrædt'),(9,60,3,'Til montering af universalbeslag + hulbånd'),(9,60,18,'Til montering af rem på stolper'),(9,61,12,'Til montering af rem på stolper'),(9,62,2,'Til montering af yderste beklædning'),(9,63,2,'Til montering af inderste beklædning'),(10,1,4,'understernbrædder til for & bagende'),(10,1,4,'understernbrædder til siderne'),(10,7,2,'oversternbrædder til forenden'),(10,7,4,'oversternbrædder til siderne'),(10,19,2,'Remme i sider, sadles ned i stolper'),(10,19,4,'Spær, monteres på rem '),(10,25,4,'Stolper nedgraves 90 cm i jorden'),(10,31,4,'vandbrædt på stern i sider'),(10,31,2,'vandbrædt på stern i forende'),(10,55,3,'Skruer til tagplader'),(10,56,2,'Til vindkryds på spær'),(10,57,15,'Til montering af spær på rem'),(10,58,15,'Til montering af spær på rem'),(10,59,1,'Til montering af stern og vandbrædt'),(10,60,3,'Til montering af universalbeslag + hulbånd'),(10,60,18,'Til montering af rem på stolper'),(10,61,12,'Til montering af rem på stolper'),(10,62,2,'Til montering af yderste beklædning'),(10,63,2,'Til montering af inderste beklædning'),(11,1,4,'understernbrædder til for & bagende'),(11,1,4,'understernbrædder til siderne'),(11,7,2,'oversternbrædder til forenden'),(11,7,4,'oversternbrædder til siderne'),(11,19,2,'Remme i sider, sadles ned i stolper'),(11,19,4,'Spær, monteres på rem '),(11,25,4,'Stolper nedgraves 90 cm i jorden'),(11,31,4,'vandbrædt på stern i sider'),(11,31,2,'vandbrædt på stern i forende'),(11,55,3,'Skruer til tagplader'),(11,56,2,'Til vindkryds på spær'),(11,57,15,'Til montering af spær på rem'),(11,58,15,'Til montering af spær på rem'),(11,59,1,'Til montering af stern og vandbrædt'),(11,60,3,'Til montering af universalbeslag + hulbånd'),(11,60,18,'Til montering af rem på stolper'),(11,61,12,'Til montering af rem på stolper'),(11,62,2,'Til montering af yderste beklædning'),(11,63,2,'Til montering af inderste beklædning'),(12,1,4,'understernbrædder til for & bagende'),(12,2,4,'understernbrædder til siderne'),(12,7,2,'oversternbrædder til forenden'),(12,8,4,'oversternbrædder til siderne'),(12,13,1,'til z på bagside af dør'),(12,38,6,'Løsholte til skur gavle'),(12,38,6,'Løsholte til skur sider'),(12,19,2,'Remme i sider, sadles ned i stolper'),(12,20,6,'Spær, monteres på rem '),(12,25,4,'Stolper nedgraves 90 cm i jorden'),(12,32,4,'vandbrædt på stern i sider'),(12,32,2,'vandbrædt på stern i forende'),(12,55,3,'Skruer til tagplader'),(12,56,2,'Til vindkryds på spær'),(12,57,15,'Til montering af spær på rem'),(12,58,15,'Til montering af spær på rem'),(12,59,1,'Til montering af stern og vandbrædt'),(12,60,3,'Til montering af universalbeslag + hulbånd'),(12,60,18,'Til montering af rem på stolper'),(12,61,12,'Til montering af rem på stolper'),(12,62,2,'Til montering af yderste beklædning'),(12,63,2,'Til montering af inderste beklædning'),(12,64,1,'Til lås på dør i skur'),(12,65,2,'Til skurdør'),(12,66,32,'Til montering af løsholter i skur'),(13,3,4,'understernbrædder til for & bagende'),(13,4,4,'understernbrædder til siderne'),(13,9,2,'oversternbrædder til forenden'),(13,10,4,'oversternbrædder til siderne'),(13,13,1,'til z på bagside af dør'),(13,38,6,'Løsholte til skur gavle'),(13,38,6,'Løsholte til skur sider'),(13,22,2,'Remme i sider, sadles ned i stolper'),(13,24,13,'Spær, monteres på rem '),(13,25,10,'Stolper nedgraves 90 cm i jorden'),(13,35,4,'vandbrædt på stern i sider'),(13,34,2,'vandbrædt på stern i forende'),(13,55,3,'Skruer til tagplader'),(13,56,2,'Til vindkryds på spær'),(13,57,15,'Til montering af spær på rem'),(13,58,15,'Til montering af spær på rem'),(13,59,1,'Til montering af stern og vandbrædt'),(13,60,3,'Til montering af universalbeslag + hulbånd'),(13,60,18,'Til montering af rem på stolper'),(13,61,12,'Til montering af rem på stolper'),(13,62,2,'Til montering af yderste beklædning'),(13,63,2,'Til montering af inderste beklædning'),(13,64,1,'Til lås på dør i skur'),(13,65,2,'Til skurdør'),(13,66,32,'Til montering af løsholter i skur'),(14,2,4,'understernbrædder til for & bagende'),(14,3,4,'understernbrædder til siderne'),(14,8,2,'oversternbrædder til forenden'),(14,9,4,'oversternbrædder til siderne'),(14,13,1,'til z på bagside af dør'),(14,39,6,'Løsholte til skur gavle'),(14,39,6,'Løsholte til skur sider'),(14,21,2,'Remme i sider, sadles ned i stolper'),(14,21,9,'Spær, monteres på rem '),(14,25,6,'Stolper nedgraves 90 cm i jorden'),(14,34,4,'vandbrædt på stern i sider'),(14,32,2,'vandbrædt på stern i forende'),(14,55,3,'Skruer til tagplader'),(14,56,2,'Til vindkryds på spær'),(14,57,15,'Til montering af spær på rem'),(14,58,15,'Til montering af spær på rem'),(14,59,1,'Til montering af stern og vandbrædt'),(14,60,3,'Til montering af universalbeslag + hulbånd'),(14,60,18,'Til montering af rem på stolper'),(14,61,12,'Til montering af rem på stolper'),(14,62,2,'Til montering af yderste beklædning'),(14,63,2,'Til montering af inderste beklædning'),(14,64,1,'Til lås på dør i skur'),(14,65,2,'Til skurdør'),(14,66,32,'Til montering af løsholter i skur'),(15,2,4,'understernbrædder til for & bagende'),(15,1,4,'understernbrædder til siderne'),(15,8,2,'oversternbrædder til forenden'),(15,7,4,'oversternbrædder til siderne'),(15,19,2,'Remme i sider, sadles ned i stolper'),(15,21,6,'Spær, monteres på rem '),(15,25,4,'Stolper nedgraves 90 cm i jorden'),(15,32,4,'vandbrædt på stern i sider'),(15,33,2,'vandbrædt på stern i forende'),(15,55,3,'Skruer til tagplader'),(15,56,2,'Til vindkryds på spær'),(15,57,15,'Til montering af spær på rem'),(15,58,15,'Til montering af spær på rem'),(15,59,1,'Til montering af stern og vandbrædt'),(15,60,3,'Til montering af universalbeslag + hulbånd'),(15,60,18,'Til montering af rem på stolper'),(15,61,12,'Til montering af rem på stolper'),(15,62,2,'Til montering af yderste beklædning'),(15,63,2,'Til montering af inderste beklædning'),(16,1,4,'understernbrædder til for & bagende'),(16,1,4,'understernbrædder til siderne'),(16,7,2,'oversternbrædder til forenden'),(16,7,4,'oversternbrædder til siderne'),(16,19,2,'Remme i sider, sadles ned i stolper'),(16,19,4,'Spær, monteres på rem '),(16,25,4,'Stolper nedgraves 90 cm i jorden'),(16,31,4,'vandbrædt på stern i sider'),(16,31,2,'vandbrædt på stern i forende'),(16,55,3,'Skruer til tagplader'),(16,56,2,'Til vindkryds på spær'),(16,57,15,'Til montering af spær på rem'),(16,58,15,'Til montering af spær på rem'),(16,59,1,'Til montering af stern og vandbrædt'),(16,60,3,'Til montering af universalbeslag + hulbånd'),(16,60,18,'Til montering af rem på stolper'),(16,61,12,'Til montering af rem på stolper'),(16,62,2,'Til montering af yderste beklædning'),(16,63,2,'Til montering af inderste beklædning'),(17,4,4,'understernbrædder til for & bagende'),(17,4,4,'understernbrædder til siderne'),(17,10,2,'oversternbrædder til forenden'),(17,10,4,'oversternbrædder til siderne'),(17,13,1,'til z på bagside af dør'),(17,38,6,'Løsholte til skur gavle'),(17,37,6,'Løsholte til skur sider'),(17,22,2,'Remme i sider, sadles ned i stolper'),(17,24,12,'Spær, monteres på rem '),(17,35,4,'vandbrædt på stern i sider'),(17,34,2,'vandbrædt på stern i forende'),(17,55,3,'Skruer til tagplader'),(17,56,2,'Til vindkryds på spær'),(17,57,15,'Til montering af spær på rem'),(17,58,15,'Til montering af spær på rem'),(17,59,1,'Til montering af stern og vandbrædt'),(17,60,3,'Til montering af universalbeslag + hulbånd'),(17,60,18,'Til montering af rem på stolper'),(17,61,12,'Til montering af rem på stolper'),(17,62,2,'Til montering af yderste beklædning'),(17,63,2,'Til montering af inderste beklædning'),(17,64,1,'Til lås på dør i skur'),(17,65,2,'Til skurdør'),(17,66,32,'Til montering af løsholter i skur'),(18,3,4,'understernbrædder til for & bagende'),(18,3,4,'understernbrædder til siderne'),(18,9,2,'oversternbrædder til forenden'),(18,9,4,'oversternbrædder til siderne'),(18,20,2,'Remme i sider, sadles ned i stolper'),(18,22,8,'Spær, monteres på rem '),(18,33,4,'vandbrædt på stern i sider'),(18,33,2,'vandbrædt på stern i forende'),(18,55,3,'Skruer til tagplader'),(18,56,2,'Til vindkryds på spær'),(18,57,15,'Til montering af spær på rem'),(18,58,15,'Til montering af spær på rem'),(18,59,1,'Til montering af stern og vandbrædt'),(18,60,3,'Til montering af universalbeslag + hulbånd'),(18,60,18,'Til montering af rem på stolper'),(18,61,12,'Til montering af rem på stolper'),(18,62,2,'Til montering af yderste beklædning'),(18,63,2,'Til montering af inderste beklædning'),(20,1,4,'understernbrædder til for & bagende'),(20,1,4,'understernbrædder til siderne'),(20,7,2,'oversternbrædder til forenden'),(20,7,4,'oversternbrædder til siderne'),(20,19,2,'Remme i sider, sadles ned i stolper'),(20,19,4,'Spær, monteres på rem '),(20,31,4,'vandbrædt på stern i sider'),(20,31,2,'vandbrædt på stern i forende'),(20,55,3,'Skruer til tagplader'),(20,56,2,'Til vindkryds på spær'),(20,57,15,'Til montering af spær på rem'),(20,58,15,'Til montering af spær på rem'),(20,59,1,'Til montering af stern og vandbrædt'),(20,60,3,'Til montering af universalbeslag + hulbånd'),(20,60,18,'Til montering af rem på stolper'),(20,61,12,'Til montering af rem på stolper'),(20,62,2,'Til montering af yderste beklædning'),(20,63,2,'Til montering af inderste beklædning'),(21,1,4,'understernbrædder til for & bagende'),(21,1,4,'understernbrædder til siderne'),(21,7,2,'oversternbrædder til forenden'),(21,7,4,'oversternbrædder til siderne'),(21,19,2,'Remme i sider, sadles ned i stolper'),(21,19,4,'Spær, monteres på rem '),(21,31,4,'vandbrædt på stern i sider'),(21,31,2,'vandbrædt på stern i forende'),(21,55,3,'Skruer til tagplader'),(21,56,2,'Til vindkryds på spær'),(21,57,15,'Til montering af spær på rem'),(21,58,15,'Til montering af spær på rem'),(21,59,1,'Til montering af stern og vandbrædt'),(21,60,3,'Til montering af universalbeslag + hulbånd'),(21,60,18,'Til montering af rem på stolper'),(21,61,12,'Til montering af rem på stolper'),(21,62,2,'Til montering af yderste beklædning'),(21,63,2,'Til montering af inderste beklædning'),(22,1,4,'understernbrædder til for & bagende'),(22,1,4,'understernbrædder til siderne'),(22,7,2,'oversternbrædder til forenden'),(22,7,4,'oversternbrædder til siderne'),(22,19,2,'Remme i sider, sadles ned i stolper'),(22,19,4,'Spær, monteres på rem '),(22,31,4,'vandbrædt på stern i sider'),(22,31,2,'vandbrædt på stern i forende'),(22,55,3,'Skruer til tagplader'),(22,56,2,'Til vindkryds på spær'),(22,57,15,'Til montering af spær på rem'),(22,58,15,'Til montering af spær på rem'),(22,59,1,'Til montering af stern og vandbrædt'),(22,60,3,'Til montering af universalbeslag + hulbånd'),(22,60,18,'Til montering af rem på stolper'),(22,61,12,'Til montering af rem på stolper'),(22,62,2,'Til montering af yderste beklædning'),(22,63,2,'Til montering af inderste beklædning');
/*!40000 ALTER TABLE `bom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carport`
--

DROP TABLE IF EXISTS `carport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carport` (
  `carport_id` int NOT NULL AUTO_INCREMENT,
  `carport_type` varchar(45) NOT NULL,
  `toolshed` tinyint NOT NULL,
  PRIMARY KEY (`carport_id`),
  KEY `fk_toolshed_id_idx` (`toolshed`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carport`
--

LOCK TABLES `carport` WRITE;
/*!40000 ALTER TABLE `carport` DISABLE KEYS */;
INSERT INTO `carport` VALUES (1,'flatroof',0),(2,'flatroof',0),(3,'flatroof',1),(4,'flatroof',1),(5,'raisedroof',1),(6,'flatroof',0),(7,'flatroof',0),(8,'flatroof',0),(9,'flatroof',0),(10,'flatroof',0),(11,'flatroof',0),(12,'flatroof',1),(13,'flatroof',1),(14,'flatroof',1),(15,'flatroof',0),(16,'flatroof',0),(17,'flatroof',1),(18,'flatroof',0),(19,'raisedroof',1),(20,'flatroof',0),(21,'flatroof',0),(22,'flatroof',0);
/*!40000 ALTER TABLE `carport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carport_length`
--

DROP TABLE IF EXISTS `carport_length`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carport_length` (
  `length_id` int NOT NULL AUTO_INCREMENT,
  `length_cm` int NOT NULL,
  PRIMARY KEY (`length_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carport_length`
--

LOCK TABLES `carport_length` WRITE;
/*!40000 ALTER TABLE `carport_length` DISABLE KEYS */;
INSERT INTO `carport_length` VALUES (1,240),(2,270),(3,300),(4,330),(5,360),(6,390),(7,420),(8,450),(9,480),(10,510),(11,540),(12,570),(13,600),(14,630),(15,660),(16,690),(17,720),(18,750),(19,780);
/*!40000 ALTER TABLE `carport_length` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carport_part`
--

DROP TABLE IF EXISTS `carport_part`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carport_part` (
  `carport_part_id` int NOT NULL AUTO_INCREMENT,
  `carport_id` int NOT NULL,
  `material_id` int NOT NULL,
  PRIMARY KEY (`carport_part_id`),
  KEY `fk_carport_id_idx` (`carport_id`),
  KEY `fk_carport_part_id_idx` (`carport_id`),
  KEY `fk_material_id_part_idx` (`material_id`),
  CONSTRAINT `fk_carportt_id` FOREIGN KEY (`carport_id`) REFERENCES `carport` (`carport_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_material_id_part` FOREIGN KEY (`material_id`) REFERENCES `materials` (`material_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=439 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carport_part`
--

LOCK TABLES `carport_part` WRITE;
/*!40000 ALTER TABLE `carport_part` DISABLE KEYS */;
INSERT INTO `carport_part` VALUES (1,1,1),(2,1,1),(3,1,2),(4,1,2),(5,1,4),(6,1,4),(7,1,5),(8,1,6),(9,1,6),(10,1,9),(11,1,10),(12,1,11),(13,1,12),(14,1,13),(15,1,14),(16,1,14),(17,1,15),(18,1,16),(19,1,17),(20,2,1),(21,2,1),(22,2,2),(23,2,2),(24,2,4),(25,2,4),(26,2,5),(27,2,6),(28,2,6),(29,2,9),(30,2,10),(31,2,11),(32,2,12),(33,2,13),(34,2,14),(35,2,14),(36,2,15),(37,2,16),(38,2,17),(39,3,1),(40,3,1),(41,3,2),(42,3,2),(43,3,3),(44,3,7),(45,3,4),(46,3,4),(47,3,5),(48,3,6),(49,3,6),(50,3,9),(51,3,10),(52,3,11),(53,3,12),(54,3,13),(55,3,14),(56,3,14),(57,3,15),(58,3,16),(59,3,17),(60,3,18),(61,3,19),(62,3,20),(63,4,1),(64,4,1),(65,4,2),(66,4,2),(67,4,3),(68,4,7),(69,4,7),(70,4,4),(71,4,4),(72,4,5),(73,4,6),(74,4,6),(75,4,9),(76,4,10),(77,4,11),(78,4,12),(79,4,13),(80,4,14),(81,4,14),(82,4,15),(83,4,16),(84,4,17),(85,4,18),(86,4,19),(87,4,20),(88,5,21),(89,5,21),(90,5,21),(91,5,5),(92,5,4),(93,5,4),(94,5,7),(95,5,7),(96,5,6),(97,5,25),(98,5,3),(99,5,22),(100,5,22),(101,5,11),(102,5,12),(103,5,18),(104,5,19),(105,5,20),(106,5,13),(107,5,14),(108,5,23),(109,5,14),(110,5,15),(111,5,13),(112,5,17),(113,5,26),(114,5,27),(115,5,30),(116,6,1),(117,6,1),(118,6,2),(119,6,2),(120,6,4),(121,6,4),(122,6,5),(123,6,6),(124,6,6),(125,6,9),(126,6,10),(127,6,11),(128,6,12),(129,6,13),(130,6,14),(131,6,14),(132,6,15),(133,6,16),(134,6,17),(135,7,1),(136,7,1),(137,7,2),(138,7,2),(139,7,4),(140,7,4),(141,7,5),(142,7,6),(143,7,6),(144,7,9),(145,7,10),(146,7,11),(147,7,12),(148,7,13),(149,7,14),(150,7,14),(151,7,15),(152,7,16),(153,7,17),(154,8,1),(155,8,1),(156,8,2),(157,8,2),(158,8,4),(159,8,4),(160,8,5),(161,8,6),(162,8,6),(163,8,9),(164,8,10),(165,8,11),(166,8,12),(167,8,13),(168,8,14),(169,8,14),(170,8,15),(171,8,16),(172,8,17),(173,9,1),(174,9,1),(175,9,2),(176,9,2),(177,9,4),(178,9,4),(179,9,5),(180,9,6),(181,9,6),(182,9,9),(183,9,10),(184,9,11),(185,9,12),(186,9,13),(187,9,14),(188,9,14),(189,9,15),(190,9,16),(191,9,17),(192,10,1),(193,10,1),(194,10,2),(195,10,2),(196,10,4),(197,10,4),(198,10,5),(199,10,6),(200,10,6),(201,10,9),(202,10,10),(203,10,11),(204,10,12),(205,10,13),(206,10,14),(207,10,14),(208,10,15),(209,10,16),(210,10,17),(211,11,1),(212,11,1),(213,11,2),(214,11,2),(215,11,4),(216,11,4),(217,11,5),(218,11,6),(219,11,6),(220,11,9),(221,11,10),(222,11,11),(223,11,12),(224,11,13),(225,11,14),(226,11,14),(227,11,15),(228,11,16),(229,11,17),(230,12,1),(231,12,1),(232,12,2),(233,12,2),(234,12,3),(235,12,7),(236,12,7),(237,12,4),(238,12,4),(239,12,5),(240,12,6),(241,12,6),(242,12,9),(243,12,10),(244,12,11),(245,12,12),(246,12,13),(247,12,14),(248,12,14),(249,12,15),(250,12,16),(251,12,17),(252,12,18),(253,12,19),(254,12,20),(255,13,1),(256,13,1),(257,13,2),(258,13,2),(259,13,3),(260,13,7),(261,13,7),(262,13,4),(263,13,4),(264,13,5),(265,13,6),(266,13,6),(267,13,9),(268,13,10),(269,13,11),(270,13,12),(271,13,13),(272,13,14),(273,13,14),(274,13,15),(275,13,16),(276,13,17),(277,13,18),(278,13,19),(279,13,20),(280,14,1),(281,14,1),(282,14,2),(283,14,2),(284,14,3),(285,14,7),(286,14,7),(287,14,4),(288,14,4),(289,14,5),(290,14,6),(291,14,6),(292,14,9),(293,14,10),(294,14,11),(295,14,12),(296,14,13),(297,14,14),(298,14,14),(299,14,15),(300,14,16),(301,14,17),(302,14,18),(303,14,19),(304,14,20),(305,15,1),(306,15,1),(307,15,2),(308,15,2),(309,15,4),(310,15,4),(311,15,5),(312,15,6),(313,15,6),(314,15,9),(315,15,10),(316,15,11),(317,15,12),(318,15,13),(319,15,14),(320,15,14),(321,15,15),(322,15,16),(323,15,17),(324,16,1),(325,16,1),(326,16,2),(327,16,2),(328,16,4),(329,16,4),(330,16,5),(331,16,6),(332,16,6),(333,16,9),(334,16,10),(335,16,11),(336,16,12),(337,16,13),(338,16,14),(339,16,14),(340,16,15),(341,16,16),(342,16,17),(343,17,1),(344,17,1),(345,17,2),(346,17,2),(347,17,3),(348,17,7),(349,17,7),(350,17,4),(351,17,4),(352,17,6),(353,17,6),(354,17,9),(355,17,10),(356,17,11),(357,17,12),(358,17,13),(359,17,14),(360,17,14),(361,17,15),(362,17,16),(363,17,17),(364,17,18),(365,17,19),(366,17,20),(367,18,1),(368,18,1),(369,18,2),(370,18,2),(371,18,4),(372,18,4),(373,18,6),(374,18,6),(375,18,9),(376,18,10),(377,18,11),(378,18,12),(379,18,13),(380,18,14),(381,18,14),(382,18,15),(383,18,16),(384,18,17),(385,20,1),(386,20,1),(387,20,2),(388,20,2),(389,20,4),(390,20,4),(391,20,6),(392,20,6),(393,20,9),(394,20,10),(395,20,11),(396,20,12),(397,20,13),(398,20,14),(399,20,14),(400,20,15),(401,20,16),(402,20,17),(403,21,1),(404,21,1),(405,21,2),(406,21,2),(407,21,4),(408,21,4),(409,21,6),(410,21,6),(411,21,9),(412,21,10),(413,21,11),(414,21,12),(415,21,13),(416,21,14),(417,21,14),(418,21,15),(419,21,16),(420,21,17),(421,22,1),(422,22,1),(423,22,2),(424,22,2),(425,22,4),(426,22,4),(427,22,6),(428,22,6),(429,22,9),(430,22,10),(431,22,11),(432,22,12),(433,22,13),(434,22,14),(435,22,14),(436,22,15),(437,22,16),(438,22,17);
/*!40000 ALTER TABLE `carport_part` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carport_tilt`
--

DROP TABLE IF EXISTS `carport_tilt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carport_tilt` (
  `tilt_id` int NOT NULL AUTO_INCREMENT,
  `tilt_degree` int NOT NULL,
  PRIMARY KEY (`tilt_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carport_tilt`
--

LOCK TABLES `carport_tilt` WRITE;
/*!40000 ALTER TABLE `carport_tilt` DISABLE KEYS */;
INSERT INTO `carport_tilt` VALUES (1,15),(2,20),(3,25),(4,30),(5,35),(6,40),(7,45);
/*!40000 ALTER TABLE `carport_tilt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carport_width`
--

DROP TABLE IF EXISTS `carport_width`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carport_width` (
  `width_id` int NOT NULL AUTO_INCREMENT,
  `width_cm` int NOT NULL,
  PRIMARY KEY (`width_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carport_width`
--

LOCK TABLES `carport_width` WRITE;
/*!40000 ALTER TABLE `carport_width` DISABLE KEYS */;
INSERT INTO `carport_width` VALUES (1,240),(2,270),(3,300),(4,330),(5,360),(6,390),(7,420),(8,450),(9,480),(10,510),(11,540),(12,570),(13,600),(14,630),(15,660),(16,690),(17,720),(18,750);
/*!40000 ALTER TABLE `carport_width` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `material_variants`
--

DROP TABLE IF EXISTS `material_variants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `material_variants` (
  `mv_id` int NOT NULL AUTO_INCREMENT,
  `material_id` int NOT NULL,
  `length` int DEFAULT NULL,
  `price` int DEFAULT NULL,
  PRIMARY KEY (`mv_id`),
  KEY `fk_material_id_idx` (`material_id`),
  CONSTRAINT `fk_material_id` FOREIGN KEY (`material_id`) REFERENCES `materials` (`material_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `material_variants`
--

LOCK TABLES `material_variants` WRITE;
/*!40000 ALTER TABLE `material_variants` DISABLE KEYS */;
INSERT INTO `material_variants` VALUES (1,1,240,10),(2,1,330,20),(3,1,420,30),(4,1,510,40),(5,1,600,50),(6,1,690,60),(7,2,240,10),(8,2,330,20),(9,2,420,30),(10,2,510,40),(11,2,600,50),(12,2,690,60),(13,3,240,10),(14,3,330,20),(15,3,420,30),(16,3,510,40),(17,3,600,50),(18,3,690,60),(19,4,300,10),(20,4,390,20),(21,4,480,30),(22,4,570,40),(23,4,660,50),(24,4,750,60),(25,5,200,20),(31,6,180,10),(32,6,270,20),(33,6,360,30),(34,6,450,40),(35,6,540,50),(36,6,630,60),(37,7,180,10),(38,7,270,20),(39,7,360,30),(40,7,450,40),(41,7,540,50),(42,7,630,60),(43,21,270,10),(44,21,360,20),(45,21,450,30),(46,21,540,40),(47,21,630,50),(48,21,720,60),(49,22,270,10),(50,22,360,20),(51,22,450,30),(52,22,540,40),(53,22,630,50),(54,22,720,60),(55,9,1,50),(56,10,NULL,50),(57,11,NULL,50),(58,12,NULL,50),(59,13,NULL,50),(60,14,NULL,50),(61,15,NULL,50),(62,16,NULL,50),(63,17,NULL,50),(64,18,NULL,50),(65,19,NULL,NULL),(66,20,NULL,NULL),(67,23,NULL,50),(68,24,NULL,200),(69,25,270,10),(70,25,360,20),(71,25,450,30),(72,25,540,40),(73,25,630,50),(74,25,720,60),(75,26,NULL,20),(76,27,NULL,20),(77,28,NULL,20),(78,29,NULL,20),(79,30,NULL,20);
/*!40000 ALTER TABLE `material_variants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materials`
--

DROP TABLE IF EXISTS `materials`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materials` (
  `material_id` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `dimension` varchar(45) DEFAULT NULL,
  `unit` varchar(45) NOT NULL,
  PRIMARY KEY (`material_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materials`
--

LOCK TABLES `materials` WRITE;
/*!40000 ALTER TABLE `materials` DISABLE KEYS */;
INSERT INTO `materials` VALUES (1,'trykimp. brædt','25x200','pcs'),(2,'trykimp. brædt','25x125','pcs'),(3,'lægte ubh.','38x73','pcs'),(4,'spærtræ ubh.','45x195','pcs'),(5,'trykimp. stolpe','97x97','pcs'),(6,'trykimp. brædt','19x100','pcs'),(7,'reglar ub.','45x95','pcs'),(8,'plastmo ecolite blåtonet','10x1500','pcs'),(9,'plastmo bundstykker 200 stk.','5x50','pkg'),(10,'hulbånd','1x20','roll'),(11,'universal','190x10','pcs'),(12,'skruer 200 stk.','5x60','pkg'),(13,'beslagskruer 250 stk.','4x50','pkg'),(14,'bræddebolt','10x120','pcs'),(15,'firkantskiver','40x40x11','pcs'),(16,'skruer 400 stk.','5x80','pkg'),(17,'skruer 300 stk','5x50','pkg'),(18,'stalddørsgreb','50x75','set'),(19,'t hængesel','390','pcs'),(20,'vinkelbeslag ','35','pcs'),(21,'trykimp. brædt','25x150','pcs'),(22,'taglægter T1','38x73','pcs'),(23,'skruer 100 stk.','5x100','pkg'),(24,'færdigskåret (byg-selv spær)',NULL,'set'),(25,'trykimp. brædt','25x50','pcs'),(26,'B & C Dobbelt -s sort',NULL,'pcs'),(27,'B & C rygsten sort',NULL,'pcs'),(28,'B & C toplægte holder',NULL,'pcs'),(29,'B & C rygstenbeslag','','pcs'),(30,'B & C tagstens bindere og nakkekroge',NULL,'pkg');
/*!40000 ALTER TABLE `materials` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  `carport_id` int NOT NULL,
  `dato` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `carport_length_id` int NOT NULL,
  `carport_width_id` int NOT NULL,
  `carport_tilt_id` int DEFAULT NULL,
  `carport_rooftype_id` int NOT NULL,
  `toolshed_length_id` int DEFAULT NULL,
  `toolshed_width_id` int DEFAULT NULL,
  `is_authorized` tinyint DEFAULT '0',
  `is_bought` tinyint DEFAULT '0',
  PRIMARY KEY (`order_id`),
  KEY `fk_carport_id_idx` (`carport_id`),
  KEY `fk_user_id_idx` (`user_id`),
  KEY `fk_carport_length_id_idx` (`carport_length_id`),
  KEY `fk_carport_width_id_idx` (`carport_width_id`),
  KEY `fk_carpot_tilt_id_idx` (`carport_tilt_id`),
  KEY `fk_carport_rooftype_id_idx` (`carport_rooftype_id`),
  KEY `fk_toolshed_length_id_idx` (`toolshed_length_id`),
  KEY `fk_toolshed_width_id_idx` (`toolshed_width_id`),
  CONSTRAINT `fk_carport_id` FOREIGN KEY (`carport_id`) REFERENCES `carport` (`carport_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_carport_length_id` FOREIGN KEY (`carport_length_id`) REFERENCES `carport_length` (`length_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_carport_rooftype_id` FOREIGN KEY (`carport_rooftype_id`) REFERENCES `rooftype` (`rooftype_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_carport_width_id` FOREIGN KEY (`carport_width_id`) REFERENCES `carport_width` (`width_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_carpot_tilt_id` FOREIGN KEY (`carport_tilt_id`) REFERENCES `carport_tilt` (`tilt_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_toolshed_length_id` FOREIGN KEY (`toolshed_length_id`) REFERENCES `toolshed_length` (`toolshed_length_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_toolshed_width_id` FOREIGN KEY (`toolshed_width_id`) REFERENCES `toolshed_width` (`toolshed_width_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,2,1,'2020-05-16 10:38:25',1,1,NULL,16,NULL,NULL,1,0),(2,3,2,'2020-05-16 16:51:45',14,14,NULL,16,NULL,NULL,1,1),(3,3,3,'2020-05-16 16:54:33',17,18,NULL,16,19,12,1,1),(4,3,4,'2020-05-16 16:54:52',1,1,NULL,16,1,1,1,1),(5,4,5,'2020-05-16 19:45:38',9,6,6,4,2,1,1,1),(6,5,6,'2020-05-17 11:02:13',7,1,NULL,16,NULL,NULL,0,0),(7,3,7,'2020-05-17 11:15:00',1,1,NULL,16,NULL,NULL,1,1),(8,3,8,'2020-05-17 11:19:45',1,1,NULL,16,NULL,NULL,1,1),(9,3,9,'2020-05-17 11:21:24',1,1,NULL,16,NULL,NULL,1,1),(10,7,10,'2020-05-17 11:30:30',1,1,NULL,16,NULL,NULL,0,0),(11,9,11,'2020-05-17 11:42:24',1,1,NULL,16,NULL,NULL,1,1),(12,9,12,'2020-05-18 08:03:21',5,5,NULL,16,3,1,1,1),(13,2,13,'2020-05-18 19:51:47',17,16,NULL,16,3,2,1,1),(14,4,14,'2020-05-19 10:10:01',11,8,NULL,16,6,4,1,0),(15,4,15,'2020-05-19 10:10:38',4,9,NULL,16,NULL,NULL,0,0),(16,10,16,'2020-05-19 10:32:40',1,1,NULL,16,NULL,NULL,1,0),(17,2,17,'2020-05-19 15:31:07',16,17,NULL,16,1,1,0,0),(18,4,18,'2020-05-20 19:22:40',9,12,NULL,16,NULL,NULL,0,0),(20,9,20,'2020-05-23 12:50:08',1,1,NULL,16,NULL,NULL,0,0),(21,9,21,'2020-05-23 13:03:14',1,1,NULL,16,NULL,NULL,0,0),(22,9,22,'2020-05-24 12:22:55',1,1,NULL,16,NULL,NULL,0,0);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rooftype`
--

DROP TABLE IF EXISTS `rooftype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rooftype` (
  `rooftype_id` int NOT NULL AUTO_INCREMENT,
  `rooftype_name` varchar(45) NOT NULL,
  `carport_type` varchar(45) NOT NULL,
  PRIMARY KEY (`rooftype_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rooftype`
--

LOCK TABLES `rooftype` WRITE;
/*!40000 ALTER TABLE `rooftype` DISABLE KEYS */;
INSERT INTO `rooftype` VALUES (1,'betontagsten - rød','raised'),(2,'betontagsten - teglrød','raised'),(3,'betontagsten - brun','raised'),(4,'betontagsten - sort','raised'),(5,'eternittag b6 - grå','raised'),(6,'eternittag b6 - sort','raised'),(7,'eternittag b6 - mokka(brun)','raised'),(8,'eternittag b6 - rødbrun','raised'),(9,'eternittag b6 - teglrød','raised'),(10,'eternittag b7 - grå','raised'),(11,'eternittag b7 - sort','raised'),(12,'eternittag b7 - mokka(brun)','raised'),(13,'eternittag b7 - rødbrun','raised'),(14,'eternittag b7 - teglrød','raised'),(15,'eternittag b7 - rødflammet','raised'),(16,'plasttrapezplader','flat'),(17,'metaltrapezplader','flat');
/*!40000 ALTER TABLE `rooftype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `toolshed_length`
--

DROP TABLE IF EXISTS `toolshed_length`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `toolshed_length` (
  `toolshed_length_id` int NOT NULL,
  `toolshed_length_cm` int NOT NULL,
  PRIMARY KEY (`toolshed_length_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `toolshed_length`
--

LOCK TABLES `toolshed_length` WRITE;
/*!40000 ALTER TABLE `toolshed_length` DISABLE KEYS */;
INSERT INTO `toolshed_length` VALUES (1,150),(2,180),(3,210),(4,240),(5,270),(6,300),(7,330),(8,360),(9,390),(10,420),(11,450),(12,480),(13,510),(14,540),(15,570),(16,600),(17,630),(18,660),(19,690);
/*!40000 ALTER TABLE `toolshed_length` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `toolshed_width`
--

DROP TABLE IF EXISTS `toolshed_width`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `toolshed_width` (
  `toolshed_width_id` int NOT NULL AUTO_INCREMENT,
  `toolshed_width_cm` int NOT NULL,
  PRIMARY KEY (`toolshed_width_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `toolshed_width`
--

LOCK TABLES `toolshed_width` WRITE;
/*!40000 ALTER TABLE `toolshed_width` DISABLE KEYS */;
INSERT INTO `toolshed_width` VALUES (1,210),(2,240),(3,270),(4,300),(5,330),(6,360),(7,390),(8,420),(9,450),(10,480),(11,510),(12,540),(13,570),(14,600),(15,630),(16,660),(17,690),(18,720);
/*!40000 ALTER TABLE `toolshed_width` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `adress` varchar(45) NOT NULL,
  `phonenumber` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `role` varchar(45) NOT NULL DEFAULT 'customer',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','admin','admin','admin@admin.dk','admin','admin','employee'),(2,'Christoffer ','Slangerupgade 2','28939704','test@test.dk','1234','Hillerød','customer'),(3,'lukas','yallavej','42334455','lukas@gmail.com','1234','yallaby','customer'),(4,'amanda','beatevej','33333333','amanda@gmail.com','1234','valby','customer'),(5,'Phillip Andersen','Tornehegnet 7','42913009','phillip_andersen@hotmail.com','Taastrup','1234','customer'),(6,'sss','ssss','sss','phillip_andersen@hotmail.com2','1234','ssss','customer'),(7,'ssss','ssss','sss','phillip_andersen@hotmail.com3','1234','sss','customer'),(8,'sss','ssss','sss','phillip_andersen@hotmail.com4','1234','sss','customer'),(9,'2222','2222','222','phillip_andersen@hotmail.com5','1234','222','customer'),(10,'Christoffer','1234','12341234','1234@1234.com','1234','1234','customer');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-27 13:43:15
