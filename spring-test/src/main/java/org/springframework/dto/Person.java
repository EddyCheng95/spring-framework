package org.springframework.dto;

/**
 * @author chengyongw
 * @Package org.springframework.dto
 * @date 2023/4/26 20:28
 * @description
 */

public class Person {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
