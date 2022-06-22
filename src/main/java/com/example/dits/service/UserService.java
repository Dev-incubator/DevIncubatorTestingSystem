package com.example.dits.service;

import com.example.dits.dto.UserInfoDTO;
import com.example.dits.entity.User;

import java.util.List;

public interface UserService {
    UserInfoDTO getUserByLogin(String login);
    List<UserInfoDTO> getAllUsers();
}
