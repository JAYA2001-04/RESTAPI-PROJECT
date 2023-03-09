package com.example.project.Service;
import java.util.List;
/* here we declare some of the methods like save hotel details,get hotel details ,
 * get hotel details by id, updating and delete details by id*/


import com.example.project.model.SwiggyModel;
public interface RestaturantService {
	SwiggyModel saveHotel(SwiggyModel hotel);
	List<SwiggyModel>  getHotelFromDb();
	

	SwiggyModel getHotelById(int hotelId);
	SwiggyModel updateHotelDetails(SwiggyModel hotel, int hotelId);
	void deleteHotelById(int hotelId);

}
