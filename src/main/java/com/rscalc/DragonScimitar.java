package com.rscalc;

public class DragonScimitar extends Item{
    public DragonScimitar(){
        super(new OffensiveBonuses(8, 67, -2, 0, 0), new DefensiveBonuses(0, 1, 0, 0, 0), new OtherBonuses(66, 0, 0, 0));
    }
}
