package com.product.dao;

import com.product.model.User;

public interface UserDao {

	void saveUser(User user);

	User getUser(String email);

	void updateUser(User user);
}
