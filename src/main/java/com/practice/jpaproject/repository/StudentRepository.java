package com.practice.jpaproject.repository;

import com.practice.jpaproject.entities.Student;
import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByFirstName(String firstName);

    List<Student> findByFirstNameContainingIgnoreCase(String firstName);

//    Student getStudentByEmailId(String emailId);

    @Query("select s from Student s where s.emailId=?1")
    Student getStudentByEmailId(String emailId);

//    @Query("select s from Student s where s.firstName=?1 or s.lastName=?2")
//    List<Student> findStudentsByFirstNameOrLastName(String firstName, String LastName);

//    @Query("select s from Student s where s.firstName=:firstName or s.lastName=:lastName")
//    List<Student> findStudentsByFirstNameOrLastNameWithParam(@Param("firstName") String firstName,
//                                                             @Param("lastName") String LastName);

    @Query(value = "select * from student_tbl s where first_name=:firstName or last_name=:lastName",
    nativeQuery = true)
    List<Student> findStudentsByFirstNameOrLastNameWithNativeQuery(@Param("firstName") String firstName,
                                                             @Param("lastName") String LastName);

    @Modifying
    @Transactional
    @Query(value = "update student_tbl set  first_name=:firstName where last_name=:lastName",
            nativeQuery = true)
    int updateStudentsByFirstNameOrLastNameWithNativeQuery(@Param("firstName") String firstName,
                                                                   @Param("lastName") String LastName);
}

