package test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo {
//    数据库测试连接
    @Test
    public  void  closeAll() throws Exception{
        String url="jdbc:mysql://localhost:3306/mydata"; //连接数据库（kucun是数据库名）
        String name="root";//连接mysql的用户名
        String pwd="pass";//连接mysql的密码
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,name,pwd);
        System.out.println(conn);
    }

}
