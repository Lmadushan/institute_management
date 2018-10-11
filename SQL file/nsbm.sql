-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 21, 2018 at 07:19 PM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nsbm`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('admin', '1234'),
('lahiru', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `cashiers`
--

CREATE TABLE `cashiers` (
  `name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cashiers`
--

INSERT INTO `cashiers` (`name`, `password`) VALUES
('cash', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `C_id` varchar(20) NOT NULL,
  `C_name` varchar(50) NOT NULL,
  `C_faculty` varchar(50) NOT NULL,
  `C_credit` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `enrollment`
--

CREATE TABLE `enrollment` (
  `E_id` varchar(20) NOT NULL,
  `E_s1` varchar(20) NOT NULL,
  `E_s2` varchar(20) NOT NULL,
  `E_s3` varchar(20) NOT NULL,
  `E_s4` varchar(20) NOT NULL,
  `E_s5` varchar(20) NOT NULL,
  `E_s6` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `enrollment2`
--

CREATE TABLE `enrollment2` (
  `E2_id` varchar(20) NOT NULL,
  `E2_s1` varchar(11) NOT NULL,
  `E2_s2` varchar(11) NOT NULL,
  `E2_s3` varchar(11) NOT NULL,
  `E2_s4` varchar(11) NOT NULL,
  `E2_s5` varchar(11) NOT NULL,
  `E2_s6` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `instructors`
--

CREATE TABLE `instructors` (
  `INS_id` varchar(20) NOT NULL,
  `INS_name` varchar(20) NOT NULL,
  `INS_email` varchar(50) NOT NULL,
  `INS_subject` varchar(20) NOT NULL,
  `INS_lab` varchar(20) NOT NULL,
  `INS_faculty` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `payments`
--

CREATE TABLE `payments` (
  `PAY_stdid` varchar(20) NOT NULL,
  `PAYMENT` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `postgradstd`
--

CREATE TABLE `postgradstd` (
  `PG_index` varchar(20) NOT NULL,
  `PG_name` varchar(50) NOT NULL,
  `PG_nic` varchar(50) NOT NULL,
  `PG_addres` varchar(50) NOT NULL,
  `PG_email` varchar(50) NOT NULL,
  `PG_phone` varchar(20) NOT NULL,
  `PG_dob` varchar(20) NOT NULL,
  `PG_degree` varchar(50) NOT NULL,
  `PG_institute` varchar(50) NOT NULL,
  `PG_Years` varchar(5) NOT NULL,
  `PG_faculty` varchar(50) NOT NULL,
  `PG_acayear` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `postgradstd`
--

INSERT INTO `postgradstd` (`PG_index`, `PG_name`, `PG_nic`, `PG_addres`, `PG_email`, `PG_phone`, `PG_dob`, `PG_degree`, `PG_institute`, `PG_Years`, `PG_faculty`, `PG_acayear`) VALUES
('PG/CS/0001', 'Lahiru Madushan', '961411840V', 'lahiru.mirihagoda@gmail.com', '232/A/1,Indigolla,Pasyala.', '0770095174', '1996/05/20', 'Bsc-CS', 'UCSC', '3', 'SOC', '2016/2017'),
('PG/CS/0002', 'Kamal Madushan', '951411835V', 'kamal.madushan@gmail.com', '232/A/1,Indigolla,Pasyala.', '0770095175', '1995/05/20', 'Bsc-CS', 'UCSC', '3', 'SOC', '2016/2017');

-- --------------------------------------------------------

--
-- Table structure for table `results`
--

CREATE TABLE `results` (
  `RES_id` varchar(20) NOT NULL,
  `RES_s1` varchar(20) NOT NULL,
  `RES_s1s` varchar(20) NOT NULL,
  `RES_s2` varchar(20) NOT NULL,
  `RES_s2s` varchar(20) NOT NULL,
  `RES_s3` varchar(20) NOT NULL,
  `RES_s3s` varchar(20) NOT NULL,
  `RES_s4` varchar(20) NOT NULL,
  `RES_s4s` varchar(20) NOT NULL,
  `RES_s5` varchar(20) NOT NULL,
  `RES_s5s` varchar(20) NOT NULL,
  `RES_s6` varchar(20) NOT NULL,
  `RES_s6s` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `results`
--

INSERT INTO `results` (`RES_id`, `RES_s1`, `RES_s1s`, `RES_s2`, `RES_s2s`, `RES_s3`, `RES_s3s`, `RES_s4`, `RES_s4s`, `RES_s5`, `RES_s5s`, `RES_s6`, `RES_s6s`) VALUES
('PG/CS/0001', 'A', 'SCS1001', 'A', 'SCS1002', 'A', 'SCS1003', 'A', 'SCS1004', 'A', 'SCS1005', 'A', 'SCS1006');

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `SU_code` varchar(20) NOT NULL,
  `SU_name` varchar(50) NOT NULL,
  `SU_teacher` varchar(20) NOT NULL,
  `SU_fees` varchar(20) NOT NULL,
  `SU_credit` varchar(20) NOT NULL,
  `SU_semester` varchar(20) NOT NULL,
  `SU_course` varchar(20) NOT NULL,
  `SU_location` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `teachers`
--

CREATE TABLE `teachers` (
  `T_id` varchar(20) NOT NULL,
  `T_name` varchar(20) NOT NULL,
  `T_nic` varchar(20) NOT NULL,
  `T_email` varchar(20) NOT NULL,
  `T_addres` varchar(20) NOT NULL,
  `T_phone` varchar(20) NOT NULL,
  `T_faculty` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `undergradstd`
--

CREATE TABLE `undergradstd` (
  `UG_index` varchar(20) NOT NULL,
  `UG_name` varchar(50) NOT NULL,
  `UG_nic` varchar(20) NOT NULL,
  `UG_email` varchar(50) NOT NULL,
  `UG_addres` varchar(60) NOT NULL,
  `UG_phone` varchar(20) NOT NULL,
  `UG_dob` varchar(20) NOT NULL,
  `ALresultS1` varchar(3) NOT NULL,
  `ALresultS2` varchar(3) NOT NULL,
  `ALresultS3` varchar(3) NOT NULL,
  `ALrank` varchar(20) NOT NULL,
  `UG_faculty` varchar(20) NOT NULL,
  `UG_acaYear` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergradstd`
--

INSERT INTO `undergradstd` (`UG_index`, `UG_name`, `UG_nic`, `UG_email`, `UG_addres`, `UG_phone`, `UG_dob`, `ALresultS1`, `ALresultS2`, `ALresultS3`, `ALrank`, `UG_faculty`, `UG_acaYear`) VALUES
('UG/CS/0001', 'Saman Mendis', '961234561V', 'saman.mendis@yahoo.com', '32/A,kandy.', '0333065980', '1996/02/28', 'A', 'B', 'A', '123', 'SOC', '2015/2016');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `cashiers`
--
ALTER TABLE `cashiers`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`C_id`);

--
-- Indexes for table `enrollment`
--
ALTER TABLE `enrollment`
  ADD PRIMARY KEY (`E_id`);

--
-- Indexes for table `enrollment2`
--
ALTER TABLE `enrollment2`
  ADD PRIMARY KEY (`E2_id`);

--
-- Indexes for table `instructors`
--
ALTER TABLE `instructors`
  ADD PRIMARY KEY (`INS_id`);

--
-- Indexes for table `payments`
--
ALTER TABLE `payments`
  ADD PRIMARY KEY (`PAY_stdid`);

--
-- Indexes for table `postgradstd`
--
ALTER TABLE `postgradstd`
  ADD PRIMARY KEY (`PG_index`);

--
-- Indexes for table `results`
--
ALTER TABLE `results`
  ADD PRIMARY KEY (`RES_id`);

--
-- Indexes for table `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`SU_code`);

--
-- Indexes for table `teachers`
--
ALTER TABLE `teachers`
  ADD PRIMARY KEY (`T_id`);

--
-- Indexes for table `undergradstd`
--
ALTER TABLE `undergradstd`
  ADD PRIMARY KEY (`UG_index`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
