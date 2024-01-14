package gr.aueb.cf.ch11.ExcerciseCh11;

public class UserCredentials {

    private long id;
    private String username;
    private String password;

    // default constructor
    public UserCredentials() {
    }

    // overloaded constructor

    public UserCredentials(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
