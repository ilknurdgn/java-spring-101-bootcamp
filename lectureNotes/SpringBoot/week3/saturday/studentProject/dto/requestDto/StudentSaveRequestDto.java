package springboot.com.techcareer.week3.saturday.studentProject.dto.requestDto;

import lombok.Getter;

@Getter
public class StudentSaveRequestDto {

    // Entity'deki fieldlar ile aynı olacak şekilde yazılmalı
    private String name;
    private String address;
    private String identityNumber;
}
