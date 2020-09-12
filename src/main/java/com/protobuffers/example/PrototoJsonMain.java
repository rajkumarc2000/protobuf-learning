package com.protobuffers.example;

import java.util.Arrays;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import example.simple.Simple.SimpleMessage;
import example.simple.Simple.SimpleMessage.Builder;

public class PrototoJsonMain {

	public static void main(String[] args) {
		SimpleMessage.Builder builder = SimpleMessage.newBuilder();
        builder.setId(42);
        builder.setName("Rajkumar");
        builder.setIsSimple(true);
        builder.addAllSampleList(Arrays.asList(1,2,3,4,5));
        
        try {
        	
        	String jsonString = JsonFormat.printer().print(builder);
			System.out.println(jsonString);
			
			Builder builder2 = SimpleMessage.newBuilder();
			JsonFormat.parser().merge(jsonString, builder2);
			System.out.println(builder2.build());
			
		} catch (InvalidProtocolBufferException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
