package hellow;

public class continueBreak {  
    public static void main(String[] args) {    
        int arr[] = {1, 2, 3, 4, 5, 6, 7 , 8};
        
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] == 4) {
                continue; 
            }
             
            System.out.println("number " + arr[i]); 
            
            if (arr[i] == 5) {
                break; 
            }
           
        }
    }
}
