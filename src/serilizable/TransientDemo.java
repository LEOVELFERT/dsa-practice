package serilizable;

import java.io.Serializable;

public class TransientDemo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userName;
    private transient String password;

    public TransientDemo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "TransientDemo{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
