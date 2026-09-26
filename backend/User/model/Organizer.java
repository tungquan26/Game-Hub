package model;

import enums.UserRole;

public class Organizer extends User {

    public Organizer() {
        super();
        setRole(UserRole.ORGANIZER);
    }

    public Organizer(long userId, String username, String password, String email,
                     String fullName) {
        super(userId, username, password, email, fullName, UserRole.ORGANIZER);
    }
}
