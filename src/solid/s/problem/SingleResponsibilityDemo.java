package solid.s.problem;

public class SingleResponsibilityDemo {

    /***
     * SRP İhlali
     * MailboxSettingsService sınıfı:
     *
     * changeSecondaryEmail(User user, String newSecondaryEmail) metodu, kullanıcının e-posta adresini değiştirmeyi sorumluluğuna alır.
     * hasAccess(User user) metodu, kullanıcının yetkisini kontrol eder.
     * Bu iki işlev aynı sınıfta bulunuyor, bu da sınıfın iki farklı sorumluluğu yerine getirdiği anlamına gelir.
     *
     * User sınıfı:
     *
     * Kullanıcı bilgilerini tutma (id, e-posta, rol) ve e-posta göndermeyi (sendMoney) sorumluluğuna alıyor.
     * User sınıfının para gönderme işlevini kendi içinde bulundurması, bu sınıfın da SRP'yi ihlal ettiğini gösterir.
     * Kullanıcıyla ilgili veri tutma ve para gönderme iki ayrı sorumluluktur.
     * @param args
     */

    public static void main(String[] args) {
        MailboxSettingsService settingsService = new MailboxSettingsService();
        User user = new User();

        // responsebility #1 of MailboxSettingsService - change settings in mailbox
        settingsService.changeSecondaryEmail(user,"newemail@email.com");


        // responsebility #2 of MailboxSettingsService - check if user has access
        if (settingsService.hasAccess(user)) {
            user.sendMoney(new User(),1000);
        }
    }
}
