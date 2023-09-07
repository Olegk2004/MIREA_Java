public class Person {
    private String fname = "*";
    private String lname = "*";
    private String mname = "*";

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getInfo(){
        String s = lname + " " + fname.charAt(0) + "." + mname.charAt(0);
        return s;
    }
}
