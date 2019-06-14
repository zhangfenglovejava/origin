package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {
    //保存数据
    void save(Account account);
    //查询数据
    List<Account> findAll();
}
