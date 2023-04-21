package com.week.challenge.dto;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class SavingsWeek {

    private int weekNumber;
    private int amountToSave;
    private int totalAmount;

}
