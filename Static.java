class Student {
    static String college = "SCSVMV";
    String name;

    Student(String n) {
        name = n;
    }

    void display() {
        System.out.println(name + " studies at " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Vamsi");
        Student s2 = new Student("Tharish");

        s1.display();
        s2.display();
    }
}