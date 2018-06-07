package pl.korbeldaniel.erp2.data.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
        @NamedQuery(name = ContactEntity.ALL_CONTACTS_QUERY, query = "SELECT c FROM ContactEntity c ORDER BY c.id")
})
public class ContactEntity {

    public static final String ALL_CONTACTS_QUERY = "allContacts";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String fullname;

    private String nickname;

    private String phonenumber;

    private String email;

    private Date birthday;

    private String notes;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[Contact: id=")
                .append(id)
                .append(", nickname=")
                .append(nickname)
                .append(", fullname=")
                .append(fullname)
                .append(", phonenumber=")
                .append(phonenumber)
                .append(", email=")
                .append(email)
                .append(", birthday=")
                .append(", notes=\"")
                .append(notes.substring(0, 20) + (notes.length() > 20 ? "..." : ""));

        return builder.toString();
    }

    @Override
    public boolean equals(final Object obj) {
        return (obj instanceof ContactEntity) && ((ContactEntity) obj).getId() != 0 && ((ContactEntity) obj).getId() == getId();
    }

    @Override
    public int hashCode() {
        return (int) getId();
    }

}
