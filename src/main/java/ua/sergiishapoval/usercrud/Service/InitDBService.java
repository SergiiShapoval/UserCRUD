package ua.sergiishapoval.usercrud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.sergiishapoval.usercrud.entity.User;
import ua.sergiishapoval.usercrud.repository.UserRepository;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.Date;

/**
 * Created by Сергей on 22.12.2014.
 */
@Transactional
@Service
public class InitDBService {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init(){

        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }

        //simple creation

        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(34);
            user.setIsAdmin(false);
            user.setName("Sergii");
            user.setCreatedDate(new Date(112, 12, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(23);
            user.setIsAdmin(true);
            user.setName("Andrew");
            user.setCreatedDate(new Date(105, 9, 12));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(19);
            user.setIsAdmin(false);
            user.setName("Max");
            user.setCreatedDate(new Date(106, 1, 16));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(45);
            user.setIsAdmin(true);
            user.setName("Rurik");
            user.setCreatedDate(new Date(105, 8, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(54);
            user.setIsAdmin(false);
            user.setName("Alex");
            user.setCreatedDate(new Date(111, 4, 9));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(12);
            user.setIsAdmin(false);
            user.setName("Vadim");
            user.setCreatedDate(new Date(110, 10, 23));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(14);
            user.setIsAdmin(false);
            user.setName("Marina");
            user.setCreatedDate(new Date(112, 5, 1));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(26);
            user.setIsAdmin(false);
            user.setName("Lusi");
            user.setCreatedDate(new Date(110, 2, 27));
            userRepository.save(user);
        }
        {
            User user = new User();
            user.setAge(18);
            user.setIsAdmin(true);
            user.setName("Marta");
            user.setCreatedDate(new Date(104, 5, 4));
            userRepository.save(user);
        }

    }
}
