
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.print("Banyak data : ");
       int[] data = {19,16,14,11,20,13,17,12,15,18};
               
               //proses insertion sort
               for(int i = 0; i < data.length; i++){
                   int key = data[i];
                   int j = i;
                   
                   while( j >= 1 && data[j - 1] > key ){
                       data[j] = data[j - 1];
                       j--;
                   }
                   data[j] = key;
               }
               for(int i = 0; i< data.length; i++){
                   System.out.print( data[i] + " ");
               }
               System.out.println();
    }
    
}
