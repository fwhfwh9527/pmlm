package cn.bdqn.entity;


public class Orderdetail {

  private long pId;     //主键
  private long oId;   //订单表id
  private long sId;   //商品id
  private long pNumber;   //购买商品数量
  private double pPrice;    //商品价格


  public long getPId() {
    return pId;
  }

  public void setPId(long pId) {
    this.pId = pId;
  }


  public long getOId() {
    return oId;
  }

  public void setOId(long oId) {
    this.oId = oId;
  }


  public long getSId() {
    return sId;
  }

  public void setSId(long sId) {
    this.sId = sId;
  }


  public long getPNumber() {
    return pNumber;
  }

  public void setPNumber(long pNumber) {
    this.pNumber = pNumber;
  }


  public double getPPrice() {
    return pPrice;
  }

  public void setPPrice(double pPrice) {
    this.pPrice = pPrice;
  }

}
