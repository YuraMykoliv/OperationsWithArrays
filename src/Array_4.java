import java.util.Arrays;
public class Array_4 {
    public static void main(String args[]) {
        int e[] = {3, 2, 3, 1, 4, 2, 8, 3};

        int size[] = e.clone();
        for (int i = 0; i < size.length; i++)

            for (int o = i + 1; o < size.length; o++) {
                if (size[i] == size[o])
                    size[o] = 0;
            }
        System.out.println(Arrays.toString(size));
    }
}

