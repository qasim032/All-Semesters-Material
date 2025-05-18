package Question7;

import java.util.Date;

public class Medicine extends Product{
    private Date MfgDate;
    private Date ExpDate;

    public void setMfgDate(Date mfgDate) {
        MfgDate = mfgDate;
    }

    public void setExpDate(Date expDate) {
        ExpDate = expDate;
    }
}
