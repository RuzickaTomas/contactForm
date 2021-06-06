package cz.contactform.converter;

import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import cz.contactform.enumeration.KindOfRequest;

@Component
public class StringToEnumConverter implements Converter<String, KindOfRequest> {
    @Override
    public KindOfRequest convert(String source) {	
    	return List.of(KindOfRequest.values())
    				.stream()
    				.filter(p -> p.getLabel().contentEquals(source))
    				.findFirst().orElse(null);
    }
}
