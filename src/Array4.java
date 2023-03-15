import java.util.Arrays;
public class Array4 {
    public static void main(String args[]) {
        int e[] = {3, 2, 3, 1, 4, 2, 8, 3};

        int e2[] = e.clone();
        for (int i = 0; i < e2.length; i++)

            for (int o = i + 1; o < e2.length; o++) {
                if (e2[i] == e2[o])
                    e2[o] = 0;
            }
        System.out.println(Arrays.toString(e2));
    }
}

