package practice.ch_15.p2;

public class Student extends Teacher {
    // since id,name,address are availabe from teacher class we omit
    // those instance variables and the corresponding methods
    int marks;

    // to store marks
    void setMarks(int marks) {
        this.marks = marks;

    }

    // to retrive marks
    int getMarks() {
        return marks;
    }

}
