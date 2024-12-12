package org.kvn.OAuth2;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
public class OAuthController {

    @GetMapping("/")
    public String home(@AuthenticationPrincipal OAuth2User user) {
        return "Welcome, " + user.getAttributes().get("name") + " !";
    }

    @GetMapping("/user")
    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User user) {
        return user.getAttributes();
    }
}
