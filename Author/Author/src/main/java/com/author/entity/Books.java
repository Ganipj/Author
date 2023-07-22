package com.author.entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/*"author": "Marguerite Yourcenar",
"country": "France/Belgium",

"language": "French",
"link": "https://en.wikipedia.org/wiki/Memoirs_of_Hadrian\n",
"pages": 408,"imageLink": "images/memoirs-of-hadrian.jpg",
"title": "Memoirs of Hadrian",
"year": 1951*/
@Entity
@Table(name = "books")
public class Books {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	
	private Long id;
	private String title;
	private String language;
	private String country;
	private String imageLink;
	private Integer pages;
	private Integer year;
	private String link;
	
	@ManyToOne
	private Author author;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Books(String title, String language, String country, String imageLink, Integer pages, Integer year,
			String link, Author author) {
		super();
		this.title = title;
		this.language = language;
		this.country = country;
		this.imageLink = imageLink;
		this.pages = pages;
		this.year = year;
		this.link = link;
		this.author = author;
	}
	

	public Books(Long id, String title, String language, String country, String imageLink, Integer pages, Integer year,
			String link, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.language = language;
		this.country = country;
		this.imageLink = imageLink;
		this.pages = pages;
		this.year = year;
		this.link = link;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + ", language=" + language + ", country=" + country
				+ ", imageLink=" + imageLink + ", pages=" + pages + ", year=" + year + ", link=" + link + ", author="
				+ author + "]";
	}
	
	
	
	
	

	
	
	
	
	
	

}
