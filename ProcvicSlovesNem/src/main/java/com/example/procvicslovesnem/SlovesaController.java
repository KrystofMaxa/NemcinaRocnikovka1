package com.example.procvicslovesnem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

public class SlovesaController extends HelloApplication implements Initializable {

        @FXML
        private Button potvrdit;
        @FXML
        private TextField cislo;
        @FXML
        private TextArea seznam;
        @FXML
        private Label label11;
        @FXML
        private Label label12;
        @FXML
        private Label label13;
        @FXML
        private Label label14;
        @FXML
        private Label label21;
        @FXML
        private Label label22;
        @FXML
        private Label label23;
        @FXML
        private Label label24;
        @FXML
        private Label label31;
        @FXML
        private Label label32;
        @FXML
        private Label label33;
        @FXML
        private Label label34;
        @FXML
        private Label label41;
        @FXML
        private Label label42;
        @FXML
        private Label label43;
        @FXML
        private Label label44;
        @FXML
        private Label label51;
        @FXML
        private Label label52;
        @FXML
        private Label label53;
        @FXML
        private Label label54;
        @FXML
        private Label label61;
        @FXML
        private Label label62;
        @FXML
        private Label label63;
        @FXML
        private Label label64;

    int l = 1;
    int k = 1;
        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                File file = new File("data.txt");
                Scanner sc = null;
                try {
                        sc = new Scanner(file);
                } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                }
                int i = 0;
                while (i<34){
                        int cisloPoradi = sc.nextInt();
                        String cz = sc.next();
                        String de = sc.next();
                        String deM = sc.next();
                        String pr = sc.next();
                        arr.add(new CelyObjekt(cisloPoradi,cz,de,deM,pr));
                        i++;
                }
                for (int o = 0; o<arr.size();o++) {
                        seznam.appendText(arr.get(o).poradi + " " + arr.get(o).cesky + '\n');
                }
                potvrdit.setOnAction(ActionEvent -> {
                       if (l==1){
                               if (k==1){
                                       label11.setText((arr.get(Integer.parseInt(cislo.getText())).cesky));
                                       k++;
                               }else  if (k==2) {
                                       label12.setText((arr.get(Integer.parseInt(cislo.getText())).nemecky));
                                       k++;
                               }else  if (k==3) {
                                       label13.setText((arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule));
                                       k++;
                               }else  if (k==4) {
                                       if (arr.get(Integer.parseInt(cislo.getText())).pravidelnost.equals("N")) {
                                               label14.setText(nepravid + " " + arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule);
                                               k = 1;
                                               l++;
                                       }else {
                                               label14.setText(pravid + " " + arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule);
                                               k = 1;
                                               l++;
                                       }
                               }
                       }else if (l==2){
                               if (k==1){
                                       label21.setText((arr.get(Integer.parseInt(cislo.getText())).cesky));
                                       k++;
                               }else  if (k==2) {
                                       label22.setText((arr.get(Integer.parseInt(cislo.getText())).nemecky));
                                       k++;
                               }else  if (k==3) {
                                       label23.setText((arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule));
                                       k++;
                               }else  if (k==4) {
                                       if (arr.get(Integer.parseInt(cislo.getText())).pravidelnost.equals("N")) {
                                               label24.setText(nepravid + " " + arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule);
                                               k = 1;
                                               l++;
                                       }else {
                                               label24.setText(pravid + " " + arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule);
                                               k = 1;
                                               l++;
                                       }
                               }
                       }else if (l==3){
                               if (k==1){
                                       label31.setText((arr.get(Integer.parseInt(cislo.getText())).cesky));
                                       k++;
                               }else  if (k==2) {
                                       label32.setText((arr.get(Integer.parseInt(cislo.getText())).nemecky));
                                       k++;
                               }else  if (k==3) {
                                       label33.setText((arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule));
                                       k++;
                               }else  if (k==4) {
                                       if (arr.get(Integer.parseInt(cislo.getText())).pravidelnost.equals("N")) {
                                               label34.setText(nepravid + " " + arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule);
                                               k = 1;
                                               l++;
                                       }else {
                                               label34.setText(pravid + " " + arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule);
                                               k = 1;
                                               l++;
                                       }
                               }
                       } else if (l==4){
                                if (k==1){
                                        label41.setText((arr.get(Integer.parseInt(cislo.getText())).cesky));
                                        k++;
                                }else  if (k==2) {
                                        label42.setText((arr.get(Integer.parseInt(cislo.getText())).nemecky));
                                        k++;
                                }else  if (k==3) {
                                        label43.setText((arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule));
                                        k++;
                                }else  if (k==4) {
                                        if (arr.get(Integer.parseInt(cislo.getText())).pravidelnost.equals("N")) {
                                                label44.setText(nepravid + " " + arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule);
                                                k = 1;
                                                l++;
                                        }else {
                                                label44.setText(pravid + " " + arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule);
                                                k = 1;
                                                l++;
                                        }
                                }
                        }else if (l==5){
                               if (k==1){
                                       label51.setText((arr.get(Integer.parseInt(cislo.getText())).cesky));
                                       k++;
                               }else  if (k==2) {
                                       label52.setText((arr.get(Integer.parseInt(cislo.getText())).nemecky));
                                       k++;
                               }else  if (k==3) {
                                       label53.setText((arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule));
                                       k++;
                               }else  if (k==4) {
                                       if (arr.get(Integer.parseInt(cislo.getText())).pravidelnost.equals("N")) {
                                               label54.setText(nepravid + " " + arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule);
                                               k = 1;
                                               l++;
                                       }else {
                                               label54.setText(pravid + " " + arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule);
                                               k = 1;
                                               l++;
                                       }
                               }
                       } else if (l==6){
                                if (k==1){
                                        label61.setText((arr.get(Integer.parseInt(cislo.getText())).cesky));
                                        k++;
                                }else  if (k==2) {
                                        label62.setText((arr.get(Integer.parseInt(cislo.getText())).nemecky));
                                        k++;
                                }else  if (k==3) {
                                        label63.setText((arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule));
                                        k++;
                                }else  if (k==4) {
                                        if (arr.get(Integer.parseInt(cislo.getText())).pravidelnost.equals("N")) {
                                                label64.setText(nepravid + " " + arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule);
                                                k = 1;
                                                l = 1;
                                        }else {
                                                label64.setText(pravid + " " + arr.get(Integer.parseInt(cislo.getText())).nemeckyMinule);
                                                k = 1;
                                                l = 1;
                                        }
                                }
                        }
             });
        }
}
