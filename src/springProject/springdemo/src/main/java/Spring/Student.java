package Spring;

public class Student {

    private int studentid;
    private String studentname;
    private String studentAddress;

    // Getters and Setters
    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentAddress=" + studentAddress + "]";
    }
}
