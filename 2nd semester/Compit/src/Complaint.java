public class Complaint {
    String shortDescription;
//    String category;
    String oneOfSoftware;
    String Hardware;
    String Other;
//    String priority;
    String oneOfLow;
    String Mid;
    String High;
    int Date;
    public void category(String oneOfSoftware,String Hardware ,String Other){
        this.oneOfSoftware = oneOfSoftware;
        this.Hardware = Hardware;
        this.Other = Other;

    }
public void setPriority(String oneOfLow,String Mid,String High){
        this.oneOfLow = oneOfLow;
        this.Mid = Mid;
        this.High = High;
}
public void setDateDiscription(int Date,String shortDescription){
        this.Date = Date;
        this.shortDescription = shortDescription;
}


}
