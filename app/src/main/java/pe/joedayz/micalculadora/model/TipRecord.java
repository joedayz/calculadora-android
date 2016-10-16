package pe.joedayz.micalculadora.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by josediaz on 10/15/16.
 */

@Getter @Setter
public class TipRecord {

    private double bill;
    private Date timestamp;
    private int tipPercentage;


    public double getTip() {
        return bill*(tipPercentage/100d);
    }

    public String getDateFormatted(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        return simpleDateFormat.format(timestamp);
    }
}