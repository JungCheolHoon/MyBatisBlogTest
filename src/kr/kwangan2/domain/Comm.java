package kr.kwangan2.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Comm implements Serializable{

	private static final long serialVersionUID = 2133254534644L;
	
	private int commId;
	private String commTitle;
	private String commContent;
	private int blogId;
	
}
