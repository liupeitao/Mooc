/*
 * @Author: your name
 * @Date: 2015-05-11 00:00:00
 * @LastEditTime: 2022-02-25 17:59:13
 * @LastEditors: your name
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \{0}--全部课件\ch06\ExceptionForIO.java
 */
import java.io.*;

public class ExceptionForIO{
	  public static void main(String[] args){
	     try{
		 	 FileInputStream in=new FileInputStream("myfile.txt");
			 int b;	
			 b = in.read();
			 while(b!= -1) {
				System.out.print((char)b);
				b = in.read();
			 }
			 in.close();
		  }catch (IOException e) {
		     System.out.println(e);
		  }finally {
		     System.out.println("finally here");
		  }
	  }
}
