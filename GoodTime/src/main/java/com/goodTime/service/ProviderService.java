package com.goodTime.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.goodTime.dao.ProviderDao;
import com.goodTime.daoimpl.ProviderDaoImpl;
import com.goodTime.domain.Provider;

@Service
public class ProviderService {
	
//	@Autowired
//	private ProviderDao providerDao;
	
	@Autowired
	private ProviderDaoImpl providerDaoImpl;

	public void registerProvider(Provider provider) {
		//providerDao.registerProvider(provider);
		providerDaoImpl.registerProvider(provider);
	}
}
