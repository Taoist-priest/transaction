package edu.nf.transaction.entity;

import lombok.Data;

/**
 * @author Taoist-priest
 * @date 2020/11/26
 */
@Data
public class UsersCreate {
    /**
     * 用户编号
     */
    private String userUuid;
    /**
     * 账户（手机号）
     */
    private String userPhone;
    /**
     * 密码
     */
    private String userPassword;
}
