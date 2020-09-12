package com.protobuffers.example;

import example.enumerations.Enumexample.DayOfTheWeek;
import example.enumerations.Enumexample.EnumMessage;
import example.enumerations.Enumexample.EnumMessage.Builder;

public class EnumMain {

	public static void main(String[] args) {
		Builder builder = EnumMessage.newBuilder();
		builder.setId(234);
		builder.setDayOfTheWeek(DayOfTheWeek.MONDAY);
		
		EnumMessage message = builder.build();
		System.out.println(message);

	}

}
