package solid.o.solution;

public class OpenClosedPrincipleDemo {

    public static void main(String[] args) {
        Validator mlValidator = new MortgageLoanValidator();
        LoanHandler mlLoanHandler = new MortgageLoanHandler(mlValidator);
        mlLoanHandler.approveLoan(new User());

        Validator plValidator = new PersonalLoanValidator();
        LoanHandler plLoanHandler = new PersonalLoanHandler(plValidator);
        plLoanHandler.approveLoan(new User());
    }
}
