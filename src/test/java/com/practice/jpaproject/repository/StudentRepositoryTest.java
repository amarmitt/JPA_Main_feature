package com.practice.jpaproject.repository;

import com.practice.jpaproject.entities.Role;
import com.practice.jpaproject.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

//    @Test
//    public void saveStudent(){
//        Student student = Student.builder()
//                .firstName("abdul")
//                .lastName("jana")
//                .emailId("abc@xyz.com")
//                .build();
//        studentRepository.save(student);
//    }

//    @Test
//    public  void findAllStudents(){
//        List<Student> studentList = studentRepository.findAll();
//        System.out.println("student List = "+studentList);
//    }

//    @Test
//    public void embededRoleWithStudent(){
//        Role role = Role.builder().roleName("Admin").build();
//        Student student = Student.builder()
//                .firstName("abdul")
//                .lastName("jana")
//                .emailId("abc1@xyz.com")
//                .role(role)
//                .build();
//        studentRepository.save(student);
//    }

//    @Test
//public void findStudentsByFirstName(){
//        System.out.println("Student List = "+studentRepository.findByFirstName("abdul"));
//    }
//@Test
//public void findStudentsByFirstNameContaining(){
//    System.out.println("Student List = "+studentRepository.findByFirstNameContainingIgnoreCase("abc"));
//}

//    @Test
//public void findStudentByEmail(){
//    System.out.println("Student List = "+studentRepository.getStudentByEmailId("abc@xyz.com"));
//}

//        @Test
//public void findStudentsByFirstNameOrLastName(){
//    System.out.println("Student List = "+studentRepository.findStudentsByFirstNameOrLastName("","jana"));
//}

//    @Test
//    public void findStudentsByFirstNameOrLastName(){
//        System.out.println("Student List = "+studentRepository.findStudentsByFirstNameOrLastNameWithParam("abdul","jana"));
//    }

//    @Test
//    public void findStudentsByFirstNameOrLastName(){
//        System.out.println("Student List = "+studentRepository.findStudentsByFirstNameOrLastNameWithNativeQuery("abdul","jana"));
//    }

//    @Test
//    public void updateStudentsFirstNamebyLastName(){
//        System.out.println("Student List = "+studentRepository.updateStudentsByFirstNameOrLastNameWithNativeQuery("aman","jana"));
//    }
}