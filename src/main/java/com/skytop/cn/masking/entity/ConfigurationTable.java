package com.skytop.cn.masking.entity;

import java.io.Serializable;

/**
 * (ConfigurationTable)实体类
 *
 * @author makejava
 * @since 2022-08-13 14:19:59
 */
public class ConfigurationTable implements Serializable {
    private static final long serialVersionUID = -60769877577584661L;
    
    private String dbTableColumn;
    
    private String desensitizationFunc;


    public String getDbTableColumn() {
        return dbTableColumn;
    }

    public void setDbTableColumn(String dbTableColumn) {
        this.dbTableColumn = dbTableColumn;
    }

    public String getDesensitizationFunc() {
        return desensitizationFunc;
    }

    public void setDesensitizationFunc(String desensitizationFunc) {
        this.desensitizationFunc = desensitizationFunc;
    }

}

