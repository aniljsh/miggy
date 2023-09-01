package com.miggy.user.mapper;

import com.miggy.user.dto.UserDTO;
import com.miggy.user.entity.UserEntity;

public class UserMapper {

	public static UserEntity mapUserDTOToUserEntity(UserDTO userDTO) {

		UserEntity userEntity = new UserEntity();

		userEntity.setName(userDTO.getName());
		userEntity.setPassword(userDTO.getPassword());
		userEntity.setAddress(userDTO.getAddress());
		userEntity.setCity(userDTO.getCity());

		return userEntity;

	}

	public static UserDTO mapUserEntityToUserDTO(UserEntity userEntity) {

		UserDTO userDTO = new UserDTO();
		userDTO.setId(userEntity.getId());
		userDTO.setName(userEntity.getName());
		userDTO.setPassword(userEntity.getPassword());
		userDTO.setAddress(userEntity.getAddress());
		userDTO.setCity(userEntity.getCity());

		return userDTO;

	}

}
