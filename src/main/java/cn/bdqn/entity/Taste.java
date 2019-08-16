package cn.bdqn.entity;


public class Taste {

  private long tid;         //主键
  private String tName;   //口味
  private long tState;    //状态


  public long getTid() {
    return tid;
  }

  public void setTid(long tid) {
    this.tid = tid;
  }


  public String getTName() {
    return tName;
  }

  public void setTName(String tName) {
    this.tName = tName;
  }


  public long getTState() {
    return tState;
  }

  public void setTState(long tState) {
    this.tState = tState;
  }

}
