package SocialMediaApplicationRestAPI;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    // public list<users> findAll()
    // public user save (User user)
    // public user findOne(int id)

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Raj", LocalDate.now().minusYears(20)));
        users.add(new User(2, "Alex", LocalDate.now().minusYears(25)));
        users.add(new User(3, "Rahul", LocalDate.now().minusYears(28)));
        users.add(new User(4, "Alia", LocalDate.now().minusYears(17)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(Integer id) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getId().equals(id)) {
                return user;
            }
            else{
                System.out.println("No such Users Available");
            }
        }
        return null;
    }
}

