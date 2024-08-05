package springboot.com.techcareer.week3.saturday.studentProject.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.com.techcareer.week3.saturday.studentProject.dto.requestDto.StudentSaveRequestDto;
import springboot.com.techcareer.week3.saturday.studentProject.dto.requestDto.StudentUpdateRequestDto;
import springboot.com.techcareer.week3.saturday.studentProject.dto.responseDto.StudentResponseDto;
import springboot.com.techcareer.week3.saturday.studentProject.entity.Student;
import springboot.com.techcareer.week3.saturday.studentProject.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/saveStudent")
    public ResponseEntity<Boolean> saveStudent(@RequestBody StudentSaveRequestDto studentSaveRequestDto) {
        Boolean saveStudent = studentService.saveStudent(studentSaveRequestDto);
        return new ResponseEntity<>(saveStudent, HttpStatus.CREATED);
    }

    @GetMapping("/getStudentListByName")
    public ResponseEntity<List<Student>> getStudentListByName1(@RequestParam String name) {
        List<Student> studentListByName1 = studentService.getStudentListByName1(name);
        return new ResponseEntity<>(studentListByName1, HttpStatus.OK);
    }

    @GetMapping("/getStudentListByName2")
    public ResponseEntity<List<StudentResponseDto>> getStudentListByName2(@RequestParam String name) {
        List<StudentResponseDto> studentListByName1 = studentService.getStudentListByName2(name);
        return new ResponseEntity<>(studentListByName1, HttpStatus.OK);
    }

    @PutMapping("/updateStudentAddress1")
    public ResponseEntity<Boolean> updateStudentAddress1(@RequestBody StudentUpdateRequestDto studentUpdateRequestDto) {
        Boolean updateStudentAddress = studentService.updateStudentAddress1(studentUpdateRequestDto);
        return new ResponseEntity<>(updateStudentAddress, HttpStatus.OK);
    }

    @PutMapping("/updateStudentAddress2")
    public ResponseEntity<String> updateStudentAddress2(@RequestBody StudentUpdateRequestDto studentUpdateRequestDto) {
        String updateStudentAddress = studentService.updateStudentAddress2(studentUpdateRequestDto);
        return new ResponseEntity<>(updateStudentAddress, HttpStatus.OK);
    }

    @PutMapping("/updateStudentAddress3")
    public ResponseEntity<String> updateStudentAddress3(@RequestBody StudentUpdateRequestDto studentUpdateRequestDto) {
        String updateStudentAddress = studentService.updateStudentAddress3(studentUpdateRequestDto);
        return new ResponseEntity<>(updateStudentAddress, HttpStatus.OK);
    }
}
