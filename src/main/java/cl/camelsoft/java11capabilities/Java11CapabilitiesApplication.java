package cl.camelsoft.java11capabilities;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java11CapabilitiesApplication {

	private transient Integer intBuffer=0;

	public static void main(String[] args) {
		SpringApplication.run(Java11CapabilitiesApplication.class, args);
		new Java11CapabilitiesApplication().testCapabilities();
	}

	private void testCapabilities(){
		List<Integer> intList=List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(intList);
		intList.forEach(val -> System.out.println("printing values: "+val));
		List<Integer> takeFirstFive=intList.stream().takeWhile(val -> val <= 5).collect(Collectors.toList());
		System.out.println("first five:"+ takeFirstFive);
		Stream<String> stream=Stream.of("a","b","c","d","e");
		List<String> aConcatenator=Stream.iterate("a", val -> val + "a").limit(10).collect(Collectors.toList());
		System.out.println("aConactenator"+aConcatenator);
		List<Integer> oddList=Stream.iterate(1, val -> val + 1).filter(val -> {return val%2==0;}).limit(20).collect(Collectors.toList());
		System.out.println("Odd list:"+oddList);
		Stream.iterate(1,val -> val + intBuffer).limit(10).forEach(val -> {intBuffer+=val;System.out.println(val+";"+intBuffer);});
		String s=new String();
		s.chars().filter(val -> {return val=='a';}).count();
	}

}
