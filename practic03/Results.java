package lesson02.practic03;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "results")
public class Results {


  @XmlElement
    public Rate[] rate;

}
