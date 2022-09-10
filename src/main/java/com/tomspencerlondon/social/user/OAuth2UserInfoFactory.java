package com.tomspencerlondon.social.user;

import static com.tomspencerlondon.social.config.OAuth2Provider.github;

import java.util.Map;

public class OAuth2UserInfoFactory {
  public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
    if (registrationId.equalsIgnoreCase(github.toString())) {
      return new GithubOAuth2UserInfo(attributes);
    } else {
      throw new RuntimeException("Login with " + registrationId + " is not supported yet.");
    }
  }
}
