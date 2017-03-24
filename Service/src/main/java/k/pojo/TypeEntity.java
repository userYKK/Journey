package k.pojo;
import javax.persistence.*;

/**
 * Created by ykk on 2017/3/25.
 */
@Entity
@Table(name = "type", schema = "", catalog = "journey")
public class TypeEntity {
    private String tyid;
    private String tyname;
    private String typid;
    private String tyinfo;
    private String iconcls;

    @Id
    @Column(name = "tyid")
    public String getTyid() {
        return tyid;
    }

    public void setTyid(String tyid) {
        this.tyid = tyid;
    }

    @Basic
    @Column(name = "tyname")
    public String getTyname() {
        return tyname;
    }

    public void setTyname(String tyname) {
        this.tyname = tyname;
    }

    @Basic
    @Column(name = "typid")
    public String getTypid() {
        return typid;
    }

    public void setTypid(String typid) {
        this.typid = typid;
    }

    @Basic
    @Column(name = "tyinfo")
    public String getTyinfo() {
        return tyinfo;
    }

    public void setTyinfo(String tyinfo) {
        this.tyinfo = tyinfo;
    }

    @Basic
    @Column(name = "iconcls")
    public String getIconcls() {
        return iconcls;
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeEntity that = (TypeEntity) o;

        if (iconcls != null ? !iconcls.equals(that.iconcls) : that.iconcls != null) return false;
        if (tyid != null ? !tyid.equals(that.tyid) : that.tyid != null) return false;
        if (tyinfo != null ? !tyinfo.equals(that.tyinfo) : that.tyinfo != null) return false;
        if (tyname != null ? !tyname.equals(that.tyname) : that.tyname != null) return false;
        if (typid != null ? !typid.equals(that.typid) : that.typid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tyid != null ? tyid.hashCode() : 0;
        result = 31 * result + (tyname != null ? tyname.hashCode() : 0);
        result = 31 * result + (typid != null ? typid.hashCode() : 0);
        result = 31 * result + (tyinfo != null ? tyinfo.hashCode() : 0);
        result = 31 * result + (iconcls != null ? iconcls.hashCode() : 0);
        return result;
    }
}
