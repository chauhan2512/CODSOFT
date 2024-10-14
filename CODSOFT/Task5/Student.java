public class Student {
    private String name;
    private int rollNumber;
    private String grade;
    private String email;

    public Student(String name, int rollNumber, String grade, String email) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.email = email;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student [Name=" + name + ", Roll Number=" + rollNumber + ", Grade=" + grade + ", Email=" + email + "]";
    }
}
