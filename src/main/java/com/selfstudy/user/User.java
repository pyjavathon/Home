package com.selfstudy.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="USERMGM")
public class User {
	
	@Id
	private String id;
	private String name;
	
	
}
