package cn.iponkan.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.iponkan.entity.Person;
import cn.iponkan.service.PersonService;

/**
* @author 作者 :董唐强
* @version 创建时间：2018年8月26日 下午2:32:11
* 说明：
*/
public class SpringJpaTest {
	private ApplicationContext ctx = null;
	private PersonService personService = null;
	
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		personService = ctx.getBean(PersonService.class);
	}
	
	@Test
	public void testPersonService(){
		Person p1 = new Person();
		p1.setAge(11);
		p1.setEmail("aa@163.com");
		p1.setLastName("AA");
		
		Person p2 = new Person();
		p2.setAge(12);
		p2.setEmail("bb@163.com");
		p2.setLastName("BB");
		
		System.out.println(personService.getClass().getName());
		personService.savePersons(p1, p2);
	}
	
	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}
}
