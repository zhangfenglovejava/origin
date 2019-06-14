package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.mapper.AccountMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class MapperTest {
  // @Test
    public void testFindAll(){
        //获取spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-mapper.xml");
        //获取mapper
        AccountMapper accountMapper = applicationContext.getBean(AccountMapper.class);
        List<Account> all = accountMapper.findAll();
        System.out.println(all);
    }
}
