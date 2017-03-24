package k.pojo;

import java.util.Arrays;
import javax.persistence.*;

/**
 * Created by ykk on 2017/3/25.
 */
@Entity
@Table(name = "url", schema = "", catalog = "journey")
public class UrlEntity {
    private String urlid;
    private String urlcontent;
    private String urlpath;
    private byte[] filecontent;
    private Integer fileok;
    private String urlinfo;

    @Id
    @Column(name = "urlid")
    public String getUrlid() {
        return urlid;
    }

    public void setUrlid(String urlid) {
        this.urlid = urlid;
    }

    @Basic
    @Column(name = "urlcontent")
    public String getUrlcontent() {
        return urlcontent;
    }

    public void setUrlcontent(String urlcontent) {
        this.urlcontent = urlcontent;
    }

    @Basic
    @Column(name = "urlpath")
    public String getUrlpath() {
        return urlpath;
    }

    public void setUrlpath(String urlpath) {
        this.urlpath = urlpath;
    }

    @Basic
    @Column(name = "filecontent")
    public byte[] getFilecontent() {
        return filecontent;
    }

    public void setFilecontent(byte[] filecontent) {
        this.filecontent = filecontent;
    }

    @Basic
    @Column(name = "fileok")
    public Integer getFileok() {
        return fileok;
    }

    public void setFileok(Integer fileok) {
        this.fileok = fileok;
    }

    @Basic
    @Column(name = "urlinfo")
    public String getUrlinfo() {
        return urlinfo;
    }

    public void setUrlinfo(String urlinfo) {
        this.urlinfo = urlinfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UrlEntity urlEntity = (UrlEntity) o;

        if (!Arrays.equals(filecontent, urlEntity.filecontent)) return false;
        if (fileok != null ? !fileok.equals(urlEntity.fileok) : urlEntity.fileok != null) return false;
        if (urlcontent != null ? !urlcontent.equals(urlEntity.urlcontent) : urlEntity.urlcontent != null) return false;
        if (urlid != null ? !urlid.equals(urlEntity.urlid) : urlEntity.urlid != null) return false;
        if (urlinfo != null ? !urlinfo.equals(urlEntity.urlinfo) : urlEntity.urlinfo != null) return false;
        if (urlpath != null ? !urlpath.equals(urlEntity.urlpath) : urlEntity.urlpath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = urlid != null ? urlid.hashCode() : 0;
        result = 31 * result + (urlcontent != null ? urlcontent.hashCode() : 0);
        result = 31 * result + (urlpath != null ? urlpath.hashCode() : 0);
        result = 31 * result + (filecontent != null ? Arrays.hashCode(filecontent) : 0);
        result = 31 * result + (fileok != null ? fileok.hashCode() : 0);
        result = 31 * result + (urlinfo != null ? urlinfo.hashCode() : 0);
        return result;
    }
}
