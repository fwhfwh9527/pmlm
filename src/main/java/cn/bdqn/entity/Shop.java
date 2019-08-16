package cn.bdqn.entity;


public class Shop {

  private long sId;         //主键
  private long bId;     //品牌外键
  private long tId;     //口味外键
  private String sName;     //商品名
  private double sPrice;      //价格
  private long sNumber;     //商品库存数
  private String sIntroduce;      //商品描述
  private long sState;      //商品状态
  private long sNum;      //销量


  public long getSId() {
    return sId;
  }

  public void setSId(long sId) {
    this.sId = sId;
  }


  public long getBId() {
    return bId;
  }

  public void setBId(long bId) {
    this.bId = bId;
  }


  public long getTId() {
    return tId;
  }

  public void setTId(long tId) {
    this.tId = tId;
  }


  public String getSName() {
    return sName;
  }

  public void setSName(String sName) {
    this.sName = sName;
  }


  public double getSPrice() {
    return sPrice;
  }

  public void setSPrice(double sPrice) {
    this.sPrice = sPrice;
  }


  public long getSNumber() {
    return sNumber;
  }

  public void setSNumber(long sNumber) {
    this.sNumber = sNumber;
  }


  public String getSIntroduce() {
    return sIntroduce;
  }

  public void setSIntroduce(String sIntroduce) {
    this.sIntroduce = sIntroduce;
  }


  public long getSState() {
    return sState;
  }

  public void setSState(long sState) {
    this.sState = sState;
  }


  public long getSNum() {
    return sNum;
  }

  public void setSNum(long sNum) {
    this.sNum = sNum;
  }

}
