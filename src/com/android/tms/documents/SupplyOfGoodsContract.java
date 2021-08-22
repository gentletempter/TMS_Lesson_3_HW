package com.android.tms.documents;

import java.util.Date;

public class SupplyOfGoodsContract extends DocumentTemplate {
    public String typeOfGoods;
    public int numberOfGoods;

    public SupplyOfGoodsContract(long documentNumber, Date documentDate, String typeOfGoods, int numberOfGoods) {
        super(documentNumber, documentDate);
        this.typeOfGoods = typeOfGoods;
        this.numberOfGoods = numberOfGoods;
    }

    public SupplyOfGoodsContract() {
    }

    @Override
    public String toString() {
        return super.toString() + "||| Type of goods: " + typeOfGoods + "; Number of goods: " + numberOfGoods + " |||";
    }
}
