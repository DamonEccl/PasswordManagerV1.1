package org.example;

public class New {

    public New(){

    }

    String password;
    String name;
    String user;

    public New(String password, String name, String user){
        this.password = password;
        this.name = name;
        this.user = name;
    }

    public void Create(String pass, String nam, String userName){
        this.password = pass;
        this.name = nam;
        this.user = userName;

        InsertNewPass();
    }

    public void InsertNewPass(){

        String newPane = "<Pane layoutX=\"84.0\" layoutY=\"44.0\" prefHeight=\"97.0\" prefWidth=\"472.0\">\n" +
                "                                 <children>\n" +
                "                                    <Rectangle arcHeight=\"15.0\" arcWidth=\"15.0\" fill=\"#202225\" height=\"96.0\" opacity=\"0.76\" stroke=\"#e1e1e1\" strokeLineCap=\"ROUND\" strokeWidth=\"0.0\" width=\"471.0\" />\n" +
                "                                    <Label layoutX=\"14.0\" layoutY=\"9.0\" text=\"Gmail\" textFill=\"#bcbcbc\">\n" +
                "                                       <font>\n" +
                "                                          <Font name=\"Calibri Bold\" size=\"20.0\" />\n" +
                "                                       </font>\n" +
                "                                    </Label>\n" +
                "                                    <Label layoutX=\"59.0\" layoutY=\"37.0\" text=\"Account:\" textFill=\"#b5b5b5\">\n" +
                "                                       <font>\n" +
                "                                          <Font name=\"Calibri\" size=\"18.0\" />\n" +
                "                                       </font>\n" +
                "                                    </Label>\n" +
                "                                    <Label layoutX=\"50.0\" layoutY=\"63.0\" text=\"Password:\" textFill=\"#bfbfbf\">\n" +
                "                                       <font>\n" +
                "                                          <Font name=\"Calibri\" size=\"18.0\" />\n" +
                "                                       </font>\n" +
                "                                    </Label>\n" +
                "                                    <Label layoutX=\"132.0\" layoutY=\"66.0\" text=\"**********\" textFill=\"#b9b9b9\">\n" +
                "                                       <font>\n" +
                "                                          <Font name=\"Calibri\" size=\"18.0\" />\n" +
                "                                       </font>\n" +
                "                                       <cursor>\n" +
                "                                          <Cursor fx:constant=\"TEXT\" />\n" +
                "                                       </cursor>\n" +
                "                                    </Label>\n" +
                "                                    <Label layoutX=\"132.0\" layoutY=\"38.0\" text=\"Example@gmail.com\" textFill=\"#b2b2b2\">\n" +
                "                                       <font>\n" +
                "                                          <Font name=\"Calibri\" size=\"18.0\" />\n" +
                "                                       </font>\n" +
                "                                       <cursor>\n" +
                "                                          <Cursor fx:constant=\"TEXT\" />\n" +
                "                                       </cursor>\n" +
                "                                    </Label>\n" +
                "                                    <Button layoutX=\"343.0\" layoutY=\"62.0\" mnemonicParsing=\"false\" style=\"-fx-background-color: grey;\" text=\"Reveal\">\n" +
                "                                       <effect>\n" +
                "                                          <DropShadow height=\"7.86\" radius=\"3.43\" width=\"7.86\" />\n" +
                "                                       </effect>\n" +
                "                                       <cursor>\n" +
                "                                          <Cursor fx:constant=\"HAND\" />\n" +
                "                                       </cursor>\n" +
                "                                    </Button>\n" +
                "                                    <Button layoutX=\"405.0\" layoutY=\"62.0\" mnemonicParsing=\"false\" style=\"-fx-background-color: grey;\" text=\"Change\">\n" +
                "                                       <effect>\n" +
                "                                          <DropShadow height=\"7.86\" radius=\"3.43\" width=\"7.86\" />\n" +
                "                                       </effect>\n" +
                "                                       <cursor>\n" +
                "                                          <Cursor fx:constant=\"HAND\" />\n" +
                "                                       </cursor>\n" +
                "                                    </Button>\n" +
                "                                    <Button layoutX=\"433.0\" layoutY=\"8.0\" mnemonicParsing=\"false\" style=\"-fx-background-color: grey;\" text=\"\uD83D\uDDD1\">\n" +
                "                                       <effect>\n" +
                "                                          <DropShadow height=\"7.86\" radius=\"3.43\" width=\"7.86\" />\n" +
                "                                       </effect>\n" +
                "                                       <cursor>\n" +
                "                                          <Cursor fx:constant=\"HAND\" />\n" +
                "                                       </cursor>\n" +
                "                                    </Button>\n" +
                "                                 </children>\n" +
                "                              </Pane>";
    }

    public static void getPreviousHeight(){

    }


}
