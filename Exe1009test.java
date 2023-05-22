import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe1009test{

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
	salarioBonus();
    }
    public static void salarioBonus(){
	List<Exe1009> bonus = new ArrayList<>();
	try{
	    for(int i = 0; i < 3; i++){
		System.out.print("Nome ");
		String nome = in.nextLine();
		System.out.print("Salario R$ ");
		double sal = in.nextDouble();
		System.out.print("Vendas R$ ");
		double vendas = in.nextDouble();
		System.out.print("Percentual comissão %");
		double comis = in.nextDouble();
		
		Exe1009 exe = new Exe1009(nome, sal, vendas, comis);
		bonus.add(exe);
		in.nextLine();
	    }
	    Thread.sleep(5000);
	    System.out.println();
	    for(Exe1009 exe: bonus){
		System.out.println("Nome "+exe.getNome());
		System.out.printf("Salario R$ %.2f%n", exe.mostrarSalario());
		Thread.sleep(5000);
	    }
	}catch(Exception e){
	    System.out.println("Erro "+e+" tente novamente");
	    in.nextLine();
	    salarioBonus();
	}
    }

}
