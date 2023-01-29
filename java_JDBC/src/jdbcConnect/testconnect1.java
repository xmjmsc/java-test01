package jdbcConnect;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testconnect1 {
    @Test
    public void testconnect001() {
        try {
            //1.数据库连接的4个基本要素：驱动、url、用户名、密码
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/db01";
            String user = "root";
            String password = "123456";
            //2.实例化Driver
            Class aClass = Class.forName(driver);
            //3.获取连接
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println(connection);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}

