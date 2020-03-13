package org.bang.calculatePhoneRate.composition;

import org.bang.reserveMovie.objectOriented.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
