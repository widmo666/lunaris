package lunaris.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import lunaris.model.User;
import lunaris.service.ExampleService;

import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

	@PersistenceContext
	private EntityManager em;

	@Override
	public String getInfo() {

		Query createQuery = em.createQuery("select u from User u");
		List<User> resultList = createQuery.getResultList();
		for (User user : resultList) {
			System.out.println("user: " + user.getPin() + " | " + user.getUsername());
		}
		return "Testowe info";
	}

}
