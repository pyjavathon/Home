package com.selfstudy.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.selfstudy.user.entity.User;


@Mapper
public interface UserMapper {
	
	Optional<User> mapperSelectOne(String id);

	List<User> selectAll();

}
