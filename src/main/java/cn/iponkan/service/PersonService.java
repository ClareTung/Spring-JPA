package cn.iponkan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.iponkan.dao.PersonDao;
import cn.iponkan.entity.Person;

/**
* @author 作者 :董唐强
* @version 创建时间：2018年8月26日 下午2:34:33
* 说明：
*/
@Service
public class PersonService {
	@Autowired
	private PersonDao personDao;
	
	@Transactional
	public void savePersons(Person p1, Person p2){
		personDao.save(p1);
		
//		int i = 10 / 0;
		
		personDao.save(p2);
	}
	
}
