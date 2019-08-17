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
public class Forum implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "fId", type = IdType.AUTO)
    private Integer fId;

    @TableField("uId")
    private Integer uId;

    @TableField("fHeadLine")
    private String fHeadLine;

    @TableField("fDate")
    private LocalDate fDate;

    @TableField("fContent")
    private String fContent;

    @TableField("fNice")
    private Integer fNice;

    @TableField("sId")
    private Integer sId;

    @TableField("bId")
    private Integer bId;

    @TableField("fNumber")
    private Integer fNumber;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getfHeadLine() {
        return fHeadLine;
    }

    public void setfHeadLine(String fHeadLine) {
        this.fHeadLine = fHeadLine;
    }

    public LocalDate getfDate() {
        return fDate;
    }

    public void setfDate(LocalDate fDate) {
        this.fDate = fDate;
    }

    public String getfContent() {
        return fContent;
    }

    public void setfContent(String fContent) {
        this.fContent = fContent;
    }

    public Integer getfNice() {
        return fNice;
    }

    public void setfNice(Integer fNice) {
        this.fNice = fNice;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getfNumber() {
        return fNumber;
    }

    public void setfNumber(Integer fNumber) {
        this.fNumber = fNumber;
    }
}
