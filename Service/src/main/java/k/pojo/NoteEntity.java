package k.pojo;
import javax.persistence.*;

/**
 * Created by ykk on 2017/3/25.
 */
@Entity
@Table(name = "note", schema = "", catalog = "journey")
public class NoteEntity {
    private String noteid;
    private String notecontent;
    private Integer tagid;
    private Integer notetime;
    private Integer notestate;
    private String noteinfo;

    @Id
    @Column(name = "noteid")
    public String getNoteid() {
        return noteid;
    }

    public void setNoteid(String noteid) {
        this.noteid = noteid;
    }

    @Basic
    @Column(name = "notecontent")
    public String getNotecontent() {
        return notecontent;
    }

    public void setNotecontent(String notecontent) {
        this.notecontent = notecontent;
    }

    @Basic
    @Column(name = "tagid")
    public Integer getTagid() {
        return tagid;
    }

    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    @Basic
    @Column(name = "notetime")
    public Integer getNotetime() {
        return notetime;
    }

    public void setNotetime(Integer notetime) {
        this.notetime = notetime;
    }

    @Basic
    @Column(name = "notestate")
    public Integer getNotestate() {
        return notestate;
    }

    public void setNotestate(Integer notestate) {
        this.notestate = notestate;
    }

    @Basic
    @Column(name = "noteinfo")
    public String getNoteinfo() {
        return noteinfo;
    }

    public void setNoteinfo(String noteinfo) {
        this.noteinfo = noteinfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoteEntity that = (NoteEntity) o;

        if (notecontent != null ? !notecontent.equals(that.notecontent) : that.notecontent != null) return false;
        if (noteid != null ? !noteid.equals(that.noteid) : that.noteid != null) return false;
        if (noteinfo != null ? !noteinfo.equals(that.noteinfo) : that.noteinfo != null) return false;
        if (notestate != null ? !notestate.equals(that.notestate) : that.notestate != null) return false;
        if (notetime != null ? !notetime.equals(that.notetime) : that.notetime != null) return false;
        if (tagid != null ? !tagid.equals(that.tagid) : that.tagid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noteid != null ? noteid.hashCode() : 0;
        result = 31 * result + (notecontent != null ? notecontent.hashCode() : 0);
        result = 31 * result + (tagid != null ? tagid.hashCode() : 0);
        result = 31 * result + (notetime != null ? notetime.hashCode() : 0);
        result = 31 * result + (notestate != null ? notestate.hashCode() : 0);
        result = 31 * result + (noteinfo != null ? noteinfo.hashCode() : 0);
        return result;
    }
}
