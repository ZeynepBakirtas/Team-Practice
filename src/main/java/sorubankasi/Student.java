package sorubankasi;

public class Student {
        String name;
        static String college ="UNF";
        Student(String n, String college){
                this.name = n;
                this.college = college;
        }
        public static void main(String args[]){
                Student s1 = new Student("Mark", "UCF");
                Student s2 = new Student("Kevin", "FIU");
                System.out.println(s1.name);
                System.out.println(s2.name);
                System.out.println(s1.college);
                System.out.println(s2.college);
        }
}
