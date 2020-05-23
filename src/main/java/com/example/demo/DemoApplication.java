package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	/*Integer intValue = 5;
	Double doubleValue = convertToDouble(intValue);

	public Double convertToDouble(Object object) {
		Double value = 0.0;

		if(object instanceof Integer) {
			value = (Double) object;  // ClassCastException
		}

		return value;
	}*/

	Integer intValue = 5;
	Double doubleValue = convertToDouble(intValue);

	public Double convertToDouble(Object object) {
		Double value = 0.0;

		if(object instanceof Integer) {
			Integer tempValue = (Integer) object;
			value = tempValue.doubleValue();
		}

		return value;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
