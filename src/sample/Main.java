package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        String Palabra;
        System.out.println("Ingresa la palabra a verificar: ");

        Palabra=entrada.nextLine();

        if (palindromo(Palabra))//utilizamos nuestro metodo.
        {
            System.out.println(Palabra + " Es un Palindromo");
        }
        else {
            System.out.println(Palabra + " No es un Palindromo");
        }
    }

    //metodo para evaluar la palabra este retornara verdadero o falso si la palabra es palindromo o no.
    static boolean palindromo(String palabra)
    {
        String word = palabra.replaceAll(" ","").toLowerCase();//reemplazamos espacios en blanco y sustituimos mayusculas por minusculas.
        int i=0;
        while (i < word.length() / 2)
        {
            if (word.charAt(i) != word.charAt(word.length() -1 -i))
                return false;
            i++;
        }
        return true;
    }
    }

