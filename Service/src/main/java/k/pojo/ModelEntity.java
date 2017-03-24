package k.pojo;

import javax.persistence.*;

/**
 * Created by ykk on 2017/3/25.
 */
@Entity
@Table(name = "model", schema = "", catalog = "journey")
public class ModelEntity {
    private String modid;
    private String modname;
    private String modinfo;

    @Id
    @Column(name = "modid")
    public String getModid() {
        return modid;
    }

    public void setModid(String modid) {
        this.modid = modid;
    }

    @Basic
    @Column(name = "modname")
    public String getModname() {
        return modname;
    }

    public void setModname(String modname) {
        this.modname = modname;
    }

    @Basic
    @Column(name = "modinfo")
    public String getModinfo() {
        return modinfo;
    }

    public void setModinfo(String modinfo) {
        this.modinfo = modinfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModelEntity that = (ModelEntity) o;

        if (modid != null ? !modid.equals(that.modid) : that.modid != null) return false;
        if (modinfo != null ? !modinfo.equals(that.modinfo) : that.modinfo != null) return false;
        if (modname != null ? !modname.equals(that.modname) : that.modname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = modid != null ? modid.hashCode() : 0;
        result = 31 * result + (modname != null ? modname.hashCode() : 0);
        result = 31 * result + (modinfo != null ? modinfo.hashCode() : 0);
        return result;
    }
}
