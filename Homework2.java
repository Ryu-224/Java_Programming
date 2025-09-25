import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);

    int studentID; long phoneNumber;
    String major; String name;

    Student () {}

    int getStudentID() { return studentID; }
    String getMajor() { return major; }
    String getName() { return name; }
    String getPhoneNumber() { 
        String strPN ="0" + Long.toString(phoneNumber);
        String hPN = strPN.substring(0, 3) + '-' 
        + strPN.substring(3, 7) + '-' 
        + strPN.substring(7, 11);
        return hPN; }

    void setStudentID() {
        studentID = sc.nextInt();
    }
    void setName() {
        name = sc.next();
    }
    void setMajor() {
        major = sc.next();
    }
    void setPhoneNumber() {
        phoneNumber = sc.nextLong();
    }
}

public class Homework2 {
    public static void main(String[] args) {
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student s1 = new Student();
        s1.setStudentID(); s1.setName(); s1.setMajor(); s1.setPhoneNumber();
        
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student s2 = new Student();
        s2.setStudentID(); s2.setName(); s2.setMajor(); s2.setPhoneNumber();
    
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student s3 = new Student();
        s3.setStudentID(); s3.setName(); s3.setMajor(); s3.setPhoneNumber();
       
        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        System.out.printf("첫번째 학생: %d %s %s %s\n", s1.getStudentID(), s1.getName(), s1.getMajor(), s1.getPhoneNumber() );
        System.out.printf("두번째 학생: %d %s %s %s\n", s2.getStudentID(), s2.getName(), s2.getMajor(), s2.getPhoneNumber() );
        System.out.printf("세번째 학생: %d %s %s %s\n", s3.getStudentID(), s3.getName(), s3.getMajor(), s3.getPhoneNumber() );
    }
}
