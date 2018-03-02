

import javax.swing.*;
import java.awt.*;

public class Principal  extends JFrame{


    public Principal() {

        super("Ventana con grid layout");

        Container ContenedorPrincipal = this.getContentPane();
        ContenedorPrincipal.setLayout(new GridBagLayout());
        GridBagConstraints restricciones=new GridBagConstraints();

                //Crear componente
        JTextArea areaTexto=new JTextArea("Area de texto multilinea");
        // modificar restriciones
        restricciones.gridx=0;
        restricciones.gridy=0;
        restricciones.gridwidth=2;
        restricciones.gridheight=2;
        //Agregar el componente al contenedor y asignar restricciones a componente
        ContenedorPrincipal.add(areaTexto,restricciones);

        //Crear componente
        JButton B1=new JButton("Boton1");
        // modificar restriciones
        restricciones.gridx=2;
        restricciones.gridy=0;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        //Agregar el componente al contenedor y asignar restricciones a componente
        ContenedorPrincipal.add(B1,restricciones);

        //Crear componente
        JButton B2 =new JButton("Boton2");
        // modificar restriciones
        restricciones.gridx=2;
        restricciones.gridy=1;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        //Agregar el componente al contenedor y asignar restricciones a componente
        ContenedorPrincipal.add(B2,restricciones);

        //Crear componente
        JButton B3 =new JButton("Boton3");
        // modificar restriciones
        restricciones.gridx=0;
        restricciones.gridy=2;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        //Agregar el componente al contenedor y asignar restricciones a componente
        ContenedorPrincipal.add(B3,restricciones);

        //Crear componente
        JButton B4 =new JButton("Boton4");
        // modificar restriciones
        restricciones.gridx=2;
        restricciones.gridy=2;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;

        //Agregar el componente al contenedor y asignar restricciones a componente
        ContenedorPrincipal.add(B4,restricciones);

        //Crear componente
        JTextField T1 =new JTextField("Campo de texto");
        // modificar restriciones
        restricciones.gridx=1;
        restricciones.gridy=2;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;

        //Agregar el componente al contenedor y asignar restricciones a componente
        ContenedorPrincipal.add(T1,restricciones);



    }


        public static void main(String[] args){

        Principal V=new Principal();
            V.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        V.pack();
            V.setVisible(true);



        }


    }

