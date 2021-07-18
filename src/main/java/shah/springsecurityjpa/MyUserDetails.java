package shah.springsecurityjpa;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
// 10005
public class MyUserDetails implements UserDetails {

  private String userName;

      // 10006
      public MyUserDetails(String userName) {
        this.userName = userName;
      }
      
      
  //  10007
  public MyUserDetails() {
      }


// 10009
  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
  }

  @Override
  public String getPassword() {
//  10008
    return "pass";
  }

  @Override
  public String getUsername() {
//  10008
    return userName; 
  }

  @Override
  public boolean isAccountNonExpired() {
//  10009
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
 //  10009
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
 //  10009
    return true;
  }

  @Override
  public boolean isEnabled() {
 //  10009
    return true;
  }
  
}
