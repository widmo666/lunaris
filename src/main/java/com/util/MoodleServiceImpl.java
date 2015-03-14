package com.util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.model.MoodleUser;

@Service
public class MoodleServiceImpl implements MoodleService {

	@PersistenceContext
	private EntityManager em;

	// @Autowired
	public MoodleUserRepository moodleUserRepository;

	@Override
	public List<MoodleUser> getAllMoodleUsers() {
		Query createQuery = em.createQuery("select mu from MoodleUser mu");
		List<MoodleUser> resultList = createQuery.getResultList();
		return resultList;
		// return moodleUserRepository.findAllMoodleUsers();
		// return null;
	}

}
