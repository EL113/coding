/*
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
 */
package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class DbUtil {
    private static Connection con;
    
    private static void createConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=gb2312&useSSL=false", "root","Daniel1137660");
        }catch(Exception ex){
        }
    }
    
    public static PreparedStatement getStatement(String sqlStatement) throws SQLException{
        if(con == null){
            DbUtil.createConnection();
        }
        return con.prepareStatement(sqlStatement);        
    }
    
    public static Statement getSqlStatement() throws SQLException{
        if(con == null){
            DbUtil.createConnection();
        }
        return con.createStatement();
    }
}
