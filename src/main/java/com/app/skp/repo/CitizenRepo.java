package com.app.skp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.skp.entity.CitizenAppEntity;

public interface CitizenRepo extends JpaRepository<CitizenAppEntity, Integer> {

	public CitizenAppEntity findByCitizenSsn(Long ssn);
	public List<CitizenAppEntity> findByCreatedBy(Integer userId);
}
