package Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        Array1 array1 = new Array1();
        array1.AdicionarItem(10);
        array1.AdicionarItem(20);
        array1.AdicionarItem(30);
        array1.AdicionarItem(40);

        System.out.println(array1.getVetor());
    }
}
