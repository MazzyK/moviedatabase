-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Aug 18, 2022 at 09:39 AM
-- Server version: 8.0.27
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `moviedatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
CREATE TABLE IF NOT EXISTS `movie` (
  `movieID` int NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `description` longtext,
  `date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `likes` int DEFAULT NULL,
  `hates` int DEFAULT NULL,
  PRIMARY KEY (`movieID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `movie`
--

INSERT INTO `movie` (`movieID`, `title`, `description`, `date`, `likes`, `hates`) VALUES
(1, 'Silent Runnning', 'In a future where all flora is extinct on Earth, an astronaut is given orders to destroy the last of Earth\'s botany, kept in a greenhouse aboard a spacecraft.', '1972-03-09 22:00:00', 5, 2),
(3, 'The Master', 'A Naval veteran arrives home from war unsettled and uncertain of his future - until he is tantalized by the Cause and its charismatic leader.', '2012-12-05 22:00:00', 10, 5),
(4, 'Contact', 'Dr. Ellie Arroway, after years of searching, finds conclusive radio proof of extraterrestrial intelligence, sending plans for a mysterious machine.', '2022-08-13 11:27:11', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `moviereaction`
--

DROP TABLE IF EXISTS `moviereaction`;
CREATE TABLE IF NOT EXISTS `moviereaction` (
  `movieID` int NOT NULL,
  `userID` int NOT NULL,
  `reaction` enum('like','hate') NOT NULL,
  `reactTimestamp` timestamp(6) NOT NULL,
  `react_timestamp` date DEFAULT NULL,
  PRIMARY KEY (`movieID`,`userID`),
  KEY `movieID` (`movieID`),
  KEY `userID` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `moviereaction`
--

INSERT INTO `moviereaction` (`movieID`, `userID`, `reaction`, `reactTimestamp`, `react_timestamp`) VALUES
(1, 1, 'like', '0000-00-00 00:00:00.000000', NULL),
(1, 3, 'like', '0000-00-00 00:00:00.000000', NULL),
(4, 1, 'like', '0000-00-00 00:00:00.000000', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `userID` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(65) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `email` varchar(80) NOT NULL,
  `role` varchar(45) NOT NULL,
  `enabled` tinyint NOT NULL,
  PRIMARY KEY (`userID`),
  UNIQUE KEY `nickname_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userID`, `username`, `password`, `email`, `role`, `enabled`) VALUES
(1, 'NyotaUhura', '$2a$12$M5pcaEe7nz1j9QSHkHmUtutQcBZ342GM32wj4rXf2S9su8TNS8J1S', 'uhura@st.com', 'ROLE_USER', 1),
(3, 'JLPicard', '$2a$12$353ihDg1Sh6tlDKL/mxXHeCJEw.alioe035RrsJisZNmK6vVPwsqq', 'jpl@ufp.com', 'ROLE_ADMIN', 1),
(4, 'maz', '$2a$12$XMRlBV3dZYNCyxfJ51qLr.diZGHfjOT8vs9gVwVbz8P0JZjQFmILa', 'mkoutsikou@gmail.com', 'ROLE_USER', 1);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `moviereaction`
--
ALTER TABLE `moviereaction`
  ADD CONSTRAINT `moviereaction_ibfk_1` FOREIGN KEY (`movieID`) REFERENCES `movie` (`movieID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `moviereaction_ibfk_2` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
