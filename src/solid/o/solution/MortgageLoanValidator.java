package solid.o.solution;

public class MortgageLoanValidator
    implements Validator {
    @Override
    public boolean isValidUser(User user) {
        return user!=null ? true : false;
    }
}
