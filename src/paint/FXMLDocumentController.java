/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;

/**
 *
 * @author Alexs
 */
public class FXMLDocumentController implements Initializable
{

    @FXML
    private Label label;
    @FXML
    private Canvas canvasWindow;
    @FXML
    private JFXButton buttonClear;
    @FXML
    private JFXButton buttonPaint;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {

    }

    private void drawShapes(GraphicsContext gc)
    {
        gc.fillRect(0, 0, 10, 10);
    }

    @FXML
    private void clearButtonAction(ActionEvent event)
    {
        canvasWindow.getGraphicsContext2D().clearRect(0, 0, canvasWindow.getWidth(), canvasWindow.getHeight());
        System.out.println("canvasWindow.getWidth()=" + canvasWindow.getWidth());
        System.out.println("canvasWindow.getHeight()=" + canvasWindow.getHeight());
        
    }

    @FXML
    private void PaintButtonAction(ActionEvent event)
    {
        drawShapes(canvasWindow.getGraphicsContext2D());
    }
}
