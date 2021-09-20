/*Insertion sort is a sorting algorithm that builds a final sorted array one element at a time.
Insertion sort has an average and worst-case running time of O(n^2)O(n2),
so in most cases, a faster algorithm is more desirable. */


public class InsertionSort {

    public static void main(String[] args){

        int[] myArray=new int[] {3,2,1,5,6,78,0};
        int[] myArray1=new int[] {3,2,1,5,6,78,0};

        // For Loops -Insertion Sort
        myArray=insertionsort(myArray);

        //Printing the sorted array
        myArray1=insertionSort1(myArray1);


        //Printing the sorted array-myArray
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        //Printing the sorted array-myArray1
        for (int i = 0; i < myArray1.length; i++) {
            System.out.println(myArray1[i]);
        }
    }

    //For Loops- Insertion Sort Implementation: O(n^2)
    public static int[] insertionsort(int[] myArray){
        for(int i=1;i<=myArray.length-1;i++){
            for(int j=0;j<=myArray.length-1;j++){
                if(myArray[i]<myArray[j]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;
                }
            }
        }
        return myArray;
    }

    //For & while - Insertion sort implementation : O(n^2)
    public static int[] insertionSort1(int[] myArray){
        for(int i=1;i<=myArray.length-1;i++){
            int min=myArray[i];
            int j=i-1;
            while(j>=0 && myArray[j]>min){
               myArray[j+1]=myArray[j];
                j--;
            }
           myArray[j+1]=min;
            }
        return myArray;
    }
}
