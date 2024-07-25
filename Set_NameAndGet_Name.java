
    class Student{
        int salary;
        String name;

        public int getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String n) {
            name = n;
        }

    }


    public class Set_NameAndGet_Name {
        public static void main(String[] args) {

            Student shan = new Student();

            shan.setName("SHAN MASOOD");
            shan.salary = 800;

            System.out.println(shan.getName());
            System.out.println(shan.getSalary());
        }
    }


