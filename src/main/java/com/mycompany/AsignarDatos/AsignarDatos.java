
package com.mycompany.AsignarDatos;

import com.mycompany.Armas.Armas;
import com.mycompany.Vehiculos.Vehiculos;
import static com.mycompany.practicaipc.JFrameDatosJuego.JCBVehiculos;
//import static com.mycompany.practicaipc.JFrameDatosJuego.JLVehiculo;
//import static com.mycompany.practicaipc.JFrameDatosJuego.JLarma1;
import static com.mycompany.practicaipc.JFrameDatosJuego.JLataque;
import static com.mycompany.practicaipc.JFrameDatosJuego.JLdefensa;

import static com.mycompany.practicaipc.JFrameDatosJuego.JLexperiencia;
import static com.mycompany.practicaipc.JFrameDatosJuego.JLnivel;
import static com.mycompany.practicaipc.JFrameDatosJuego.JLpunteria;
import static com.mycompany.practicaipc.JFrameDatosJuego.JLpuntosPoder;
import static com.mycompany.practicaipc.JFrameDatosJuego.JLpuntosVida;
import static com.mycompany.practicaipc.JFrameDatosJuego.JLrecibirOro;
import static com.mycompany.practicaipc.JFrameDatosJuego.JLrecibirnickname;
import static com.mycompany.practicaipc.JFrameDatosJuego.cmbArmas;
import static com.mycompany.practicaipc.JFrameDatosJuego.getNuevoJugador;
import static com.mycompany.practicaipc.JFrameDatosJuego.JLdanio;
import static com.mycompany.practicaipc.JFrameDatosJuego.JLdefensa;
import static com.mycompany.practicaipc.JFrameDatosJuego.JLpunteriaA;
import static com.mycompany.practicaipc.JFrameDatosJuego.JLvelocidad;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

/**
 *
 * @author Ivan Rivera
 */
public class AsignarDatos {

    

    public void establecerDatos() {
        JLrecibirnickname.setText(getNuevoJugador().getNickname());
        JLrecibirOro.setText(Integer.toString(getNuevoJugador().getCantidadOro()));
        
        establecerComboBoxVehiculos(getNuevoJugador().getVehiculo()[0]);
        int posicion = JCBVehiculos.getSelectedIndex();
        JLpuntosVida.setText(Integer.toString(getNuevoJugador().getVehiculo()[posicion].getPuntosVida()));
        JLpuntosPoder.setText(Integer.toString(getNuevoJugador().getVehiculo()[posicion].getPuntosPoder()));
        JLnivel.setText(Integer.toString(getNuevoJugador().getVehiculo()[posicion].getNivel()));
        JLexperiencia.setText(Integer.toString(getNuevoJugador().getVehiculo()[posicion].getExperiencia()));
        JLataque.setText(Integer.toString(getNuevoJugador().getVehiculo()[posicion].getAtaque()));
        JLpunteria.setText(Integer.toString(getNuevoJugador().getVehiculo()[posicion].getPunteria()));
        JLdefensa.setText(Integer.toString(getNuevoJugador().getVehiculo()[posicion].getDefensa()));
        JLrecibirOro.setText(Integer.toString(getNuevoJugador().getCantidadOro()));

        
        estableerComboBoxArmas();
        establecerDatosArmas();
    }

    public void establecerComboBoxVehiculos(Vehiculos vehiculo) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) JCBVehiculos.getModel();
        model.addElement(vehiculo.getNombre());
    }

    public void estableerComboBoxArmas() {
        int posicion = JCBVehiculos.getSelectedIndex();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbArmas.getModel();
        model.removeAllElements();
        for (int i = 0; i < getNuevoJugador().getVehiculo()[posicion].getArmas().length; i++) {
            model.addElement(getNuevoJugador().getVehiculo()[posicion].getArmas()[i].getNombreArma());

        }
    }

    public void establecerDatosArmas() {
        int posicionArma;
        int posicion = JCBVehiculos.getSelectedIndex();
        posicionArma = cmbArmas.getSelectedIndex();

        JLpunteriaA.setText(Integer.toString(getNuevoJugador().getVehiculo()[posicion].getArmas()[posicionArma].getPunteria()));
        JLvelocidad.setText(Integer.toString(getNuevoJugador().getVehiculo()[posicion].getArmas()[posicionArma].getVelocidad()));
        JLdanio.setText(Integer.toString(getNuevoJugador().getVehiculo()[posicion].getArmas()[posicionArma].getNivelDanio()));

    }
    public void establecerCmb(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) JCBVehiculos.getModel();
        model.removeAllElements();
        for (int i = 0; i < getNuevoJugador().getVehiculo().length; i++) {
            model.addElement(getNuevoJugador().getVehiculo()[i].getNombre());
            
        }
    }
    
    
}
