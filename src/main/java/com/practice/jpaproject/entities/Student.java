package com.practice.jpaproject.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="student_tbl", uniqueConstraints = @UniqueConstraint(
        name = "emailId_unique",
        columnNames = "email_address"
))
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence",
    sequenceName = "student_sequence",
            allocationSize = 1
    )
      @GeneratedValue(strategy = GenerationType.SEQUENCE,
      generator = "student_sequence")
    long studentId;
    String firstName;
    String lastName;
    @Column(name = "email_address",/**unique = true,*/nullable = false)
    String emailId;
   @Embedded
   Role role;
}
