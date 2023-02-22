package me.tretyakovv.p4_lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;


public class UserTest {

    private String login;
    private String email;

    User user0;
    User user1;

    @BeforeEach
    public void setUp() {

        login = "test";
        email = "test@mail.ru";

        user0 = new User();
        user1 = new User(login, email);
    }

    @Test
    public void createUser() {
        Assertions.assertEquals(login, user1.getLogin());
        Assertions.assertEquals(email, user1.getEmail());
    }

    @Test
    public void createUserEmpty() {
        Assertions.assertNull(user0.getLogin());
        Assertions.assertNull(user0.getEmail());
    }

    @Test
    public void emailIsCorrect() {

        String emailUser1 = user1.getEmail();

        Assertions.assertNotNull(emailUser1);
        if (emailUser1 != null)
            Assertions.assertTrue(emailUser1.contains("@") && emailUser1.contains("."));
    }

    @Test
    public void loginAndEmailEqual() {

        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            User user2 = new User("test", "test");
        });

        Assertions.assertEquals("Exception: логин не должен быть равен email!", exception.getMessage());
    }
}
