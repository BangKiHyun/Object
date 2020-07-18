package com.object.command_query;

import java.time.Duration;
import java.time.LocalDateTime;

//특정 일자에 실제로 발생하는 사건
public class Event {
    private String subject;
    private LocalDateTime from;
    private Duration duration;

    public Event(final String subject, final LocalDateTime from, final Duration duration) {
        this.subject = subject;
        this.from = from;
        this.duration = duration;
    }

    public boolean isSatisfied(final RecurringSchedule schedule) { //명령과 쿼리 두 가지 역할 수행
        if (from.getDayOfWeek() != schedule.getDayOfWeek() ||
                !from.toLocalDate().equals(schedule.getFrom()) ||
                !duration.equals(schedule.getDuration())) {
            reschedule(schedule); //상태 수정
            return false;
        }

        return true;
    }

    private void reschedule(final RecurringSchedule schedule) {
        from = LocalDateTime.of(from.toLocalDate().plusDays(dayDistance(schedule)),
                schedule.getFrom());
        duration = schedule.getDuration();
    }

    private long dayDistance(final RecurringSchedule schedule) {
        return schedule.getDayOfWeek().getValue() - from.getDayOfWeek().getValue();
    }
}
