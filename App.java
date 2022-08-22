package com.mycompany.pnetapplicationjob;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.control.TextField;
import javafx.scene.Group;
import java.io.FileInputStream;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;



public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
       
        //set scene + title        
        stage.setTitle("PNet App");
        stage.setWidth(400);
        stage.setHeight(500);
        
        //Create an image
        Image i;
        i = new Image(new FileInputStream("PNet_Logo.jpg"));
        //add image to the Group
        ImageView view = new ImageView(i);
        //change height and weight of image
        view.setFitHeight(100);
        view.setFitWidth(200);
        //set the postion on our scene
        view.setTranslateY(30);
        view.setTranslateX(100);
        
         // create Labels en add Labels to group
        Label name = new Label("Enter your Name: ");
        //set the position of the label
        name.setTranslateY(200);
        name.setTranslateX(10);
        //set the font of the label
        name.setFont(Font.font("Arial", FontWeight.BOLD, 14));

        // create Labels en add Labels to group
        Label position = new Label("Enter the Position: ");
        //set the position of the label
        position.setTranslateY(250);
        position.setTranslateX(10);
        //set the postion on our scene
        position.setFont(Font.font("Arial", FontWeight.BOLD, 14));

        // create Labels en add Labels to group
        Label experience = new Label("Enter your Experience: ");
        //set the position of the label
        experience.setTranslateY(300);
        experience.setTranslateX(10);
        //set the postion on our scene
        experience.setFont(Font.font("Arial", FontWeight.BOLD, 14));

        //Create a textfield for the users name
        TextField tfname = new TextField();
        //set position of the textfield
        tfname.setTranslateY(195);
        tfname.setTranslateX(180);

        //Create a textfield for the users name
        TextField tfposition = new TextField();
        //set position of the textfield
        tfposition.setTranslateY(245);
        tfposition.setTranslateX(180);

        //Create a combobox for the years of experience
        ComboBox cbexp = new ComboBox();
        //set the values of the combobox
        cbexp.getItems().add("1 - 5");
        cbexp.getItems().add("6 - 10");
        cbexp.getItems().add("11 - 20");
        //set the position
        cbexp.setTranslateY(295);
        cbexp.setTranslateX(180);

        //Create a button
        Button btnApply = new Button("Apply");
        //set the size of button
        btnApply.setMinWidth(80);
        btnApply.setMinHeight(40);
        //set the font
        btnApply.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        //set the style of the button
        btnApply.setStyle("-fx-border-color: #FFFFFF; -fx-border-width: 2px; -fx-text-fill: #FFFFFF; -fx-background-color: #FF0000;");
        //set the positon of the button on the stage
        btnApply.setTranslateY(360);
        btnApply.setTranslateX(150);

        //create a alert box
        Alert alert = new Alert(Alert.AlertType.NONE);
        
        
        //create a set on action for the button using arrowevent to only run the if statement when button is pressed
        btnApply.setOnAction(arrowEvent -> {
            //Validating to see if any of my textfield and combobox is empty
            if (tfname.getText().isEmpty() || tfposition.getText().isEmpty() || cbexp.getItems().isEmpty() ) {
                //creating a warning alert if one of them is left open
                alert.setTitle("Warning");
                alert.setAlertType(AlertType.ERROR);
                alert.setHeaderText("One or more fields are empty!");
                alert.show();
            } else {
                //create an information alert if everything was filled in correct
                alert.setTitle("Aplication Sent");
                alert.setAlertType(AlertType.INFORMATION);
                alert.setHeaderText("Applcation Details: " + "\n" + "Apllicant Name: " + tfname.getText() + "\n" + "Position Applied: " + tfposition.getText() + "\n" + "Years of Experience: " + cbexp.getValue());
                alert.show();
            }
        });
        //create a group to add all of my images,labels,combobox, button and textfields to the group
        Group r = new Group(name, position, experience, view, tfname, tfposition, cbexp, btnApply);
        //adding all of my group items to the scene
        Scene sc = new Scene(r, 400, 500);
        stage.setScene(sc);

        //show the staggggggeeeeeeeee
        
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}