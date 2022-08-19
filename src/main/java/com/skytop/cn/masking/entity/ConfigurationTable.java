package com.skytop.cn.masking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * (ConfigurationTable)实体类
 *
 * @author makejava
 * @since 2022-08-13 14:19:59
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigurationTable implements Serializable {

    private String dbTableColumn;
    
    private String desensitizationFunc;



}

