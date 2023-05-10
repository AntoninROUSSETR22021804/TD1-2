package com.example.td12;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Node;


public class Exercice1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Création du conteneur principal
        VBox vbox = new VBox();

        Scene scene = new Scene(vbox );
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("VBox and HBox App");
        //Menu
        Menu menu1 = new Menu("File");
        MenuItem menu11 = new MenuItem("New");
        MenuItem menu12 = new MenuItem("Open");
        MenuItem menu13 = new MenuItem("Save");
        MenuItem menu14 = new MenuItem("Close");
        menu1.getItems().addAll(menu11,menu12,menu13,menu14);
        Menu menu2 = new Menu("Edit");
        MenuItem menu21 = new MenuItem("Cut");
        MenuItem menu22 = new MenuItem("Copy");
        MenuItem menu23 = new MenuItem("Paste");
        menu2.getItems().addAll(menu21,menu22,menu23);
        Menu menu3 = new Menu("Help");
        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);

        // Création du conteneur
        VBox Boutons = new VBox();
        Boutons.setAlignment( Pos.CENTER_LEFT);
        VBox.setVgrow(Boutons,Priority.ALWAYS);
        Label Bouton = new Label("Bouton :");
        Button Bouton1 = new Button("Bouton1");
        Button Bouton2 = new Button("Bouton2");
        Button Bouton3 = new Button("Bouton3");
        Boutons.getChildren().addAll( Bouton,Bouton1,Bouton2,Bouton3 );

        GridPane Log = new GridPane();

        Label LName = new Label("Name:");
        GridPane.setRowIndex(LName, 0);
        GridPane.setColumnIndex(LName, 0);
        TextField Name = new TextField();
        GridPane.setRowIndex(Name, 0);
        GridPane.setColumnIndex(Name, 1);

        Label LEmail = new Label("Email:");
        GridPane.setRowIndex(LEmail, 1);
        GridPane.setColumnIndex(LEmail, 0);
        TextField Email = new TextField();
        GridPane.setRowIndex(Email, 1);
        GridPane.setColumnIndex(Email, 1);

        Label LPassword = new Label("Password:");
        GridPane.setRowIndex(LPassword, 2);
        GridPane.setColumnIndex(LPassword, 0);
        TextField Password = new TextField();
        GridPane.setRowIndex(Password, 2);
        GridPane.setColumnIndex(Password, 1);


        Label label = new Label("Ceci est un label en bas de page");
        HBox Hlabel = new HBox(label);
        Hlabel.setAlignment(Pos.BOTTOM_CENTER);

        Log.getChildren().addAll(LName,Name,LEmail,Email,LPassword,Password);
        Log.setAlignment(Pos.CENTER);

        HBox Centre = new HBox(Boutons,Log);

        VBox.setVgrow(Centre, Priority.ALWAYS);

        VBox.setVgrow(Log,Priority.ALWAYS);
        vbox.getChildren().addAll(
                menuBar,
                Centre,
                Hlabel
        );

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}


    
