package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.stereotype.Service;
import web.DAO.UserDAO;
import web.entity.User;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;
    @Transactional
    @Override
    public void add(User user) {
        userDAO.add(user);
    }
    @Transactional
    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }
    @Transactional
    @Override
    public void update(User user) {
        userDAO.update(user);
    }
    @Transactional
    @Override
    public List<User> listUsers() {
        return userDAO.listUsers();
    }
    @Transactional
    @Override
    public User getUserById(int i) {
        return userDAO.getUserById(i);
    }
}
