package com.example.nepravidelnaslovesa;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HlavniController implements Initializable {
    @FXML
    private ListView listview_slovesa;
    @FXML
    private Button button_dalsi;
    @FXML
    private TextField txtF_poradi;

    @FXML
    private HBox hbox_1;
    @FXML
    private HBox hbox_2;
    @FXML
    private HBox hbox_3;
    @FXML
    private VBox vbox1;
    @FXML
    private VBox vbox2;
    @FXML
    private VBox vbox3;

    @FXML
    private Label label_11;
    @FXML
    private Label label_12;
    @FXML
    private Label label_13;
    @FXML
    private Label label_14;
    @FXML
    private Label label_21;
    @FXML
    private Label label_22;
    @FXML
    private Label label_23;
    @FXML
    private Label label_24;
    @FXML
    private Label label_31;
    @FXML
    private Label label_32;
    @FXML
    private Label label_33;
    @FXML
    private Label label_34;
    @FXML
    private Label label_41;
    @FXML
    private Label label_42;
    @FXML
    private Label label_43;
    @FXML
    private Label label_44;
    @FXML
    private Label label_51;
    @FXML
    private Label label_52;
    @FXML
    private Label label_53;
    @FXML
    private Label label_54;
    @FXML
    private Label label_61;
    @FXML
    private Label label_62;
    @FXML
    private Label label_63;
    @FXML
    private Label label_64;
    @FXML
    private Label label_71;
    @FXML
    private Label label_72;
    @FXML
    private Label label_73;
    @FXML
    private Label label_74;
    @FXML
    private Label label_81;
    @FXML
    private Label label_82;
    @FXML
    private Label label_83;
    @FXML
    private Label label_84;
    @FXML
    private Label label_91;
    @FXML
    private Label label_92;
    @FXML
    private Label label_93;
    @FXML
    private Label label_94;


    File file = new File("data.txt");
    Scanner sc = new Scanner(file);

    ArrayList<CelyObjekt> slovesaObjekty = new ArrayList<>();
    ArrayList<VBox> arrVbox = new ArrayList<VBox>();
    HBox[] arrHbox = new HBox[3];

    int radekVB = 0; int cisloVB = 1;
    String pravid = "Er hat";
    String nepravid = "Er ist";
    public HlavniController() throws FileNotFoundException {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        arrHbox[0] = hbox_1;
        arrHbox[1] = hbox_2;
        arrHbox[2] = hbox_3;

        double fontSize = 43;
        Font font2 = Font.font(fontSize);

           while (sc.hasNext()) {
               int poradi = sc.nextInt();
               String cesky = sc.next();
               String infinitiv = sc.next();
               String minulyTvar = sc.next();
               String pomocneSloveso = sc.next();
               slovesaObjekty.add(new CelyObjekt(poradi,cesky,infinitiv,minulyTvar,pomocneSloveso));

               listview_slovesa.getItems().add(poradi + " "+ cesky);
           }



           // arrHbox[0].getChildren().addAll(vbox1,vbox2,vbox3);
          //  hbox_1.getChildren().add(vboxArr);


        for (int i = 0; i<(3);i++){
            VBox vboxArr = new VBox();
            hbox_2.getChildren().add(vboxArr);
            arrVbox.add(vboxArr);
        }
        for (int i = 0; i<(3);i++){
            VBox vboxArr = new VBox();
            hbox_3.getChildren().add(vboxArr);
            arrVbox.add(vboxArr);
        }
           button_dalsi.setOnAction(actionEvent -> {
                if (cisloVB==1) {
                    if (radekVB == 0) {
                        label_11.setText("");
                        label_12.setText("");
                        label_13.setText("");
                        label_14.setText("");
                        label_11.setText((slovesaObjekty.get(Integer.parseInt(txtF_poradi.getText()) - 1).cesky));
                        radekVB++;
                    } else if (radekVB == 1) {
                        label_12.setText((slovesaObjekty.get(Integer.parseInt(txtF_poradi.getText()) - 1).infinitiv));
                        radekVB++;
                    } else if (radekVB == 2) {
                        label_13.setText((slovesaObjekty.get(Integer.parseInt(txtF_poradi.getText()) - 1).minulyTvar));
                        radekVB++;
                    } else if (radekVB == 3) {
                        //HBox hbox = new HBox();
                        if (slovesaObjekty.get(Integer.parseInt(txtF_poradi.getText())).pomocneSloveso.equals("N")) {
                            label_14.setText(nepravid + " " + slovesaObjekty.get(Integer.parseInt(txtF_poradi.getText()) - 1).minulyTvar);
                        } else {

                            label_14.setText(pravid + " " + slovesaObjekty.get(Integer.parseInt(txtF_poradi.getText()) - 1).minulyTvar);
                        }
                        radekVB = 0;
                        cisloVB++;
                    }
                } else if (cisloVB==2) {
                   if (radekVB == 0) {
                       label_21.setText("");
                       label_22.setText("");
                       label_23.setText("");
                       label_24.setText("");
                       label_21.setText((slovesaObjekty.get(Integer.parseInt(txtF_poradi.getText()) - 1).cesky));
                       radekVB++;
                   } else if (radekVB == 1) {
                       label_22.setText((slovesaObjekty.get(Integer.parseInt(txtF_poradi.getText()) - 1).infinitiv));
                       radekVB++;
                   } else if (radekVB == 2) {
                       label_23.setText((slovesaObjekty.get(Integer.parseInt(txtF_poradi.getText()) - 1).minulyTvar));
                       radekVB++;
                   } else if (radekVB == 3) {
                       //HBox hbox = new HBox();
                       if (slovesaObjekty.get(Integer.parseInt(txtF_poradi.getText())).pomocneSloveso.equals("N")) {
                           label_24.setText(nepravid + " " + slovesaObjekty.get(Integer.parseInt(txtF_poradi.getText()) - 1).minulyTvar);
                       } else {

                           label_24.setText(pravid + " " + slovesaObjekty.get(Integer.parseInt(txtF_poradi.getText()) - 1).minulyTvar);
                       }
                       radekVB = 0;
                       cisloVB++;
                   }
               }



                       if (cisloVB ==3) {
                           cisloVB = 1;
                           System.out.println(cisloVB);
                       }
           });



    }
}
