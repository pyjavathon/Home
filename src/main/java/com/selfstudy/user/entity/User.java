package com.selfstudy.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="USERMGM")
public class User {
	
	@Id
	@Column(updatable = false)
	private String id;
	private String name;
	
	
}
