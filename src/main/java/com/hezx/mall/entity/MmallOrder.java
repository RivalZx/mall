package com.hezx.mall.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
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
@TableName("mmall_order")
@ApiModel(value = "MmallOrder对象", description = "")
public class MmallOrder {

    @ApiModelProperty("订单id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("订单号")
    @TableField("order_no")
    private Long orderNo;

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Integer userId;

    @TableField("shipping_id")
    private Integer shippingId;

    @ApiModelProperty("实际付款金额,单位是元,保留两位小数")
    @TableField("payment")
    private BigDecimal payment;

    @ApiModelProperty("支付类型,1-在线支付")
    @TableField("payment_type")
    private Integer paymentType;

    @ApiModelProperty("运费,单位是元")
    @TableField("postage")
    private Integer postage;

    @ApiModelProperty("订单状态:0-已取消-10-未付款，20-已付款，40-已发货，50-交易成功，60-交易关闭")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("支付时间")
    @TableField("payment_time")
    private LocalDateTime paymentTime;

    @ApiModelProperty("发货时间")
    @TableField("send_time")
    private LocalDateTime sendTime;

    @ApiModelProperty("交易完成时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty("交易关闭时间")
    @TableField("close_time")
    private LocalDateTime closeTime;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;


}
