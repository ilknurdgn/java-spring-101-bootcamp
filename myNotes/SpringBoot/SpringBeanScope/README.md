# SPRING BEAN SCOPE

Beanlerimizin bir yaşam döngsü vardır. Bu yaşam döngüsü çerçevesinde istediğimiz işlemleri yapması için Beanimizin kapsamını yani scope’unu belirlememiz gerekmektedir. Spring Beanlerimizdeki scopeleri Spring IoC container tarafından yönetilir ve beanlerimizdeki nesnelerin ne zaman ve nasıl oluşturulacağını belirler.

Spring’de 5 çeşit scope kavramı vardır.

### ***1- Singleton***

Bir Spring Bean varsayılan olarak **singleton scope** ile tanımlanır. Singleton scope kullanıldığında, uygulama bağlamında (application context) yalnızca bir tane Bean örneği oluşturulur. Bu örnek, tüm isteklerde (requests) tekrar kullanılır ve üzerinde yapılan değişiklikler, Bean'i kullanan tüm yerlerde etkili olur.

### ***2- Prototype***

Prototype ile belirlenmiş bir bean, container içerisinde çağırıldığı her request’te yeniden oluşturulacaktır. 

### ***3- Request***

Request scope değeri her bir http request’i bir adet bean oluştururur.

### ***4- Session***

Session scope değeri her bir http session’ı için bir adet bean oluşturur.

### ***5- Global Session***

Bir HTTP’nin yaşam döngüsünde tek bir Bean’ın tanımını kapsamaktadır. Yalnızca web uyumlu Spring ApplicationContext bağlamında geçerlidir.

### Örnek:
```java
@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EmployeeService {
}
```