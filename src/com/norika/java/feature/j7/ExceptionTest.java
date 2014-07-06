package com.norika.java.feature.j7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionTest {

	public static void main(String[] args) throws FileNotFoundException {
		try
        {
            new FileOutputStream("a.txt");
        }catch (Exception ex){
            ex.printStackTrace();
            throw ex;
        }
	}

}
