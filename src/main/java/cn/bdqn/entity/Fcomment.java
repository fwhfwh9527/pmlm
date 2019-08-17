package cn.bdqn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author YangZhiJie
 * @since 2019-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Fcomment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "fcId", type = IdType.AUTO)
    private Integer fcId;

    @TableField("uId")
    private Integer uId;

    @TableField("fcContent")
    private String fcContent;

    @TableField("fcTime")
    private LocalDate fcTime;

    @TableField("fcNice")
    private Integer fcNice;

    @TableField("fId")
    private Integer fId;

    @TableField("fcfId")
    private Integer fcfId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getFcContent() {
        return fcContent;
    }

    public void setFcContent(String fcContent) {
        this.fcContent = fcContent;
    }

    public LocalDate getFcTime() {
        return fcTime;
    }

    public void setFcTime(LocalDate fcTime) {
        this.fcTime = fcTime;
    }

    public Integer getFcNice() {
        return fcNice;
    }

    public void setFcNice(Integer fcNice) {
        this.fcNice = fcNice;
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Integer getFcfId() {
        return fcfId;
    }

    public void setFcfId(Integer fcfId) {
        this.fcfId = fcfId;
    }
}
