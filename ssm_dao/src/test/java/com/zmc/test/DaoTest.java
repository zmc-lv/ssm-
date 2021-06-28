package com.zmc.test;

import com.zmc.dao.ItemsDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 包名：com.zmc.test
 *
 * @author zmc
 * 日期：2021/6/28  15:22
 */
public class DaoTest {

    @Test
    public void TestDao(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-dao.xml");
        ItemsDao dao = app.getBean(ItemsDao.class);
        System.out.println(dao.findAll());
    }
}
