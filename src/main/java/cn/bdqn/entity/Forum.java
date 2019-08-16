package cn.bdqn.entity;


public class Forum {

  private long fId;           //主键
  private long uId;     //用户id
  private String fHeadLine;     //标题
  private java.sql.Date fDate;      //时间
  private String fContent;      //内容
  private long fNice;     //点赞数
  private long sId;     //商品外键
  private long bId;     //品牌外键
  private long fNumber;     //评论数


  public long getFId() {
    return fId;
  }

  public void setFId(long fId) {
    this.fId = fId;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public String getFHeadLine() {
    return fHeadLine;
  }

  public void setFHeadLine(String fHeadLine) {
    this.fHeadLine = fHeadLine;
  }


  public java.sql.Date getFDate() {
    return fDate;
  }

  public void setFDate(java.sql.Date fDate) {
    this.fDate = fDate;
  }


  public String getFContent() {
    return fContent;
  }

  public void setFContent(String fContent) {
    this.fContent = fContent;
  }


  public long getFNice() {
    return fNice;
  }

  public void setFNice(long fNice) {
    this.fNice = fNice;
  }


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


  public long getFNumber() {
    return fNumber;
  }

  public void setFNumber(long fNumber) {
    this.fNumber = fNumber;
  }

}
