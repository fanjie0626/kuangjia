package org.ssm.dufy.dao;

import org.springframework.stereotype.Repository;
import org.ssm.dufy.entity.User;

@Repository
public interface UserDao {
	public User selectUserById(int id);
}
