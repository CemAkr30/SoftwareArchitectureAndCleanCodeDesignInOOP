package solid.s.solution;


public class SingleResponsibilityDemo {

    public static void main(String[] args) {
        SecurityService accessControlService = new SecurityService();
        MailboxSettingsService settingsService = new MailboxSettingsService(accessControlService);
        MoneyTransferService moneyTransferService = new MoneyTransferService();

        User user = new User();
        settingsService.changeSecondaryEmail(user, "newemail@email.com");

        if (accessControlService.hasAccess(user)) {
            User receiver = new User();
            moneyTransferService.sendMoney(user, receiver, 1000);
        }
    }

}