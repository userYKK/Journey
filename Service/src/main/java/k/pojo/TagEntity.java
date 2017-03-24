package k.pojo;
import javax.persistence.*;

/**
 * Created by ykk on 2017/3/25.
 */
@Entity
@Table(name = "tag", schema = "", catalog = "journey")
public class TagEntity {
    private String tagid;
    private String tagname;
    private Integer notenum;
    private String taginfo;

    @Id
    @Column(name = "tagid")
    public String getTagid() {
        return tagid;
    }

    public void setTagid(String tagid) {
        this.tagid = tagid;
    }

    @Basic
    @Column(name = "tagname")
    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    @Basic
    @Column(name = "notenum")
    public Integer getNotenum() {
        return notenum;
    }

    public void setNotenum(Integer notenum) {
        this.notenum = notenum;
    }

    @Basic
    @Column(name = "taginfo")
    public String getTaginfo() {
        return taginfo;
    }

    public void setTaginfo(String taginfo) {
        this.taginfo = taginfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TagEntity tagEntity = (TagEntity) o;

        if (notenum != null ? !notenum.equals(tagEntity.notenum) : tagEntity.notenum != null) return false;
        if (tagid != null ? !tagid.equals(tagEntity.tagid) : tagEntity.tagid != null) return false;
        if (taginfo != null ? !taginfo.equals(tagEntity.taginfo) : tagEntity.taginfo != null) return false;
        if (tagname != null ? !tagname.equals(tagEntity.tagname) : tagEntity.tagname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tagid != null ? tagid.hashCode() : 0;
        result = 31 * result + (tagname != null ? tagname.hashCode() : 0);
        result = 31 * result + (notenum != null ? notenum.hashCode() : 0);
        result = 31 * result + (taginfo != null ? taginfo.hashCode() : 0);
        return result;
    }
}
