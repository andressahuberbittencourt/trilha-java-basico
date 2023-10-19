import java.util.Scanner;

public class Contador1 {
    public static void main(String[] args) {

        int parametroUm = 0, parametroDois = 0;
		
        do{
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.print("Digite o primeiro parâmetro: ");
		        parametroUm = teclado.nextInt();
                System.out.print("Digite o segundo parâmetro: ");
		        parametroDois = teclado.nextInt();

                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            
            }catch (ParametrosInvalidosException exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.print("O segundo parâmetro deve ser MAIOR que o primeiro!\n");  
            }
        } while(parametroUm > parametroDois);
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int i = 0; i <= contagem; i++){
            System.out.println("Imprimindo número " + i);
        }
	}
}
