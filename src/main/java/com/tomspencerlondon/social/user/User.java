package com.tomspencerlondon.social.user;

import com.tomspencerlondon.social.config.OAuth2Provider;
import java.util.Collection;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

@Getter
@Setter
public class User {
  private String name;
  private String email;
  private String imageUrl;
  private OAuth2Provider provider;
  private Collection<? extends GrantedAuthority> authorities;
}
