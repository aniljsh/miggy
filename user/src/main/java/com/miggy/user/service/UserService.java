package com.miggy.user.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miggy.user.dto.UserDTO;
import com.miggy.user.entity.UserEntity;
import com.miggy.user.mapper.UserMapper;
import com.miggy.user.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public List<UserDTO> getUsers() {
		List<UserEntity> users = userRepo.findAll();

		return users.stream().map(user -> UserMapper.mapUserEntityToUserDTO(user)).collect(Collectors.toList());
	}

	public UserDTO addUser(UserDTO userDTO) {

		userRepo.save(UserMapper.mapUserDTOToUserEntity(userDTO));

		return userDTO;

	}

	public UserDTO getUser(int id) {

		Optional<UserEntity> uOptional = userRepo.findById(id);

		if (uOptional.isPresent()) {
			return UserMapper.mapUserEntityToUserDTO(uOptional.get());
		}

		return null;

	}

}
