package com.imagin.dom;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="WJAISSUE")
public class WjaIssue {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="HPSIEGE_ID")
	private int id;
	private String title;
	private String description;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
	private Member member;
	
public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	//	@OneToMany(fetch = FetchType.LAZY,mappedBy="issue")
//	private List<Comment> comments;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
		
}
