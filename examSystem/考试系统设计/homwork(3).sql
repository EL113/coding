/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50130
Source Host           : localhost:3306
Source Database       : homwork

Target Server Type    : MYSQL
Target Server Version : 50130
File Encoding         : 65001

Date: 2017-12-29 11:09:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `id` int(20) NOT NULL COMMENT 'id号（唯一标识符）',
  `user_id` int(20) NOT NULL COMMENT '学号',
  `sc` varchar(8) NOT NULL COMMENT '得分',
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '考试时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of score
-- ----------------------------

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `testID` int(20) NOT NULL COMMENT '题号',
  `text` varchar(100) NOT NULL COMMENT '题目内容',
  `optionA` varchar(80) NOT NULL COMMENT '选项A',
  `optionB` varchar(80) NOT NULL COMMENT '选项B',
  `optionC` varchar(80) NOT NULL COMMENT '选项C',
  `optionD` varchar(80) NOT NULL COMMENT '选项D',
  `answer` varchar(8) NOT NULL COMMENT '正确答案',
  PRIMARY KEY (`testID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('1', '有一部根据同名小说《飘》改编的电影，那请问这部影片的名称是：', '《罗马假日》', '《乱世佳人》', '《魂断蓝桥》', '《窈窕淑女》', 'B');
INSERT INTO `test` VALUES ('2', '是谁第一次将中国功夫引入好莱坞？', '李连杰', '甄子丹', '李小龙', '成龙', 'C');
INSERT INTO `test` VALUES ('3', '著名导演李安凭借下列哪部电影获得奥斯卡最佳导演奖\r\n\r\n?', '《色戒》', '《断背山》', '《卧虎藏龙》', '《喜宴》', 'B');
INSERT INTO `test` VALUES ('4', '中国经典电影《一个都不能少》的导演是哪位？', '李爽', '韦家辉', '张艺谋', '陈力', 'C');
INSERT INTO `test` VALUES ('5', '中国第一次电影放映的地方是在哪里？', '上海', '北京', '香港', '台湾', 'A');
INSERT INTO `test` VALUES ('6', '欧洲三大电影节不包括下列哪一个？', '威尼斯电影节', '瑞典电影节', '柏林国际电影节', '戛纳电影节', 'B');
INSERT INTO `test` VALUES ('7', '她是一位著名影星，人称“谋女郎”，代表作是《卧虎藏龙》，请问这位女明星是谁？', '巩俐\r\n\r\n \r\n', '舒淇', '范冰冰', '章子怡', 'D');
INSERT INTO `test` VALUES ('8', '首位在戛纳电影节封后的华人女演员是：', '章子怡', '杨紫琼', '巩俐', '张曼玉', 'C');
INSERT INTO `test` VALUES ('9', '宫崎骏的作品《千与千寻》中，影片最后，在千寻的帮助下，白龙找\r\n\r\n回了自己的名字。他的名字是：', '琥珀川', '荻野千寻', '小白', '赈早贤', 'A');
INSERT INTO `test` VALUES ('10', '系列电影《加勒比海盗》是哪间电影公司的作品？', '梦工厂', '华纳', '迪士尼', '好莱坞', 'C');
INSERT INTO `test` VALUES ('11', '下列不属于影帝梁朝伟的电影作品是：', '《花样年华》', '《重庆森林》', '《悲情城市》', '《旺角卡门》', 'B');
INSERT INTO `test` VALUES ('12', '《暮光之城》男主角吸血鬼是谁主演的？', '杰森·贝特曼', '罗伯特·帕丁森', '小罗伯特﹒唐尼', '凯特﹒哈德森', 'B');
INSERT INTO `test` VALUES ('13', '电影《搜索》的男主角是谁？', '彭于晏', '赵又廷', '佟大为', '张家辉', 'B');
INSERT INTO `test` VALUES ('14', '《致我们终将逝去的青春》的主题曲是谁唱的？', '陈红', '王菲', '尚雯婕', '韩红', 'D');
INSERT INTO `test` VALUES ('15', '电影《十月围城》中的故事发生的地点是在哪里? ', '广州', '北京', '日本', '香港', 'D');
INSERT INTO `test` VALUES ('16', '以下哪个不是电影《听风者》的主要演员\r\n\r\n \r\n\r\n？', '梁朝伟', '约瑟夫·高登', '周迅', '凯特·温丝莱特', 'D');
INSERT INTO `test` VALUES ('17', '电影《一个陌生女人的来信》的导演是下列哪位？', '吴基恒', '陈可辛', '徐静蕾', '韦家辉', 'C');
INSERT INTO `test` VALUES ('18', '电影《狄仁杰之通天帝国》中，大陆演员邓超所饰演的裴东来是导演徐克倾注了很多心思的角色。该角色的造型特征是？', '有白化病', '肤色黝黑', '黑衣人', '白衣人', 'A');
INSERT INTO `test` VALUES ('19', '中国第一个涉及电影拍摄的出版社是下列哪一个？', '文学出版社', '电影出版社', '商务出版社', '古籍书店', 'C');
INSERT INTO `test` VALUES ('20', '电影《生化危机》的女主角是下列哪位？', '伊娃·朗格丽亚\r\n\r\n \r\n', '米拉·乔沃维奇\r\n\r\n \r\n\r\n \r\n', '佐伊·索尔达娜\r\n\r\n \r\n', '哈莉·贝瑞', 'B');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(20) NOT NULL COMMENT '学号',
  `name` varchar(40) NOT NULL COMMENT '姓名',
  `sex` varchar(4) NOT NULL COMMENT '性别(0 表示男 1表示女)',
  `idcard` varchar(40) NOT NULL COMMENT '身份证号',
  `phone` varchar(40) NOT NULL COMMENT '联系电话',
  `email` varchar(40) NOT NULL COMMENT '邮箱',
  `root` tinyint(3) NOT NULL COMMENT '0表示普通用户，1表示管理员',
  `password` varchar(10) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of users
-- ----------------------------
