package theory_assignment_1;

public class BlockList extends Contact {
    public BlockList(String id, String name, String number) {
        super(id, name, number);
    }


    @Override
    public String toString() {
        return "Blocked Contact - Name: " + getName() + " | Number: " + getNumber();
    }
}
