
public class Pessoa 
{
	// Dados
	private	String nome;
	private	int rg;
	private	int cpf;
	private	char[] dia = new char[2];
	private	char[] mes = new char[2];
	private	char[] ano = new char[4];

	public Pessoa(String nome, String data, int rg, int cpf)
	{
			this.setNome(nome);
			this.rg = rg;
			this.cpf = cpf;
			this.dia[0] = data.charAt(0);
			this.dia[1] = data.charAt(1);
			this.mes[0] = data.charAt(3);
			this.mes[1] = data.charAt(4);
			this.ano[0] = data.charAt(6);
			this.ano[1] = data.charAt(7);
			this.ano[2] = data.charAt(8);
			this.ano[3] = data.charAt(9);
						
	}
	// Funções e Set
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public int getRg() 
	{
		return rg;
	}
	public void setRg(int rg)
	{
		this.rg = rg;
	}
	
	public int getCpf()
	{
		return cpf;
	}
	public void setCpf(int cpf)
	{
		this.cpf = cpf;
	}
	
	//Retornar a data no formado dd/mm/aaaa
	public String getData()
	{
		return (dia[0] +""+dia[1]+"/"+mes[0]+mes[1]+"/"+ ano[0] + ano[1] + ano[2] +  ano[3]);
	}
	
	//Salvar o valor da data
	public void setData(String data)
	{
		this.dia[0] = data.charAt(0);
		this.dia[1] = data.charAt(1);
		this.mes[0] = data.charAt(3);
		this.mes[1] = data.charAt(4);
		this.ano[0] = data.charAt(6);
		this.ano[1] = data.charAt(7);
		this.ano[2] = data.charAt(8);
		this.ano[3] = data.charAt(9);	
	}		
}
	