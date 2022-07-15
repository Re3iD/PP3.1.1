package web.DAO;
import org.springframework.stereotype.Component;
import web.entity.User;

import java.util.List;
@Component
public interface UserDAO {
    void add(User user);
    void delete(User user);
    void update(User user);
    List<User> listUsers();
    User getUserById(int i);

}
