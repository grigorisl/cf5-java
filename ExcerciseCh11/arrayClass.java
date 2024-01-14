public class Challenge1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = getIntegers(5);
        printArray(array);
        System.out.println("Descending sort: ");
        printArray(sortInteger(array));


    }

    /*
     * User give arrays number
     */

    public static int[] getIntegers(int number) {
        System.out.println("Insert " + number + " integers");
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    /*
     * Print the array
     */

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /*
     * Copy the elements to a new array
     * and make the descending sort
     */

    public static int[] sortInteger(int[] array) {

        int[] sortedArray = new int[array.length];
        for (int i = 0; i < sortedArray.length; i++) {
            int biggerNumber = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    biggerNumber++;
                }
            }
            sortedArray[biggerNumber] = array[i];
        }
        return sortedArray;
    }
}