package com.csfrez.flex.dao.entity;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户表 实体类。
 *
 * @author Frez
 * @since 2024-05-16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("tb_sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @Id
    private String id;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 密码
     */
    private String password;

    /**
     * 工号
     */
    private String no;

    /**
     * 姓名
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 用户头像
     */
    private String photo;

    /**
     * 最后登陆IP
     */
    @Column(isLarge = true, version = true)
    private String loginIp;

    /**
     * 最后登陆时间
     */
    private LocalDateTime loginDate;

    /**
     * 是否可登录
     */
    private String loginFlag;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateDate;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 删除标记
     */
    private String delFlag;

}
