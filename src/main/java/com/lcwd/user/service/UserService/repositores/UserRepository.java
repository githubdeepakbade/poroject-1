package com.lcwd.user.service.UserService.repositores;
import com.lcwd.user.service.UserService.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
