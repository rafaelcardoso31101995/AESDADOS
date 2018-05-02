package pilha;

import javax.swing.JOptionPane;

public class ExPalindrome {
	 private char vet[];
	 private int topo;

	  public ExPalindrome(int tamanho)
	 {
	  vet = new char[tamanho];
	  topo = -1;
	 }

	  public void empilhar(char x)
	 {
	  topo++;
	  vet[topo] = x;
	 }

	  public char desempilhar()
	 {
	  char aux = vet[topo];
	  topo--;
	  return aux;
	 }

	  public boolean vazia()
	 {
	  if (topo == -1) return true;
	  else return false;
	 }
	  
	public static void main(String[] args) {
		
		String pf = JOptionPane.showInputDialog("Digite a frase/palavra");
		int tamanho = pf.length();
		
		ExPalindrome p1 = new ExPalindrome(tamanho);
		ExPalindrome p2 = new ExPalindrome(tamanho);
		  
		  p1.empilhar('a');
		  p1.empilhar('m');
		  p1.empilhar('a');
		  p1.empilhar('n');
		  p1.empilhar('d');
		  p1.empilhar('a');

		   while(! p1.vazia())
		  {
		   char aux = p1.desempilhar();
		   System.out.println(aux);
		   p2.empilhar( aux );
		  }
		  
		  while(! p2.vazia())
		  {
		   System.out.println(p2.desempilhar());
		  }
	}

}