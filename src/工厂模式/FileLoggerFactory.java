package ����ģʽ;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FileLoggerFactory implements Factory {

	@Override
	public Logger factoryMethod() {
		Logger logger = new FileLogger();
		return logger;
	}
	
	
	/*
	 * public Logger factoryMethod() {
		try {

			// ��XML�ļ�
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(new File("src\\�򵥹���ģʽ\\log-config.xml"));

			NodeList nl = document.getElementsByTagName("FileLogger");
			Node node = nl.item(0).getFirstChild();
			String type = node.getNodeValue().trim();
			
			Class c = Class.forName(type);
			Object p = c.newInstance();

			return (Logger)p;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	 */

}
