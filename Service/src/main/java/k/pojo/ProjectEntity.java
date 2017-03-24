package k.pojo;
import javax.persistence.*;

/**
 * Created by ykk on 2017/3/25.
 */
@Entity
@Table(name = "project", schema = "", catalog = "journey")
public class ProjectEntity {
    private String projid;
    private String projname;
    private Integer projbegin;
    private Integer projend;
    private String projcontext;
    private String projinfo;

    @Id
    @Column(name = "projid")
    public String getProjid() {
        return projid;
    }

    public void setProjid(String projid) {
        this.projid = projid;
    }

    @Basic
    @Column(name = "projname")
    public String getProjname() {
        return projname;
    }

    public void setProjname(String projname) {
        this.projname = projname;
    }

    @Basic
    @Column(name = "projbegin")
    public Integer getProjbegin() {
        return projbegin;
    }

    public void setProjbegin(Integer projbegin) {
        this.projbegin = projbegin;
    }

    @Basic
    @Column(name = "projend")
    public Integer getProjend() {
        return projend;
    }

    public void setProjend(Integer projend) {
        this.projend = projend;
    }

    @Basic
    @Column(name = "projcontext")
    public String getProjcontext() {
        return projcontext;
    }

    public void setProjcontext(String projcontext) {
        this.projcontext = projcontext;
    }

    @Basic
    @Column(name = "projinfo")
    public String getProjinfo() {
        return projinfo;
    }

    public void setProjinfo(String projinfo) {
        this.projinfo = projinfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectEntity that = (ProjectEntity) o;

        if (projbegin != null ? !projbegin.equals(that.projbegin) : that.projbegin != null) return false;
        if (projcontext != null ? !projcontext.equals(that.projcontext) : that.projcontext != null) return false;
        if (projend != null ? !projend.equals(that.projend) : that.projend != null) return false;
        if (projid != null ? !projid.equals(that.projid) : that.projid != null) return false;
        if (projinfo != null ? !projinfo.equals(that.projinfo) : that.projinfo != null) return false;
        if (projname != null ? !projname.equals(that.projname) : that.projname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projid != null ? projid.hashCode() : 0;
        result = 31 * result + (projname != null ? projname.hashCode() : 0);
        result = 31 * result + (projbegin != null ? projbegin.hashCode() : 0);
        result = 31 * result + (projend != null ? projend.hashCode() : 0);
        result = 31 * result + (projcontext != null ? projcontext.hashCode() : 0);
        result = 31 * result + (projinfo != null ? projinfo.hashCode() : 0);
        return result;
    }
}
