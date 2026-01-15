package SocialMediaApplicationRestAPI;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.List;

@RestController
public class UserResources {
    private UserDaoService service;
    public UserResources(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/users/{ID}")
    public List<User> retriveUsers(@PathVariable int ID){
        return Collections.singletonList(service.findOne(ID));

//        return service.findAll();
    }
}
