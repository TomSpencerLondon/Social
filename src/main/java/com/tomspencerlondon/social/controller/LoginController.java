package com.tomspencerlondon.social.controller;

import static com.tomspencerlondon.social.config.OAuth2Provider.github;

import com.tomspencerlondon.social.user.UserPrincipal;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
  private static final String authorizationRequestBaseUri = "oauth2/authorization";

  @GetMapping("/login")
  public String getLoginPage(Model model) {
    model.addAttribute(github.toString(), authorizationRequestBaseUri + "/" + github.toString());

    return "login";
  }

  @GetMapping("/home")
  public String getIndexPage(Model model, @AuthenticationPrincipal UserPrincipal userPrincipal) {
    model.addAttribute("user_name", userPrincipal.getName());
    model.addAttribute("user_avatar", userPrincipal.getImageUrl());

    return "index";
  }
}
