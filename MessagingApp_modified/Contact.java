package theory_assignment_1;


public class Contact {
    private String id;
    private String name;
    private String number;

    public Contact(String id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Number: " + number;

    }
}

