package com.mycompany.Tienda;

import com.mycompany.Armas.Armas;
import com.mycompany.Armas.arma1;
import com.mycompany.Armas.arma2;
import com.mycompany.Armas.arma3;
import com.mycompany.AsignarDatos.AsignarDatos;
import com.mycompany.Vehiculos.Avion;
import com.mycompany.Vehiculos.Tanque;
import com.mycompany.Vehiculos.Vehiculos;
import static com.mycompany.practicaipc.JFrameDatosJuego.JCBVehiculos;
import static com.mycompany.practicaipc.JFrameDatosJuego.getNuevoJugador;
import static com.mycompany.practicaipc.JFrameTienda2.cmbComprarArmas;
import static com.mycompany.practicaipc.JFrameTienda2.cmbSeleccionarVehiculoComprado;
import static com.mycompany.practicaipc.JFrameTienda2.cmbVehiculoComprar;
import static com.mycompany.practicaipc.JFrameTienda2.lblPrecio;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class EstablecerDatosTienda {

    public void establecerDatosTienda() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbSeleccionarVehiculoComprado.getModel();
        model.removeAllElements();
        for (int i = 0; i < getNuevoJugador().getVehiculo().length; i++) {
            model.addElement(getNuevoJugador().getVehiculo()[i].getNombre());

        }

        //lblPrecio.setText(Integer.toString(getNuevoJugador().getCantidadOro()));
        //CantidadOroRestante();
    }

    public void EstablecercbmCompraVehiculos() {
        Vehiculos nuevoVehiculo = new Vehiculos();

        if (cmbVehiculoComprar.getSelectedIndex() == 0) {
            nuevoVehiculo = new Tanque();
        } else {
            nuevoVehiculo = new Avion();
        }

        if (getNuevoJugador().getCantidadOro() >= nuevoVehiculo.getPrecioVehiculo()) {
            getNuevoJugador().agregarVehiculoComprado(nuevoVehiculo);
            AsignarDatos asignar = new AsignarDatos();
            asignar.establecerCmb();
            JOptionPane.showMessageDialog(null, "Has comprado un Vehiculo");
            establecerDatosTienda();
            getNuevoJugador().restarOro(nuevoVehiculo.getPrecioVehiculo());

        } else {

            JOptionPane.showMessageDialog(null, "No tienes el oro sufisiente para comprar");

        }

    }

    public void CantidadOroRestante() {
        lblPrecio.setText(Integer.toString(getNuevoJugador().getCantidadOro()));
        establecerDatosTienda();
    }

    public void establecercmbCompraArmas() {
        Armas nuevaArma = new Armas();

        switch (cmbComprarArmas.getSelectedIndex()) {

            case 1:
                nuevaArma = new arma1();

            case 2:
                nuevaArma = new arma2();

            case 3:
                nuevaArma = new arma3();

        }
        
        if(getNuevoJugador().getCantidadOro()>= nuevaArma.getPrecioArma()){
            getNuevoJugador().getVehiculo()[0].agregarArmaComprada(nuevaArma);
            EstablecerDatosTienda asignar = new EstablecerDatosTienda();
            asignar.
            
            
            
        }

    }
    
    
    public void seleccionComprarArma(){
        
        
        
    }
    
    
    
    
    
    
    public void establecerCmb(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) JCBVehiculos.getModel();
        model.removeAllElements();
        for (int i = 0; i < getNuevoJugador().getVehiculo().length; i++) {
            model.addElement(getNuevoJugador().getVehiculo()[i].getNombre());
            
        }
    }
    
    public void establecercmbCompraArmas(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbComprarArmas.getColorModel();
        model.removeAllElements();
        for (int i = 0; i < getNuevoJugador().getVehiculo()[i].getArmas().length; i++) {
            model.addElement(getNuevoJugador().getVehiculo()[i].getArmas().getNombreArma());
            
        }

        
        
                

        
        
    }

    
}
