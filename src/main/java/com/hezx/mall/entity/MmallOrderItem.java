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
@TableName("mmall_order_item")
@ApiModel(value = "MmallOrderItem对象", description = "")
public class MmallOrderItem {

    @ApiModelProperty("订单子表id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("user_id")
    private Integer userId;

    @TableField("order_no")
    private Long orderNo;

    @ApiModelProperty("商品id")
    @TableField("product_id")
    private Integer productId;

    @ApiModelProperty("商品名称")
    @TableField("product_name")
    private String productName;

    @ApiModelProperty("商品图片地址")
    @TableField("product_image")
    private String productImage;

    @ApiModelProperty("生成订单时的商品单价，单位是元,保留两位小数")
    @TableField("current_unit_price")
    private BigDecimal currentUnitPrice;

    @ApiModelProperty("商品数量")
    @TableField("quantity")
    private Integer quantity;

    @ApiModelProperty("商品总价,单位是元,保留两位小数")
    @TableField("total_price")
    private BigDecimal totalPrice;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;


}
