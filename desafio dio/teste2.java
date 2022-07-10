import java.util.*;
 
    public class teste2{

	//complete o código para que ele funcione corretamente
 
        public static void main(String[] args) {
           
	    //a classe Scanner auxilia na leitura dos dados de entrada
            Scanner scan = new Scanner(System.in);
 
            int N= Integer.parseInt(scan.nextLine());
            String[] teste = new String[N];
            for(int i=0;i<N;i++){
                
                teste[i] = scan.nextLine();
            }
            //String string = scan.nextLine();
            
	    
	    //quebra string em várias substrings a partir de um caracter
            //String[] s = string.split(" ");
            //System.out.println(N);
            //System.out.println(string);
            //System.out.println(s);
            double[] idade = new double[N];
           // for (int i = 0; i < N; i++)
           // {   
            int j = 0;
                //for (String idades : s) {
                   
                   // System.out.println(idade[i]); 
                    //idade[j] = Double.parseDouble(idades); 
                   // System.out.println(idade[i]); 
                  //  j += 1;   
               // }
           // }
           for (int i = 0; i < N; i++){
                idade[i]= Double.parseDouble(teste[i]);
           }
 
            System.out.println("Nao poderao entrar as idades: ");
            for (int i = 0; i < N; i++)
            {
                if (idade[i]<18    )
                {
                   System.out.println(idade[i]);
                }
 
            }
                   
        }
    }