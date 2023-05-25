/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.urg.xml;
import cat.institutmvm.urg.model.business.entities.Urgencia;
import cat.institutmvm.urg.persistence.daos.impl.UrgenciaImplDAO;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
/**
 *
 * @author Seku
 */
public class CreateXml {
    public CreateXml(){
    try {
        List<Urgencia> Urgencies = new ArrayList<>();
        UrgenciaImplDAO uImp = new UrgenciaImplDAO();
        Urgencies=uImp.getUrgencies();
        
        
            // Crear el documento XML
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            // Nodo raíz "urgencia"
            Element nodoRaiz = doc.createElement("urgencia");
            doc.appendChild(nodoRaiz);
            for(int i = 0;i<Urgencies.size();i++){
                Urgencia urg = Urgencies.get(i);
            // Nodo "DNI"
            Element nodoDni = doc.createElement("DNI");
            nodoRaiz.appendChild(nodoDni);
            nodoDni.appendChild(doc.createTextNode(urg.getPacient().getDni()));

            // Nodo "DATA"
            Element nodoData = doc.createElement("DATA");
            String data = String.valueOf(urg.getData());
            nodoData.appendChild(doc.createTextNode(data));
            nodoRaiz.appendChild(nodoData);
            
            // Nodo "NIVELL"
            Element nodoNivell = doc.createElement("NIVELL");
            nodoNivell.appendChild(doc.createTextNode(String.valueOf(urg.getNivell())));
            nodoRaiz.appendChild(nodoNivell);
            

            // Nodo "MOTIU"
            Element nodoMotiu = doc.createElement("MOTIU");
            nodoMotiu.appendChild(doc.createTextNode(urg.getMotiu()));
            nodoRaiz.appendChild(nodoMotiu);

            // Nodo "TORN"
            Element nodoTorn = doc.createElement("TORN");
            nodoTorn.appendChild(doc.createTextNode(String.valueOf(urg.getTorn())));
            nodoRaiz.appendChild(nodoTorn);
        }
            // Escribir el contenido en el archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("files\\urgencia.xml"));
            transformer.transform(source, result);
            /*
            // Salida en la consola para verificar
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);
            */
            System.out.println("Archivo XML creado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        
    }
    }
    }

