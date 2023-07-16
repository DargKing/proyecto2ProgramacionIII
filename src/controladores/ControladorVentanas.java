package controladores;

import vistas.CrearCita;
import vistas.CrearFacturaPaciente;
import vistas.CrearInformeMedico;
import vistas.CrearMaterialMedico;
import vistas.CrearProveedor;
import vistas.ListaDeProveedores;
import vistas.ListaMaterialesMedicos;
import vistas.ModificarHistorial;
import vistas.MostrarActividad;
import vistas.MostrarCitas;
import vistas.MostrarEgresos;
import vistas.MostrarHistorial;
import vistas.MostrarIngresos;
import vistas.MostrarPacienteFactura;
import vistas.VentanaPrincipal;
import vistas.VerInformeMedico;

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

        public static final int INFORME = 9;
    }

    public static void cambiarPestañas(VentanaPrincipal ventana, int idPestaña) {
        if (idPestaña == ventana.getPestañaActual()) {
            return;
        }

        ventana.getContenidoPestañas().removeAll();

        switch (idPestaña) {
            case ControladorVentanas.idPestaña.CITA:
                CrearCita crearCita = new CrearCita(ventana);
                MostrarCitas mostrarCitas = new MostrarCitas(ventana);

                ventana.getContenidoPestañas().addTab("Crear Cita", crearCita);
                ventana.getContenidoPestañas().addTab("Mostrar Citas", mostrarCitas);

                ventana.setPestañaActual(ControladorVentanas.idPestaña.CITA);
                break;
            case ControladorVentanas.idPestaña.FACTURA:
                CrearFacturaPaciente crearFactura = new CrearFacturaPaciente(ventana);
                MostrarPacienteFactura mostrarFactura = new MostrarPacienteFactura(ventana);

                ventana.getContenidoPestañas().addTab("Crear Factura", crearFactura);
                ventana.getContenidoPestañas().addTab("Mostrar Facturas", mostrarFactura);

                ventana.setPestañaActual(ControladorVentanas.idPestaña.FACTURA);
                break;
            case ControladorVentanas.idPestaña.HISTORIAL:
                MostrarHistorial mostrarHistorial = new MostrarHistorial(ventana);
                ModificarHistorial modificarHistorial = new ModificarHistorial(ventana);

                ventana.getContenidoPestañas().addTab("Mostrar Historial", mostrarHistorial);
                ventana.getContenidoPestañas().addTab("Modificar Historial", modificarHistorial);

                ventana.setPestañaActual(ControladorVentanas.idPestaña.HISTORIAL);
                break;
            case ControladorVentanas.idPestaña.INFORME:
                CrearInformeMedico crearInformeMedico = new CrearInformeMedico(ventana);
                VerInformeMedico verInforme = new VerInformeMedico(ventana);
                
                ventana.getContenidoPestañas().addTab("Inspeccionar Informes", verInforme);
                ventana.getContenidoPestañas().addTab("Crear Informe Medico", crearInformeMedico);
                
                ventana.setPestañaActual(ControladorVentanas.idPestaña.INFORME);
                break;
                
            case ControladorVentanas.idPestaña.PROVEEDORES:
                CrearProveedor crearProveedor = new CrearProveedor(ventana);
                ListaDeProveedores listaProveedor = new ListaDeProveedores(ventana);
                
                ventana.getContenidoPestañas().addTab("Lista de  Proveedores", listaProveedor);
                ventana.getContenidoPestañas().addTab("Modificar Proveedor", crearProveedor);
                
                ventana.setPestañaActual(ControladorVentanas.idPestaña.PROVEEDORES);
                break;
            case ControladorVentanas.idPestaña.MATERIAL_MEDICO:
                CrearMaterialMedico crearMaterial = new CrearMaterialMedico(ventana);
                ListaMaterialesMedicos listaMateriales = new ListaMaterialesMedicos(ventana);
                
                ventana.getContenidoPestañas().addTab("Lista de Materiales Medicos", listaMateriales);
                ventana.getContenidoPestañas().addTab("Generar Compra Material Medico", crearMaterial);
                
                ventana.setPestañaActual(ControladorVentanas.idPestaña.MATERIAL_MEDICO);
                break;
            case ControladorVentanas.idPestaña.INGRESOS:
                MostrarIngresos mostrarIngresosDia = new MostrarIngresos(ventana, 0);
                MostrarIngresos mostrarIngresosSemana = new MostrarIngresos(ventana, 1);
                MostrarIngresos mostrarIngresosMes = new MostrarIngresos(ventana, 2);
                
                ventana.getContenidoPestañas().addTab("Mostrar Ingresos (Dia)", mostrarIngresosDia);
                ventana.getContenidoPestañas().addTab("Mostrar Ingresos (Semana)", mostrarIngresosSemana);
                ventana.getContenidoPestañas().addTab("Mostrar Ingresos (Mes)", mostrarIngresosMes);
                ventana.setPestañaActual(ControladorVentanas.idPestaña.INGRESOS);
                break;
            case ControladorVentanas.idPestaña.EGRESOS:
                MostrarEgresos mostrarEgresosDia = new MostrarEgresos(ventana, 0);
                MostrarEgresos mostrarEgresosSemana = new MostrarEgresos(ventana, 1);
                MostrarEgresos mostrarEgresosMes = new MostrarEgresos(ventana, 2);
                
                ventana.getContenidoPestañas().addTab("Mostrar Egresos (Dia)", mostrarEgresosDia);
                ventana.getContenidoPestañas().addTab("Mostrar Egresos (Semana)", mostrarEgresosSemana);
                ventana.getContenidoPestañas().addTab("Mostrar Egresos (Mes)", mostrarEgresosMes);
                
                ventana.setPestañaActual(ControladorVentanas.idPestaña.EGRESOS);
                break;
            case ControladorVentanas.idPestaña.ACTIVIDAD:
                MostrarActividad mostrarActividadDia = new MostrarActividad(ventana, 0);
                MostrarActividad mostrarActividadSemana = new MostrarActividad(ventana, 1);
                MostrarActividad mostrarActividadMes = new MostrarActividad(ventana, 2);
                
                ventana.getContenidoPestañas().addTab("Mostrar Actividad (Dia)", mostrarActividadDia);
                ventana.getContenidoPestañas().addTab("Mostrar Actividad (Semana)", mostrarActividadSemana);
                ventana.getContenidoPestañas().addTab("Mostrar Actividad (Mes)", mostrarActividadMes);
                break;
        }

    }
}
