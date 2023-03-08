public class Array_1 {
    public static void main(String args[]) {
        int numbers[] = {2, 3, 1, 7, 11};                           //1.Створюю масив з ініціалізованими значеннями
        ReversSortMethod(numbers);                                  //14.Використовую створений метод сортування
    }

    static void ReversSortMethod(int[] e) {                         //2.Створюю метод який сортує числа
        int iteration = 0;                                          //3.Змінна яка записує к-сть повтореннь які будуть використані для сортування
        boolean change = true;                                      //4.Змінна яка продовжує сортування
        while (change) {                                            //5.Цикл який повторює програму поки відбуваються заміни елементів
            change = false;                                         //13.Змінна яка контролює повтор, коли вона буде дорівнювати свому значенню це ознака відсортованого масиву
            for (int i = 0; i < e.length-1-iteration; i++) {        //6.Починаю з 1го елементу, зупиняю порівняння на передостанньому елементі, віднімаю повтор щоб не перевіряти останні комірки
                if (e[i] < e[i + 1]) {                              //7. Порівнюю сусідні елементи
                    int hp = e[i];                                  //8. Cтворюю тимчасову змінну для зберігання першого елементу
                    e[i] = e[i + 1];                                //9.Перенос останнього елементу в попередній
                    e[i + 1] = hp;                                  //10.Запис значення з тимчасової змінної в вільний елемент масиву
                    change = true;                                  //11.Змінна яка показує що заміна відбулась
                }
            }
            iteration++;                                            //12.Повтор циклу
        }
        for (int i: e)                                              //
            System.out.print(i + " ");                              //15.Виведення на екран
    }
}