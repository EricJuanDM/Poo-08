
import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        Area a1 = new Area();

        System.out.println("Area Quadrado: "+ a1.area(2));
        System.out.println("Area Retangulo: "+ a1.area( 10, 2));
        System.out.println("Area Quadrado: "+ a1.area(3.2));

        Funcionario f1 = new Funcionario("Felipe", 1500.0);
        Desenvolvedor d1 = new Desenvolvedor("Luis", 3000);
        Gerente g1 = new Gerente("Douglas", 6000);

        ArrayList<Funcionario> l1 = new ArrayList<>();

        l1.add(f1);
        l1.add(d1);
        l1.add(g1);
        for(Funcionario f: l1)
            System.out.println(f.getNome()+" "+ f.getSalario() + " "+ f.calcularBonus());
    }    
}
