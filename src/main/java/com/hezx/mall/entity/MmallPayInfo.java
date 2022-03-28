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
@TableName("mmall_pay_info")
@ApiModel(value = "MmallPayInfo对象", description = "")
public class MmallPayInfo {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty("订单号")
    @TableField("order_no")
    private Long orderNo;

    @ApiModelProperty("支付平台:1-支付宝,2-微信")
    @TableField("pay_platform")
    private Integer payPlatform;

    @ApiModelProperty("支付宝支付流水号")
    @TableField("platform_number")
    private String platformNumber;

    @ApiModelProperty("支付宝支付状态")
    @TableField("platform_status")
    private String platformStatus;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;


}
