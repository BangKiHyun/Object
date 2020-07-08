package object.discount;


import object.Screening;

public class SequenceCondition implements DiscountCondition {

    private final int sequence;

    public SequenceCondition(final int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(final Screening screening) {
        return sequence == screening.getSequence();
    }
}
