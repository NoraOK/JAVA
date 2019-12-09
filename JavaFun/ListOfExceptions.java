import java.util.ArrayList;

public class ListOfExceptions{
    public void listOfExceptions(){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("success");
            }catch(ClassCastException e){
                System.out.println("Failed at "+i);
            }
        }

        
    }
}