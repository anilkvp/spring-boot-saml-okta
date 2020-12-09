package org.coldstone.springboot.saml.okta.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Arrays;

/**
 *
 */
@RestController
public class UserController {

    /**
     * @return
     */
    @GetMapping("/user/names")
    public ResponseEntity<?> getUsernames() {
        return ResponseEntity.ok(Arrays.asList("spring", "spring-boot", "maven"));
    }

    /**
     * @return
     */
    @GetMapping("/users")
    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok(Arrays.asList(
                new User(1000L, "spring_user1", "spring-user1@spring.io"),
                new User(1000L, "spring_boot_user1", "spring-boot-user1@spring.io"),
                new User(1000L, "maven_user001", "maven_user001@maven.org")
        ));
    }


    /**
     * @return
     */
    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUser(@PathParam("id") String id) {
        return ResponseEntity.ok(
                new User(1000L, "spring_user1", "spring-user1@spring.io"));
    }
}
