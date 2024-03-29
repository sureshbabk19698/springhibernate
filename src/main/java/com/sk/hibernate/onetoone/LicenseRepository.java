package com.sk.hibernate.onetoone;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LicenseRepository extends JpaRepository<License, Integer>, JpaSpecificationExecutor<License> {

	List<License> getByType(@Param("type") String type);

	List<License> getByValidFrom(@Param("validFrom") Date validFrom);
	
	@Query(value = "Select id, type from License where valid_to>= :validTo", nativeQuery = true)
	List<LicenseMapping> getAllIdAndTypeByValidTo(@Param("validTo") Date validTo);
	
	List<License> getAllIdAndTypeByValidFrom(@Param("validFrom") Date validFrom);
	
	
	public interface LicenseMapping {

		Long getId();
		String getType();
		
	}

}
