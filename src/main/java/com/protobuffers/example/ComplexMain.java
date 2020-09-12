package com.protobuffers.example;

import java.util.ArrayList;

import example.complex.Complex.ComplexMessage;
import example.complex.Complex.ComplexMessage.Builder;
import example.complex.Complex.DummyMessage;

public class ComplexMain {

	public static void main(String[] args) {

		Builder builder = ComplexMessage.newBuilder();
		
		example.complex.Complex.DummyMessage.Builder dummyBuilder = createDummyMessage("rajkumar", 123);
		example.complex.Complex.DummyMessage.Builder dummyBuilder1 = createDummyMessage("rajkumar1", 234);
		example.complex.Complex.DummyMessage.Builder dummyBuilder2 = createDummyMessage("rajkumar2", 456);
		example.complex.Complex.DummyMessage.Builder dummyBuilder3 = createDummyMessage("rajkumar3", 678);
		
		ArrayList<example.complex.Complex.DummyMessage> dummyBuilderList = new ArrayList<example.complex.Complex.DummyMessage>();
		dummyBuilderList.add(dummyBuilder1.build());
		dummyBuilderList.add(dummyBuilder2.build());
		dummyBuilderList.add(dummyBuilder3.build());
		
		builder.setOneDummy(dummyBuilder.build());
		builder.addAllMultipleDummy(dummyBuilderList);
		
		System.out.println(builder.build());
		
	}

	private static example.complex.Complex.DummyMessage.Builder createDummyMessage(String name, int id) {
		example.complex.Complex.DummyMessage.Builder dummyBuilder= DummyMessage.newBuilder();
		
		dummyBuilder.setId(id);
		dummyBuilder.setName(name);
		return dummyBuilder;
	}

}
