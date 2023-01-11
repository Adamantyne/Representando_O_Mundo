public class User {
    private String username;
    private String email;
    private String password;
    private boolean online;
    private int exp;

    User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.online = false;
        this.exp = 0;
    }

    // getters
    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }

    public boolean getStatus() {
        return this.online;
    }

    public int getExp() {
        return this.exp;
    }

    // setters
    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    public void setStatus(boolean newStatus) {
        this.online = newStatus;
    }

    public void setExp() {
        this.exp ++;
    }

    // actions
    public void login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            this.online = true;
        }
    }

    public void logout() {
        if (this.online) {
            this.online = false;
        }
    }

    public void changeUsername(String newUsername) {
        this.username = newUsername;
    }
}
