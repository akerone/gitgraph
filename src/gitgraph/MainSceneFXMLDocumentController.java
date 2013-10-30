/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gitgraph;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Joan Puig <akerone@gmail.com>
 */
public class MainSceneFXMLDocumentController implements Initializable
{
	@FXML private TabPane tabPane;
	
	@FXML private void closeFileMenuItemAction()
	{
		System.exit(0);
	}
	
	@FXML private void newFileMenuItemAction()
	{
		Tab newTab = new Tab("Hello, Tab!");
		
		BorderPane bp = new BorderPane();
		
		Label top = new Label("top");
		Label bot = new Label("bot");
		
		bp.setTop(top);
		bp.setBottom(bot);
		
		newTab.setContent(bp);
		
		tabPane.getTabs().add(newTab);
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb)
	{
		
	}
	
}
