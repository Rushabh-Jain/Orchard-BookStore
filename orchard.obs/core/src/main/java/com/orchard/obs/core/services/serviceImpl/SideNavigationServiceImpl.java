package com.orchard.obs.core.services.serviceImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.orchard.obs.Exceptions.daoexceptions.SideNavigationDaoException;
import com.orchard.obs.Exceptions.serviceExceptions.SideNavigationServiceException;
import com.orchard.obs.core.dao.SideNavigationDao;
import com.orchard.obs.core.entity.Book;
import com.orchard.obs.core.services.SideNavigationServices;

@Component(immediate = true, service = SideNavigationServices.class)
public class SideNavigationServiceImpl implements SideNavigationServices {

	@Reference
	SideNavigationDao sideNavigationDao;

	@Override
	public List<String> getBookGenres(String dataSourceName) throws SideNavigationServiceException {
		try {
			return sideNavigationDao.getBookGenres(dataSourceName);
		} catch (SideNavigationDaoException e) {
			throw new SideNavigationServiceException(e);
		}
	}

	@Override
	public List<String> getBookPublishers(String dataSourceName) throws SideNavigationServiceException {
		try {
			return sideNavigationDao.getBookPublishers(dataSourceName);
		} catch (SideNavigationDaoException e) {
			throw new SideNavigationServiceException(e);
		}
	}

	@Override
	public List<Book> getBookBasedOnGenre(String dataSourceName, String genre, String customerId)
			throws SideNavigationServiceException {
		try {
			return sideNavigationDao.getBookBasedOnGenre(dataSourceName, genre, customerId);
		} catch (SideNavigationDaoException e) {
			throw new SideNavigationServiceException(e);
		}
	}

	@Override
	public List<Book> getBookBasedOnPublisher(String dataSourceName, String publisher, String customerId)
			throws SideNavigationServiceException {
		try {
			return sideNavigationDao.getBookBasedOnPublisher(dataSourceName, publisher, customerId);
		} catch (SideNavigationDaoException e) {
			throw new SideNavigationServiceException(e);
		}
	}

	@Override
	public List<Book> getBookBasedOnGenreAndPublisher(String dataSourceName, String genre, String publisher,
			String customerId) throws SideNavigationServiceException {
		try {
			return sideNavigationDao.getBookBasedOnGenreAndPublisher(dataSourceName, genre, publisher, customerId);
		} catch (SideNavigationDaoException e) {
			throw new SideNavigationServiceException(e);
		}
	}

}
