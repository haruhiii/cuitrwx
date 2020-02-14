/*
Navicat MySQL Data Transfer

Source Server         : kodey
Source Server Version : 50045
Source Host           : localhost:3306
Source Database       : cuitrwx

Target Server Type    : MYSQL
Target Server Version : 50045
File Encoding         : 65001

Date: 2020-02-14 18:34:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for appointment
-- ----------------------------
DROP TABLE IF EXISTS `appointment`;
CREATE TABLE `appointment` (
  `id` varchar(255) NOT NULL,
  `begintime` datetime NOT NULL,
  `endtime` datetime NOT NULL,
  `illustrate` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  `createTime` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of appointment
-- ----------------------------
INSERT INTO `appointment` VALUES ('1', '2020-02-06 05:12:09', '2020-01-29 05:12:13', '1', '2', '2020-02-06 05:12:27');
INSERT INTO `appointment` VALUES ('2', '2020-02-14 05:12:35', '2020-02-04 05:12:38', '1', '0', '2020-02-04 05:12:43');
INSERT INTO `appointment` VALUES ('1', '2020-02-06 05:12:47', '2020-02-06 05:12:51', '1', '0', '2020-02-05 05:12:59');
INSERT INTO `appointment` VALUES ('1', '2019-11-22 04:44:52', '2019-11-22 04:44:52', '1', '1', '2019-11-22 04:44:52');
INSERT INTO `appointment` VALUES ('5', '2019-11-22 04:44:52', '2019-11-22 04:44:52', '5', '5', '2019-11-22 04:44:52');

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `articleid` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `createTime` datetime NOT NULL,
  `deployTime` datetime default NULL,
  `modifyTime` datetime default NULL,
  `content` mediumtext,
  PRIMARY KEY  (`articleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('1', '1', '0', '张三', '2019-11-21 14:44:52', null, '2019-11-28 06:45:01', '写了故事');
INSERT INTO `article` VALUES ('2', '2', '2', '2', '2019-11-09 17:31:29', '2019-11-12 17:31:33', '2019-11-20 17:31:35', '2');
INSERT INTO `article` VALUES ('3', '2', '2', '2', '2019-11-28 06:45:01', '2019-11-28 06:45:01', '2019-11-28 06:45:01', '2');
INSERT INTO `article` VALUES ('9', '9', '0', '9', '2019-11-22 04:44:52', '2019-11-22 04:44:52', '2019-11-22 04:44:52', '9');

-- ----------------------------
-- Table structure for common_problems
-- ----------------------------
DROP TABLE IF EXISTS `common_problems`;
CREATE TABLE `common_problems` (
  `title` varchar(255) NOT NULL,
  `content` varchar(255) NOT NULL,
  `status` int(11) NOT NULL,
  `createtime` datetime NOT NULL,
  `id` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of common_problems
-- ----------------------------
INSERT INTO `common_problems` VALUES ('12', ' 2', '2', '2020-02-06 11:01:12', '1');
INSERT INTO `common_problems` VALUES ('21', '22', '12', '2020-02-03 11:01:22', '2');

-- ----------------------------
-- Table structure for details
-- ----------------------------
DROP TABLE IF EXISTS `details`;
CREATE TABLE `details` (
  `id` varchar(255) NOT NULL,
  `academy` varchar(255) NOT NULL,
  `politicstatus` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of details
-- ----------------------------

-- ----------------------------
-- Table structure for feedback
-- ----------------------------
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback` (
  `id` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `content` varchar(255) NOT NULL,
  `createtime` datetime NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of feedback
-- ----------------------------

-- ----------------------------
-- Table structure for overseas_study
-- ----------------------------
DROP TABLE IF EXISTS `overseas_study`;
CREATE TABLE `overseas_study` (
  `id` varchar(255) NOT NULL,
  `reason` varchar(255) NOT NULL,
  `tel` varchar(255) NOT NULL,
  `status` int(11) NOT NULL,
  `createtime` datetime NOT NULL,
  `name` varchar(255) NOT NULL,
  `overseas_study_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of overseas_study
-- ----------------------------
INSERT INTO `overseas_study` VALUES ('1', '1', '1', '0', '2019-11-22 04:44:52', '1', '');
INSERT INTO `overseas_study` VALUES ('5', '5', '555', '0', '2019-11-22 04:44:52', '2', '6');

-- ----------------------------
-- Table structure for study_abroad_type
-- ----------------------------
DROP TABLE IF EXISTS `study_abroad_type`;
CREATE TABLE `study_abroad_type` (
  `overseas_study_id` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `content` varchar(255) NOT NULL,
  `status` int(11) NOT NULL,
  `createTime` datetime NOT NULL,
  PRIMARY KEY  (`overseas_study_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of study_abroad_type
-- ----------------------------
INSERT INTO `study_abroad_type` VALUES ('1', '5', '5', '5', '2020-02-05 09:26:49');
INSERT INTO `study_abroad_type` VALUES ('2', '32', '3', '3', '2020-02-04 10:11:44');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `status` int(11) NOT NULL,
  `studentid` varchar(255) NOT NULL,
  `classname` varchar(255) NOT NULL,
  `grade` varchar(255) NOT NULL,
  `major` varchar(255) NOT NULL,
  `academy` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1 ', '0', '1', '1', '1', '1', '1');
INSERT INTO `user` VALUES ('2', '2', '0', '2', '23333333333333', '2', '2', '2');
INSERT INTO `user` VALUES ('3', '3', '0', '3', '3', '3', '3', '3');
