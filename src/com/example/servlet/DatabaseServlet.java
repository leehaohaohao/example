package com.example.servlet;

import com.example.config.DBConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * classname
 *
 * @author lihao
 * &#064;date  2024/12/3--20:32
 * @since 1.0
 */
@WebServlet("/testDB")
public class DatabaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 设置响应内容类型
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // 获取数据库连接
        Connection conn = DBConfig.getConnection();

        if (conn != null) {
            try {
                // 查询数据库（假设有一个 users 表）
                String query = "SELECT * FROM users";
                PreparedStatement statement = conn.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();
                out.println("<h2>数据库连接成功！</h2>");
            } catch (SQLException e) {
                out.println("<h3>错误 " + e.getMessage() + "</h3>");
            } finally {
                try {
                    if (conn != null) conn.close(); // 关闭连接
                } catch (SQLException e) {
                    out.println("<h3>连接失败： " + e.getMessage() + "</h3>");
                }
            }
        } else {
            out.println("<h3>不能连接到数据库</h3>");
        }
    }
}
