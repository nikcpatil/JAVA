package iooperation;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class WriteDataInput {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("Okay.txt");
			DataInputStream DIS = new DataInputStream(fin);
			
			int num = DIS.readInt();
			double d = DIS.readDouble();
			System.out.println(num+"    "+d);
			//person p = DIS.readInt();
			//double p = DIS.readDouble();--->exception-->at java.io.DataInputStream.readFully(DataInputStream.java:197)
			//at java.io.DataInputStream.readLong(DataInputStream.java:416)
			//at java.io.DataInputStream.readDouble(DataInputStream.java:468)
			//at iooperation.WriteDataInput.main(WriteDataInput.java:14)
			//person P =  DIS.readUTF();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
