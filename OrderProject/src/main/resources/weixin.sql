/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : weixin

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2019-09-21 13:59:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer_addr
-- ----------------------------
DROP TABLE IF EXISTS `customer_addr`;
CREATE TABLE `customer_addr` (
  `customer_addr_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键ID',
  `customer_id` int(10) unsigned NOT NULL COMMENT 'customer_inf表的自增ID',
  `zip` varchar(6) NOT NULL COMMENT '邮编',
  `province` varchar(6) NOT NULL COMMENT '省份',
  `city` varchar(6) NOT NULL COMMENT '城市',
  `district` varchar(6) NOT NULL COMMENT '县',
  `address` varchar(200) NOT NULL COMMENT '具体的地址门牌号',
  `is_default` char(4) NOT NULL COMMENT '是否默认',
  `modified_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`customer_addr_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='用户地址表';

-- ----------------------------
-- Records of customer_addr
-- ----------------------------
INSERT INTO `customer_addr` VALUES ('1', '1', '475300', '河南', '开封', '兰考', '黄河路274号', '1', '2019-09-16 11:27:05');

-- ----------------------------
-- Table structure for customer_inf
-- ----------------------------
DROP TABLE IF EXISTS `customer_inf`;
CREATE TABLE `customer_inf` (
  `customer_inf_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `customer_name` varchar(20) NOT NULL COMMENT '用户名称',
  `customer_password` varchar(255) DEFAULT NULL COMMENT '用户登录密码',
  `identity_card_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '证件类型：1 身份证，2 军官证，3 护照',
  `identity_card_no` varchar(20) DEFAULT NULL COMMENT '证件号码',
  `mobile_phone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `customer_email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `gender` char(1) DEFAULT NULL COMMENT '性别',
  `user_point` int(11) NOT NULL DEFAULT '0' COMMENT '用户积分',
  `register_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '注册时间',
  `birthday` datetime DEFAULT NULL COMMENT '会员生日',
  `customer_level` tinyint(4) NOT NULL DEFAULT '1' COMMENT '会员级别：1 普通会员，2 青铜，3白银，4黄金，5钻石',
  `user_money` decimal(8,2) NOT NULL DEFAULT '0.00' COMMENT '用户余额',
  `modified_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`customer_inf_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='用户信息表';

-- ----------------------------
-- Records of customer_inf
-- ----------------------------
INSERT INTO `customer_inf` VALUES ('1', '刘承恩', null, '1', '410225199805055814', '15890311683', '15890311683@163.com', '男', '0', '2019-09-16 10:42:23', '2019-09-19 10:40:34', '1', '0.00', '2019-09-16 10:42:23');

-- ----------------------------
-- Table structure for order_detail
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail` (
  `detail_id` varchar(32) NOT NULL,
  `order_id` varchar(32) NOT NULL,
  `product_id` varchar(32) NOT NULL,
  `product_name` varchar(64) NOT NULL COMMENT '商品名称',
  `product_price` decimal(8,2) NOT NULL COMMENT '商品价格',
  `product_quantity` int(11) NOT NULL COMMENT '商品数量',
  `product_icon` varchar(512) DEFAULT NULL COMMENT '商品小图',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`detail_id`),
  KEY `idx_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单详情表';

-- ----------------------------
-- Records of order_detail
-- ----------------------------

-- ----------------------------
-- Table structure for order_master
-- ----------------------------
DROP TABLE IF EXISTS `order_master`;
CREATE TABLE `order_master` (
  `order_id` varchar(32) NOT NULL,
  `buyer_name` varchar(32) NOT NULL COMMENT '买家名字',
  `buyer_phone` varchar(32) NOT NULL COMMENT '买家电话',
  `buyer_address` varchar(128) NOT NULL COMMENT '买家地址',
  `buyer_openid` varchar(64) NOT NULL COMMENT '买家微信openID',
  `order_amount` decimal(8,2) NOT NULL COMMENT '订单总金额',
  `order_status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '订单状态,默认0新下单',
  `pay_status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '支付状态，默认0未支付',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`order_id`),
  KEY `idx_buyer_openid` (`buyer_openid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单表';

-- ----------------------------
-- Records of order_master
-- ----------------------------

-- ----------------------------
-- Table structure for product_category
-- ----------------------------
DROP TABLE IF EXISTS `product_category`;
CREATE TABLE `product_category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(64) NOT NULL COMMENT '类目名字',
  `catShopID` varchar(11) NOT NULL COMMENT '店铺编号',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COMMENT='类目表';

-- ----------------------------
-- Records of product_category
-- ----------------------------
INSERT INTO `product_category` VALUES ('1', '日销榜', '1', '2019-09-04 17:17:27', '2019-09-16 10:10:24');
INSERT INTO `product_category` VALUES ('5', '女士最爱', '1', '2019-09-04 17:54:42', '2019-09-16 10:10:27');
INSERT INTO `product_category` VALUES ('14', '男士最爱', '1', '2019-09-05 17:37:37', '2019-09-15 22:15:18');

-- ----------------------------
-- Table structure for product_info
-- ----------------------------
DROP TABLE IF EXISTS `product_info`;
CREATE TABLE `product_info` (
  `product_id` varchar(64) NOT NULL COMMENT '商品编号',
  `product_name` varchar(64) NOT NULL COMMENT '商品名称',
  `product_price` decimal(8,2) NOT NULL COMMENT '商品单价',
  `product_stock` int(11) NOT NULL COMMENT '库存',
  `product_description` varchar(64) DEFAULT NULL COMMENT '描述',
  `product_icon` varchar(512) DEFAULT NULL COMMENT '小图',
  `category_type` int(11) NOT NULL COMMENT '类目编号',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品表';

-- ----------------------------
-- Records of product_info
-- ----------------------------
INSERT INTO `product_info` VALUES ('f1978808-d827-11e9-b66b-e82a44a17662', '特步童鞋', '98.80', '55', '飞一般的感觉', 'img', '1', '2019-09-16 10:16:07', '2019-09-16 10:16:07');

-- ----------------------------
-- Table structure for shop
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
  `shopID` varchar(64) NOT NULL COMMENT '店铺编号',
  `shopName` varchar(64) DEFAULT NULL COMMENT '店铺名称',
  `shopDescribe` varchar(255) DEFAULT NULL COMMENT '店铺描述',
  `userID` int(11) DEFAULT NULL COMMENT '商家用户id',
  `shopicon` varchar(64) DEFAULT NULL COMMENT '店铺图片',
  PRIMARY KEY (`shopID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of shop
-- ----------------------------
INSERT INTO `shop` VALUES ('1', '特步专卖店', '非一般的感觉', '1', 'img');

-- ----------------------------
-- Table structure for shopping_trolley
-- ----------------------------
DROP TABLE IF EXISTS `shopping_trolley`;
CREATE TABLE `shopping_trolley` (
  `carID` varchar(255) NOT NULL COMMENT '购物车编号',
  `customerID` int(11) DEFAULT NULL COMMENT '用户编号',
  `productID` varchar(255) DEFAULT NULL COMMENT '商品编号',
  PRIMARY KEY (`carID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of shopping_trolley
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userid` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `userName` varchar(255) DEFAULT NULL COMMENT '用户真实名称',
  `user_loginName` varchar(32) DEFAULT NULL COMMENT '用户登录名称',
  `user_PassWord` varchar(255) DEFAULT NULL COMMENT '用户登录密码',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '刘承恩', '410225199805055814', '123456');
