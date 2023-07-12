package controladores;

import vistas.CrearCita;
import vistas.CrearFacturaPaciente;
import vistas.MostrarCitas;
import vistas.MostrarHistorial;
import vistas.MostrarPacienteFactura;
import vistas.VentanaPrincipal;

public class ControladorVentanas {
    
    public class idPestaña {
        public static final int CITA = 1;
        public static final int FACTURA = 2;
        public static final int HISTORIAL = 3;
        
        public static final int ACTIVIDAD = 4;
        public static final int INGRESOS = 5;
        
        public static final int EGRESOS = 6;
        public static final int PROVEEDORES = 7;
        
        public static final int MATERIAL_MEDICO = 8;
    }
    
    public static void cambiarPestañas(VentanaPrincipal ventana, int idPestaña){
        if(idPestaña == ventana.getPestañaActual()){
            return;
        }
        
        ventana.getContenidoPestañas().removeAll();
        
        switch(idPestaña){
            case ControladorVentanas.idPestaña.CITA:
                CrearCita crearCita = new CrearCita();
                MostrarCitas mostrarCitas = new MostrarCitas(ventana);
                
                ventana.getContenidoPestañas().addTab("Crear Cita", crearCita);
                ventana.getContenidoPestañas().addTab("Mostrar Citas", mostrarCitas);
                
                ventana.setPestañaActual(ControladorVentanas.idPestaña.CITA);
                break;
            case ControladorVentanas.idPestaña.FACTURA:
                CrearFacturaPaciente crearFactura = new CrearFacturaPaciente();
                MostrarPacienteFactura mostrarFactura = new MostrarPacienteFactura(ventana);
                
                ventana.getContenidoPestañas().addTab("Crear Factura", crearFactura);
                ventana.getContenidoPestañas().addTab("Mostrar Facturas", mostrarFactura);
                
                ventana.setPestañaActual(ControladorVentanas.idPestaña.FACTURA);
                break;
            case ControladorVentanas.idPestaña.HISTORIAL:
                MostrarHistorial mostrarHistorial = new MostrarHistorial(ventana);
                
                ventana.getContenidoPestañas().addTab("Mostrar Historial", mostrarHistorial);
                
                ventana.setPestañaActual(ControladorVentanas.idPestaña.HISTORIAL);
                break;
        }
        
    }
}
