package dao;
import java.util.*;

import entities.Courier;
//ICourierUserService Interface
public interface ICourierUserService {
 // Customer-related functions
 long placeOrder(Courier courierObj);

 String getOrderStatus(long trackingNumber);

 boolean cancelOrder(long trackingNumber);

 List<Courier> getAssignedOrders(int courierStaffId);
}

