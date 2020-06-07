package theater;

public class Bag {

    private Long amount;
    private final Invitation invitation;
    private Ticket ticket;

    //Bag의 인스터스 상태는 초대장과 현금을 같이 보관하거나, 현금만 보관하는 두 가지 경우중 하나(제약을 강제)
    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public Bag(Long amount) {
        this(amount, null);
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        }
        setTicket(ticket);
        minusAmount(ticket.getFee());
        return ticket.getFee();
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public Long getAmount() {
        return this.amount;
    }
}
