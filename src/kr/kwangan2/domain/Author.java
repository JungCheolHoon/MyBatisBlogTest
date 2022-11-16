package kr.kwangan2.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Author implements Serializable{

	private static final long serialVersionUID = 2133254534643L;
	
	private int authorId;
	private String authorName;
	
}
