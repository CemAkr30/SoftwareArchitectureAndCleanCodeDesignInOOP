package solid.s.solution;

public class MoneyTransferService {
    public void sendMoney(User sender, User receiver, int amount) {
        System.out.println("Money sent from " + sender.getId() + " to " + receiver.getId() + " with amount " + amount);
    }
}
