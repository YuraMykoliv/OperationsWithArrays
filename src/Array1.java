public class Array1 {
    public static void main(String args[]) {
        int numbers[] = {2, 3, 1, 7, 11};                           
        reversSortMethod(numbers);                                 
    }

    static void reversSortMethod(int[] e) {                         
        int iteration = 0;                                          
        boolean change = true;                                      
        while (change) {                                            
            change = false;                                        
            for (int i = 0; i < e.length-1-iteration; i++) {      
                if (e[i] < e[i + 1]) {                              
                    int hp = e[i];                                  
                    e[i] = e[i + 1];                                
                    e[i + 1] = hp;                                 
                    change = true;                                 
                }
            }
            iteration++;                                            
        }
        for (int i: e)                                              
            System.out.print(i + " ");                             
    }
}
