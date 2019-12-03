package Reto1ADW;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class EscritorTxt {

	public static void funcionDeEscrituraDeXML(String archivo) {
		
		try {

			File stocks = new File(archivo);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(stocks);
			doc.getDocumentElement().normalize();

			System.out.println( doc.getDocumentElement().getNodeName());
			NodeList nodes = doc.getElementsByTagName("empleado");
			System.out.println("==========================");

			for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					 File file = new File("ficheros"+ File.separator+"EscritorTXT.txt");
			            // Si el archivo no existe es creado
			            if (!file.exists()) {
			                file.createNewFile();
			            }
			            FileWriter fw = new FileWriter(file);
			            BufferedWriter bw = new BufferedWriter(fw);
			            bw.write("EMPLEADOS");
			            bw.newLine();
			            bw.write("-----------------------------------------------------------------------");
			            bw.newLine();
			            bw.write("Id : "+(i+1));
			            bw.newLine();
			            bw.write("Nombre : "+getValue("nombre",element));
			            bw.newLine();
			            bw.write("Nombre Del Usuario :"+ getValue("username",element));
			            bw.newLine();
			            bw.write("Contraseña : "+ getValue("password",element));
			            
			            bw.newLine();
			      
			            bw.close();
					
			      }
			            
		          
				/*System.out.println("nombre: " + getValue("nombre", element));
				System.out.println("nombre de usuario: " + getValue("username", element));
				System.out.println("contraseña: " + getValue("password", element));*/
				
			}
			}
			catch (Exception ex) {	
			ex.printStackTrace();
			}
	}
	private static String getValue(String tag, Element element) {
		NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodes.item(0);
		return node.getNodeValue();
	}
}
