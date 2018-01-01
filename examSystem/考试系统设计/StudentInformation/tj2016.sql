/*
Navicat MySQL Data Transfer

Source Server         : DB
Source Server Version : 50130
Source Host           : localhost:3306
Source Database       : tj2016

Target Server Type    : MYSQL
Target Server Version : 50130
File Encoding         : 65001

Date: 2016-12-30 21:00:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `courseid` int(30) NOT NULL,
  `coursename` varchar(60) NOT NULL,
  `teacher` varchar(30) DEFAULT NULL,
  `room` varchar(30) DEFAULT NULL,
  `xz` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`courseid`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1300001', '数学', '封腾', 'A231', '公共必修课');
INSERT INTO `course` VALUES ('1300002', '英语', '峰峰', 'A123', '公共选修课');
INSERT INTO `course` VALUES ('1300003', '语文', '高松', 'B101', '专业必修课');
INSERT INTO `course` VALUES ('1300004', '物理', '秦斌', 'B231', '公共必修课');
INSERT INTO `course` VALUES ('1300005', '化学', '王宗', 'A101', '公共必修课');
INSERT INTO `course` VALUES ('1300006', '生物', '王美', 'A102', '专业必修课');

-- ----------------------------
-- Table structure for info
-- ----------------------------
DROP TABLE IF EXISTS `info`;
CREATE TABLE `info` (
  `id` int(30) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `idcard` varchar(30) DEFAULT NULL,
  `birthday` varchar(30) DEFAULT NULL,
  `hometown` varchar(30) DEFAULT NULL,
  `major` varchar(60) DEFAULT NULL,
  `grade` varchar(30) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of info
-- ----------------------------
INSERT INTO `info` VALUES ('12001', '冯晓辉', '男', '150124199105231615', '1991-05-23', '北京市', '统计学', '2012', '13423547891', '11@qq.com');
INSERT INTO `info` VALUES ('12002', '李明', '男', '130435199411092312', '1994-11-09', '上海市', '经济学', '2013', '15434567890', '22@qq.com');
INSERT INTO `info` VALUES ('12003', '冯梅梅', '女', '230435199401092311', '1994-01-09', '山西省', '经济学', '2014', '13243234543', '567@qq.com');
INSERT INTO `info` VALUES ('12004', '刘微微', '女', '230432199710102312', '1997-10-10', '重庆市', '统计学', '2013', '15467345432', '1234@qq.com');
INSERT INTO `info` VALUES ('12005', '刘洋', '男', '130435198002036712', '1980-02-03', '浙江省', '统计学', '2014', '13232323232', '1234@aa.com');
INSERT INTO `info` VALUES ('12006', '张雯雯', '女', '234123198003052512', '1980-03-05', '河北省', '经济学', '2015', '13223452345', '123@qq.com');
INSERT INTO `info` VALUES ('12007', '王升水', '女', '513434199006129075', '1990-06-12', '上海市', '统计学', '2014', '15432432342', '111@qq.com');
INSERT INTO `info` VALUES ('12008', '陈肖', '女', '130435199411082322', '1994-11-08', '重庆市', '统计学', '2014', '13243212342', '22@ww.cn');
INSERT INTO `info` VALUES ('12009', '韩东东', '男', '230712198907224858', '1989-07-22', '吉林省', '经济学', '2014', '15323421234', '124@qq.com');

-- ----------------------------
-- Table structure for sc
-- ----------------------------
DROP TABLE IF EXISTS `sc`;
CREATE TABLE `sc` (
  `id` int(20) NOT NULL,
  `courseid` int(20) NOT NULL,
  `sc` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of sc
-- ----------------------------
INSERT INTO `sc` VALUES ('12001', '1300001', '89');
INSERT INTO `sc` VALUES ('12001', '1300002', '90');
INSERT INTO `sc` VALUES ('12001', '1300003', '95');
INSERT INTO `sc` VALUES ('12001', '1300004', '78');
INSERT INTO `sc` VALUES ('12001', '1300005', '86');
INSERT INTO `sc` VALUES ('12001', '1300006', '99');
INSERT INTO `sc` VALUES ('12002', '1300001', '80');
INSERT INTO `sc` VALUES ('12002', '1300002', '90');
INSERT INTO `sc` VALUES ('12002', '1300003', '22');
INSERT INTO `sc` VALUES ('12002', '1300004', '90');
INSERT INTO `sc` VALUES ('12002', '1300005', '66');
INSERT INTO `sc` VALUES ('12002', '1300006', '80');
INSERT INTO `sc` VALUES ('12003', '1300001', '76');
INSERT INTO `sc` VALUES ('12003', '1300002', '78');
INSERT INTO `sc` VALUES ('12003', '1300003', '80');
INSERT INTO `sc` VALUES ('12003', '1300004', '80');
INSERT INTO `sc` VALUES ('12003', '1300005', '92');
INSERT INTO `sc` VALUES ('12003', '1300006', '77');
INSERT INTO `sc` VALUES ('12004', '1300001', '56');
INSERT INTO `sc` VALUES ('12004', '1300002', '65');
INSERT INTO `sc` VALUES ('12004', '1300003', '87');
INSERT INTO `sc` VALUES ('12004', '1300004', '33');
INSERT INTO `sc` VALUES ('12004', '1300005', '87');
INSERT INTO `sc` VALUES ('12004', '1300006', '90');
INSERT INTO `sc` VALUES ('12005', '1300006', '90');
INSERT INTO `sc` VALUES ('12005', '1300005', '95');
INSERT INTO `sc` VALUES ('12005', '1300004', '99');
INSERT INTO `sc` VALUES ('12005', '1300003', '99');
INSERT INTO `sc` VALUES ('12005', '1300002', '87');
INSERT INTO `sc` VALUES ('12005', '1300001', '76');
INSERT INTO `sc` VALUES ('12006', '1300001', '87');
INSERT INTO `sc` VALUES ('12006', '1300002', '87');
INSERT INTO `sc` VALUES ('12006', '1300003', '88');
INSERT INTO `sc` VALUES ('12006', '1300004', '90');
INSERT INTO `sc` VALUES ('12006', '1300005', '90');
INSERT INTO `sc` VALUES ('12006', '1300006', '80');
INSERT INTO `sc` VALUES ('12007', '1300001', '78');

-- ----------------------------
-- Table structure for susers
-- ----------------------------
DROP TABLE IF EXISTS `susers`;
CREATE TABLE `susers` (
  `id` int(30) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `position` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of susers
-- ----------------------------
INSERT INTO `susers` VALUES ('12001', '冯晓辉', '123456', '\0');
INSERT INTO `susers` VALUES ('12002', '李明', '123456', '\0');
INSERT INTO `susers` VALUES ('12003', '冯梅梅', '123456', '\0');
INSERT INTO `susers` VALUES ('12004', '刘微微', '123456', '\0');
INSERT INTO `susers` VALUES ('12005', '刘洋', '123456', '\0');
INSERT INTO `susers` VALUES ('12006', '张雯雯', '123456', '\0');
INSERT INTO `susers` VALUES ('12007', '王升水', '123456', '\0');
INSERT INTO `susers` VALUES ('12008', '陈肖', '123456', '\0');
INSERT INTO `susers` VALUES ('12009', '韩东东', '123456', '\0');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` varchar(60) DEFAULT NULL,
  `password` varchar(30) NOT NULL,
  `position` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=201609 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('201601', '王晓刚', '123@qq.com', '13456723456', '123456', '');
INSERT INTO `users` VALUES ('201602', '冯晓辉', '1234@we.com', '13209875678', '1111', '');
INSERT INTO `users` VALUES ('201603', '李晓明', '12356@qq.com', '1234567890', '2222', '');
INSERT INTO `users` VALUES ('201604', '张小飞', '789@swufe.edu.cn', '15632456789', '222', '');
INSERT INTO `users` VALUES ('201605', '赵小赵', '124@qq.com', '12348920', '2222', '');
INSERT INTO `users` VALUES ('201606', '张翔', '134@eud.com', '14567890345', '2222', '');
INSERT INTO `users` VALUES ('201607', '张晓华', '11@qq.com', '13423453421', '123456', '');
INSERT INTO `users` VALUES ('201608', '李霄鹏', '12@aa.co', '13423453421', '222222', '');
