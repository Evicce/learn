package com.example.demo.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("User")
public class UserEntity {
    @TableId
    private Integer id;
    @TableField
    private String name;
    @TableField

    private Integer age;
}
