public class StringManipulatorTest{
    public static void main(String[] args){
        StringManipulator iD = new StringManipulator();
        String new_str = iD.trimAndConcat("      Hello      ", "     World ");
        System.out.println(new_str);
        char letter = 'o';
        Integer a = iD.getIndexOrNull("Coding", letter);
        Integer b = iD.getIndexOrNull("Hello World", letter);
        Integer c = iD.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer new_a = iD.getIndexOrNull(word, subString);
        Integer new_b = iD.getIndexOrNull(word, notSubString);
        System.out.println(new_a); // 2
        System.out.println(new_b); // null
        String new_word = iD.concatSubstring("Hello", 1, 2, "world");
        System.out.println(new_word); // eworld
    }   
}