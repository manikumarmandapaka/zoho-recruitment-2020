public class ExamPattern
{
public static void main(String[] args) {
         int i, j, k = 1;
         int space=5;
         for (i = 1; i <= 5; i++) 
         {
                  space--;
                  k++;
                 
             for (j = 1; j<=space; j++) 
             {
                 System.out.print(" ");
             }
             for (x = 1; x<=k; x++) 
             {
                 System.out.print(k);
                      k++;
                              
             }     
                  
   
             System.out.println();
         }
     }
}
