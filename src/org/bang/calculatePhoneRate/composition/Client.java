package org.bang.calculatePhoneRate.composition;

import org.bang.reserveMovie.objectOriented.Money;

import java.time.Duration;

public class Client {
    Duration duration;
    Money money;
    Phone phone = new Phone(new TaxablePolicy(new FixedFeePolicy(money, duration), 0.05));
}