package org.kvn.OAuth2;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OAuthController {

    @GetMapping("/user")
    public Map<String, Object> userDetails(@AuthenticationPrincipal OAuth2User user) {
        return user.getAttributes();
    }
    @GetMapping("/")
    public String user(@AuthenticationPrincipal OAuth2User user) {
        return "Welcome, " + user.getAttributes().get("name") + " !";
    }
}
