package com.orchard.obs.core.dao;

import java.util.List;

import com.orchard.obs.Exceptions.daoexceptions.SideNavigationDaoException;
import com.orchard.obs.core.entity.Book;

public interface SideNavigationDao {
	public List<String> getBookGenres(String dataSourceName) throws SideNavigationDaoException;

	public List<String> getBookPublishers(String dataSourceName) throws SideNavigationDaoException;

	public List<Book> getBookBasedOnGenre(String dataSourceName, String genre,String customerId) throws SideNavigationDaoException;

	public List<Book> getBookBasedOnPublisher(String dataSourceName, String publisher,String customerId)
			throws SideNavigationDaoException;

	public List<Book> getBookBasedOnGenreAndPublisher(String dataSourceName, String genre, String publisher,String customerId)
			throws SideNavigationDaoException;
}
