package model;

import enums.UserRole;

public class Admin extends User {

    public Admin() {
        super();
        setRole(UserRole.ADMIN);
    }

    public Admin(long userId, String username, String password, String email,
                 String fullName) {
        super(userId, username, password, email, fullName, UserRole.ADMIN);
    }
}
