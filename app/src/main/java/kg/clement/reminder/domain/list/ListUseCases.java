package kg.clement.reminder.domain.list;

import kg.clement.reminder.model.ReminderEntity;

import java.util.List;

public interface ListUseCases {
    List getList();
    ReminderEntity getReminder();
}
