import theater.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Audience invitedAudience = new Audience(new Bag(10000L, new Invitation(LocalDateTime.now())));
        Audience unInvitedAudience = new Audience(new Bag(10000L));


        List<Ticket> tickets = Arrays.asList(
                new Ticket(10000L), new Ticket(10000L), new Ticket(10000L));

        Theater theater = new Theater(
                new TicketSeller(new TicketOffice(0L, tickets)));

        theater.enter(invitedAudience);
        theater.enter(unInvitedAudience);

        Bag invitedAudienceBag = invitedAudience.getBag();
        Bag unInvitedAudienceBag = unInvitedAudience.getBag();
        System.out.println(String.format("티켓 보유 여부: %b, 현재 남은 금액: %d", invitedAudienceBag.hasTicket(), invitedAudienceBag.getAmount()));
        System.out.println(String.format("티켓 보유 여부: %b, 현재 남은 금액: %d", unInvitedAudienceBag.hasTicket(), unInvitedAudienceBag.getAmount()));
    }
}
