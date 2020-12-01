package edu.nf.transaction.dao;

import edu.nf.transaction.entity.UsersCreate;

import java.util.List;

/**
 * @author Taoist-priest
 * @date 2020/11/26
 */
public interface UsersCreateDao {
    /**
     * 注册用户
     *
     * @param users
     */
    void usersCreate(UsersCreate users);

    /**
     * 注册用户的列表集
     *
     * @return
     */
    List<UsersCreate> usersList();
}
