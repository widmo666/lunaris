package lunaris.service.impl;

import java.util.List;

import lunaris.model.User;
import lunaris.service.ExampleService;
import lunaris.service.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public String getInfo() {
		List<User> resultList = userRepository.getUsers();
		for (User user : resultList) {
			System.out.println("user: " + user.getPin() + " | " + user.getUsername());
		}
		return "Testowe info";
	}

}
