# Clean Code Architecture, Coupling & Cohesion

- Temiz bir mimari düşük coupling ve yüksek cohesion'a sahip olmalıdır.
- Coupling: Bağımlılık, bir sınıfın başka bir sınıfı nasıl kullandığıdır. Düşük coupling, bir sınıfın başka bir sınıfı nasıl kullandığına dair az bilgi sahibi olması anlamına gelir.
- Cohesion: Bağlılık, bir sınıfın içindeki elemanların birbirleriyle ne kadar ilişkili olduğudur. Yüksek cohesion, bir sınıfın içindeki elemanların birbirleriyle ne kadar ilişkili olduğu anlamına gelir.



# Coupling

- High coupling: Bir sınıfın başka bir sınıfı nasıl kullandığına dair çok fazla bilgi sahibi olması anlamına gelir. Bu durumda, bir sınıfın başka bir sınıfı kullanabilmesi için çok fazla bilgiye ihtiyacı vardır. Bu durum, sınıflar arasındaki bağımlılığı artırır ve kodun bakımını zorlaştırır.
- Low coupling: Bir sınıfın başka bir sınıfı nasıl kullandığına dair az bilgi sahibi olması anlamına gelir. Bu durumda, bir sınıfın başka bir sınıfı kullanabilmesi için az bilgiye ihtiyacı vardır. Bu durum, sınıflar arasındaki bağımlılığı azaltır ve kodun bakımını kolaylaştırır.