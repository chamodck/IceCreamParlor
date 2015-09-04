import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int[] array=new int[50];
        for(int i=0;i<t;i++){
            String str=s.next();
            int remainder=0;
            for(int j=49;j>=0;j--){
                int n=Integer.parseInt(str.substring(j, j+1));
                String str1=Integer.toString(array[j]+n+remainder);
                int len=str1.length();
                if (j != 0) {
                    if (len == 1) {
                        array[j] = array[j] + n+remainder;
                        remainder=0;
                    } else {
                        array[j] = Integer.parseInt(str1.substring(len - 1));
                        remainder = Integer.parseInt(str1.substring(0, len - 1));
                    }
                }else{
                    array[j] = array[j] + n+remainder;
                    remainder=0;
                }
            }
        }
        String rslt="";
        for(int i=0;i<10;i++){
            rslt +=Integer.toString(array[i]);
        }
        
        System.out.print(rslt.substring(0, 10));
        
    }    
}
