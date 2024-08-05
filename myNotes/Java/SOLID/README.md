# SOLID

### **Single Responsibility Principle (Tek Sorumluluk Prensibi)**

- Bir sınıfın, bir methodun tek bir görevi yapması gerektiğini savunur.

### **Open Closed Principle (Açık Kapalı Prensibi)**

- Yazılım gelişime açık, değişime kapalı olması gerektiğini savunur. 

- Bir yazılıma yeni kodlar eklendiğinde mevcut kodlar değiştirilmeden geliştirme yapılabilmektedir.

### **Liskov Substitution Principle (Liskov Yerine Geçme Prensibi)**

- SubClass’lar miras aldıkları SüperClass’larla yer değiştirdiğinde sorunsuz çalışabilmelidir.

### **Interface Segregation Principle (Arayüzlerin Ayrıması Prensibi)**

- Sorumluluklar tek bir arayüzde değil daha özel birbirinden ayrı arayüzlerde tutulmalıdır.

- Ortak olmayan sorumluluklar ayrı arayüzler oluşturularak Interface’i implement eden Class’da gereksiz metot kullanımı engellenmelidir.

### **Dependecy Inversion Principle (Bağımlılıkların Tersine Çevrilmesi Prensibi)**

- Sınıflar arasındaki bağımlılıklar en aza indirgenmesini savunur.

- Tüm somut sınıfların soyutlama yöntemiyle bağımlılıkları azaltılmalıdır.

- SubClass’larda yapılan değişiklikler SüperClass’ları etkilememelidir.

