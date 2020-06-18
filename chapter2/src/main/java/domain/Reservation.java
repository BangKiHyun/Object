package domain;

import domain.vo.Money;

public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audieceCount;

    public Reservation(final Customer customer, final Screening screening, final Money fee, final int audieceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audieceCount = audieceCount;
    }
}
