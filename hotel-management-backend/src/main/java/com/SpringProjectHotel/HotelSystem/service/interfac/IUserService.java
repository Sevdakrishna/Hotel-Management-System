package com.SpringProjectHotel.HotelSystem.service.interfac;

import com.SpringProjectHotel.HotelSystem.dto.LoginRequest;
import com.SpringProjectHotel.HotelSystem.dto.Response;
import com.SpringProjectHotel.HotelSystem.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    //Response getUserBookingHistory(Long userId);

   // Response deleteUser(Long userId);

    //Response getUserById(Long userId);

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
