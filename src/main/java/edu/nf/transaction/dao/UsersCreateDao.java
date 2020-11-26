package edu.nf.transaction.dao;

import edu.nf.transaction.entity.Users;
import edu.nf.transaction.entity.UsersCreate;

/**
 * @author Taoist-priest
 * @date 2020/11/26
 */
public interface UsersCreateDao {
    /**
     * 注册用户
     * @param users
     */
    void usersCreate(UsersCreate users);
}
