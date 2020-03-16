package org.bang.calculatePhoneRate.composition;

import org.bang.calculatePhoneRate.Inheritance.Call;

import java.util.Arrays;
import java.util.List;

public class FixedFeeCondition implements FeeCondition {
    @Override
    public List<DateTimeInterval> findTImeIntervals(Call call) {
        return Arrays.asList(call.getInterval());
    }
}
