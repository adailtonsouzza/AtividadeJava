import java.util.Scanner;
import java.io.*;

public class Cadastro 
{

	public static void main(String[] args) 
	{
		
		int pessoas; 
		String nome;
		int rg, cpf;
		String data; 
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digitar o numero de pessoas para ser cadastrada:");
		pessoas = s.nextInt();

		Pessoa [] p = new Pessoa[pessoas];
		s.nextLine();
		
		// Repetição para coletar os dados
		for (int i = 0; i < pessoas; i++)
		{
			
			System.out.println("Digitar o nome:");
			nome = s.nextLine();
			
			System.out.println("Digitar o RG:");
			rg = s.nextInt();
			
			System.out.println("Digitar o CPF:");
			cpf = s.nextInt();
			
			s.nextLine();
			System.out.println("Digitar a Data de Nascimento:");
			data = s.nextLine();
			
			p[i] = new Pessoa(nome, data, rg, cpf);	
		}
		
		// Arquivo area
		File arquivo = new File("cadastro.txt");
		try
		{
			
			FileWriter fw = new FileWriter(arquivo);
			BufferedWriter bw = new BufferedWriter(fw);
			
			if (arquivo.exists() == false)
			{
				arquivo.createNewFile();
			}
				bw.write(String.valueOf(pessoas));
				bw.newLine();

			for ( int i = 0; i < pessoas; i++)
			{
				
				bw.write(p[i].getNome());
				bw.newLine();
				bw.write(p[i].getData());
				bw.newLine();	
				bw.write(String.valueOf(p[i].getRg()));
				bw.newLine();
				bw.write(String.valueOf(p[i].getCpf()));
				bw.newLine();
			}
			
			bw.close();
			fw.close();
		}catch (IOException e){
			e.printStackTrace();
			
		}
		s.close();
	}
}
