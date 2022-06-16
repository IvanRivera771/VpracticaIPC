package com.mycompany.Tienda;

import com.mycompany.AsignarDatos.AsignarDatos;
import com.mycompany.Vehiculos.Avion;
import com.mycompany.Vehiculos.Tanque;
import com.mycompany.Vehiculos.Vehiculos;
import static com.mycompany.practicaipc.JFrameDatosJuego.getNuevoJugador;
import static com.mycompany.practicaipc.JFrameTienda2.cmbSeleccionarVehiculoComprado;
import static com.mycompany.practicaipc.JFrameTienda2.cmbVehiculoComprar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class EstablecerDatosTienda {

    public void establecerDatosTienda() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbSeleccionarVehiculoComprado.getModel();
        model.removeAllElements();
        for (int i = 0; i < getNuevoJugador().getVehiculo().length; i++) {
            model.addElement(getNuevoJugador().getVehiculo()[i].getNombre());

        }

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

        } else {

            JOptionPane.showMessageDialog(null, "No tienes el oro sufisiente para comprar");

        }

    }
    
    
    public int  EstablecerlblCantidadOro(){
        
        
        
        
        
        
        
        
    }
    
    
    
    
    

}
