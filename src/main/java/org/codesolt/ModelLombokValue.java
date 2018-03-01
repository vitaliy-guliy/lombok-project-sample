package org.codesolt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.extern.log4j.Log4j;

@Log4j
@Value
@AllArgsConstructor
public class ModelLombokValue implements ModelInterface {
	
	@NonFinal private String stringValue;
	@NonNull private Integer integerValue;
	@Getter(lazy=true) private static final Double doubleValue = calculateDoubleValue();

	
	private static Double calculateDoubleValue() {
		log.info("Calculating double value");
		double a = 2.0;
		for(int i=0; i<9; i++)
			a = a * 1.5;
		return a;
	}
}
