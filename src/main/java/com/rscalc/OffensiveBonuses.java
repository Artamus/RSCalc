package com.rscalc;

public class OffensiveBonuses {
    private int stabAttack;
    private int slashAttack;
    private int crushAttack;
    private int magicAttack;
    private int rangedAttack;

    public OffensiveBonuses(int stabAttack,
                            int slashAttack,
                            int crushAttack,
                            int magicAttack,
                            int rangedAttack){
        this.stabAttack = stabAttack;
        this.slashAttack = slashAttack;
        this.crushAttack = crushAttack;
        this.magicAttack = magicAttack;
        this.rangedAttack = rangedAttack;
    }
}
