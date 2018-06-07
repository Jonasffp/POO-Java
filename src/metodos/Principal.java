package metodos;

public class Principal {
    public static void main(String args[]) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        c2.setPonta(0.5);
        System.out.println(c1.getPonta());
        System.out.println(c2.getPonta());

    }
}
