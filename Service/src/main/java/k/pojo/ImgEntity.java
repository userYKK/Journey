package k.pojo;

import java.util.Arrays;
import javax.persistence.*;

/**
 * Created by ykk on 2017/3/25.
 */
@Entity
@Table(name = "img", schema = "", catalog = "journey")
public class ImgEntity {
    private String imgid;
    private String imgname;
    private String imgurl;
    private byte[] imgcontent;
    private String imginfo;

    @Id
    @Column(name = "imgid")
    public String getImgid() {
        return imgid;
    }

    public void setImgid(String imgid) {
        this.imgid = imgid;
    }

    @Basic
    @Column(name = "imgname")
    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }

    @Basic
    @Column(name = "imgurl")
    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    @Basic
    @Column(name = "imgcontent")
    public byte[] getImgcontent() {
        return imgcontent;
    }

    public void setImgcontent(byte[] imgcontent) {
        this.imgcontent = imgcontent;
    }

    @Basic
    @Column(name = "imginfo")
    public String getImginfo() {
        return imginfo;
    }

    public void setImginfo(String imginfo) {
        this.imginfo = imginfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImgEntity imgEntity = (ImgEntity) o;

        if (!Arrays.equals(imgcontent, imgEntity.imgcontent)) return false;
        if (imgid != null ? !imgid.equals(imgEntity.imgid) : imgEntity.imgid != null) return false;
        if (imginfo != null ? !imginfo.equals(imgEntity.imginfo) : imgEntity.imginfo != null) return false;
        if (imgname != null ? !imgname.equals(imgEntity.imgname) : imgEntity.imgname != null) return false;
        if (imgurl != null ? !imgurl.equals(imgEntity.imgurl) : imgEntity.imgurl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = imgid != null ? imgid.hashCode() : 0;
        result = 31 * result + (imgname != null ? imgname.hashCode() : 0);
        result = 31 * result + (imgurl != null ? imgurl.hashCode() : 0);
        result = 31 * result + (imgcontent != null ? Arrays.hashCode(imgcontent) : 0);
        result = 31 * result + (imginfo != null ? imginfo.hashCode() : 0);
        return result;
    }
}
