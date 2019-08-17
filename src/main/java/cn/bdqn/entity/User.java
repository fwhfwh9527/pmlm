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
public class User implements Serializable {

  private static final long serialVersionUID = 1L;

  @TableId(value = "uId", type = IdType.AUTO)
  private Integer uId;

  @TableField("uPhone")
  private String uPhone;

  @TableField("uAccount")
  private String uAccount;

  @TableField("uName")
  private String uName;

  @TableField("uPassword")
  private String uPassword;

  @TableField("uImg")
  private String uImg;

  /**
   * 角色
   */
  private Integer role;

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public Integer getuId() {
    return uId;
  }

  public void setuId(Integer uId) {
    this.uId = uId;
  }

  public String getuPhone() {
    return uPhone;
  }

  public void setuPhone(String uPhone) {
    this.uPhone = uPhone;
  }

  public String getuAccount() {
    return uAccount;
  }

  public void setuAccount(String uAccount) {
    this.uAccount = uAccount;
  }

  public String getuName() {
    return uName;
  }

  public void setuName(String uName) {
    this.uName = uName;
  }

  public String getuPassword() {
    return uPassword;
  }

  public void setuPassword(String uPassword) {
    this.uPassword = uPassword;
  }

  public String getuImg() {
    return uImg;
  }

  public void setuImg(String uImg) {
    this.uImg = uImg;
  }

  public Integer getRole() {
    return role;
  }

  public void setRole(Integer role) {
    this.role = role;
  }
}
