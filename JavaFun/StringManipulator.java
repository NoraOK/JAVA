public class StringManipulator{
    public String trimAndConcat(String str1, String str2){
        String new_str = (str1.trim()) + (str2.trim());
        return (new_str);
    }
    public Integer getIndexOrNull(String str, char letter){
        return(str.indexOf(letter));
    }
    public Integer getIndexOrNull(String str1, String str2){
        return(str1.indexOf(str2));
    }
    public String concatSubstring(String str1, int num1, int num2, String str2){
        return(str1.substring(num1, num2)+str2);
    }
}