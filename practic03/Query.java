package lesson02.practic03;

import javax.xml.bind.annotation.*;




@XmlRootElement(name = "query")
public class Query {

//    public Query() {
//    }
//    private String yahoo;
//    private int count;
//    private String created;
//    private String lang;
    private Results results;

    public Results getResults() {
        return results;
    }
    @XmlElement (name = "results")
    public void setResults(Results results) {
        this.results = results;
    }

//
//    @XmlAttribute (namespace = "yahoo", name = "count")
//    public void setCount(int count) {
//        this.count = count;
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    @XmlAttribute (namespace = "yahoo")
//    public void setCreated(String created) {
//        this.created = created;
//    }
//
//    public String getCreated() {
//        return created;
//    }
//
//    @XmlAttribute (namespace = "yahoo")
//    public void setLang(String lang) {
//        this.lang = lang;
//    }
//
//    public String getLang() {
//        return lang;
//    }
//
//    @Override
//    public String toString() {
//        return "Query: {" + "count: " + count + ", created: " + created + ", lang: " + lang + results.toString();
//    }
//
//    public String getYahoo() {
//        return yahoo;
//    }
//
//    @XmlAttribute (name = "yahoo")
//    public void setYahoo(String yahoo) {
//        this.yahoo = yahoo;
//    }
}
