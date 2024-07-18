package project_spring.internship_zealous;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class profile_entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int profileId;
    private String fullname;
    private String dob;
    private int contact;
    private String email;
    transient private List<app_entity> myApps;

}



