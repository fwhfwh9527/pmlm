package cn.bdqn.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author YangZhiJie
 * @since 2019-08-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Img implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("imgId")
    private Integer imgId;

    private String img;

    /**
     * 商品
     */
    @TableField("sId")
    private Integer sId;

    /**
     * 帖子
     */
    @TableField("fId")
    private Integer fId;

    /**
     * 商品评论
     */
    @TableField("cId")
    private Integer cId;

    /**
     * 帖子评论
     */
    @TableField("fcId")
    private Integer fcId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }
}
