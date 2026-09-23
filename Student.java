public class Student {

    int studentNo;
    String name;
    String serviceType;
    int serviceTime;

    Student(int studentNo, String name, String serviceType, int serviceTime) {
        this.studentNo = studentNo;
        this.name = name;
        this.serviceType = serviceType;
        this.serviceTime = serviceTime;
    }

    void display() {
        System.out.println(
            studentNo + " | " +
            name + " | " +
            serviceType + " | " +
            serviceTime + " min"
        );
    }
}