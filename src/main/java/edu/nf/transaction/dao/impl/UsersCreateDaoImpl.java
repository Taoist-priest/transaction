package edu.nf.transaction.dao.impl;

import edu.nf.transaction.dao.UsersCreateDao;
import edu.nf.transaction.entity.UsersCreate;
import edu.nf.transaction.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author Taoist-priest
 * @date 2020/11/26
 */
public class UsersCreateDaoImpl implements UsersCreateDao {
    @Override
    public void usersCreate(UsersCreate users) {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession(true)) {
            UsersCreateDao usersDao = sqlSession.getMapper(UsersCreateDao.class);
            usersDao.usersCreate(users);
        } catch (RuntimeException e) {
            throw e;
        }
    }
}
