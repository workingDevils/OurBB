package com.OurBB.OurBB.dealer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dealers")
public class DealerController {
    @Autowired
    DealerService dealerService;

    @GetMapping("/allDealers")
    List<Dealers> allDealers()
    {
        return null;
    }
    @GetMapping("/getDealerById")
    Dealers getDealerById(int dealerId){
        return dealerService.getDealerById(dealerId);
    }
    @PostMapping("/createDealers")
    Dealers createDealers(Dealers dealers){
        return dealerService.createDealers(dealers);
    }
    @PutMapping("/updateDealers")
    Dealers updateDealers(Dealers dealers){
        return null;
    }
    @DeleteMapping("/deleteDealers")
    Dealers deleteDealers(int dealerId){
        return null;
    }
}
