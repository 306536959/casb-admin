package com.casb.casbadmin.service.serviceImpl;

import com.casb.casbadmin.mapper.login.LoginMapper;
import com.casb.casbadmin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper mapper;
    @Override
    public boolean login(int userId, String password) {
        return  mapper.login(userId,password);
    }
}
