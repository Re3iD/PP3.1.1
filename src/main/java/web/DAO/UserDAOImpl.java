package web.DAO;

import web.entity.User;

import java.util.List;

import org.springframework.stereotype.Component;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class UserDAOImpl implements UserDAO{

    @PersistenceContext
    private EntityManager manager;
    private EntityManager getManager(){
        return this.manager;
    }

    @Override
    public void add(User user) {
        getManager().persist(user);
    }

    @Override
    public void delete(User user) {
        getManager().remove(getManager().contains(user)?user:getManager().merge(user));
    }

    @Override
    public void update(User user) {
        getManager().merge(user);
    }

    @Override
    public List<User> listUsers() {
        List<User> list = getManager().createQuery("select u from User as u").getResultList();
        return list;
    }

    @Override
    public User getUserById(int id) {
        return getManager().find(User.class,id);
    }
}