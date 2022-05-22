import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner buffer = new Scanner((System.in));


        //1. Ans:

        int n=buffer.nextInt();
        int i,j;
        int[] x= new int[n];
        for(i=0;i<n;i++)
            x[i]=buffer.nextInt();

        System.out.println("\nIn reverse order: ");

        for(i=n-1;i>-1;i--)
            System.out.print(x[i]+ " ");


        //2. Ans:

        int sum=0;
        for(i=0;i<n;i++)
            sum=sum+x[i];
        System.out.println("\nSum = "+sum);


        //3. Ans:

        int[] y= new int[n];
        for(i=0;i<n;i++){
            y[i]=x[i];
            System.out.println("y["+i+"] = "+y[i]);
        }



        //4. Ans:

        int[] z = new int[n];
        int count=0;

        for(i=0;i<n;i++){

            for(j=0;j<count;j++){
                if(x[i]==z[j])
                    break;
            }
            if(j==count){
                z[count]=x[i];
                count++;
            }
        }

        System.out.println("\nUnique elements: ");

        for(i=0;i<count;i++)
            System.out.print(z[i]+" ");
    }
}