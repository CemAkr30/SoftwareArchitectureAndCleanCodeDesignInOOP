package solid.o.solution;

public class PersonalLoanValidator
    implements Validator {
    @Override
    public boolean isValidUser(User user) {
        return user!=null ? true : false;
    }
}
