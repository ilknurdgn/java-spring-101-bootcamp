package springboot.com.techcareer.week3.saturday.studentProject.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "identity_number")
    private String identityNumber;
}
