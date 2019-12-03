package Reto1ADW;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class EscritorXML {

	public static void escritorXML(String archivo) {
		
		try {
			//ArrayList<String>lista=new ArrayList<String>();
			File stocks = new File(archivo);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(stocks);
			Document doc2 = null;
			doc.getDocumentElement().normalize();

			System.out.println( doc.getDocumentElement().getNodeName());
			NodeList nodes = doc.getElementsByTagName("empleado");
			System.out.println("==========================");

			for (int i = 0; i < nodes.getLength(); i++) {
				Node node = nodes.item(i);
	
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					
					doc2.createAttribute(getValue("nombre", element));
					doc2.createAttribute(getValue("username", element));
					doc2.createAttribute(getValue("password", element));
					
					System.out.println(doc2.getLocalName());
					//System.out.println("nombre: " + getValue("nombre", element));
					//System.out.println("nombre de usuario: " + getValue("username", element));
					//System.out.println("contraseña: " + getValue("password", element));				
				}
			}
		} catch (Exception ex) {
				ex.printStackTrace();
		}
	}

	private static String getValue(String tag, Element element) {
		NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodes.item(0);
		return node.getNodeValue();
	}
}
