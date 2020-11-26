package edu.nf.transaction.entity;

import lombok.Data;

/**
 * @author Taoist-priest
 * @date 2020/11/26
 */
@Data
public class Users {
    /**
     * 用户编号
     */
    private String userUuid;
    /**
     * 昵称
     */
    private String user_nickname;
    /**
     * 性别
     */
    private String user_sex;
    /**
     * 年龄
     */
    private Integer user_age;
    /**
     * 身份证
     */
    private String user_card_id;
    /**
     * 真实姓名
     */
    private String user_card_name;
}
