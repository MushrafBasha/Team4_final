package project_spring.internship_zealous;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class profile_services {
    @Autowired
    profile_jpa remote;

    @Autowired
    private feign_profile feignCommunicator;

    public profile_entity implementFindById(int id){
        profile_entity obj = remote.findById(id).orElse(new profile_entity());
        if(obj!=null){
            obj.setMyApps(feignCommunicator.callByProfile(obj.getProfileId()));
        }
        return obj;
    }
    public List<profile_entity> implementFindAll(){
        return remote.findAll();
    }
    public profile_entity implementSave(profile_entity profile){
        return remote.save(profile);
    }
    public profile_entity readId( int id){
        return remote.findById(id).orElse(new profile_entity());
    }
    public void implementDelete(int id) {
        remote.deleteById(id);
    }
}


