package cn.bdqn.entity;


public class Fcomment {

  private long fcId;            //主键
  private long uId;   //用户外键
  private String fcContent;   //帖子评论内容
  private java.sql.Date fcTime;   //回复时间
  private  String fcimg;        //评论图片外键
  private long fcNice;    //点赞数
  private long fId;   //评论对应的帖子
  private long fcfId;


  public long getFcId() {
    return fcId;
  }

  public void setFcId(long fcId) {
    this.fcId = fcId;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public String getFcContent() {
    return fcContent;
  }

  public void setFcContent(String fcContent) {
    this.fcContent = fcContent;
  }


  public java.sql.Date getFcTime() {
    return fcTime;
  }

  public void setFcTime(java.sql.Date fcTime) {
    this.fcTime = fcTime;
  }


  public long getFcNice() {
    return fcNice;
  }

  public void setFcNice(long fcNice) {
    this.fcNice = fcNice;
  }


  public long getFId() {
    return fId;
  }

  public void setFId(long fId) {
    this.fId = fId;
  }


  public long getFcfId() {
    return fcfId;
  }

  public void setFcfId(long fcfId) {
    this.fcfId = fcfId;
  }

}
