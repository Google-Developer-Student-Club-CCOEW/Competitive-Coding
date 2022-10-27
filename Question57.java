import java.util.*;
class problem2{
    int max(int[] array){
        Arrays.sort(array);
        int min=0,max= array.length-1;
        while (min<=max){
            if (array[min]+array[max]==0){
                return array[max];
            } else if (array[min]+array[max]>0) {
                max--;
            } else if (array[min]+array[max]<0) {
                min++;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the elements of the array");
            arr[i]=sc.nextInt();
        }
        problem2 p=new problem2();
        System.out.println("");
        System.out.println("The Largest positive number that exist with its negative in the array: "+p.max(arr));






    }
}
