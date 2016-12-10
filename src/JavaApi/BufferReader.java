package JavaApi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		String path1 ="C:/Users/mukbu/OneDrive/Documents/p&T lecture note/API classes/file1.txt";
		String path2 = "C:/Users/mukbu/OneDrive/Documents/p&T lecture note/API classes/file1.txt";
		
		try {
		 fr = new FileReader(path1);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
		br = new BufferedReader (fr);
		String text = "";
		try {
			while((text = br.readLine())!=null){
				System.out.println(text);
			}
		} catch (IOException e) {
			e.printStackTrace();
			}
		finally {
			try{
				if(br != null){
					br = null;
				}if(fr != null){
					fr = null;
				}
			}catch(Exception ex){
				ex.printStackTrace();
				}
			}
		}
		}
		
	

