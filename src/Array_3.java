 public class Array_3 {


    public static void main(String args[]) {
        int number[] = {13, 3, 53, 17, 24};
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            total += number[i];
        }
        int arithmeticMount = total /= number.length;
        System.out.print(arithmeticMount);
    }
}
