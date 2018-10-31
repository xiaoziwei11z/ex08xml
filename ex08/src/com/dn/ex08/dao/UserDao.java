package com.dn.ex08.dao;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.dn.ex08.domain.User;

public class UserDao {
	private String path = "E:\\workspace-sts-3.9.5.RELEASE\\ex08\\src/user.xml";
	
	public void add(User user) {
		System.out.println(System.getProperty("user.dir"));
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(path);
			Element root = document.getRootElement();
			Element element = root.addElement("user");
			
			Element name = element.addElement("name");
			name.setText(user.getName());
			Element age = element.addElement("age");
			age.setText(user.getAge());
			Element gender = element.addElement("gender");
			gender.setText(user.getGender());
			
			XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(path), OutputFormat.createPrettyPrint());
			xmlWriter.write(document);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
