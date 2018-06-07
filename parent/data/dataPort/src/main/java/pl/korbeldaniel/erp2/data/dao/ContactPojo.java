package pl.korbeldaniel.erp2.data.dao;

import java.util.Date;

public class ContactPojo {

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
        return (obj instanceof ContactPojo) && ((ContactPojo) obj).getId() != 0 && ((ContactPojo) obj).getId() == getId();
    }

    @Override
    public int hashCode() {
        return (int) getId();
    }

}
