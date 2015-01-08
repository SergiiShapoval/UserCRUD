package ua.sergiishapoval.usercrud.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ua.sergiishapoval.usercrud.entity.User;

import java.util.List;


public interface UserService {
	void add(User user);
	void edit(User user);
	void delete(int id);
	User getUser(int id);
	List getAllUser();
	Page<User> getAllUser(Integer pageNumber);
	Page<User> findByNameContaining(String name, Integer pageNumber);
}
