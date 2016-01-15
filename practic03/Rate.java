package lesson02.practic03;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "rate")
public class Rate {


    private String id;

    private String Name;
    private double Rate;
    private String Date;
    private String Time;
    private String Ask;
    private String Bid;



    @XmlAttribute
    public void setId(String id) {
        this.id = id;
    }

    @XmlElement (name = "Name")
    public void setName(String name) {
        Name = name;
    }

    @XmlElement (name = "Rate")
    public void setRate(double Rate) {
        this.Rate = Rate;
    }

    @XmlElement (name = "Date")
    public void setDate(String Date) {
        this.Date = Date;
    }

    @XmlElement (name = "Time")
    public void setTime(String Time) {
        this.Time = Time;
    }

    @XmlElement (name = "Ask")
    public void setAsk(String Ask) {
        this.Ask = Ask;
    }

    @XmlElement (name = "Bid")
    public void setBid(String Bid) {
        this.Bid = Bid;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public double getRate() {
        return Rate;
    }

    public String getDate() {
        return Date;
    }

    public String getTime() {
        return Time;
    }

    public String getAsk() {
        return Ask;
    }

    public String getBid() {
        return Bid;
    }


    @Override
    public String toString() {
        StringBuilder strB = new StringBuilder();
        strB.append("Name: " + getName());
        strB.append(", Rate: " + getRate());
        strB.append(", Date: " + getDate());
        strB.append(", Time: " + getTime());
        strB.append(", Ask: " + getAsk());
        strB.append(", Bid: " + getBid());
        return strB.toString();
    }
}
