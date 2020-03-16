package org.bang.calculatePhoneRate.composition;

import org.bang.calculatePhoneRate.Inheritance.Call;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

public class TImeDayOfFeeCondition implements FeeCondition {
    private LocalTime from;
    private LocalTime to;

    public TImeDayOfFeeCondition(LocalTime from, LocalTime to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public List<DateTimeInterval> findTImeIntervals(Call call) {
        return call.splitByDay()
                .stream()
                .map(each ->
                        DateTimeInterval.of(LocalDateTime.of(each.getFrom().toLocalDate(), from(each)),
                                LocalDateTime.of(each.getTo().toLocalDate(), to(each))))
                .collect(Collectors.toList());
    }

    private LocalTime from(DateTimeInterval interval) {
        return interval.getFrom().toLocalTime().isBefore(from) ?
                from : interval.getFrom().toLocalTime();
    }

    private LocalTime to(DateTimeInterval interval) {
        return interval.getTo().toLocalTime().isAfter(to) ?
                to : interval.getTo().toLocalTime();
    }
}
