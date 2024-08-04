package solid.i.problem;


public class InterfaceSegregationPrincipleDemo {


    /***
     * Kodunuzda ISP ihlali mevcut çünkü Vehicle arayüzü, hem araçların kara yolunda sürüşünü, hem uçuşunu, hem de
     * deniz yolunda yelken açmasını destekleyecek metotları içeriyor. Bu durumda, Car, Plane, ve Boat gibi sınıflar,
     * kendilerine ait olmayan metodları implement etmek zorunda kalıyorlar.
     *
     * ISP İhlali Açıklaması
     * İhlalin Sebebi:
     *
     * Vehicle arayüzü, drive, fly, ve sail metotlarını içeriyor. Ancak bu metotlar tüm araç türleri için geçerli değil.
     * Boat, Car, ve Plane sınıfları, bu metotlardan sadece bir veya iki tanesini uygulamak zorunda kalıyorlar ve diğer
     * metotlar için UnsupportedOperationException fırlatıyorlar.
     *
     * Çözüm
     * Bu problemi çözmek için, Vehicle arayüzünü daha spesifik arayüzlere bölelim. Her araç türü sadece gerekli
     * metotları içeren arayüzleri implement edecektir.
     *
     */

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle plane = new Plane();
        Vehicle boat = new Boat();

        car.drive();
        plane.fly();
        boat.sail();
    }

}
