package cn.bdqn.entity;


public class Img {

  private long imgId;     //主键
  private String img;   //图片
  private long sId;   //商品外键
  private long fId;   //用户外键
  private long cId;   //帖子外键
  private long fcId;    //回复外键


  public long getImgId() {
    return imgId;
  }

  public void setImgId(long imgId) {
    this.imgId = imgId;
  }


  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }


  public long getSId() {
    return sId;
  }

  public void setSId(long sId) {
    this.sId = sId;
  }


  public long getFId() {
    return fId;
  }

  public void setFId(long fId) {
    this.fId = fId;
  }


  public long getCId() {
    return cId;
  }

  public void setCId(long cId) {
    this.cId = cId;
  }


  public long getFcId() {
    return fcId;
  }

  public void setFcId(long fcId) {
    this.fcId = fcId;
  }

}
