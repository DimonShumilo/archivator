package lesson02.practic03;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Dimon on 21.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        String request = "http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20" +
                "yahoo.finance.xchange%20where%20pair%20in%20(\"USDEUR\",%20\"USDUAH\")&env=store://datatables.org/alltableswithkeys";

       // File file = new File("src\\lesson02\\practic03\\1.xml");

        try {
            String result = performRequest(request);
            System.out.println(result);
//            StringReader reader = new StringReader(result);

            JAXBContext jaxbContext = JAXBContext.newInstance(Query.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();


            InputStream inputStream = new ByteArrayInputStream(result.getBytes());
//            Query query = (Query) unmarshaller.unmarshal(reader);

            Query query = (Query) unmarshaller.unmarshal(inputStream);

          //  Query query = (Query) unmarshaller.unmarshal(file);

            for (Rate rate : query.getResults().rate) {
                System.out.println(rate.getId() + "=" + rate.getRate());
            }
            System.out.println("________________________________");
            for (Rate rate : query.getResults().rate) {
                System.out.println(rate);
            }
            System.out.println(query);


        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static String performRequest(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        StringBuilder sb = new StringBuilder();

        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
            char[] buf = new char[1000000];

            int r = 0;
            do {
                if ((r = br.read(buf)) > 0)
                    sb.append(new String(buf, 0, r));
            } while (r > 0);
        } finally {
            http.disconnect();
        }

        return sb.toString();
    }


}
