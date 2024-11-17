package com.example.servlet;

import com.example.db.ExampleData;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * 样例servlet
 *
 * @author lihao
 * &#064;date  2024/11/17--20:50
 * @since 1.0
 */
@WebServlet("/example")
public class ExampleServlet extends HttpServlet {
    private final ExampleData exampleData = new ExampleData();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=UTF-8");
        String responseJson = exampleData.getJsonData("lihao",19);
        resp.getWriter().write(responseJson);
    }
}
