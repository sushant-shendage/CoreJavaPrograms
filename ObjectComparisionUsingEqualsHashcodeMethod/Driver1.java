// Package declaration (commented out for simplicity since it depends on your project structure)
// package javapgms.ObjectComparisionUsingEqualsHashcodeMethod;

public class Driver1 {
    public static void main(String[] args) {
        // Creating two User objects with the same data (userId=10, userName="Nitin")
        User u1 = new User(10, "Nitin");
        User u2 = new User(10, "Nitin");
        
        // Comparing the two User objects using the overridden equals method
        // If the objects are considered equal, "true" will be printed; otherwise, "false" will be printed
        System.out.println((u1.equals(u2)) ? "true" : "false");
    }
}

// Class representing a User with properties userId and userName
class User {
    // Fields for User class
    int userId; // Unique identifier for a user
    String userName; // Name of the user

    // Constructor to initialize User object with userId and userName
    public User(int userId, String userName) {
        this.userId = userId; // Assign the passed userId to the userId field
        this.userName = userName; // Assign the passed userName to the userName field
    }

    // Overriding toString() to provide a meaningful string representation of the User object
    @Override
    public String toString() {
        // Format the User object as a string in the format: "User [userId=10, userName=Nitin]"
        return "User [userId=" + userId + ", userName=" + userName + "]";
    }

    // Getter for userId
    public int getUserId() {
        return userId; // Return the value of userId
    }

    // Setter for userId
    public void setUserId(int userId) {
        this.userId = userId; // Update the userId field with the passed value
    }

    // Getter for userName
    public String getUserName() {
        return userName; // Return the value of userName
    }

    // Setter for userName
    public void setUserName(String userName) {
        this.userName = userName; // Update the userName field with the passed value
    }

    // Overriding hashCode() to generate a hash value for User objects
    @Override
    public int hashCode() {
        final int prime = 31; // A prime number used to calculate the hash
        int result = 1; // Initial hash value
        result = prime * result + userId; // Add userId's contribution to the hash
        result = prime * result + ((userName == null) ? 0 : userName.hashCode()); // Add userName's hash contribution
        return result; // Return the final hash value
    }

    // Overriding equals() to define equality for User objects
    @Override
    public boolean equals(Object obj) {
        // Check if the current object is compared with itself
        if (this == obj)
            return true; // Return true if both references point to the same object
        
        // Check if the other object is null
        if (obj == null)
            return false; // Return false if the other object is null
        
        // Check if the classes of both objects are the same
        if (getClass() != obj.getClass())
            return false; // Return false if they are different classes
        
        // Cast the other object to a User for field comparison
        User other = (User) obj;
        
        // Compare userId fields of both User objects
        if (userId != other.userId)
            return false; // Return false if userId fields are not equal
        
        // Compare userName fields of both User objects
        if (userName == null) {
            if (other.userName != null)
                return false; // Return false if one userName is null but the other is not
        } else if (!userName.equals(other.userName))
            return false; // Return false if userName fields are not equal
        
        // If all checks pass, return true indicating both objects are equal
        return true;
    }
}
