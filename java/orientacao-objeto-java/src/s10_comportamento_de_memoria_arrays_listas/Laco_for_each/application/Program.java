package s10_comportamento_de_memoria_arrays_listas.Laco_for_each.application;

public class Program {
    public static void main(String[] args) {

        String[] vect = new String[]{"Maria", "Bob","alex"};

        for(int i=0; i< vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println("-----------");
        for (String obj : vect ) {
            System.out.println(obj);
        }
    }
}
