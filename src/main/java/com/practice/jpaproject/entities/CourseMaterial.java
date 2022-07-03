package com.practice.jpaproject.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseMaterial {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String url;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    Course course;
}
