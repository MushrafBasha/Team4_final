package project_spring.internship_zealous;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profile")
public class profile_rest {
    @Autowired
    private profile_services service;

    @PostMapping("/add")
    public profile_entity callSave(@RequestBody profile_entity profile){
        return service.implementSave(profile);
    }

    @GetMapping("/getId/{id}")
    public profile_entity getId (@PathVariable("id") int id){
        return service.implementFindById(id);
    }


    @GetMapping("/get")
    public List<profile_entity> callFetch(){
        return service.implementFindAll();
    }
    @DeleteMapping("/{id}")
    public String remove(@PathVariable("id") int id){
        service.implementDelete(id);
        return id+" has removed";
    }
}


