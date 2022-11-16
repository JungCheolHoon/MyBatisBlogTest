package kr.kwangan2.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class CommSearcher implements Serializable{
	
	private static final long serialVersionUID = 2133254534641L;
	
	private int blogId;
	private String searchKey;
	private String searchValue;
	
}
