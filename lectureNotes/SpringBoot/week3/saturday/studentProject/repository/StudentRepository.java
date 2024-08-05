package springboot.com.techcareer.week3.saturday.studentProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.com.techcareer.week3.saturday.studentProject.entity.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    /**
     * CrudRepository'de kullanılabilir.
     * Burada db'deki hangi tablo için işlemler yapılacağını belirtmek için tablo ismini(Student)
     ve primary key(id) değerinin tipini(Long) veriyoruz.
     * JPA'nın isimlendirme standırna uygun yazdığımızda arka planda bizim için sql sorgusunu yazar.
     * Fakat karmaşık sorgular olduğunda @Query(sql sorgusu) anotasyonu ile sorguyu kendimiz verip metot oluşturabiliriz.
     */

    // select * from student where name = ?
    List<Student> findAllByName(String name);

    //@Query(sql sorgusu)
   // List<Student> findByNameFirstCharA();
}
