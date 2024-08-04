package solid.l.problem;

public class LiskovSubstitutionPrincipleDemo {

    /***
     * İhlalin Sebebi
     * Bird arayüzü, her tür kuşun fly ve eat metodlarını sağlamasını bekler. Ancak, Ostrich (deveyi) bir kuş türü olarak
     * tasarlandığında, bu kuşun uçamaması beklenen bir durumdur. Bu nedenle, Ostrich sınıfında fly metodunun çağrılması,
     * UnsupportedOperationException hatası verir. Bu, LSP'yi ihlal eder çünkü Ostrich sınıfı, Bird arayüzünün beklentilerini
     * karşılamıyor ve bir Bird nesnesi yerine geçtiğinde hatalar ortaya çıkıyor.
     *
     * Çözüm
     * LSP'yi uygulamak için, Bird arayüzünü değiştirmek yerine, uçmayan kuşları uçma yeteneği olmayan bir arayüz veya
     * temel sınıfa taşıyabilirsiniz.
     * @param args
     */

    public static void main(String[] args) {
        Bird[] birds = new Bird[] { new Sparrow(), new Crow(), new Ostrich()};

        for (Bird bird : birds) {
            bird.fly();
            bird.eat();
        }
    }
}
