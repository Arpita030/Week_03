package sorting.insertion_sort;

public class EmployeeId {
    public static void employeeid(int[]Id){
        for(int i=0; i<Id.length;i++){
            int current=Id[i];
            int j=i-1;
            while(j>=0 && current<Id[j]){
                Id[j+1]=Id[j];
                j--;
            }
            Id[j+1]=current;
        }
    }
}
