import java.util.*;

public class UserManager {
    private UserService userService;

    public UserManager(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }
}