package com.rain.dao;

import com.rain.model.User;

public interface IUserDao {

    User selectUser(long id);
}
