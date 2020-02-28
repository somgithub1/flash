package validationPackage;

import java.util.LinkedList;

import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.javascript.NamedNodeMap;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Node;
import com.gargoylesoftware.htmlunit.javascript.host.html.HTMLCollection;

public class AllListItemsCheckBoxPage {

	WebDriver driver;

	public AllListItemsCheckBoxPage(WebDriver driver) {
		this.driver = driver;
	}

	public static LinkedList<Node> getAllNodes(Document doc) {
		LinkedList<Node> returnList = new LinkedList<Node>();
		HTMLCollection nodes = doc.getElementsByTagName("a");
		for (int index = 0; index < nodes.getLength(); index++) {
			returnList.add((Node) nodes.item(index));
			Object attribList = ((Node) nodes.item(index)).getAttributes();
			if (attribList == null) {
				continue;
			}
			for (int j = 0; j < ((NamedNodeMap) attribList).getLength(); j++) {
				returnList.add((Node) ((NamedNodeMap) attribList).item(j));
			}
			System.out.println(attribList);
		}
		return returnList;

	}

}
