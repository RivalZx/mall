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
 * @since 2022-03-28 10:14:19
 */
@Data
@TableName("mmall_cart")
@ApiModel(value = "MmallCart对象", description = "")
public class MmallCart {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty("商品id")
    @TableField("product_id")
    private Integer productId;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private Integer quantity;

    @ApiModelProperty("是否选择,1=已勾选,0=未勾选")
    @TableField("checked")
    private Integer checked;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;


}
