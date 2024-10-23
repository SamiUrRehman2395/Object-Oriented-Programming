package practice_codes;

enum Status{
    Running,
    Failed,
    Success,
    Pending
}
public class Enumeration {
    public static void main(String[] args) {

        Status status = Status.Running;
        System.out.println(status);

        Status status1 = Status.Running;
        System.out.println(status1.ordinal());

        System.out.println();

        Status[] status2 = Status.values();

        for (Status s : status2) {
            System.out.println(s + " : " +s.ordinal());
        }


    }
}
