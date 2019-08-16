package cn.bdqn.entity;


public class Brand {

  private long bId;         //主键
  private String bName;   //品牌名
  private long bState;    //品牌状态
  private long country;   //区域外键


  public long getBId() {
    return bId;
  }

  public void setBId(long bId) {
    this.bId = bId;
  }


  public String getBName() {
    return bName;
  }

  public void setBName(String bName) {
    this.bName = bName;
  }


  public long getBState() {
    return bState;
  }

  public void setBState(long bState) {
    this.bState = bState;
  }


  public long getCountry() {
    return country;
  }

  public void setCountry(long country) {
    this.country = country;
  }

}
