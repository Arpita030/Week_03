package sorting.selectionsort;

public class ExamScores {
    public static void examscore(int[] marks){
        for(int i=0; i<marks.length-1;i++){
            int smallest=i;
            for(int j=i+1; j<marks.length;j++){
                if(marks[smallest] > marks[j]){
                    smallest=j;

                }
            }
             int  temp=marks[smallest];
             marks[smallest]=marks[i];
             marks[i]=temp;
        }
    }
}
