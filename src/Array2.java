public class Array2 {
    public static void main(String[] args) {

        int number[] = {-32, 12, -71, 25, -90, 41};                
        int total = 0;                                            
        returnToZero(number);
        for (int i = 0; i < number.length; i++) {
            total += number[i];           
        }
        System.out.println(total);
    }

    static void returnToZero(int[] e) {                            
        int iteration = 0;                                          
        boolean change = true;                                      
        while (change) {                                            
            change = false;                                         
            for (int i = 0; i < e.length-1-iteration; i++) {         
                if (e[i] > 0) {                                     
                    int hp = e[i];                                 
                    e[i] = e[i + 1];                             
                    e[i + 1] = hp;                                  
                    change = true;                                 
                } else e[i] = 0;                                  
            }
            iteration++;                                           
        }
    }
}
