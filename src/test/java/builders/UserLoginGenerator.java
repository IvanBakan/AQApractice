package builders;

import pojo.PostLogin;

public class UserLoginGenerator {
    public static PostLogin setUserData() {
        return PostLogin
                .builder()
                .username("String")
                .email("String")
                .password("String")
                .build();
    }

    public static PostLogin setSuccessfulUserData() {
        return PostLogin
                .builder()
                .username("Ivan")
                .email("test@gmail.com")
                .password("123456789")
                .build();
    }
}
