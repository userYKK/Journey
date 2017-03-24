package k.pojo;
import javax.persistence.*;

/**
 * Created by ykk on 2017/3/25.
 */
@Entity
@Table(name = "company", schema = "", catalog = "journey")
public class CompanyEntity {
    private String cmpid;
    private String cmpname;
    private String cmpurl;
    private String cmpaddress;
    private String cmpinfo;

    @Id
    @Column(name = "cmpid")
    public String getCmpid() {
        return cmpid;
    }

    public void setCmpid(String cmpid) {
        this.cmpid = cmpid;
    }

    @Basic
    @Column(name = "cmpname")
    public String getCmpname() {
        return cmpname;
    }

    public void setCmpname(String cmpname) {
        this.cmpname = cmpname;
    }

    @Basic
    @Column(name = "cmpurl")
    public String getCmpurl() {
        return cmpurl;
    }

    public void setCmpurl(String cmpurl) {
        this.cmpurl = cmpurl;
    }

    @Basic
    @Column(name = "cmpaddress")
    public String getCmpaddress() {
        return cmpaddress;
    }

    public void setCmpaddress(String cmpaddress) {
        this.cmpaddress = cmpaddress;
    }

    @Basic
    @Column(name = "cmpinfo")
    public String getCmpinfo() {
        return cmpinfo;
    }

    public void setCmpinfo(String cmpinfo) {
        this.cmpinfo = cmpinfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompanyEntity that = (CompanyEntity) o;

        if (cmpaddress != null ? !cmpaddress.equals(that.cmpaddress) : that.cmpaddress != null) return false;
        if (cmpid != null ? !cmpid.equals(that.cmpid) : that.cmpid != null) return false;
        if (cmpinfo != null ? !cmpinfo.equals(that.cmpinfo) : that.cmpinfo != null) return false;
        if (cmpname != null ? !cmpname.equals(that.cmpname) : that.cmpname != null) return false;
        if (cmpurl != null ? !cmpurl.equals(that.cmpurl) : that.cmpurl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cmpid != null ? cmpid.hashCode() : 0;
        result = 31 * result + (cmpname != null ? cmpname.hashCode() : 0);
        result = 31 * result + (cmpurl != null ? cmpurl.hashCode() : 0);
        result = 31 * result + (cmpaddress != null ? cmpaddress.hashCode() : 0);
        result = 31 * result + (cmpinfo != null ? cmpinfo.hashCode() : 0);
        return result;
    }
}
