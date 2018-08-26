package cn.iponkan.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cn.iponkan.entity.Person;

/**
* @author 作者 :董唐强
* @version 创建时间：2018年8月26日 下午2:34:20
* 说明：
*/
@Repository
public class PersonDao {

	//如何获取到和当前事务关联的 EntityManager 对象呢 ?
	//通过 @PersistenceContext 注解来标记成员变量!
	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Person person){
		entityManager.persist(person);
	}
}
