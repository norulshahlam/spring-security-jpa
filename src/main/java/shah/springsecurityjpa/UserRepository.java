package shah.springsecurityjpa;

import org.springframework.data.jpa.repository.JpaRepository;

import shah.springsecurityjpa.models.User;

import java.util.Optional;
// 10015
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
