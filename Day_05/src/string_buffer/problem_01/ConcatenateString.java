package string_buffer.problem_01;

public class ConcatenateString {
    public String  concatenate(String[] str){
        StringBuffer sb =new StringBuffer();
        for(int i=0;i< str.length; i++){
            sb.append(str[i]);

        }
        return sb.toString();

    }
}
