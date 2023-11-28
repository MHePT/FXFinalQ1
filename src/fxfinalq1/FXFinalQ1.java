package fxfinalq1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FXFinalQ1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button Add = new Button("Add");
        Button Subtract =new Button("Subtract");
        Button Multiply =new Button("Multiply");
        Button Divid =new Button("Divid");
        
        TextField frstno = new TextField();
        TextField secno = new TextField();
        
        Label firstnolbl = new Label("First Number");
        Label secnolbl = new Label("Second Number");
        Label reslbl = new Label("Result");
        Label output = new Label("?");
        
        GridPane root = new GridPane();
        root.add(firstnolbl, 0, 0 , 2,1);
        root.add(frstno, 2, 0,2,1);
        root.add(secnolbl, 0, 1,2,1);
        root.add(secno, 2, 1,2,1);
        root.add(Add, 0, 2);
        root.add(Subtract, 1, 2);
        root.add(Multiply, 2, 2);
        root.add(Divid, 3, 2);
        root.add(reslbl, 0, 3);
        root.add(output, 0, 4);
        
        root.setPadding(new Insets(20));
        root.setHgap(40);
        root.setVgap(20);
        root.setAlignment(Pos.CENTER);
        
        Add.setOnAction((ActionEvent event) -> {
            output.setText(""+(Integer.parseInt(frstno.getText())+Integer.parseInt(secno.getText())));
        });
        
        
        Subtract.setOnAction((ActionEvent event) -> {
            output.setText(""+(Integer.parseInt(frstno.getText())-Integer.parseInt(secno.getText())));
        });
        
        Multiply.setOnAction((ActionEvent event) -> {
            output.setText(""+(Integer.parseInt(frstno.getText())*Integer.parseInt(secno.getText())));
        });
        
        Divid.setOnAction((ActionEvent event) -> {
            if(Integer.parseInt(secno.getText())==0)
            {
               output.setText("Second Number is Zero and is not allowed for division");
            }else
            output.setText(""+(Integer.parseInt(frstno.getText())/Integer.parseInt(secno.getText())));
        });
        
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
