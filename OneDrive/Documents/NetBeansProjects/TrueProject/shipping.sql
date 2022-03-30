-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 30, 2022 at 07:38 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shipping`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `ID` varchar(256) NOT NULL,
  `Password` varchar(256) NOT NULL,
  `name` varchar(256) NOT NULL,
  `mail` varchar(256) NOT NULL,
  `age` int(255) NOT NULL,
  `address` varchar(256) NOT NULL,
  `check` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`ID`, `Password`, `name`, `mail`, `age`, `address`, `check`) VALUES
('Admin', '1234', 'Thanarat Kaenchan', 'england.thanarat@gmail.com', 19, '20 M.7 \r\nlak hok\r\nmuang pathumthani\r\npathumthani', 'Admin'),
('emmer', '1234', 'Eng', 'Thanarat.k64@rsu.ac.th', 20, 'rangsit U.', 'Employee'),
('Nieb', '1234', 'Nieb', 'Anupat.k64@rsu.ac.th', 18, 'Ayutthaya', 'Employee');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `ID_track` varchar(256) NOT NULL,
  `Name` varchar(256) NOT NULL,
  `Surname` varchar(256) NOT NULL,
  `address` varchar(256) NOT NULL,
  `destination` varchar(256) NOT NULL,
  `ParcelType` varchar(256) NOT NULL,
  `cost` int(255) NOT NULL,
  `Status` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`ID_track`, `Name`, `Surname`, `address`, `destination`, `ParcelType`, `cost`, `Status`) VALUES
('3043750', 'Nieb', 'Anupat', 'Rangsit', 'Ayutthaya', 'Flower', 160, 'receive'),
('7335346', 'Eng', 'Kaenchan', 'Chonburi', 'Bangkok', 'Bag', 120, 'receive'),
('9251551', 'Min', 'Pornnarin', 'Nonthaburi', 'Bangkok', 'Shirt', 83, 'receive parcels');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`ID_track`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
