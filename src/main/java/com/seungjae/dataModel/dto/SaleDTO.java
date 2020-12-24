package com.seungjae.dataModel.dto;

import com.seungjae.model.Sale;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SaleDTO {
    int saleId;
    String userId;
    int productId;
    String date;
    int count;

    public SaleDTO(Sale sale) {
        this.saleId = sale.getSaleId();
        this.userId = sale.getUserId();
        this.productId = sale.getProductId();
        this.date = sale.getDate();
        this.count = sale.getCount();
    }
}
