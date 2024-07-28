# Araç Kiralama Projesi

- Bir araç kiralama firmasında SUV, Sedan, Hatchback tiplerinde
araçlar kiralanabiliyor.

- Sedan ve Hatchback araçlar aylık ya da günlük kiralanabilir ancak SUV araçlar
sadece günlük kiralanabilir.
- Araçlar bireysel müşteriler ya da şirketlertarafından kiralanabilir ancak bireysel 
müşteriler tarafından sadece Hatchback ve Sedan araçlar kiralanabilirken,
şirketler tarafından tüm araç tipleri kiralanabilir.
Yani siteye giriş yapan kullanıcı bireysel müşteri ise sadece Hatchback ve Sedan 
araçları görebilir, kullanıcı şirket ise tüm model araçları görebilir.
- Müşteri için adı (bireysel müşteri ise adı soyadı, şirket ise şirket adı), telefon 
numarası, bireysel müşteri için T.C. kimlik numarası, şirket için vergi numarası
gibi özellikler bulunmalıdır.
- Araçlara çeşitli özellikler eklenmelidir. (Marka, model, segment, vites tipi,
bagaj kapasitesi, renk, yaş, yakıt tipi, günlük kiralana bedeli vs.)
Bu özelliklerin birkaçı bazı araçlarda aynı olurken bazı araçlarda özelleştirilmelidir.
- Her bir aracın aylık ve günlük kiralama şekilleri modele göre değişmektedir.
Aylık kiralama bedeli günlük kiralama bedeli üzerinden hesaplanır ve bu
hesaplama her araç için değişebilir.

Örneğin, Sedan bir aracın günlük kiralama bedeli 800 ₺ iken aylık kiralama bedeli 
800x30 olarak hesaplanıp aylık kiralamalardaki indirim oranı (Sedan için %7) bu 
tutardan düşürülerek hesaplanabilir.
Örneğin, Hatcback araçlarda aylık bedel hesaplanırken bir katsayı kullanılabilir. Bu 
katsayı aracın segmentine göre değişebilir.