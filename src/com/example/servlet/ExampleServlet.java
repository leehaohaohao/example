package com.example.servlet;

import com.example.db.ExampleData;
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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //设置请求响应编码
        resp.setContentType("application/json;charset=UTF-8");
        System.out.println("System has received id that is: "+req.getParameter("id"));
        String responseJson = exampleData.getJsonData("lihao",19);
        //返回响应数据
        resp.getWriter().write(responseJson);
    }
}
