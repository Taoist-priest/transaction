package edu.nf.transaction.dao.impl;

import edu.nf.transaction.dao.UsersInfoDao;
import edu.nf.transaction.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author 10207
 * @date 2020/11/26
 */
public class UsersInfoDaoImpl implements UsersInfoDao {
    @Override
    public void usersInfoUpdateById(String userUuid) {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession(true)) {
            UsersInfoDao dao = sqlSession.getMapper(UsersInfoDao.class);
            dao.usersInfoUpdateById(userUuid);
        } catch (RuntimeException e) {
            throw e;
        }
    }
}
