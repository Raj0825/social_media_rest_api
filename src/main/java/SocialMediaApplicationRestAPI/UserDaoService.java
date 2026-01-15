package SocialMediaApplicationRestAPI;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int userCount = 0;

    static {
        users.add(new User(++userCount, "Raj", LocalDate.now().minusYears(20)));
        users.add(new User(++userCount, "Alex", LocalDate.now().minusYears(25)));
        users.add(new User(++userCount, "Rahul", LocalDate.now().minusYears(28)));
        users.add(new User(++userCount, "Alia", LocalDate.now().minusYears(17)));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        user.setId(++userCount);
        users.add(user);
        return user;
    }

    public User findOne(Integer id) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}


