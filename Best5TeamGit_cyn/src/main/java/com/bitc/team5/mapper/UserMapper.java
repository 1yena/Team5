package com.bitc.team5.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.bitc.team5.dto.UserDto;

@Mapper
public interface UserMapper {

	void userJoin(UserDto user) throws Exception;

	int loginCheck(@Param("email") String email, @Param("password") String password) throws Exception;

	List<UserDto> selectUserList() throws Exception;

	UserDto selectUserDetail(int seq) throws Exception;

	void updateUser(UserDto user) throws Exception;

	void userDelete(UserDto user) throws Exception;

}