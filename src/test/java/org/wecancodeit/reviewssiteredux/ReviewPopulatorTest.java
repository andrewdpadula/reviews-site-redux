package org.wecancodeit.reviewssiteredux;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

public class ReviewPopulatorTest {

	@Mock
	CategoryRepository testCategoryRepo;

	@Mock
	ReviewRepository testReviewRepo;
	
	@Mock
	Category testCategory1;
	
	@Mock
	Review testReview1;

	@Autowired
	ReviewPopulator populator;
	
	@Test
	public void populatorShouldSaveCategory() {
		long repoCountBeforeSavingCategory = testCategoryRepo.count();
		testCategoryRepo.save(testCategory1);
		long repoCountAfterSavingCategory = testCategoryRepo.count();
		assertThat(repoCountAfterSavingCategory, contains(testCategory1));
		
	}
	
	@Test
	public void populatorShouldSaveReview() {
		long repoCountBeforeSavingReview = testReviewRepo.count();
		testReviewRepo.save(testReview1);
		long repoCountAfterSavingReview = testReviewRepo.count();
		assertThat(repoCountAfterSavingReview, is(equalTo(repoCountBeforeSavingReview + 1)));
	}
}
