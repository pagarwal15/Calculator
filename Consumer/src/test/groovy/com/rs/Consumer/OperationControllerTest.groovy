package com.rs.Consumer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import com.rs.Consumer.bean.Calculator
import com.rs.Consumer.bean.Results
import spock.lang.Specification


@SpringBootTest
class OperationControllerTest extends Specification {
	
	@Autowired
	OperationController controller
	
	def "test fetching of mathamethic operation add"(){
		given:
		Calculator bean = new Calculator()
		bean.setOperation("add")
		List<Integer> list = [1.0,2.0]
		bean.setNumbers(list)
		
		when:
		Results result = controller.fetchResult(bean);
		
		then:
		null!=result
		result.getResult() == "3.0"
		
	}
	
	def "test fetching of mathamethic operation negative -add"(){
		given:
		Calculator bean = new Calculator()
		bean.setOperation("add")
		List<Integer> list = [1.0,2.0]
		bean.setNumbers(list)
		
		when:
		Results result = controller.fetchResult(bean);
		
		then:
		null!=result
		result.getResult() == "4.0"
		
	}
	
	def "test fetching of mathamethic operation subtract"(){
		given:
		Calculator bean = new Calculator()
		bean.setOperation("subtract")
		List<Integer> list = [10.0,2.0]
		bean.setNumbers(list)
		
		when:
		Results result = controller.fetchResult(bean);
		
		then:
		null!=result
		result.getResult() == "8.0"
		
	}
	def "test fetching of mathamethic operation multiply"(){
		given:
		Calculator bean = new Calculator()
		bean.setOperation("miltiply")
		List<Integer> list = [1.0,2.0]
		bean.setNumbers(list)
		
		when:
		Results result = controller.fetchResult(bean);
		
		then:
		null!=result
		result.getResult() == "2.0"
		
	}
	def "test fetching of mathamethic operation divide"(){
		given:
		Calculator bean = new Calculator()
		bean.setOperation("divide")
		List<Integer> list = [2.0,1.0]
		bean.setNumbers(list)
		
		when:
		Results result = controller.fetchResult(bean);
		
		then:
		null!=result
		result.getResult() == "1.0"
		
	}
	
}
