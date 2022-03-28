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
@TableName("mmall_category")
@ApiModel(value = "MmallCategory对象", description = "")
public class MmallCategory {

    @ApiModelProperty("类别Id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("父类别id当id=0时说明是根节点,一级类别")
    @TableField("parent_id")
    private Integer parentId;

    @ApiModelProperty("类别名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("类别状态1-正常,2-已废弃")
    @TableField("status")
    private Boolean status;

    @ApiModelProperty("排序编号,同类展示顺序,数值相等则自然排序")
    @TableField("sort_order")
    private Integer sortOrder;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;


}
