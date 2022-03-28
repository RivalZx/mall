package com.hezx.mmall.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author hezx
 * @since 2022-03-28
 */
@TableName("mmall_user")
@ApiModel(value = "MmallUser对象", description = "")
public class MmallUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户表id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("用户密码，MD5加密")
    private String password;

    private String email;

    private String phone;

    @ApiModelProperty("找回密码问题")
    private String question;

    @ApiModelProperty("找回密码答案")
    private String answer;

    @ApiModelProperty("角色0-管理员,1-普通用户")
    private Integer role;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("最后一次更新时间")
    private LocalDateTime updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "MmallUser{" +
        "id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", email=" + email +
        ", phone=" + phone +
        ", question=" + question +
        ", answer=" + answer +
        ", role=" + role +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
