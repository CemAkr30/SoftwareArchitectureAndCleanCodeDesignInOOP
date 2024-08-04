package solid.s.solution;


public class MailboxSettingsService {

    private SecurityService securityService;


    public MailboxSettingsService(SecurityService securityService) {
        this.securityService = securityService;
    }

    public void changeSecondaryEmail(User user, String newSecondaryEmail) {
        if (securityService.hasAccess(user)) {
            user.setSecondaryEmail(newSecondaryEmail);
        }
    }

}
