package string;

public class StringUtil {
    public static String reversed(String str){
        String reversed="";
        for(int i=0;i<str.length();i++){
            reversed += str.charAt(str.length()-i-1);
        }

        return reversed;
    }
}
