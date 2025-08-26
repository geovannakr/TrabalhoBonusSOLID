public class Customer {
    private String email;
    private boolean isStudent;

    public Customer(String email, boolean isStudent) {
        this.email = email;
        this.isStudent = isStudent;
    }

    public String getEmail() {
        return email;
    }

    public boolean isStudent() {
        return isStudent;
    }
}