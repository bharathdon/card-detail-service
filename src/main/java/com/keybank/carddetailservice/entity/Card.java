package com.keybank.carddetailservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {

    private String cardNum;
    private String cvv;
    private String expDate;
    private String nameOnCard;
    private String enrollmentDate;
    private String status;
    public Boolean isPrimary;
    private String productCode;
    private String productType;
    private String renewal;
}
