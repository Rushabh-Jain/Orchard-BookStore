/**
 * 
 */
package com.orchard.obs.core.entity;

import java.util.Date;
import java.util.List;

/**
 * @author Rushabh
 *
 */
public class Book {
	private int price, quantity, discount, pageCount;
	private Long isbn[];
	private String id, name, author[], genre, language, publisher, edition, description;
	private List<String> authors;
	private Date publishDate;
	private boolean isPresentInCart,isBestSeller,isNew;
	
	public Book() {
		super();
	}

	/**
	 * @param price
	 * @param quantity
	 * @param discount
	 * @param pageCount
	 * @param isbn
	 * @param id
	 * @param name
	 * @param author
	 * @param genre
	 * @param language
	 * @param publisher
	 * @param edition
	 * @param description
	 * @param authors
	 * @param publishDate
	 * @param isPresentInCart
	 * @param isBestSeller
	 * @param isNew
	 */
	public Book(int price, int quantity, int discount, int pageCount, Long[] isbn, String id, String name,
			String[] author, String genre, String language, String publisher, String edition, String description,
			List<String> authors, Date publishDate, boolean isPresentInCart, boolean isBestSeller, boolean isNew) {
		super();
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
		this.pageCount = pageCount;
		this.isbn = isbn;
		this.id = id;
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.language = language;
		this.publisher = publisher;
		this.edition = edition;
		this.description = description;
		this.authors = authors;
		this.publishDate = publishDate;
		this.isPresentInCart = isPresentInCart;
		this.isBestSeller = isBestSeller;
		this.isNew = isNew;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	/**
	 * @return the pageCount
	 */
	public int getPageCount() {
		return pageCount;
	}

	/**
	 * @param pageCount the pageCount to set
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	/**
	 * @return the isbn
	 */
	public Long[] getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(Long[] isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the author
	 */
	public String[] getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String[] author) {
		this.author = author;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the edition
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * @param edition the edition to set
	 */
	public void setEdition(String edition) {
		this.edition = edition;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the authors
	 */
	public List<String> getAuthors() {
		return authors;
	}

	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	/**
	 * @return the publishDate
	 */
	public Date getPublishDate() {
		return publishDate;
	}

	/**
	 * @param publishDate the publishDate to set
	 */
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	/**
	 * @return the isPresentInCart
	 */
	public boolean isPresentInCart() {
		return isPresentInCart;
	}

	/**
	 * @param isPresentInCart the isPresentInCart to set
	 */
	public void setPresentInCart(boolean isPresentInCart) {
		this.isPresentInCart = isPresentInCart;
	}

	/**
	 * @return the isBestSeller
	 */
	public boolean isBestSeller() {
		return isBestSeller;
	}

	/**
	 * @param isBestSeller the isBestSeller to set
	 */
	public void setBestSeller(boolean isBestSeller) {
		this.isBestSeller = isBestSeller;
	}

	/**
	 * @return the isNew
	 */
	public boolean isNew() {
		return isNew;
	}

	/**
	 * @param isNew the isNew to set
	 */
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	
	
	
}
