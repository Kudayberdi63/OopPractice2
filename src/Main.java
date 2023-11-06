public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kuba", 17, "Java");
        System.out.println(student.age + "\n" + student.name + "\n" + student.group);

        System.out.println("");

        Student student1 = new Student("Ronaldo", 39, "JS");
        System.out.println(student1.name + "\n" + student1.group + "\n" + student1.age);

        System.out.println("");

        Student student2 = new Student("Messi", 37, "JAVA");
        System.out.println(student2.name + "\n" + student2.group + "\n" + student2.age);

        System.out.println(" ");

        Student student3 = new Student("Neymar ", 36, "JS");
        System.out.println(student3.name + "\n" + student3.group + "\n" + student3.age);

        System.out.println(" ");

        Student student4 = new Student(" Ramos ", 38, "JAVA");
        System.out.println(student4.name + "\n" + student4.group + "\n" + student4.age);

    }
}