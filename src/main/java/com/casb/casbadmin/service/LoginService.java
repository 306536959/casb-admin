package com.casb.casbadmin.service;

import java.util.List;

public interface LoginService {
    boolean login(int userId , String password);

    List<Object> logins();
}
