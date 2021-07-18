package shah.springsecurityjpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import shah.springsecurityjpa.models.User;

// 10011
@Service
public class MyUserDetailsService implements UserDetailsService {

  // 10016
  @Autowired
  UserRepository userRepository;
  
  // 10004
  @Override
  public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    // 10017
    Optional<User> user = userRepository.findByUserName(userName);
    // 10021
    user.orElseThrow(()-> new UsernameNotFoundException("Not found: "+userName));
    return user.map(MyUserDetails::new).get();
  
  }
 
  
}
