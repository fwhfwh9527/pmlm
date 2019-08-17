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
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "aId", type = IdType.AUTO)
    private Integer aId;

    @TableField("uId")
    private Integer uId;

    @TableField("aName")
    private String aName;

    @TableField("aPhone")
    private String aPhone;

    private String address;

    @TableField("aState")
    private Integer aState;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaPhone() {
        return aPhone;
    }

    public void setaPhone(String aPhone) {
        this.aPhone = aPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getaState() {
        return aState;
    }

    public void setaState(Integer aState) {
        this.aState = aState;
    }
}
