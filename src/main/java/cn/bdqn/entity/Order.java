package cn.bdqn.entity;


public class Order {

  private long oId;     //主键
  private String oBh;     //订单编号
  private long uId;     //用户id
  private long aId;     //地址表id
  private double oPrice;      //总价格


  public long getOId() {
    return oId;
  }

  public void setOId(long oId) {
    this.oId = oId;
  }


  public String getOBh() {
    return oBh;
  }

  public void setOBh(String oBh) {
    this.oBh = oBh;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public long getAId() {
    return aId;
  }

  public void setAId(long aId) {
    this.aId = aId;
  }


  public double getOPrice() {
    return oPrice;
  }

  public void setOPrice(double oPrice) {
    this.oPrice = oPrice;
  }

}
