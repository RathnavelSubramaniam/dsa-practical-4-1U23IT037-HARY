import java.util.Scanner;

public class Array_Insertion {

    public static void main(String[] args) {
         int len,p,e;
        System.out.println("ARRAY OPERATION");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        len=sc.nextInt();
        int arr[]=new int[len+1];
        System.out.println("Enter "+len+" element(s) to insert");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the position where you want to insert:");
        p=sc.nextInt();
        System.out.println("Enter the element to be inserted");
        e=sc.nextInt();
        arrayInsert(arr,p,e,len);
    }
    static void arrayInsert()
    {
    //TYPE OF CODE HERE
    }
}
