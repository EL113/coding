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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class DbUtil {
    private static final String DATABASE_NAME = "test";
    private static final String USRE_ID = "root";
    private static final String DATABASE_PASSWORD = "SQL1137660";
    private static String DATABASE_URL = "jdbc:mysql://localhost:3306/"+DATABASE_NAME+"?useUnicode=true&characterEncoding=gb2312&useSSL=false";
    
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            throw new RuntimeException();
        }
    }
    public static Connection createConnection(){
        Connection con = null;
        try {
            con  = DriverManager.getConnection(DATABASE_URL, USRE_ID,DATABASE_PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public static void free(Connection conn, Statement st, ResultSet rs){
        try{  
            if(rs != null){  
                rs.close();  
            }  
        }catch(SQLException e){  
            e.printStackTrace();  
        }finally{  
            try{  
                if(st != null){  
                    st.close();  
                }  
            }catch(SQLException e){  
                e.printStackTrace();  
            }finally{  
                try{  
                    if(conn != null){  
                        conn.close();  
                    }  
                }catch(SQLException e){  
                    e.printStackTrace();  
                }  
            }  
        }  
    }
}
