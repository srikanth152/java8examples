/*package com.practice;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.disney.service.context.ServiceContext;
import com.disney.service.exception.ServiceException;
import com.wdw.party.service.PartyIF;
import com.wdw.party.service.transferobject.RetrievePartyResponse;

public class DreamsTest {

    public static void main(String[] args) {
        

        try {
            URL url = new URL("http://partysvcbash.wdw.disney.com:8080/Party/PartyServicePort?wsdl");
            //1st argument service URI, refer to wsdl document above
            //2nd argument is service name, refer to wsdl document above
            QName qname = new QName("http://service.party.wdw.com/", "PartyService");
            
            public static final QName SERVICE = new QName("http://service.party.wdw.com/", "PartyService");
            public static final QName PartyServicePort = new QName("http://service.party.wdw.com/", "PartyServicePort");
            
            Service service = Service.create(url, qname);
            
            PartyIF partyIF = service.getPort(PartyIF.class);
            
            ServiceContext svc = new ServiceContext();
            System.out.println(partyIF.retrieveParty(279779055L, svc));
            RetrievePartyResponse resp = partyIF.retrieveParty(279779055L, svc);
            System.out.println(resp.getParty().getIndividualInfo().getFirstName());
            catch (ServiceException e) {
            e.printStackTrace();
        }catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }

}
*/