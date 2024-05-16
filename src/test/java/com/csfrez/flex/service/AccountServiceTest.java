package com.csfrez.flex.service;

import com.csfrez.flex.DemoMybatisFlexApplicationTests;
import com.csfrez.flex.dao.entity.Account;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AccountServiceTest extends DemoMybatisFlexApplicationTests {

    @Resource
    private AccountService accountService;

    @Test
    void getAccount() {
        Account account = accountService.getAccountByAge(18);
        assertNotNull(account);
    }
}
