package com.OurBB.OurBB.dealer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DealerService {
    List<Dealers> allDealers();
    Dealers getDealerById(int dealerId);
    Dealers createDealers(Dealers dealers);
    Dealers updateDealers(Dealers dealers);
    Dealers deleteDealers(int dealerId);
}
