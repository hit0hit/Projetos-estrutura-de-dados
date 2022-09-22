package Aula01;

public class Ex001 {
    public static void main(String[] args) {
        double[] vendas = { 10, 200, 0, 1000, 100};
        double[] salario = new double[6];
        System.out.println("Funcionário\tVendas Brutas\tSalário");
        for(int i = 0; i < vendas.length; i++) {
            salario[i] = 200 + (vendas[i] * 0.08);
            System.out.println(i +"\t\t" + vendas[i] + "\t\t" + salario[i]);
        }
    }
}
