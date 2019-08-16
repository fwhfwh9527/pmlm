package cn.bdqn.entity;


public class Comment {

  private long cId;             //主键
  private long sId;   //商品外键ID
  private String comment;   //评论内容
  private long uId;   //用户外键ID
  private String cTime;    //评论时间


  public long getCId() {
    return cId;
  }

  public void setCId(long cId) {
    this.cId = cId;
  }


  public long getSId() {
    return sId;
  }

  public void setSId(long sId) {
    this.sId = sId;
  }


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public String getCTime() {
    return cTime;
  }

  public void setCTime(String cTime) {
    this.cTime = cTime;
  }

}
