package project_spring.internship_zealous;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Feign-Interceptor", url = "http://localhost:8054/app")
public interface feign_profile {
    @GetMapping("/byProfile/{profileId}")
    public List<app_entity> callByProfile(@PathVariable("profileId") int profileId);
}





