package kg.clement.reminder.data.model;

import java.util.Date;

import io.realm.RealmObject;

public class RReminderEntity extends RealmObject {

    private Integer id;
    private String title;
    private String text;
    private Date whenAlarm;

    public RReminderEntity(String title, String text, Date whenAlarm) {
        this.title = title;
        this.text = text;
        this.whenAlarm = whenAlarm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getWhenAlarm() {
        return whenAlarm;
    }

    public void setWhenAlarm(Date whenAlarm) {
        this.whenAlarm = whenAlarm;
    }
}
