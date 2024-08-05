package springboot.com.techcareer.week3.saturday.toString;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
//@ToString
public class Flower {

    private String name;

    private String number;

    //Default olarak bu şekilde verilir. İhtiyaca göre güncellenebilir.
    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
