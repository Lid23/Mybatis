package com.noodles.mybatistechnicalinsider;

import com.noodles.mybatistechnicalinsider.bean.Blog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: MybatisTechnicalInsider
 * @description: Main
 * @author: Eric
 * @create: 2019-04-04 10:21
 **/
public class Main {

    public static void main(String args[]) throws Exception{
        String resource = "config/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("id", 1);
            Blog blog = (Blog)sqlSession.selectOne("com.noodles.mybatistechnicalinsider.mapper.BlogMapper.selectBlogDetails", paramMap);
            System.out.println(blog);
        } finally {
            sqlSession.close();
        }
    }
}
