package org.wecancodeit.reviewssiteredux;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue
	private Long id;
	private String categoryName;

	@OneToMany(mappedBy="category")
	private Collection<Review> reviews;

	public Category(String categoryName) {
		this.categoryName = categoryName;
	}

	public Category() {

	}

	public Long getId() {
		return id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

	@Override
	public String toString() {
		return "Category: " + categoryName;
	}
}
