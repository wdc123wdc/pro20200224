/*
Navicat MySQL Data Transfer

Source Server         : 1704C
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : jcart0224

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2020-02-26 13:58:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `jcart_address`
-- ----------------------------
DROP TABLE IF EXISTS `jcart_address`;
CREATE TABLE `jcart_address` (
  `address_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) NOT NULL,
  `receiver_name` varchar(20) NOT NULL,
  `receiver_mobile` varchar(20) NOT NULL,
  `content` varchar(200) NOT NULL,
  `tag` varchar(20) NOT NULL,
  PRIMARY KEY (`address_id`),
  KEY `idx_customer_id` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of jcart_address
-- ----------------------------

-- ----------------------------
-- Table structure for `jcart_administrator`
-- ----------------------------
DROP TABLE IF EXISTS `jcart_administrator`;
CREATE TABLE `jcart_administrator` (
  `administrator_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `real_name` varchar(20) DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `encrypted_password` varchar(100) NOT NULL,
  `status` tinyint(4) NOT NULL,
  `create_time` datetime NOT NULL,
  `avatar_url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`administrator_id`),
  UNIQUE KEY `idx_username` (`username`),
  UNIQUE KEY `idx_email` (`email`),
  KEY `idx_real_name` (`real_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of jcart_administrator
-- ----------------------------

-- ----------------------------
-- Table structure for `jcart_customer`
-- ----------------------------
DROP TABLE IF EXISTS `jcart_customer`;
CREATE TABLE `jcart_customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `real_name` varchar(20) NOT NULL,
  `avatar_url` varchar(100) DEFAULT NULL,
  `encrypted_password` varchar(100) NOT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `mobile_verified` bit(1) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `email_verified` bit(1) DEFAULT NULL,
  `status` tinyint(4) NOT NULL,
  `create_time` datetime NOT NULL,
  `news_subscribed` bit(1) NOT NULL,
  `reword_points` int(11) NOT NULL,
  `default_address_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `idx_username` (`username`),
  UNIQUE KEY `idx_mobile` (`mobile`),
  UNIQUE KEY `idx_email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of jcart_customer
-- ----------------------------

-- ----------------------------
-- Table structure for `jcart_order`
-- ----------------------------
DROP TABLE IF EXISTS `jcart_order`;
CREATE TABLE `jcart_order` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) NOT NULL,
  `status` tinyint(4) NOT NULL,
  `total_price` double NOT NULL,
  `reword_points` int(11) DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `idx_customer_id` (`customer_id`),
  KEY `idx_create_time` (`create_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of jcart_order
-- ----------------------------

-- ----------------------------
-- Table structure for `jcart_order_detail`
-- ----------------------------
DROP TABLE IF EXISTS `jcart_order_detail`;
CREATE TABLE `jcart_order_detail` (
  `order_id` bigint(20) NOT NULL,
  `ship_method` smallint(6) NOT NULL,
  `ship_address` varchar(300) DEFAULT NULL,
  `ship_price` double NOT NULL,
  `pay_method` smallint(6) NOT NULL,
  `invoice_address` varchar(300) DEFAULT NULL,
  `invoice_price` double NOT NULL,
  `comment` varchar(300) DEFAULT NULL,
  `order_products` text NOT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of jcart_order_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `jcart_order_history`
-- ----------------------------
DROP TABLE IF EXISTS `jcart_order_history`;
CREATE TABLE `jcart_order_history` (
  `order_history_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) NOT NULL,
  `time` datetime NOT NULL,
  `order_status` tinyint(4) NOT NULL,
  `comment` varchar(300) DEFAULT NULL,
  `customer_notified` bit(1) NOT NULL,
  PRIMARY KEY (`order_history_id`),
  KEY `idx_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of jcart_order_history
-- ----------------------------

-- ----------------------------
-- Table structure for `jcart_product`
-- ----------------------------
DROP TABLE IF EXISTS `jcart_product`;
CREATE TABLE `jcart_product` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_code` varchar(50) NOT NULL,
  `product_name` varchar(100) NOT NULL,
  `product_abstract` varchar(300) NOT NULL,
  `price` double NOT NULL,
  `discount` double DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `status` tinyint(4) NOT NULL,
  `main_pic_url` varchar(100) NOT NULL,
  `reword_points` int(11) DEFAULT NULL,
  `sort_order` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  UNIQUE KEY `idx_product_code` (`product_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of jcart_product
-- ----------------------------

-- ----------------------------
-- Table structure for `jcart_product_detail`
-- ----------------------------
DROP TABLE IF EXISTS `jcart_product_detail`;
CREATE TABLE `jcart_product_detail` (
  `product_id` int(11) NOT NULL,
  `description` text NOT NULL,
  `other_pic_urls` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of jcart_product_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `jcart_return`
-- ----------------------------
DROP TABLE IF EXISTS `jcart_return`;
CREATE TABLE `jcart_return` (
  `return_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` bigint(20) NOT NULL,
  `order_time` datetime DEFAULT NULL,
  `customer_id` int(11) NOT NULL,
  `customer_name` varchar(20) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `status` tinyint(4) NOT NULL,
  `action` tinyint(4) DEFAULT NULL,
  `product_code` varchar(50) NOT NULL,
  `product_name` varchar(100) NOT NULL,
  `quantity` int(11) NOT NULL,
  `reason` tinyint(4) NOT NULL,
  `opened` bit(1) NOT NULL,
  `comment` varchar(300) DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`return_id`),
  KEY `idx_customer_id` (`customer_id`),
  KEY `idx_order_id` (`order_id`),
  KEY `idx_create_time` (`create_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of jcart_return
-- ----------------------------

-- ----------------------------
-- Table structure for `jcart_return_history`
-- ----------------------------
DROP TABLE IF EXISTS `jcart_return_history`;
CREATE TABLE `jcart_return_history` (
  `return_history_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `return_id` int(11) NOT NULL,
  `time` datetime NOT NULL,
  `return_status` tinyint(4) NOT NULL,
  `comment` varchar(300) DEFAULT NULL,
  `customer_notified` bit(1) NOT NULL,
  PRIMARY KEY (`return_history_id`),
  KEY `idx_return_id` (`return_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of jcart_return_history
-- ----------------------------
