public class Array {

    public static int[] array;
    public static void main() {
        Array a = new Array();
        a.createArray();
        showArray();
    }

    public void createArray() {

        this.array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public static int[] getArray() {

        return array;
    }

    public static void showArray() {
        for (int i = 0; i < getArray().length; i++) {
            System.out.println(array[i]);
        }
    }
}
