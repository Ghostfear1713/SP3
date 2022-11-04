public class User extends Main{

    int ageOfUser;
    private String userName;
    private String password;


    public User(int ageOfUser, String userName, String password) {
        this.ageOfUser = ageOfUser;
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



    public int getAgeOfUser() {
        return ageOfUser;
    }
}
