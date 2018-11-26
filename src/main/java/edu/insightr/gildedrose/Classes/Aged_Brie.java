package edu.insightr.gildedrose.Classes;

public class Aged_Brie extends Item {
    public Aged_Brie(String name, int sellIn, int quality)
    {
        super();
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality()
    {
        if (this.getQuality() < 50) {
            this.setQuality(this.getQuality() + 1);
        }

        if (this.getSellIn() < 0) {
            if (this.getQuality() < 50) {
                this.setQuality(this.getQuality() + 1);
            }
        }
    }
}
