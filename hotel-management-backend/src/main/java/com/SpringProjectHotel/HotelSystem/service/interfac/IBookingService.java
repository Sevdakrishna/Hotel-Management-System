package com.SpringProjectHotel.HotelSystem.service.interfac;

import com.SpringProjectHotel.HotelSystem.dto.Response;
import com.SpringProjectHotel.HotelSystem.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);


}
