package com.rscalc;

public class Item {
    private OffensiveBonuses offensiveBonuses;
    private DefensiveBonuses defensiveBonuses;
    private OtherBonuses otherBonuses;

    public Item(OffensiveBonuses offensiveBonuses,
                DefensiveBonuses defensiveBonuses,
                OtherBonuses otherBonuses){
        this.offensiveBonuses = offensiveBonuses;
        this.defensiveBonuses = defensiveBonuses;
        this.otherBonuses = otherBonuses;
    }
}
