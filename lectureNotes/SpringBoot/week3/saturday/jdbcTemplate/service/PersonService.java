package springboot.com.techcareer.week3.saturday.jdbcTemplate.service;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import springboot.com.techcareer.week3.saturday.jdbcTemplate.entity.Person;
import springboot.com.techcareer.week3.saturday.jdbcTemplate.mapper.PersonMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final JdbcTemplate jdbcTemplate;

    public List<Person> getPersonList() {

        String sql = "select * from person";

        List<Person> query = jdbcTemplate.query(sql, new PersonMapper());

        return query;
    }

    //Sql İnjection'a açık bir kod bloğudur.
    public List<Person> getPersonListByName(String name) {
        String sql = "select * from person s where s.name=" + "'" + name + "'";

        return jdbcTemplate.query(sql, new PersonMapper());
    }

    // Sql injection'dan korunmak için ? ile verileri jdbc template'e bırakıyoruz.
    public List<Person> getPersonListByName1(String name) {
        String sql = "select * from person s where s.name= ?";

        return jdbcTemplate.query(sql, new PersonMapper());
    }
}
