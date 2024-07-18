package project_spring.internship_zealous;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class app_entity {

    @Id

    private int appId;
    private String appName;
    private String appVendor;
    private int downloadedCount;
    private double ratings;
    private int profileId;
}




