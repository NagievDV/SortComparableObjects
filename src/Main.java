public class Main {
    public static void main(String[] args) {
        // Массив целых чисел
        Integer[] intArray = {5, 2, 8, 4, 1};
        SortComparableObjects.Sort(intArray);
        System.out.println("Отсортированный массив целых чисел: " + java.util.Arrays.toString(intArray));

        // Массив чисел типа double
        Double[] doubleArray = {2.2, 3.3, 1.1, 4.4, 0.0};
        SortComparableObjects.Sort(doubleArray);
        System.out.println("Отсортированный массив double: " + java.util.Arrays.toString(doubleArray));

        // Массив символов
        Character[] charArray = {'и', 'п', 'а', 'г'};
        SortComparableObjects.Sort(charArray);
        System.out.println("Отсортированный массив символов: " + java.util.Arrays.toString(charArray));

        // Массив строк
        String[] stringArray = {"банан", "яблоко", "апельсин", "киви"};
        SortComparableObjects.Sort(stringArray);
        System.out.println("Отсортированный массив строк: " + java.util.Arrays.toString(stringArray));
    }
}