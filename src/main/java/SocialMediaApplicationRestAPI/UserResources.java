package SocialMediaApplicationRestAPI;


import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserResources {

    private final UserDaoService service;

    public UserResources(UserDaoService service) {
        this.service = service;
    }

    // GET all users
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    // GET single user
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        User user = service.findOne(id);
        if (user == null) {
            throw new RuntimeException("User not found");
        }
        return user;
    }

    // POST new user
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return service.save(user);
    }
}

