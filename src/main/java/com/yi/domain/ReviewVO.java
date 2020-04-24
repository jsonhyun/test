package com.yi.domain;

public class ReviewVO {
	private String reviewer;
	private String title;
	private String writer;
	private String publisher;
	private String review;

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "ReviewVO [reviewer=" + reviewer + ", title=" + title + ", writer=" + writer + ", publisher=" + publisher
				+ ", review=" + review + "]";
	}

}
