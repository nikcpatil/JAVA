package iooperation;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

class person implements Serializable{
	int SrNo;
	//String name;
	float age;
	
	person(int SrNo, float age){
		this.SrNo = SrNo;
		//this.name = name;
		this.age = age;
	}
	
}
public class WriteDataOutput {
	public static void main(String args[]) throws IOException {
		person p = new person(4, 23.1f);
		try {
			FileOutputStream fout = new FileOutputStream("Okay.txt");
			DataOutputStream dt = new DataOutputStream(fout);
			dt.writeInt(9);
			dt.writeDouble(15.45);
			
			System.out.println("Saved..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
