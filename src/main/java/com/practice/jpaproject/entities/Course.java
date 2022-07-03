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
@Table(uniqueConstraints = @UniqueConstraint(name = "courseName_Unique",columnNames ="course_Name"))
public class Course {
    @Id
    @Column (name = "course_id")
    @SequenceGenerator(name = "course_sequence",
    sequenceName = "course_sequence",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "course_sequence")
     Long courseId;

    @NonNull
            @Column(name="course_Name")
    String courseName;

}
