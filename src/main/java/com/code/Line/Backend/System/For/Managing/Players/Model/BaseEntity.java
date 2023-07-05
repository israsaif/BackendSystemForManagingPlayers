package com.code.Line.Backend.System.For.Managing.Players.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Muscat")
    Date createdDate;
    @UpdateTimestamp
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Muscat")
    Date updatedDate;
    Boolean isActive;
}
