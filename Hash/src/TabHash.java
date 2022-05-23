import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.Random;

public class TabHash {
	private List<Long> pesos;
	
	public void read() {
		Scanner leitor = new Scanner(System.in); 
		System.out.print("Nome do Arquivo de entrada: ");
		String nomearq;
		BufferedReader buffread;
		nomearq = leitor.next();  
		try {
			buffread = new BufferedReader(new FileReader(nomearq));
			StringBuffer sb=new StringBuffer();
			String line;
			while((line=buffread.readLine())!=null){  
				sb.append(line); 
				String sbStr = sb.toString();
				String[] dados = sbStr.split(",");
				
			}
		
		buffread.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	public void create(String[] dados) {
		Random rn = new Random();
		long chave = rn.nextInt(100000 + 1);
		
	}
}
