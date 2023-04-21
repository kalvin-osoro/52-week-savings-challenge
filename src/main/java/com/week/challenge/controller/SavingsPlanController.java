package com.week.challenge.controller;

import com.week.challenge.dto.SavingsWeek;
import com.week.challenge.service.SavingsPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/savings-plan")
@RequiredArgsConstructor
public class SavingsPlanController {
    private final SavingsPlanService savingsPlanService;

    @GetMapping
    public List<SavingsWeek> getSavingsPlan() {
        return savingsPlanService.generateSavingsPlan();
    }
}
