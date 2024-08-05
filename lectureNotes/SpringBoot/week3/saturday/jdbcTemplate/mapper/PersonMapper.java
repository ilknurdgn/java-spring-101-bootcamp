package springboot.com.techcareer.week3.saturday.jdbcTemplate.mapper;

import org.springframework.jdbc.core.RowMapper;
import springboot.com.techcareer.week3.saturday.jdbcTemplate.entity.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {

    // Person tablosuna karşılık gelen tüm alanları eşler.
    // Db'den çektiğimiz her satırı projede kullanmak için bir nesne haline getiriyoruz.

    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();
        person.setName(rs.getString("name")); //db'de name kolonundaki değeri person'a set eder.
        person.setIdentityNumber(rs.getString("identity_number"));
        return person;
    }
}
