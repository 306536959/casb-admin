package com.casb.casbadmin.mapper.login;


import java.util.List;

public interface LoginMapper {

    boolean login(int userId, String password);

    List<Object> list();
}
