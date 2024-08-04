package solid.s.problem;

public class User {
    private int id;
    private String primaryEmail;
    private String secondaryEmail;
    private Role role;


    public User(int id, String primaryEmail, String secondaryEmail, Role role) {
        this.id = id;
        this.primaryEmail = primaryEmail;
        this.secondaryEmail = secondaryEmail;
        this.role = role;
    }


    public User() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public Role getRole() {
        return role;
    }

    public void sendMoney(User user, int amount) {
        System.out.println("Money sent to " + user.getId() + " with amount " + amount);
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
