package com.protobuffers.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

import example.simple.Simple.SimpleMessage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        //setting the values for the message. 
        SimpleMessage.Builder builder = SimpleMessage.newBuilder();
        builder.setId(42);
        builder.setName("Rajkumar");
        builder.setIsSimple(true);
        builder.addAllSampleList(Arrays.asList(1,2,3,4,5));
        
        
        System.out.println(builder.toString());
        
        SimpleMessage message = builder.build();
        
        try {
			FileOutputStream file = new FileOutputStream("simple_message.bin");
			message.writeTo(file);
			file.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			FileInputStream file1 = new FileInputStream("simple_message.bin");
			SimpleMessage messagefromFile = SimpleMessage.parseFrom(file1);
			System.out.println("Reading from file");
			System.out.println(messagefromFile);
			
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    }
}
