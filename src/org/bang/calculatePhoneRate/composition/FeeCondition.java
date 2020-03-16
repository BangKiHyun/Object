package org.bang.calculatePhoneRate.composition;

import org.bang.calculatePhoneRate.Inheritance.Call;

import java.util.List;

public interface FeeCondition {
    List<DateTimeInterval> findTImeIntervals(Call call);
}
