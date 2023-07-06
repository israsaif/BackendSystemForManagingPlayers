package com.code.Line.Backend.System.For.Managing.Players.Model;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
    @CreatedDate
    Date createdDate;
    @UpdateTimestamp
    Date updatedDate;
    Boolean isActive;
}
