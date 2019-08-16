package cn.bdqn.entity;


public class Address {

  private long aId;         //主键
  private long uId;   //用户id
  private String aName;   //收货人名字
  private String aPhone;    //收货手机号
  private String address;   //收货人地址
  private long aState;    //地址状态


  public long getAId() {
    return aId;
  }

  public void setAId(long aId) {
    this.aId = aId;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public String getAName() {
    return aName;
  }

  public void setAName(String aName) {
    this.aName = aName;
  }


  public String getAPhone() {
    return aPhone;
  }

  public void setAPhone(String aPhone) {
    this.aPhone = aPhone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public long getAState() {
    return aState;
  }

  public void setAState(long aState) {
    this.aState = aState;
  }

}
