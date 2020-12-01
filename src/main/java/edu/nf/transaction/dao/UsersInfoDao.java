package edu.nf.transaction.dao;

/**
 * @author 10207
 * @date 2020/11/26
 */
public interface UsersInfoDao {
    /**
     * 更新用户详细资料
     *
     * @param userUuid
     */
    void usersInfoUpdateById(String userUuid);
}
