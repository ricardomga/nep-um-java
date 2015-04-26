/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.ws;

import backend.pojos.HealthProfessional;
import backend.pojos.Patient;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.*;

/**
 *
 * @author jorge
 */
public class PatientWS {
    
    private WrapperWS wrapperWS;
    private CloseableHttpResponse responseWS;
    private Gson gson;
    private Logger log = Logger.getLogger(Patient.class);

    public PatientWS() {
        gson = new Gson();
        wrapperWS = WrapperWS.getWrapperWS();
    }

    public void saveEditPatient (Patient p) {
 
        try{
        responseWS = wrapperWS.sendRequest("Patient", "saveEditPatient", getAllParams(p));    //efetua o pedido ao WS
        String validacao = wrapperWS.readResponse(responseWS);         //Passa a resposta para uma string

            Validation v = gson.fromJson(validacao, Validation.class);    //Conversão do objecto Json para o objecto Java
            
            if (v.getCod() != 201) {
                System.out.println(v.getMsg());
                log.error(v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao criar o Paciente");
            }

        } catch (RuntimeException e) {
            log.error(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("Patient saved with sucess");
    }
    
    public List<Patient> getAllPatients() {
        List<Patient> pList = null;

        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta

        try {
            responseWS = wrapperWS.sendRequest("Patient",
                    "getAllPatients", params);    //efetua o pedido ao WS
            String jsonResp = wrapperWS.readResponse(responseWS);         //Passa a responseWS para uma string

            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 200) {
                Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java     
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao aceder aos dados do Paciente");
            }

            Type type = new TypeToken<List<Patient>>() {
            }.getType();  //tipo do para o qual queros retornar a responseWS Json
            pList = gson.fromJson(jsonResp, type);

        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("\n\t Patient data access success");
        log.debug("\n\tHPs : " + pList.toString());
        return pList;

    }
    
    private List<NameValuePair> getAllParams(Patient p) {
        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta
        params.add(new BasicNameValuePair("idPatient", String.valueOf(p.getIdPatient())));
        params.add(new BasicNameValuePair("name", p.getName()));
        params.add(new BasicNameValuePair("lastName", p.getLastName()));
        params.add(new BasicNameValuePair("numCC", String.valueOf(p.getNumCC())));
        params.add(new BasicNameValuePair("adress", p.getAdress()));
        params.add(new BasicNameValuePair("numTel", String.valueOf(p.getNumTel())));
        params.add(new BasicNameValuePair("nif", String.valueOf(p.getNif())));
        params.add(new BasicNameValuePair("email", p.getEmail()));
        params.add(new BasicNameValuePair("maritalState", p.getMaritalState()));
        params.add(new BasicNameValuePair("birthDate", String.valueOf(p.getBirthDate())));
        params.add(new BasicNameValuePair("bloodGroup", p.getBloodGroup()));
        params.add(new BasicNameValuePair("nationality", p.getNationality()));
        params.add(new BasicNameValuePair("gender", p.getGender()));
        params.add(new BasicNameValuePair("password", p.getPassword()));
        params.add(new BasicNameValuePair("pathology", p.getPathology()));
        params.add(new BasicNameValuePair("description", p.getDescription()));
        params.add(new BasicNameValuePair("picture", p.getPicture()));
        
        return params;
    }
    
   public Patient getPatientById(int id){
       
       Patient p = null;

        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta
        params.add(new BasicNameValuePair("idPatient", String.valueOf(id)));

        try {
            responseWS = wrapperWS.sendRequest("Patient",
                    "getPatientById", params);    //efetua o pedido ao WS
            String jsonResp = wrapperWS.readResponse(responseWS);         //Passa a responseWS para uma string

            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 200) {
                Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java     
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao aceder aos dados do Paciente");
            }

            p = gson.fromJson(jsonResp, Patient.class);

        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("\n\tPatient data access success");
        log.debug("\n\tP with id " + id + ": " + p.toString());
        return p;
   }
}