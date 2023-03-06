package com.keybank.carddetailservice.controller;

import com.keybank.carddetailservice.entity.Card;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class CardDetailsController {

    @GetMapping("/cards/{custId}")
    public List<Card> getCards(@PathVariable(name = "custId") String custId,
                               @RequestHeader(name = "client_id") String clientId,
                               @RequestHeader(name = "request_id") String requestId,
                               @RequestHeader(name = "message_ts") String messageTS) {

        return null;
    }

    @GetMapping("/card/{cardNum}")
    public Card getCardDetails(@PathVariable(name = "cardNum") String cardNum,
                               @RequestHeader(name = "client_id") String clientId,
                               @RequestHeader(name = "request_id") String requestId,
                               @RequestHeader(name = "message_ts") String messageTS) {

        Card card = new Card();

        card.setCardNum(cardNum);
        card.setNameOnCard("bharath");
        card.setCvv("123");
        card.setProductCode("moffers");
        card.setEnrollmentDate("12-23");
        card.setIsPrimary(true);
        card.setProductType("credit");
        card.setStatus("active");
card.setEnrollmentDate(new Date().toString());
card.setExpDate(LocalDateTime.now().plusYears(3).toString());

        return card;
    }
}
