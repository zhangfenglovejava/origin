package com.itheima.mapper;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountMapper {
    //保存数据
    void save(Account account);
    //查找数据
    List<Account> findAll();
}
