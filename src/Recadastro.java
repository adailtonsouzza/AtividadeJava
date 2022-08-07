import java.io.*;

public class Recadastro {

	public static void main(String[] args) {
		int pessoas, Rg, Cpf;
		String nome, data, rg, cpf;
		File arquivo = new File("recadastro.txt");
		// Sei que era pra colocar no mesmo arquivo mas assim � melhor para verificar o codigo

		Pessoa[] p;

		try 
		{
			// Fun��es para escrever
			BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
			// Fun��es para ler
			BufferedReader br = new BufferedReader(new FileReader("cadastro.txt"));
			// Se arquivo existir leia ele, se n�o mostre mensagem de erro
			if (arquivo.exists() == true) 
			{
				// L� a primeira tam onde est� a quantidade
				String tam = br.readLine();
				// Converte valor de String para inteiro
				pessoas = Integer.parseInt(tam);
				System.out.println(pessoas);
				// Declara o vetor de Objetos com o tamanho obtido
				p = new Pessoa[pessoas];

				// ------------- Ler Arquivo -----------
				int i = pessoas - 1;
				while (br.ready() == true) 
				{
					// Salva valores obtidos em tais tams
					nome = br.readLine();
					data = br.readLine();
					rg = br.readLine();
					cpf = br.readLine();
					// Converte valores que devem ser inteiros
					Rg = Integer.parseInt(rg);
					Cpf = Integer.parseInt(cpf);
					// Instancia um Objeto salvando os dados
					p[i] = new Pessoa(nome, data, Rg, Cpf);
					i--;
				}
				// Fecha fun��es de leitura
				br.close();

				// ----------- Escrever no arquivo -----------
				bw.write(tam);
				bw.newLine();
				for (i = 0; i < pessoas; i++) 
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
				// Fecha fun��es de escrita
				bw.close();
			} 
			// Caso o arquivo de leitura n�o exista
			else 
			{
				System.out.println("Arquivo n�o Encontrado!");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
