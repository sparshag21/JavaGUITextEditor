import java.io.*;
import FileFunctions.*;
class MainProgram

{
	public static void main(String args[])throws Exception {
		FileFunctions ff = new FileFunctions();
		ff.write("IITKanpur.txt","Hi my name is sparsh");
		System.out.println(ff.read("IITKanpur.txt"));
	}
}