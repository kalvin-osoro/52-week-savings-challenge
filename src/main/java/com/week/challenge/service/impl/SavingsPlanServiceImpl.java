package com.week.challenge.service.impl;

import com.week.challenge.dto.SavingsWeek;
import com.week.challenge.service.SavingsPlanService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SavingsPlanServiceImpl implements SavingsPlanService {
    @Override
    public List<SavingsWeek> generateSavingsPlan() {
        List<SavingsWeek> savingsPlan = new ArrayList<>();

        int currentAmountToSave = 50;
        int totalAmount = 0;

        for (int i= 1; i<=52; i++) {
            SavingsWeek week = new SavingsWeek();
            week.setWeekNumber(i);
            week.setAmountToSave(currentAmountToSave);
            totalAmount =totalAmount + currentAmountToSave;
            week.setTotalAmount(totalAmount);
            savingsPlan.add(week);

//            totalAmount =totalAmount + currentAmountToSave;
            currentAmountToSave +=50;
//            totalAmount =totalAmount + currentAmountToSave;
            System.out.println("Total amount save is: " + totalAmount);

        }

        return savingsPlan;
    }
}
