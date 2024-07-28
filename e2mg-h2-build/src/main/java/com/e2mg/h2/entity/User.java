package com.e2mg.h2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
//使用JPA注解配置映射关系
@Entity //告诉JPA这是一个实体类（和数据表映射的类）
@Table(name = "tbl_user") //@Table来指定和哪个数据表对应;如果省略默认表名就是user；
public class User {

    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "your_sequence_generator")
    @SequenceGenerator(name = "your_sequence_generator", sequenceName = "your_sequence_name", allocationSize = 1)
    private Long id;

    @Column(name = "name", length = 50) //这是和数据表对应的一个列
    private String name;
}