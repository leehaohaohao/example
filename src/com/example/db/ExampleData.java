package com.example.db;

import com.example.entity.User;

/**
 * 获取数据样例展示
 *
 * @author lihao
 * &#064;date  2024/11/17--20:53
 * @since 1.0
 */
public class ExampleData {
    /**
     * 从数据库获取json数据 TODO 可以利用现成的json工具，如fastjson、jackson等，下载对应jar包，然后引入依赖，查看官方文档使用教程
     * @param name 用户名
     * @param age 年龄
     * @return json数据
     */
    public String getJsonData(String name,Integer age) {
        //TODO 从数据库获取数据
        User user = new User(name,age);
        String result = "";
        if(user.getName()!=null && user.getAge() != null){
            result = "{\"name\":\""+user.getName()+"\",\"age\":"+user.getAge()+"}";
        }else if(user.getName()!=null){
            result = "{\"name\":\""+user.getName()+"\"}";
        }else if(user.getAge() != null){
            result = "{\"age\":"+user.getAge()+"}";
        }
        return result;
    }
}
