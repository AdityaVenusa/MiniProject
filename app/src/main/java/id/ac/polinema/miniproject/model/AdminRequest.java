package id.ac.polinema.miniproject.model;

public class AdminRequest {
    private String username, password;

    public AdminRequest(String username, String password) {
        this.username= username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
