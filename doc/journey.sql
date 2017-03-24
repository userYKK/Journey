/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : journey

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2017-03-23 20:30:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `cmpid` varchar(50) NOT NULL,
  `cmpname` varchar(50) DEFAULT NULL,
  `cmpurl` varchar(255) DEFAULT NULL,
  `cmpaddress` varchar(255) DEFAULT NULL,
  `cmpinfo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cmpid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for img
-- ----------------------------
DROP TABLE IF EXISTS `img`;
CREATE TABLE `img` (
  `imgid` varchar(50) NOT NULL,
  `noteid` varchar(50) DEFAULT NULL,
  `imgname` varchar(100) DEFAULT NULL,
  `imgurl` varchar(255) DEFAULT NULL,
  `imgcontent` blob,
  `imginfo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`imgid`),
  KEY `fk_img_note` (`noteid`),
  CONSTRAINT `fk_img_note` FOREIGN KEY (`noteid`) REFERENCES `note` (`noteid`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for model
-- ----------------------------
DROP TABLE IF EXISTS `model`;
CREATE TABLE `model` (
  `modid` varchar(50) NOT NULL,
  `modname` varchar(100) DEFAULT NULL,
  `modinfo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`modid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for note
-- ----------------------------
DROP TABLE IF EXISTS `note`;
CREATE TABLE `note` (
  `noteid` varchar(50) NOT NULL,
  `tyid` varchar(50) DEFAULT NULL,
  `projid` varchar(50) DEFAULT NULL,
  `modid` varchar(50) DEFAULT NULL,
  `notecontent` varchar(255) DEFAULT NULL,
  `tagid` int(11) DEFAULT NULL,
  `notetime` int(11) DEFAULT NULL,
  `notestate` int(11) DEFAULT NULL,
  `noteinfo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`noteid`),
  KEY `fk_note_type` (`tyid`),
  KEY `fk_note_project` (`projid`),
  KEY `fk_note_model` (`modid`),
  CONSTRAINT `fk_note_model` FOREIGN KEY (`modid`) REFERENCES `model` (`modid`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_note_project` FOREIGN KEY (`projid`) REFERENCES `project` (`projid`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_note_type` FOREIGN KEY (`tyid`) REFERENCES `type` (`tyid`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `projid` varchar(50) NOT NULL,
  `cmpid` varchar(50) DEFAULT NULL,
  `projname` varchar(100) DEFAULT NULL,
  `projbegin` int(6) DEFAULT NULL,
  `projend` int(6) DEFAULT NULL,
  `projcontext` varchar(255) DEFAULT NULL,
  `projinfo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`projid`),
  KEY `fk_project_company` (`cmpid`),
  CONSTRAINT `fk_project_company` FOREIGN KEY (`cmpid`) REFERENCES `company` (`cmpid`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag` (
  `tagid` varchar(50) NOT NULL,
  `tyid` varchar(50) DEFAULT NULL,
  `tagname` varchar(100) DEFAULT NULL,
  `notenum` int(11) DEFAULT NULL,
  `taginfo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`tagid`),
  KEY `fk_tag_type` (`tyid`),
  CONSTRAINT `fk_tag_type` FOREIGN KEY (`tyid`) REFERENCES `type` (`tyid`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `tyid` varchar(50) NOT NULL,
  `tyname` varchar(100) DEFAULT NULL,
  `typid` varchar(50) DEFAULT NULL,
  `tyinfo` varchar(255) DEFAULT NULL,
  `iconcls` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`tyid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for url
-- ----------------------------
DROP TABLE IF EXISTS `url`;
CREATE TABLE `url` (
  `urlid` varchar(50) NOT NULL,
  `noteid` varchar(50) DEFAULT NULL,
  `urlcontent` varchar(255) DEFAULT NULL,
  `urlpath` varchar(255) DEFAULT NULL,
  `filecontent` blob,
  `fileok` int(11) DEFAULT NULL,
  `urlinfo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`urlid`),
  KEY `fk_url_note` (`noteid`),
  CONSTRAINT `fk_url_note` FOREIGN KEY (`noteid`) REFERENCES `note` (`noteid`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
