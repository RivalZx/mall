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
@TableName("mmall_shipping")
@ApiModel(value = "MmallShipping对象", description = "")
public class MmallShipping {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty("收货姓名")
    @TableField("receiver_name")
    private String receiverName;

    @ApiModelProperty("收货固定电话")
    @TableField("receiver_phone")
    private String receiverPhone;

    @ApiModelProperty("收货移动电话")
    @TableField("receiver_mobile")
    private String receiverMobile;

    @ApiModelProperty("省份")
    @TableField("receiver_province")
    private String receiverProvince;

    @ApiModelProperty("城市")
    @TableField("receiver_city")
    private String receiverCity;

    @ApiModelProperty("区/县")
    @TableField("receiver_district")
    private String receiverDistrict;

    @ApiModelProperty("详细地址")
    @TableField("receiver_address")
    private String receiverAddress;

    @ApiModelProperty("邮编")
    @TableField("receiver_zip")
    private String receiverZip;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;


}
