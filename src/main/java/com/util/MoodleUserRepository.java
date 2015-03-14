package com.util;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.MoodleUser;

public interface MoodleUserRepository extends JpaRepository<MoodleUser, Long> {

	@Query("select mu from MoodleUser mu")
	public List<MoodleUser> findAllMoodleUsers();
}
