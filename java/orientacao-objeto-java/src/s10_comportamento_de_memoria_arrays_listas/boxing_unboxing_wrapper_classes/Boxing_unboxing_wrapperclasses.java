package s10_comportamento_de_memoria_arrays_listas.boxing_unboxing_wrapper_classes;

public class Boxing_unboxing_wrapperclasses {
    public static void main (String[] args) {
        int x = 20;
        Object obj = x;
        System.out.println();
        int y = (int) obj;

        System.out.println(y);
    }
}
