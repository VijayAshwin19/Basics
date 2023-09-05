package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter("//home//vijay//Documents//Java//Awesome.java");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("public class Awesome\n{\n");
			bw.write("public static void main()\n{\n");
			bw.write("System.out.println(\"Awesome\");\n}\n}");
			bw.close();
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
