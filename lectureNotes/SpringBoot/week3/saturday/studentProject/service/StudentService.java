package springboot.com.techcareer.week3.saturday.studentProject.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import springboot.com.techcareer.week3.saturday.studentProject.dto.requestDto.StudentSaveRequestDto;
import springboot.com.techcareer.week3.saturday.studentProject.dto.requestDto.StudentUpdateRequestDto;
import springboot.com.techcareer.week3.saturday.studentProject.dto.responseDto.StudentResponseDto;
import springboot.com.techcareer.week3.saturday.studentProject.entity.Student;
import springboot.com.techcareer.week3.saturday.studentProject.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    public Boolean saveStudent(StudentSaveRequestDto studentSaveRequestDto) {
        Student student = new Student();
        student.setName(studentSaveRequestDto.getName());
        student.setAddress(studentSaveRequestDto.getAddress());
        student.setIdentityNumber(studentSaveRequestDto.getIdentityNumber());
        //     BeanUtils.copyProperties(studentSaveRequestDto, student);
        studentRepository.save(student);
        return true;
    }

    public Boolean saveStudent1(StudentSaveRequestDto studentSaveRequestDto) {
        Student student = convertToStudentFromDto1(studentSaveRequestDto);
        //     BeanUtils.copyProperties(studentSaveRequestDto, student);
        studentRepository.save(student);
        return true;
    }

    // Single Responsiblity
    // Open Closed
    private Student convertToStudentFromDto1(StudentSaveRequestDto studentSaveRequestDto) {
        Student student = new Student();
        student.setName(studentSaveRequestDto.getName());
        student.setAddress(studentSaveRequestDto.getAddress());
        student.setIdentityNumber(studentSaveRequestDto.getIdentityNumber());
        return student;
    }

    // Eğer map işlemi yaptığımız dto ile entity'deki field'ların isimleri farklı olursa değer ataması yapmaz.
    private Student convertToStudentFromDto2(StudentSaveRequestDto studentSaveRequestDto) {
        ModelMapper modelMapper = new ModelMapper();
        Student student = modelMapper.map(studentSaveRequestDto, Student.class);
        return student;
    }

    private Student convertToStudentFromDto3(StudentSaveRequestDto studentSaveRequestDto) {
        return modelMapper.map(studentSaveRequestDto, Student.class);
    }

    public List<Student> getStudentListByName1(String name) {
        List<Student> studentList = new ArrayList<>();
        List<Student> allStudent = studentRepository.findAll();  // db'deki tüm verileri getirir.
        for (Student student : allStudent) {
            if (Objects.equals(student.getName(), name)) {
                studentList.add(student);
            }
        }
        return studentList;
    }

    // Yukarıdaki işlem için tüm verileri db'den getirmek yerine filtreleme işlemi yapılıp db'den en küçük data Listesi çekilmelidir.
    // Yani filtreleme işlemini kod tarafında yapmak yerine db seviyesinde yapıyoruz.
    public List<StudentResponseDto> getStudentListByName2(String name) {
        List<StudentResponseDto> responseDtos = new ArrayList<>();
        List<Student> studentList = studentRepository.findAllByName(name);
        for (Student student : studentList) {
            StudentResponseDto responseDto = modelMapper.map(student, StudentResponseDto.class);
            responseDtos.add(responseDto);
        }
        return responseDtos;
    }

    public Boolean updateStudentAddress1(StudentUpdateRequestDto studentUpdateRequestDto) {
        Long id = studentUpdateRequestDto.getId();
        String address = studentUpdateRequestDto.getAddress();
        // Db'den ilgili student'ı getir.
        Optional<Student> studentOptional = studentRepository.findById(id);
        // Addresi güncelle
        Student student = studentOptional.get();
        student.setAddress(address);
        studentRepository.save(student);
        return true;
    }

    public String updateStudentAddress2(StudentUpdateRequestDto studentUpdateRequestDto) {
        Long id = studentUpdateRequestDto.getId();
        String address = studentUpdateRequestDto.getAddress();
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            student.setAddress(address);
            studentRepository.save(student);
            return "true";
        }
        return String.format("%s Id'sine sahip  bir öğrenci bulunmamaktadır.", id);
    }

    public String updateStudentAddress3(StudentUpdateRequestDto studentUpdateRequestDto) {
        Long id = studentUpdateRequestDto.getId();
        String address = studentUpdateRequestDto.getAddress();

        try {
            Optional<Student> studentOptional = studentRepository.findById(id);
            if (studentOptional.isPresent()) {
                Student student = studentOptional.get();
                student.setAddress(address);
                studentRepository.save(student);
                return "Kayıt işlemi başarılı.";
            }
            return "Veritabanında böyle bir öğrenci yoktur.";
        } catch (Exception e) {
            e.printStackTrace();
            return "Bir hata ile karşılaşıldı. Lütfen tekrar deneyiniz.";
        }
    }
}
