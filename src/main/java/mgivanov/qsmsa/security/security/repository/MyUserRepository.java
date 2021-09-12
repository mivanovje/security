package mgivanov.qsmsa.security.security.repository;

import mgivanov.qsmsa.security.security.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepository extends JpaRepository<MyUser, Integer> {
      MyUser findByUsername(String username);
}
