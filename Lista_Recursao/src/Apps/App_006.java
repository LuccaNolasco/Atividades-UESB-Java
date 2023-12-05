package Apps;

public class App_006 {

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;

        int result = binarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("O elemento " + target + " foi encontrado no índice " + result + ".");
        } else {
            System.out.println("O elemento " + target + " não foi encontrado no array.");
        }
    }

    public static int binarySearch(int[] array, int target) {
        return binarySearchRecursive(array, target, 0, array.length - 1);
    }

    private static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1; // Elemento não encontrado no array.
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid; // Elemento encontrado no índice `mid`.
        } else if (array[mid] < target) {
            return binarySearchRecursive(array, target, mid + 1, right); // Busca na metade direita do array.
        } else {
            return binarySearchRecursive(array, target, left, mid - 1); // Busca na metade esquerda do array.
        }
    }

}

