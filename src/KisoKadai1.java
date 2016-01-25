
public class KisoKadai1 {

	public static void main(String[] args) {

	System.out.println("xは");
	    int name=new java.util.Scanner( System.in).nextInt();
	   System.out.println("yは");
	    int nam=new java.util.Scanner( System.in).nextInt();

	    for (int i=1 ; i<=name ; i++ ){
		for(int j=1; j<= nam ;j++ ){
			System.out.print(" ");
			System.out.print( i + "×" + j + "=" +  i * j);
		}
		System.out.println("");
		;
	 }
	}
	}
