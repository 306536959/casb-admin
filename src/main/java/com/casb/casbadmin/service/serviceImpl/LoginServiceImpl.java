package com.casb.casbadmin.service.serviceImpl;

import com.casb.casbadmin.mapper.login.LoginMapper;
import com.casb.casbadmin.service.LoginService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper mapper;
    @Override
    public boolean login(int userId, String password) {
        return  mapper.login(userId,password);
    }

    @Override
    public List<Object> logins() {
        PageHelper.startPage(2, 10);
        List<Object> list =  mapper.list();
        PageInfo pageInfo = new PageInfo(list);

        return list;
    }
}
