package cn.bdqn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "bId", type = IdType.AUTO)
    private Integer bId;

    @TableField("bName")
    private String bName;

    @TableField("bState")
    private Integer bState;

    private Integer country;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public Integer getbState() {
        return bState;
    }

    public void setbState(Integer bState) {
        this.bState = bState;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }
}
