package shah.springsecurityjpa;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

// 10011
@Service
public class MyUserDetailsService implements UserDetailsService {
  
  // 10004
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    //  10010 
    return new MyUserDetails(username);
  }
 
  
}
