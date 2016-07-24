package com.rscalc;

public class BandosChestplate extends Item{
    public BandosChestplate(){
        super(new OffensiveBonuses(0, 0, 0, -15, -10), new DefensiveBonuses(98, 93, 105, -6, 133), new OtherBonuses(4, 0, 0, 1));
    }
}
