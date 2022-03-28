package com.hezx.mall.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author hezx
 * @since 2022-03-28 10:14:20
 */
@Data
@TableName("mmall_user")
@ApiModel(value = "MmallUser对象", description = "")
public class MmallUser {
    

    @ApiModelProperty("用户表id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty("用户密码，MD5加密")
    @TableField("password")
    private String password;

    @TableField("email")
    private String email;

    @TableField("phone")
    private String phone;

    @ApiModelProperty("找回密码问题")
    @TableField("question")
    private String question;

    @ApiModelProperty("找回密码答案")
    @TableField("answer")
    private String answer;

    @ApiModelProperty("角色0-管理员,1-普通用户")
    @TableField("role")
    private Integer role;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("最后一次更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;
    
    public MmallUser(Integer id, String username, String password, String email, String phone, String question, String answer, Integer role, LocalDateTime createTime, LocalDateTime updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.question = question;
        this.answer = answer;
        this.role = role;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
