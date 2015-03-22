package lunaris.service.impl;

import java.util.List;

import lunaris.model.User;
import lunaris.service.ExampleService;
import lunaris.service.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

	// @PersistenceContext
	// private EntityManager em;

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public String getInfo() {
		// Query createQuery = em.createQuery("select u from User u");
		// List<User> resultList = createQuery.getResultList();
		List<User>  resultList = userRepository.findAll();
		for (User user : resultList) {
			System.out.println("user: " + user.getPin() + " | " + user.getUsername());
		}
		return "Testowe info";
	}

}
