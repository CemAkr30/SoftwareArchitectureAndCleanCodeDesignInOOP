package solid.s.problem;

public class MailboxSettingsService {

    public void changeSecondaryEmail(User user, String newSecondaryEmail) {
        if (hasAccess(user)) {
            user.setSecondaryEmail(newSecondaryEmail);
        }
    }

    public boolean hasAccess(User user) {
        if (Role.ADMIN.equals(user.getRole())) {
            return true;
        }else{
            return false;
        }
    }
}
