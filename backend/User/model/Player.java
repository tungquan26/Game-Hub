package model;

import enums.UserRole;

public class Player extends User {

    public Player() {
        super();
        setRole(UserRole.PLAYER);
    }

    public Player(long userId, String username, String password, String email,
                  String fullName) {
        super(userId, username, password, email, fullName, UserRole.PLAYER);
    }
}
