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
@TableName("mmall_product")
@ApiModel(value = "MmallProduct对象", description = "")
public class MmallProduct {

    @ApiModelProperty("商品id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("分类id,对应mmall_category表的主键")
    @TableField("category_id")
    private Integer categoryId;

    @ApiModelProperty("商品名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("商品副标题")
    @TableField("subtitle")
    private String subtitle;

    @ApiModelProperty("产品主图,url相对地址")
    @TableField("main_image")
    private String mainImage;

    @ApiModelProperty("图片地址,json格式,扩展用")
    @TableField("sub_images")
    private String subImages;

    @ApiModelProperty("商品详情")
    @TableField("detail")
    private String detail;

    @ApiModelProperty("价格,单位-元保留两位小数")
    @TableField("price")
    private BigDecimal price;

    @ApiModelProperty("库存数量")
    @TableField("stock")
    private Integer stock;

    @ApiModelProperty("商品状态.1-在售 2-下架 3-删除")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;


}
