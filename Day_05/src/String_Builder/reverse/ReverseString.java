package String_Builder.reverse;

public class ReverseString {
    public String reverse( String str ){
        StringBuilder sb= new StringBuilder(str);
        return sb.reverse().toString();
    }
}
