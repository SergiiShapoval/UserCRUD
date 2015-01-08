package ua.sergiishapoval.usercrud.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.sergiishapoval.usercrud.entity.User;

import java.util.List;

/**
 * Created by Сергей on 21.12.2014.
 */

public interface UserRepository extends JpaRepository<User, Integer> {

    public User save(User user);

    @Override
    public void delete(Integer id);

    public User findById(int id);

    public Page<User> findAll(Pageable pageable);

    public List<User> findAll();

    public Page<User> findByNameContaining(String name, Pageable pageable);





}
