package Homework7.AdditionalTask.Documents;

import Homework7.AdditionalTask.BaseClasses.DocInformation;
import Homework7.AdditionalTask.BaseClasses.Document;

import java.util.Date;

public class ContractSupplyGoods extends Document implements DocInformation {

    private String goodsType;
    private int goodsQuantity;

    public ContractSupplyGoods() {
        super();
        goodsType = "не определено";
        goodsQuantity = 0;
    }

    public ContractSupplyGoods(int setNumber, Date setDate, String setGoodsType, int setGoodsQuantity) {
        super(setNumber, setDate);
        goodsType = setGoodsType;
        goodsQuantity = setGoodsQuantity;
    }

    @Override
    public void displayDocInformation() {
        System.out.printf("\n- Номер документа: %d\n" +
                "- Тип товаров: %s\n" +
                "- Количество товаров: %d\n" +
                "- Дата документа: %s\n", number, goodsType, goodsQuantity, date.toString());
    }
}
