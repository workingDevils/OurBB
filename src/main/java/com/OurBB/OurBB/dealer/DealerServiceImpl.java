package com.OurBB.OurBB.dealer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DealerServiceImpl implements DealerService{
    @Autowired
    DealerRepo dealerRepo;

    @Override
    public List<Dealers> allDealers() {
        return null;
    }

    @Override
    public Dealers getDealerById(int dealerId) {
        Dealers dealer=dealerRepo.findById(dealerId).get();
        return dealer;
    }

    @Override
    public Dealers createDealers(Dealers dealers) {
        Dealers dealer=dealerRepo.save(dealers);
        return dealer;
    }

    @Override
    public Dealers updateDealers(Dealers dealers) {
        return null;
    }

    @Override
    public Dealers deleteDealers(int dealerId) {
        return null;
    }
}
