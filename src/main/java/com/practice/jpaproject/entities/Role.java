package com.practice.jpaproject.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@AttributeOverrides({
        @AttributeOverride(
                name ="roleName",
                column = @Column(name = "role_name")
        )
})
@Builder
public class Role {
     String roleName;
}
