/**Java linear search program using recursion*/

public class RecursiveLinearSearch {

    public static void main(String[] args) {

        int i=0;
        int[] A = {1, 2, 3, 4, 5};

        System.out.println(linearSearch(A, 4,i));
    }

    public static int linearSearch(int[] A,int searchKey,int i){

        if (i>A.length-1) {
            System.out.println("Not Found");
            return -1;
        }
        else if(A[i]==searchKey){
            System.out.println("Match Found");
            return i;
        }
        else
            System.out.println("Searching");
            return(linearSearch(A,searchKey,i+1));

    }
}
