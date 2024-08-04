package solid.o.problem;

public class OpenClosedPrincipleDemo {

    /***
     * OCP ihlali şu şekildedir:
     *
     * LoanHandler Sınıfı: Bu sınıf, hem kişisel krediler hem de ipotek kredileri için onay işlemlerini yönetir. Ancak, eğer yeni bir
     * kredi türü eklemek isterseniz (örneğin, araba kredisi), LoanHandler sınıfında değişiklik yapmanız gerekir.
     * Bu, OCP'yi ihlal eder çünkü mevcut kodda değişiklik yapılması gerekmektedir.
     *
     * Yeni Kredi Türleri Eklemek: Yeni kredi türleri eklemek için LoanHandler sınıfını değiştirmeniz gerekiyor.
     * Bu durum, LoanHandler sınıfının mevcut işleyişini değiştirmeyi zorunlu kılar.
     *
     * OCP'yi uygulayarak bu durumu nasıl düzeltebileceğinizi aşağıda açıklıyorum.
     *
     * OCP'yi Uygulamak İçin Çözüm
     * OCP'yi uygulamak için, LoanHandler sınıfını kredi onay işlemlerini bir arayüz veya üst sınıfa dayanarak genişletecek
     * şekilde tasarlayabiliriz. Bu şekilde, yeni kredi türleri eklenirken mevcut kodda değişiklik yapmamıza gerek kalmaz.
     *
     */

    public static void main(String[] args) {
        LoanHandler loanHandler = new LoanHandler();
        User user = new User();

        loanHandler.approvePersonalLoan(user);
        loanHandler.approveMortgage(user);

    }

}
