package linear_search.problem_02;

public class SpecificWord {
    public static String  specificword(String[]sentences,String word){
        for(int i=0; i< sentences.length; i++){
            if(sentences[i].contains(word)) {
                return sentences[i];
            }
        }
        return "not found";
    }
}
