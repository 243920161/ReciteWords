-- MySQL dump 10.13  Distrib 5.7.19, for Linux (x86_64)
--
-- Host: localhost    Database: ReciteWords
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `exam`
--

DROP TABLE IF EXISTS `exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exam` (
  `exam_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '考试id',
  `name` varchar(255) DEFAULT NULL COMMENT '考试名称',
  `positive` int(11) DEFAULT NULL COMMENT '正确数量',
  `negative` int(11) DEFAULT NULL COMMENT '错误数量',
  `altogether` int(11) DEFAULT NULL COMMENT '总数量',
  `rate` float DEFAULT NULL COMMENT '正确率',
  `time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '考试时间',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`exam_id`),
  KEY `fk_exam_user_id` (`user_id`),
  CONSTRAINT `fk_exam_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam`
--

LOCK TABLES `exam` WRITE;
/*!40000 ALTER TABLE `exam` DISABLE KEYS */;
/*!40000 ALTER TABLE `exam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam_detail`
--

DROP TABLE IF EXISTS `exam_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exam_detail` (
  `exam_detail_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '考试详情id',
  `english` varchar(255) DEFAULT NULL COMMENT '英文',
  `chinese` varchar(255) DEFAULT NULL COMMENT '中文',
  `user_english` varchar(255) DEFAULT NULL COMMENT '用户英文',
  `user_chinese` varchar(255) DEFAULT NULL COMMENT '用户中文',
  `result` varchar(255) DEFAULT NULL COMMENT '结果：正确 or 错误',
  `correct` varchar(255) DEFAULT NULL COMMENT '正确答案',
  `type` varchar(255) DEFAULT NULL COMMENT '考试类型：中文 or 英文',
  `exam_id` int(11) DEFAULT NULL COMMENT '考试id',
  PRIMARY KEY (`exam_detail_id`),
  KEY `fk_exam_id` (`exam_id`),
  CONSTRAINT `fk_exam_id` FOREIGN KEY (`exam_id`) REFERENCES `exam` (`exam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam_detail`
--

LOCK TABLES `exam_detail` WRITE;
/*!40000 ALTER TABLE `exam_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `exam_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login_log`
--

DROP TABLE IF EXISTS `login_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login_log` (
  `login_log_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '登录日志id',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `ip` varchar(15) DEFAULT NULL COMMENT 'ip',
  `address` varchar(15) DEFAULT NULL COMMENT '登录地址',
  `time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '登录时间',
  PRIMARY KEY (`login_log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login_log`
--

LOCK TABLES `login_log` WRITE;
/*!40000 ALTER TABLE `login_log` DISABLE KEYS */;
/*!40000 ALTER TABLE `login_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','123456',NULL,'2019-03-06 11:32:29');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `word`
--

DROP TABLE IF EXISTS `word`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `word` (
  `word_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '单词id',
  `english` varchar(255) DEFAULT NULL COMMENT '英文',
  `chinese` varchar(255) DEFAULT NULL COMMENT '中文',
  `word_book_id` int(11) DEFAULT NULL COMMENT '单词本id',
  PRIMARY KEY (`word_id`),
  KEY `fk_word_book_id` (`word_book_id`),
  CONSTRAINT `fk_word_book_id` FOREIGN KEY (`word_book_id`) REFERENCES `word_book` (`word_book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `word`
--

LOCK TABLES `word` WRITE;
/*!40000 ALTER TABLE `word` DISABLE KEYS */;
/*!40000 ALTER TABLE `word` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `word_book`
--

DROP TABLE IF EXISTS `word_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `word_book` (
  `word_book_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '单词本id',
  `name` varchar(255) DEFAULT NULL COMMENT '单词本名称',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`word_book_id`),
  KEY `fk_word_book_user_id` (`user_id`),
  CONSTRAINT `fk_word_book_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `word_book`
--

LOCK TABLES `word_book` WRITE;
/*!40000 ALTER TABLE `word_book` DISABLE KEYS */;
/*!40000 ALTER TABLE `word_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wrong`
--

DROP TABLE IF EXISTS `wrong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wrong` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '错题id',
  `english` varchar(255) DEFAULT NULL COMMENT '英文',
  `chinese` varchar(255) DEFAULT NULL COMMENT '中文',
  `wrong_book_id` int(11) DEFAULT NULL COMMENT '错题本id',
  PRIMARY KEY (`id`),
  KEY `fk_wrong_book_id` (`wrong_book_id`),
  CONSTRAINT `fk_wrong_book_id` FOREIGN KEY (`wrong_book_id`) REFERENCES `wrong_book` (`wrong_book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wrong`
--

LOCK TABLES `wrong` WRITE;
/*!40000 ALTER TABLE `wrong` DISABLE KEYS */;
/*!40000 ALTER TABLE `wrong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wrong_book`
--

DROP TABLE IF EXISTS `wrong_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wrong_book` (
  `wrong_book_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '错题本id',
  `name` varchar(255) DEFAULT NULL COMMENT '错题本名称',
  `time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '时间',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`wrong_book_id`),
  KEY `fk_wrong_book_user_id` (`user_id`),
  CONSTRAINT `fk_wrong_book_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wrong_book`
--

LOCK TABLES `wrong_book` WRITE;
/*!40000 ALTER TABLE `wrong_book` DISABLE KEYS */;
/*!40000 ALTER TABLE `wrong_book` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-12 16:49:39
