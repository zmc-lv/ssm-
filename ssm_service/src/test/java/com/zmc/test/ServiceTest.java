package com.zmc.test;

import com.zmc.dao.ItemsDao;
import com.zmc.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 包名：com.zmc.test
 *
 * @author zmc
 * 日期：2021/6/28  15:42
 */
public class ServiceTest {
    @Test
    public void TestDao(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService dao = app.getBean(ItemsService.class);
        System.out.println(dao.findAll());
    }
}
