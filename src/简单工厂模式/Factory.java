package �򵥹���ģʽ;


import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

public class Factory {

	/* �������� */
	public static Product getProduct() {
    	
    	try {
    		
    		//��XML�ļ�
        	DocumentBuilderFactory  documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder  documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse( new File("src\\�򵥹���ģʽ\\product-config.xml"));
			
			NodeList nl = document.getElementsByTagName("product");
			Node  node = nl.item(0).getFirstChild();
			String type = node.getNodeValue().trim();
			Product p = null;
			if ("A".equals(type)) {
				p = new ConcreteProductA();
			}else if ("B".equals(type)) {
				p = new ConcreteProductA();
			}
			
			return p;			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
}
