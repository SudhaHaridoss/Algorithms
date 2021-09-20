import java.util.Arrays;

public class BinarySearch {

    public static void main (String[] args){
        int[] A= {1,2,3,4,5};

        //Binary Search
        System.out.println(binarySearch(A,8));

        //Recursive Binary Search
        System.out.println(recursiveBinarySearch(A,8,0,A.length-1));

        //Arrays- BinarySearch
        System.out.println(Arrays.binarySearch(A,4));

    }


    //Implementation of Binary Search
    public static int binarySearch(int A[],int searchKey) {
        int p=0;
        int q=A.length-1;
        int mid=0;
        while(p<=q){
            mid=(p+q)/2;
            if(searchKey>A[mid])p=mid+1;
            else if (searchKey<A[mid])q=mid-1;
            else return mid;
        }
        return -1;
    }

    //Implementation of Recursive Binary Search
    public static int recursiveBinarySearch(int A[],int searchKey,int p,int q){
        int mid=(p+q)/2;
        if(A[mid]==searchKey) return mid;
        else if(searchKey>A[mid]) p=mid+1;
        else if(searchKey<A[mid]) q=mid-1;
        if(p<=q) return recursiveBinarySearch(A, searchKey, p, q);
        else return -1;
    }
}
