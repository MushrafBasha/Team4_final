package project_spring.internship_zealous;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface profile_jpa extends JpaRepository<profile_entity,Integer> {
}



