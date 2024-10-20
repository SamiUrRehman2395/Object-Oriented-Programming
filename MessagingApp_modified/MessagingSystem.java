package theory_assignment_1;


import java.util.Arrays;
import java.util.Scanner;

public class MessagingSystem {

    private Contact[] contacts = new Contact[100];
    private BlockList[] blocked = new BlockList[100];

    private Sms[][] chats = new Sms[100][100];

    private int contactCount = 0;
    private int blockCount = 0;
    private int[] chatCounts = new int[100];



    private final String senderName = "Sami";
    private final String senderNumber = "+923038822180";

    {
        preAddedContacts("Imad Wasim", "+923039812367");
        preAddedContacts("Mohammad Amir", "+92317080150");
        preAddedContacts("Shan Masood", "+923457872784");
        preAddedContacts("Salman Ali Agha", "+923210035650");
        preAddedContacts("Fakhar Zaman", "+923002378044");
    }

    public void addContact(String name, String number) {
        contacts[contactCount] = new Contact(Integer.toString(contactCount + 1), name, number);
        //Used Integer.toString to convert integer type counter into string, because array consider id as string
        contactCount++;
        System.out.println("Contact added successfully: " + name);
    }

    public void preAddedContacts(String name, String number) {
        contacts[contactCount] = new Contact(Integer.toString(contactCount + 1), name, number);
        contactCount++;
    }

    //we can use this method in our other methods to reduce redundancy
    private int searchContactIndexByName(String name) {
        for (int i = 0; i < contactCount; i++) {

            if (contacts[i].getName().equalsIgnoreCase(name)) {
                //used equalsIgnoreCase function, so if user enter small letter instead of capital, it will not give error
                return i;
            }
        }

        return -1;

    }

    private int searchBlockIndexByName(String name) {
        for (int i = 0; i < blockCount; i++) {
            if (blocked[i].getName().equalsIgnoreCase(name)) {
                return i;
            }

        }
        return -1;


    }

    public void deleteContact(String name) {
        int contactIndex = searchContactIndexByName(name);
        if (contactIndex != -1) {

            for (int j = contactIndex; j < contactCount - 1; j++) {
                contacts[j] = contacts[j + 1];
            }
            contactCount--;
            System.out.println("Contact removed.");

        }
        else
        {
            System.out.println("No such contact saved.");
        }
    }

    public void viewContacts() {
        if (contactCount == 0) {
            System.out.println("No contacts saved.");
            return;
        }


        System.out.println("Contact List:");
        for (int i = 0; i < contactCount; i++) {
            System.out.println(contacts[i].toString());
        }
    }

    public void blockContact(String name) {
        int contactIndex = searchContactIndexByName(name);
        if (contactIndex != -1) {
            blocked[blockCount] = new BlockList(contacts[contactIndex].getId(), contacts[contactIndex].getName(), contacts[contactIndex].getNumber());
            blockCount++;
            System.out.println(name + " has been blocked.");
        }
        else
        {
            System.out.println("No such contact found to block.");
        }
    }

    public void viewBlocked() {
        if (blockCount == 0) {
            System.out.println("No blocked contacts.");
            return;
        }

        System.out.println("Blocked Contacts:");
        for (int i = 0; i < blockCount; i++) {
            System.out.println(blocked[i].toString());
        }
    }

    public void unblockContact(String name) {
        int blockIndex = searchBlockIndexByName(name);


        if (blockIndex != -1) {
            for (int j = blockIndex; j < blockCount - 1; j++) {
                blocked[j] = blocked[j + 1];
            }

            blockCount--;
            System.out.println(name + " has been unblocked.");
        }

        else
        {
            System.out.println("No such contact found in block list.");
        }
    }

    public boolean isBlocked(String name) {
        return searchBlockIndexByName(name) != -1;

    }

    public void startChat(String name) {

        int contactIndex = searchContactIndexByName(name);
        if (contactIndex != -1) {

            if (isBlocked(name)) {
                System.out.println("The person is blocked.");
                return;
            }

            int contactId = Integer.parseInt(contacts[contactIndex].getId()) - 1;

            //Integer.parseInt is noe converting string type id into integer type , and -1 to match 0 based java indexing

            System.out.println("Chatting with " + contacts[contactIndex].getName());

            System.out.println("Enter '0' to stop chatting.");

            System.out.println("Sender: " + senderName + " | Receiver: " + contacts[contactIndex].getName());

            Scanner scanner = new Scanner(System.in);
            while (true) {
                String message = scanner.nextLine();

                if (message.equals("0"))
                    break;

                Sms newMessage = new Sms(message);
                chats[contactId][chatCounts[contactId]++] = newMessage;
                System.out.println("Message sent.");


            }

        }
        else
        {
            System.out.println("No such contact found.");
        }
    }

    public void viewChats(String name) {
        int contactIndex = searchContactIndexByName(name);

        if (contactIndex != -1) {
            int contactId = Integer.parseInt(contacts[contactIndex].getId()) - 1;
            System.out.println("\nChats with " + contacts[contactIndex].getName() + ":");
            System.out.println("Sender: " + senderName + " | Receiver: " + contacts[contactIndex].getName());
            System.out.println("___________________________________________________________________________");

            Sms[] messages = Arrays.copyOf(chats[contactIndex], chatCounts[contactIndex]);

            //

            Arrays.sort(messages, (msg1, msg2) -> msg2.getTimestamp().compareTo(msg1.getTimestamp()));
//here i used lambda expression to sort messages from newer to older
            //whenever user view messages of specific contact, it shows the latest msgs first followed by older msgs

            for (Sms message : messages) {
                System.out.println(message.toString());
                message.markAsRead();
            }
        }
        else
        {
            System.out.println("No chats found with this contact.");
        }


    }

    public void deleteMessage(String name, String messageId) {

        int contactIndex = searchContactIndexByName(name);

        if (contactIndex != -1) {
            int contactId = Integer.parseInt(contacts[contactIndex].getId()) - 1;

            for (int j = 0; j < chatCounts[contactId]; j++) {
                if (chats[contactId][j].getMessageId().equals(messageId)) {
                    for (int k = j; k < chatCounts[contactId] - 1; k++) {
                        chats[contactId][k] = chats[contactId][k + 1];
                    }
                    chatCounts[contactId]--;
                    System.out.println("Message deleted.");
                    return;
                }

            }

        }

        System.out.println("No message with the given ID found.");
    }

}

