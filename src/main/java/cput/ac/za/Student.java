package cput.ac.za;

public class Student {
    String name;
    int phone;
    String faculty;

    public Student() {
    }

    public Student(String name, int phone,String faculty) {
        this.name = name;
        this.phone = phone;
        this.faculty= faculty;
    }



    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n"+" NAME:" + name  + '\'' +
                " PHONE:" + phone  +
                " FACULTY:" + faculty +"\n" ;
    }
}

