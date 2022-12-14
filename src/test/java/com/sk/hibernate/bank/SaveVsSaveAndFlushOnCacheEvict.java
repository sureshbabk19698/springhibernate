package com.sk.hibernate.bank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;

import com.sk.hibernate.annotation.SpringBootTestByProfile;

@SpringBootTestByProfile
@Sql(scripts = { "/db/data/bank-int.sql" })
public class SaveVsSaveAndFlushOnCacheEvict {

	@Autowired
	SaveVsSaveAndFlush saveVsSaveAndFlush;
	
	@Test
	public void testSaveAndFlush_whenCacheIsEvicted_fetchFromDb_hasLatestChanges() {
		saveVsSaveAndFlush.testSaveAndFlush_whenCacheEvicted_fetchFromDb_hasLatestChanges();
	}

	@Test
	public void testSave_whenCacheIsEvicted_fetchFromDb_doesNotHaveLatestChanges() {
		saveVsSaveAndFlush.testSave_whenCacheEvicted_fetchFromDb_doesNotHaveLatestChanges();
	}
	
}
