package kg.clement.reminder.model;

import java.util.Date;

public class ReminderEntity {
    private String title;
    private String text;
    private Date whenAlarm;

    public ReminderEntity(String title, String info, Date whenAlarm) {
        this.title = title;
        this.text = info;
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
