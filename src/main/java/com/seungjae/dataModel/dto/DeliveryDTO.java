package com.seungjae.dataModel.dto;

import com.seungjae.model.Delivery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DeliveryDTO {
    int deliveryId;
    String userId;
    int saleId;
    String period;

    public DeliveryDTO(Delivery delivery) {
        this.deliveryId = delivery.getDeliveryId();
        this.userId = delivery.getUserId();
        this.saleId = delivery.getSaleId();
        this.period = delivery.getPeriod();
    }
}
