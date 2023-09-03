#  Java Spring Testing With Junit and Mockito

### Proje Kurulumu

Projeyi öncelikle forklayın ve clone edin.
Daha sonra projeyi IntellijIDEA kullanarak açınız. README.md dosyasını dikkatli bir şekilde okuyarak istenenleri yapmaya çalışın.
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:

### Employee Rest Api

 ### Başlangıç
 * Spring Initializr kullanarak bir Spring Boot projesi oluşturun.
 * İçerisinde ```Spring Web, Spring Data JPA, Lombok, Postgresql driver``` dependencyler eklenmeli.
 * Maven dependency management sistemini kullanarak tüm dependencyleri install edin.
 * Uygulamanızı  ```8080``` portundan ayağa kaldırın.
 
 ### Görev 1
 * ana paketiniz altında ```controller```, ```services```, ```dao```, ```entity```, ```exceptions``` isminde 5 adet daha paket oluşturunuz. .
 * ```entity``` paketinin altına ```Employee``` isimli bir tane sınıf oluşturunuz.
 * ```Employee``` sınıfı ```id, firstName, lastName, email, salary``` isimli 5 fielda sahip olmalı.
 * ```Employee``` sınıfı project lombok ve Jpa annotationlarını kullanmalıdır.

### Görev 2
 * dao paketi altına ```EmployeeRepository``` interfaceini oluşturmalısınız.
 * Bu sınıflarda tüm crud işlemleri yapılabilmeli.
 * findByEmail metodu ile email adresi verilen çalışan bulunabilmeli.
 * findBySalary metodu ile verilen salary parametresinden daha yüksek salary miktarına sahip çalışanlar maaşlarına göre azalan sırada çekilebilmeli.
 * findByOrder metodu ile çalışanlar soyadlarına göre alfabetik olarak sıralanabilmeli.

### Görev 3
 * service paketi altına ```EmployeeService``` sınıfını oluşturmalısınız.
 * service paketi altına ```EmployeeServiceImpl``` sınıflarını oluşturmalısınız.
 * Dao sınıfları ile arasında  ```Dependency Injection``` ilişkisini kurmalısınız.
 * Tüm dao methodları Override edilmeli.
 * Error handling kısmını service sınıfı içerisinden yönetiniz.

 ### Görev 3
 * ```EmployeeController``` isimli 1 tane controller yazmalısınız.
 * Amacımız CRUD işlemlerini tanımlayan endpointler yazmak. 
 * [GET]/workintech/employees => tüm çalışan kayıtlarını dönmeli.
 * [GET]/workintech/employees/{id} => İlgili id deki çalışan objesini dönmeli.
 * [GET]/workintech/employees/byEmail/{email} => Emaili verilen çalışan bilgisini dönmeli.
 * [GET]/workintech/employees/byOrder/ => Lastname parametresine göre alfabetik sırada tüm kullanıcıları döner.
 * [POST]/workintech/employees => Bir adet çalışan objesini id değerine göre ya veri tabanına ekler. Ya da var olan değeri update eder.
 * [POST]/workintech/employees/bySalary/{salary} => Bir adet salary değişkeni alır ve employee tablosu içerisinde geçen salary değeri bu değerden daha büyük olan çalışanları listeler.
 * [DELETE]/workintech/employees/{id} => İlgili id değerindeki çalışan objesini veritabanından siler.
 

 ### Görev 4
 * ```EmployeeRepository``` sınıfında kendi yazdığınız 3 method için unit test yazınız.
 * ```EmployeeServiceImpl``` sınıfında yazdığınız tüm metodlar için unit test yazınız.
 * ```EmployeeController``` sınıfındaki tüm endpointler için integration test yazınız.

### Görev 5
 * Bir tane apinizin dönüş değerinde işlem başarılıysa hem objenin kendisini hem de işlemin başarılı olduğuna dair bir mesaj ekleyiniz.
 
