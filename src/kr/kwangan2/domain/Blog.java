package kr.kwangan2.domain;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Blog implements Serializable{
	
	private static final long serialVersionUID = 2133254534642L;
	
	private int blogId;
	private String blogName;
	private String blogTitle;
	private Author author;
	private List<Comm> comms;
	private int blogAuthorId;
	
	public Blog() {
		
	}
	
	public Blog(Integer blogId) {
		this.blogId = blogId;
	}
}
