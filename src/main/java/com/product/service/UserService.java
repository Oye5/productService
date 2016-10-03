package com.product.service;

import com.product.model.User;

public interface UserService {

	void saveUser(User user);

	User getUser(String email);

	void updateUser(User user);
}
