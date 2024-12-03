package com.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库配置类（数据库配置信息如用户名、密码、驱动等）
 *
 * @author lihao
 * &#064;date  2024/11/17--21:02
 * @since 1.0
 */
public class DBConfig {

    // 数据库配置信息
    private static final String URL = "jdbc:mysql://localhost:3306/blob?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    // 获取数据库连接
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // 加载数据库驱动
            Class.forName(DRIVER);
            // 获取连接
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 驱动加载失败: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("数据库连接失败: " + e.getMessage());
        }
        return connection;
    }
}
