package lk.ijse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Order {
    private String orderId;
    private  String customerId;

    private Date orderDate;





}