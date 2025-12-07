package com.ruoyi.project.system.zhiyuanxinxi.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 职员对应表对象 zhiyuanxinxi
 * 
 * @author ruoyi
 * @date 2025-12-06
 */
public class Zhiyuanxinxi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long idzhiyuanxinxi;

    /** 源名字 */
    @Excel(name = "源名字")
    private String 源名字;

    /** 目标名字 */
    @Excel(name = "目标名字")
    private String 目标名字;

    /** 源组织 */
    @Excel(name = "源组织")
    private String 源组织;

    /** 目标组织 */
    @Excel(name = "目标组织")
    private String 目标组织;

    public void setIdzhiyuanxinxi(Long idzhiyuanxinxi) 
    {
        this.idzhiyuanxinxi = idzhiyuanxinxi;
    }

    public Long getIdzhiyuanxinxi() 
    {
        return idzhiyuanxinxi;
    }

    public void set源名字(String 源名字) 
    {
        this.源名字 = 源名字;
    }

    public String get源名字() 
    {
        return 源名字;
    }

    public void set目标名字(String 目标名字) 
    {
        this.目标名字 = 目标名字;
    }

    public String get目标名字() 
    {
        return 目标名字;
    }

    public void set源组织(String 源组织) 
    {
        this.源组织 = 源组织;
    }

    public String get源组织() 
    {
        return 源组织;
    }

    public void set目标组织(String 目标组织) 
    {
        this.目标组织 = 目标组织;
    }

    public String get目标组织() 
    {
        return 目标组织;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("idzhiyuanxinxi", getIdzhiyuanxinxi())
            .append("源名字", get源名字())
            .append("目标名字", get目标名字())
            .append("源组织", get源组织())
            .append("目标组织", get目标组织())
            .toString();
    }
}
