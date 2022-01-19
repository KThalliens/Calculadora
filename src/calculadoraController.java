import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class calculadoraController {
    private int operando = 0; //Aributo empleado para almacenar el valor del operando
    private String operador = null;
    private int total = 0;
    
    @FXML
    private TextField resultText;

    @FXML
    private Button button4;

    @FXML
    private Button button1;

    @FXML
    private Button button8;

    @FXML
    private Button button5;

    @FXML
    private Button button2;

    @FXML
    private Button button0;

    @FXML
    private Button button9;

    @FXML
    private Button button6;

    @FXML
    private Button button3;

    @FXML
    private Button buttonResultado;

    @FXML
    private Button buttonDivision;

    @FXML
    private Button buttonMultiplicacion;

    @FXML
    private Button buttonResta;

    @FXML
    private Button buttonSuma;

    @FXML
    private Button button7;

    @FXML
    private Button buttonBorrar;

    @FXML
    void addNumber(ActionEvent event) {
        Node node= (Node) event.getSource();
        String data = (String) node.getUserData(); //capaturar el valor de la variable  userdata
        System.out.println(data);
        if(resultText.getText().equals("0")){
            resultText.setText(data);
        }else{
            resultText.setText(resultText.getText()+ data);
        }


    }

    @FXML
    void addOperador(ActionEvent event) {
        Node node = (Node) event.getSource(); //Establece cual es el botón al cual se le dió clic
        String data = (String) node.getUserData(); //Obtener el valor del botón al cual se le dió clic
        operando = Integer.parseInt(resultText.getText());
        System.out.println(operador);
        System.out.println(operando);
        System.out.println(total);
        if(operador != null){ //
            switch (operador){
                case "+":
                    total +=  Integer.parseInt(resultText.getText());
                break;
                case "-":
                    total -=  Integer.parseInt(resultText.getText());
                break;
                case "*":
                    total *=  Integer.parseInt(resultText.getText());
                break;
                case "/":
                    total /=  Integer.parseInt(resultText.getText());
                break;
                default:
                break;
            }
        }
        else{
            total = operando;
        }
        operador = data;
        resultText.setText("0");
    }

    @FXML
    void borrar(ActionEvent event) {
        resultText.setText("0");
        total = 0;
        operando = 0;
        operador = null;
    }

    @FXML
    void getResultado(ActionEvent event) {
        int numero = Integer.parseInt(resultText.getText());
        switch(operador){
            case "+":
                total += numero;
            break;
            case "-":
                total -= numero;
            break;
            case "*":
                total *= numero;
            break;
            case "/":
                total /= numero;
            break;
            default:
                total = numero;
            break;
        }
        resultText.setText(Integer.toString(total));//Asignado el total a la caja de texto resultText
        operador = null;
    }

}