package springboot.com.techcareer.week3.saturday.studentProject.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    /**
     * ModelMapper 3th party bir kütüphane olduğu için Class'ı Spring Bean'i olarak işaretleyemeyiz.
     * Bu yüzden metot bazında işaretlemek için Configuration pakaetinde bu metodu oluşturup metotdu Spring Bean'i olarak işaretleriz.
     * Artık bu Class'ı diğer classlarda inject edebiliriz.
     * 3th party bir kütüphane Spring Bean'i olarak işaretlemek istediğimde bu şekilde oluşturabiliriz.
     */
    @Bean                   // Metodu Spring Bean olarak işaretledik.
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
