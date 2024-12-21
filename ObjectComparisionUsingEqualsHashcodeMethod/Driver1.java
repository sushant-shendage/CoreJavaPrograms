public class Driver1 {
    public static void main(String[] args) {
        User u1 = new User(10, "Nitin");
        User u2 = new User(10, "Nitin");

        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());

        System.out.println((u1.equals(u2)) ? "true" : "false");
    }
}

class User {

    int userId;
    String userName;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + "]";
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public int hashCode() {
        return userId + userName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        User other = (User) obj;
        return (this == obj) ? true : (obj == null) ? false : (getClass() != obj.getClass()) ? false : (userName == null || userId == 0) ? false : (this.userId == other.userId && this.userName.equals(other.userName));
    }
}
