package com.goodTime.daoimpl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.goodTime.dao.ProviderDao;
import com.goodTime.domain.Provider;

@Repository
public class ProviderDaoImpl implements ProviderDao {
	
	private NamedParameterJdbcTemplate namedParamJdbcTemplate;
	
	public ProviderDaoImpl(DataSource dataSoruce) {
		namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSoruce);
	}
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);

	}

	public void registerProvider(Provider provider) {
		SqlParameterSource beansParams = new BeanPropertySqlParameterSource(provider);
		String sqlQuery = "INSERT INTO provider_table(email, password)"
				+ "VALUES(:email, :password)";
		namedParamJdbcTemplate.update(sqlQuery, beansParams);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
