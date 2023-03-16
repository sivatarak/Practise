import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.StreamHandler;

public class Graph{
    static boolean isValid(int wood[],int N,int len,int k ){
        int count=0;
        for(int i=0;i<N;i++){
            count += wood[i]/len;
        }
        return count>=k;//for getting  clarity about correct size of the wood
    }
     static int findSameLen(int wood[],int N,int k){
        //traversing from 1 to max element
        int left = 1;
        //making the max element as right from the array
        int right = Arrays.stream(wood).max().getAsInt();

        while(left <= right){
            int mid = left+(right-left)/2;

         if(isValid(wood,N,mid,k)){
                 left = mid +1;
         }
         else{
             right =mid-1;
         }
        }
        return right;
    }

    //Driver code
    public static void main(String [] args){
        int wood[] ={5,9,7};
        int k = 4;
        int N = wood.length;
        System.out.println(findSameLen(wood,N,k));
    }
}
