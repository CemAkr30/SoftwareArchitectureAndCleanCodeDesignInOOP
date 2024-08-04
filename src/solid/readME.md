Object Oriented Programming (OOP)

- Nesne Yönelimli Programlama (OOP), programlamada kullanılan bir paradigmadır.
- Gerçek hayattaki nesneleri modellemek için kullanılır. Sınıflara ve nesnelere dayanır.
- OOP, programlamada karmaşıklığı azaltır ve kodun daha iyi organize edilmesini sağlar.
- OOP, programlama dillerinde kullanılan bir programlama stili ve yaklaşımıdır.



SOLID: Overview & Principles

Content: 

- Temel bu ilkeler yazılım tasarımını daha anlaşılır, esnek, sürdürülebilir 
ve genişletilebilir hale getirir. Bu ilkelerin uygulanması, yazılımın 
daha iyi bir şekilde yapılandırılmasını sağlar.

- SOLID, bu basit kuralları takip ederek bakımı ve desteklenmesi kolay,
daha iyi kod yazılmasına neden olur. Aynı zamanda yeni özellikler eklemek
ve kodu değiştirmek daha kolay hale gelir.

- SOLID, Robert C. Martin tarafından yazılan ve yazılım tasarımı için 
beş temel prensibi içeren bir akronimdir.



Single Responsibility Principle (SRP)

- Bir sınıfın sadece bir sorumluluğu olmalıdır. Bir sınıfın birden fazla sorumluluğu
olduğunda, sınıfın değişikliklere karşı daha savunmasız hale gelir. Bu nedenle,
bir sınıfın sadece bir sorumluluğu olmalıdır.

- SRP, bir sınıfın sadece bir iş yapmasını ve bu işi en iyi şekilde yapmasını sağlar.

- SRP, sınıfların daha az karmaşık ve daha az bağımlı olmasını sağlar. Bu nedenle,
sınıfların daha kolay test edilmesini ve bakımının yapılmasını sağlar.



Open/Closed Principle (OCP)

- Bir sınıf, genişletilebilir olmalı, ancak değiştirilemez olmalıdır. Bir sınıfın
koduna müdahale etmeden, sınıfın davranışını değiştirebilmelisiniz.

- OCP, bir sınıfın davranışını değiştirmek için sınıfın kodunu değiştirmek yerine,
sınıfı genişletmeyi önerir. Bu, sınıfın daha az karmaşık ve daha az bağımlı olmasını
sağlar.

- OCP, sınıfların daha az bağımlı olmasını ve daha kolay test edilmesini sağlar. Bu
nedenle, sınıfların daha iyi bir şekilde yapılandırılmasını sağlar.


# Not:
Open/Closed Principle (OCP) yazılım tasarımı için önemli bir prensiptir ve yazılım bileşenlerinin genişlemeye açık, değişikliğe kapalı 
olmasını öngörür. Yani, bir sınıf veya modül yeni işlevler eklenerek genişletilebilir, ancak mevcut kodda değişiklik yapmadan 
bu işlevler eklenmelidir.



Liskov Substitution Principle (LSP)

- Bir sınıf, türetilen sınıflar tarafından değiştirilebilir olmalıdır. Yani, bir sınıfın
türetilen sınıflar tarafından değiştirilmesi, sınıfın davranışını etkilememelidir.

- LSP, alt sınıfların üst sınıfların yerine geçebilmesini ve aynı şekilde davranabilmesini
sağlar. Bu, kodun daha iyi bir şekilde yapılandırılmasını sağlar.


# Not: 
Liskov Substitution Principle (LSP) bir nesne yönelimli tasarım prensibidir ve bir sınıfın alt sınıflarının, üst sınıfının 
yerine geçebilmesi gerektiğini belirtir. Başka bir deyişle, alt sınıflar üst sınıflarının beklentilerini yerine getirebilmeli ve 
üst sınıflarının davranışlarını bozmamalıdır.



Interface Segregation Principle (ISP)

- Bir arayüz, bir sınıfın ihtiyaç duymadığı metotları içermemelidir. Yani, bir arayüz
bir sınıfın ihtiyaç duyduğu metotları içermeli, ancak ihtiyaç duymadığı metotları içermemelidir.

- ISP, bir sınıfın ihtiyaç duymadığı metotları içermemesini ve sınıfların daha az karmaşık
ve daha az bağımlı olmasını sağlar. Bu nedenle, sınıfların daha iyi bir şekilde yapılandırılmasını sağlar.

- Her bir arayüzün kendine ait bir sorumluluğu olmalıdır. Bütün methodlar tek bir arayüzde
toplanmamalıdır. Bu prensip, bir sınıfın ihtiyaç duymadığı metotları içermemesini sağlar. 
Alt sınıflar tarafından UnsupsportedException hatası alınmaması için bu prensip önemlidir.



# Not:
Interface Segregation Principle (ISP), yazılım tasarımında bir arayüzün, ilgili istemcilerin sadece kullanacakları metotları 
içermesi gerektiğini belirtir. Başka bir deyişle, istemciler kullanmadıkları metodlara bağlı olmamalıdır. Bu prensip, büyük ve
kapsamlı arayüzlerin küçük ve daha spesifik arayüzlere bölünmesi gerektiğini öngörür.





Dependency Inversion Principle (DIP)

- Bir sınıf, başka bir sınıfa bağımlı olmamalıdır. Yani, bir sınıfın başka bir sınıfa
bağımlı olması, sınıfın daha az esnek ve daha az genişletilebilir olmasına neden olur.

- DIP, sınıfların birbirine bağımlı olmamasını ve sınıfların daha az karmaşık ve daha az
bağımlı olmasını sağlar. Bu nedenle, sınıfların daha iyi bir şekilde yapılandırılmasını sağlar.

- Üst seviye modüller, alt seviye modüllere bağımlı olmamalıdır. Her ikisi de soyutlamalara
bağımlı olmalıdır. Soyutlamalar, detaylara bağımlı olmamalıdır. Detaylar, soyutlamalara bağımlı
olmalıdır. Bu prensip, sınıfların daha az bağımlı olmasını ve daha kolay test edilmesini sağlar.



# Not:

Dependency Inversion Principle (DIP), yazılım tasarımında yüksek seviyeli modüllerin (iş mantığı gibi) düşük seviyeli
modüllere (veritabanı erişimi gibi) bağlı olmaması gerektiğini öngörür. 
Bunun yerine, her iki modül de soyutlamalara bağlı olmalıdır. Bu, genellikle arayüzler veya soyut sınıflar
aracılığıyla gerçekleştirilir.