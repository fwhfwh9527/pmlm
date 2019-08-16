package cn.bdqn.entity;


public class User {

  private long uId;           //主键
  private String uPhone;    //手机号
  private String uAccount;    //账号
  private String uName;   //用户昵称
  private String uPassword;   //密码
  private String uImg;    //头像路径
  private long role;    //身份


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public String getUPhone() {
    return uPhone;
  }

  public void setUPhone(String uPhone) {
    this.uPhone = uPhone;
  }


  public String getUAccount() {
    return uAccount;
  }

  public void setUAccount(String uAccount) {
    this.uAccount = uAccount;
  }


  public String getUName() {
    return uName;
  }

  public void setUName(String uName) {
    this.uName = uName;
  }


  public String getUPassword() {
    return uPassword;
  }

  public void setUPassword(String uPassword) {
    this.uPassword = uPassword;
  }


  public String getUImg() {
    return uImg;
  }

  public void setUImg(String uImg) {
    this.uImg = uImg;
  }


  public long getRole() {
    return role;
  }

  public void setRole(long role) {
    this.role = role;
  }

}
