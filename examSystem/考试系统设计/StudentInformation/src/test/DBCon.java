/*
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `sex` bit(1) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `hometown` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=gb2312;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class DBCon {
    static Connection DBconnec() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/tj2016?useUnicode=true&characterEncoding=gb2312", "root","root");
        return con;
    }
}
