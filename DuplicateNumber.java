import java.util.Arrays; 

public class DupNum{

  public static void main(String[] args) 
    {
        int[] arr = {11,12,13,14,11,17,22};
 
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if ((arr[i] == arr[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+arr[j]);
                }
            }
        }
    }    
}
