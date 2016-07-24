package com.rscalc;

public class DefensiveBonuses {
    private int stabDefence;
    private int slashDefence;
    private int crushDefence;
    private int magicDefence;
    private int rangedDefence;

    public DefensiveBonuses(int stabDefence,
                            int slashDefence,
                            int crushDefence,
                            int magicDefence,
                            int rangedDefence){
        this.stabDefence = stabDefence;
        this.slashDefence = slashDefence;
        this.crushDefence = crushDefence;
        this.magicDefence = magicDefence;
        this.rangedDefence = rangedDefence;
    }
}
