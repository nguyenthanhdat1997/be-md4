package com.codegym.bemd4.model.service;

import com.codegym.bemd4.model.dto.entity.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getUsers();
    UserDTO getUserById(Long userId);
    void save(UserDTO UserDTO);
    void remove(Long id);
    UserDTO findUserByUsername(String username);
    UserDTO findUserByEmail(String email);
}
