package com.csfrez.flex.service;

import com.alibaba.fastjson2.JSON;
import com.csfrez.flex.dao.entity.Account;
import com.csfrez.flex.dao.mapper.AccountMapper;
import com.mybatisflex.core.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static com.csfrez.flex.dao.entity.table.AccountTableDef.ACCOUNT;

@Service
@Slf4j
public class AccountService {

    @Resource
    private AccountMapper accountMapper;

    public Account getAccountByAge(int age) {
        QueryWrapper queryWrapper = QueryWrapper.create()
                .select()
                .where(ACCOUNT.AGE.eq(age));
        Account account = accountMapper.selectOneByQuery(queryWrapper);
        log.info(JSON.toJSONString(account));
        return account;
    }
}
