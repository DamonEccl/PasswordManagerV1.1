package org.example.Backend;

public class New {

    public static String[] passKeeper;
    public static String[] newFXML;
    public static String[] newPane;
    public static int newLine;


    public New(){
    }

    String password;
    String name;
    String user;
    String heightIncrease;

    public New(String password, String name, String user){
        this.password = password;
        this.name = name;
        this.user = name;
        this.heightIncrease = getPreviousHeight();
    }

    public static void Create(New newPane){

        System.out.println(newPane.heightIncrease);

    }

    public void InsertNewPass(){

        String[] newPane = {"<Pane layoutX=\"84.0\" layoutY=\" " + heightIncrease + "\" prefHeight=\"97.0\" prefWidth=\"472.0\">",
                "                                 <children>",
                "                                    <Rectangle arcHeight=\"15.0\" arcWidth=\"15.0\" fill=\"#202225\" height=\"96.0\" opacity=\"0.76\" stroke=\"#e1e1e1\" strokeLineCap=\"ROUND\" strokeWidth=\"0.0\" width=\"471.0\" />",
                "                                    <Label layoutX=\"14.0\" layoutY=\"9.0\" text=\"" + this.user + "\" textFill=\"#bcbcbc\">\n" +
                "                                       <font>",
                "                                          <Font name=\"Calibri Bold\" size=\"20.0\" />",
                "                                       </font>",
                "                                    </Label>",
                "                                    <Label layoutX=\"59.0\" layoutY=\"37.0\" text=\"Account:\" textFill=\"#b5b5b5\">",
                "                                       <font>",
                "                                          <Font name=\"Calibri\" size=\"18.0\" />",
                "                                       </font>",
                "                                    </Label>",
                "                                    <Label layoutX=\"50.0\" layoutY=\"63.0\" text=\"Password:\" textFill=\"#bfbfbf\">",
                "                                       <font>",
                "                                          <Font name=\"Calibri\" size=\"18.0\" />",
                "                                       </font>",
                "                                    </Label>",
                "                                    <Label layoutX=\"132.0\" layoutY=\"66.0\" text=\" " + this.password + "\" textFill=\"#b9b9b9\">,",
                "                                       <font>",
                "                                          <Font name=\"Calibri\" size=\"18.0\" />\n",
                "                                       </font>",
                "                                       <cursor>",
                "                                          <Cursor fx:constant=\"TEXT\" />",
                "                                       </cursor>",
                "                                    </Label>",
                "                                    <Label layoutX=\"132.0\" layoutY=\"38.0\" text=\"" + this.user + "\" textFill=\"#b2b2b2\">",
                "                                       <font>",
                "                                          <Font name=\"Calibri\" size=\"18.0\" />",
                "                                       </font>",
                "                                       <cursor>",
                "                                          <Cursor fx:constant=\"TEXT\" />",
                "                                       </cursor>",
                "                                    </Label>",
                "                                    <Button layoutX=\"343.0\" layoutY=\"62.0\" mnemonicParsing=\"false\" style=\"-fx-background-color: grey;\" text=\"Reveal\">",
                "                                       <effect>",
                "                                          <DropShadow height=\"7.86\" radius=\"3.43\" width=\"7.86\" />",
                "                                       </effect>",
                "                                       <cursor>",
                "                                          <Cursor fx:constant=\"HAND\" />",
                "                                       </cursor>",
                "                                    </Button>",
                "                                    <Button layoutX=\"405.0\" layoutY=\"62.0\" mnemonicParsing=\"false\" style=\"-fx-background-color: grey;\" text=\"Change\">",
                "                                       <effect>",
                "                                          <DropShadow height=\"7.86\" radius=\"3.43\" width=\"7.86\" />",
                "                                       </effect>",
                "                                       <cursor>",
                "                                          <Cursor fx:constant=\"HAND\" />",
                "                                       </cursor>",
                "                                    </Button>",
                "                                    <Button layoutX=\"433.0\" layoutY=\"8.0\" mnemonicParsing=\"false\" style=\"-fx-background-color: grey;\" text=\"\uD83D\uDDD1\">",
                "                                       <effect>",
                "                                          <DropShadow height=\"7.86\" radius=\"3.43\" width=\"7.86\" />",
                "                                       </effect>",
                "                                       <cursor>",
                "                                          <Cursor fx:constant=\"HAND\" />",
                "                                       </cursor>",
                "                                    </Button>",
                "                                 </children>",
                "                              </Pane>",
                ""};
    }

    public static String getPreviousHeight(){
        String temp = "";


        for (int i = 0; i < passKeeper.length; i++){
            if (passKeeper[i].contains("<Pane ") && !passKeeper[i].contains("Infinity") && !passKeeper[i].contains("fx")){

                int startIndex = passKeeper[i].indexOf("layoutY=\"");
                int endIndex = passKeeper[i].indexOf("\" prefHeight");

                if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) {
                    temp = passKeeper[i].substring(startIndex + 9, endIndex);

                }


            }

            if (passKeeper[i].contains("<!-- Add  -->")){
                System.out.println("$ " + i + " " + passKeeper[i]);
                newLine += i;
            }
        }

        String height = (Double.parseDouble(temp) + 50.0) + "";
        System.out.println(height);
        combineFXML();



        return height;


    }

    public static void setPassKeeper(String[] tempKeeper){
        passKeeper = tempKeeper;
    }

    public static void combineFXML(){
        newFXML = new String[newPane.length + passKeeper.length];
        int sum = -1;

        for (int i = 0; i < newLine; i++){
            sum++;
            newFXML[sum] = passKeeper[i];
        }

        for (int i = 0; i < newPane.length; i++){
            sum++;
            newFXML[sum] = newPane[i];
        }


        for (int i = newLine; i < passKeeper.length; i++){
            sum++;
            newFXML[sum] = passKeeper[i];
        }
    }

}
