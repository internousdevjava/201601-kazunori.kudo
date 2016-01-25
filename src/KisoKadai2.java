
public class KisoKadai2 {

	public static void main(String[] args) {

		System.out.print("[数当てゲーム]");
	int ans = (int)(Math.random()*100);
	for (int i =0 ;i<100 ; i++){
    System.out.println("0～100の数字を入力して下さい");
    int num = new java.util.Scanner(System.in).nextInt();
    if (ans == num){
    	 System.out.println("あたり!");
       break;
      }if(ans > num){
    System.out.println("小さすぎます");
	} if(ans < num){
	System.out.println("大きすぎます");

      }
    }
	System.out.println("ゲームを終了します");
	}
}

