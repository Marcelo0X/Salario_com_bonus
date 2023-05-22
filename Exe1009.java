public class Exe1009 implements Runnable {

    private String nome;
    private double salario;
    private double vendas;
    private double comissao;

    public Exe1009(String nome, double salario, double vendas, double comissao){
	setNome(nome);
	setSalario(salario);
	setVendas(vendas);
	setComissao(comissao);
    }
    public void setNome(String nome){
	this.nome = nome;
    }
    public String getNome(){
	return nome;
    }
    public void setSalario(double salario){
	this.salario = salario;
    }
    public double getSalario(){
	return salario;
    }
    public void setVendas(double vendas){
	this.vendas = vendas;
    }
    public double getVendas(){
	return vendas;
    }
    public void setComissao(double comissao){
	this.comissao = comissao;
    }
    public double getComissao(){
	return comissao;
    }
    public double mostrarSalario(){
	return salario + (vendas * (comissao / 100));
    }
    public void run(){
	mostrarSalario();
    }
}
