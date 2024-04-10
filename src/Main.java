
import java.util.ArrayList;
import  java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");


        namesLinkedList.add(1, "Jerry");
//        System.out.println(namesLinkedList.get(1));

        for(String name : namesLinkedList){
            System.out.println(name);

        }

        ArrayList<String> namesArrayList = new ArrayList<>();

        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        namesArrayList.add("Ringo");


        namesArrayList.add(1, "Jerry");
//        System.out.println(namesArrayList.get(1));

        }
    }
