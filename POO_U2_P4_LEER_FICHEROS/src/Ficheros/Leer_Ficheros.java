package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer_Ficheros {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		BufferedReader br =new BufferedReader (new FileReader("C:\\Users\\ESPE\\Desktop\\POOP3.txt"));
		String linea;
		try {
			while((linea=br.readLine())!=null) {
				System.out.println(linea);
			}
		}catch (IOException ex) {
			
		}
	}
}

