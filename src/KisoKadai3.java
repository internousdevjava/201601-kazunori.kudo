import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean end = true ;
		while (end){

			System.out.println("[メニュー] １：新規作成  ２：ファイル読み込み  ３：ファイル書き込み 4:終了 \n");
			int menu =new java.util.Scanner(System.in).nextInt();
			switch (menu) {
				case 1:
					Create();
					break;
				case 2:
					Read();
					break;
				case 3:
					write();
					break;
				case 4 :
					fin();
					end = false;
					break;
			default:
				break;
			}
		}
	}


		public static void Create() {
			System.out.println("ファイルを作成します");
			System.out.println("ファイル名をどうぞ");
			String namefile =new java.util.Scanner(System.in).nextLine();
			String fileplase ="C:\\users\\internous\\";
			File newfile = new File( fileplase + namefile);

			try{
				if (newfile.createNewFile()){
					System.out.println("ファイルの作成に成功しました");
				}else{
			        System.out.println("ファイルの作成に失敗しました");
				}
			}catch(IOException e){
				System.out.println(e);
			}
		}

		 public static void Read(){
			 System.out.println("どのファイルを読みますか？");
		    	String namefile =new java.util.Scanner(System.in).nextLine();
		    	String plase = "C:\\users\\internous\\";
		    		    try{
		    		    	System.out.println("ファイルを読み込みます \n");
		    		    	File file = new File(plase + namefile );
		    		      if (checkBeforeReadfile(file)){
		    		        BufferedReader br = new BufferedReader(new FileReader(file));

		    		        String str;
		    		        while((str = br.readLine()) != null){
		    		          System.out.println(str);

		    		        }

		    		        br.close();
		    		      }else{
		    		        System.out.println("ファイルが見つからないか開けません");
		    		      }
		    		    }catch(FileNotFoundException e){
		    		      System.out.println(e);
		    		    }catch(IOException e){
		    		      System.out.println(e);
		    		    }
		    		  }

		    		  private static boolean checkBeforeReadfile(File file){
		    		    if (file.exists()){
		    		      if (file.isFile() && file.canRead()){
		    		        return true;
		    		      }
		    		    }

		    		    return false;
		    		  }

		      public static void write(){
		    	  System.out.println("ファイルに書き込みをします");
		     	 System.out.println("書き込みたいファイル名をどうぞ！");
		     	 String namefile =new Scanner(System.in).nextLine();
		     	 String plase = "C:\\users\\internous\\";
		     	 try{
		     	      File file = new File(plase + namefile);

		     	      if (checkBeforeWritefile(file)){
		     	        FileWriter filewriter = new FileWriter(file, true);
		                 System.out.println("内容");
		                 String bun =new Scanner(System.in).nextLine();
		     	        filewriter.write(bun + "\n");
		     	        System.out.println("\n");
		     	        String bun2  =new Scanner(System.in).nextLine();
		     	        filewriter.write(bun2 + "\n");
	                   System.out.println("入力を終了します");
		     	        filewriter.close();
		     	      }else{
		     	        System.out.println("ファイルに書き込めません");
		     	      }
		     	    }catch(IOException e){
		     	      System.out.println(e);
		     	    }
		     	  }

		      public static void fin(){
		    	  System.out.println("システムを終了します。お疲れ様でした。");
		    	  			System.exit(0); }





		     	  private static boolean checkBeforeWritefile(File file){
		     	    if (file.exists()){
		     	      if (file.isFile() && file.canWrite()){
		     	        return true;
		     	      }
		     	    }

		     	    return false;
		     	  }
		     }

