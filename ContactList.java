package definition;

import adt.ContactListADT;
import java.util.ArrayList;

public class ContactList<person> implements ContactListADT<person> {
    ArrayList arrayOfNames = new ArrayList<String>();
    ArrayList arrayOfFirstName = new ArrayList<String>();
    private Node<Person> head;
    private int size = 0;
    private int counter = 0;
