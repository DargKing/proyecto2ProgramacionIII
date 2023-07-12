/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author yorman
 */
public class BaseDeDatos {

    ArrayList<Factura> facturas;
    ArrayList<Paciente> pacientes;
    ArrayList<Cita> citas;
    ArrayList<MaterialMedico> materialesMedicos;
    ArrayList<Proveedor> proveedores;
    ArrayList<Usuario> usuarios;

    public BaseDeDatos() {
        this.facturas = new ArrayList();
        this.pacientes = new ArrayList();
        this.citas = new ArrayList();
        this.materialesMedicos = new ArrayList();
        this.proveedores = new ArrayList();

        this.obtenerPacientes();
        this.obtenerFacturas();
        this.obtenerCitas();
        this.obtenerMaterialesMedicos();
        this.obtenerProveedores();
    }

    public void obtenerPacientes() {
        try {
            String path = new File(".").getAbsolutePath();
            Gson gson = new Gson();

            JsonReader archivo = new JsonReader(new FileReader(path + "\\src\\database\\pacientes.json"));

            Paciente[] arr = gson.fromJson(archivo, Paciente[].class);

            if (this.pacientes.size() < arr.length) {
                for (int i = this.pacientes.size(); i < arr.length; i++) {
                    this.pacientes.add(arr[i]);
                }
            } else if (this.pacientes.size() > arr.length) {
                for (int i = this.pacientes.size(); i > arr.length; i--) {
                    this.pacientes.remove(i);
                }
            }
        } catch (Exception err) {
            pacientes = new ArrayList();
        }
    }

    public void obtenerFacturas() {
        try {
            String path = new File(".").getAbsolutePath();
            Gson gson = new Gson();

            JsonReader archivo = new JsonReader(new FileReader(path + "\\src\\database\\facturas.json"));

            Factura[] arr = gson.fromJson(archivo, Factura[].class);

            if (this.facturas.size() < arr.length) {
                for (int i = this.facturas.size(); i < arr.length; i++) {
                    this.facturas.add(arr[i]);
                }
            } else if (this.pacientes.size() > arr.length) {
                for (int i = this.facturas.size(); i > arr.length; i--) {
                    this.facturas.remove(i - 1);
                }
            }
        } catch (Exception err) {
            System.out.println(err);
            this.facturas = new ArrayList();
        }
    }

    public void obtenerCitas() {
        try {
            String path = new File(".").getAbsolutePath();
            Gson gson = new Gson();

            JsonReader archivo = new JsonReader(new FileReader(path + "\\src\\database\\citas.json"));

            Cita[] arr = gson.fromJson(archivo, Cita[].class);

            if (this.citas.size() < arr.length) {
                for (int i = this.citas.size(); i < arr.length; i++) {
                    this.citas.add(arr[i]);
                }
            } else if (this.citas.size() > arr.length) {
                for (int i = this.citas.size(); i > arr.length; i--) {
                    this.citas.remove(i - 1);
                }
            }
        } catch (Exception err) {
            System.out.println(err);
            this.citas = new ArrayList<>();
        }
    }

    public void obtenerMaterialesMedicos() {
        try {
            String path = new File(".").getAbsolutePath();
            Gson gson = new Gson();

            JsonReader archivo = new JsonReader(new FileReader(path + "\\src\\database\\materialesmedicos.json"));

            MaterialMedico[] arr = gson.fromJson(archivo, MaterialMedico[].class);

            if (this.materialesMedicos.size() < arr.length) {
                for (int i = this.materialesMedicos.size(); i < arr.length; i++) {
                    this.materialesMedicos.add(arr[i]);
                }
            } else if (this.materialesMedicos.size() > arr.length) {
                for (int i = this.materialesMedicos.size(); i > arr.length; i--) {
                    this.materialesMedicos.remove(i - 1);
                }
            }
        } catch (Exception err) {
            System.out.println(err);
            this.materialesMedicos = new ArrayList<>();
        }
    }

    public void obtenerUsuarios() {
        try {
            String path = new File(".").getAbsolutePath();
            Gson gson = new Gson();

            JsonReader archivo = new JsonReader(new FileReader(path + "\\src\\database\\usuarios.json"));

            Usuario[] arr = gson.fromJson(archivo, Usuario[].class);

            if (this.usuarios.size() < arr.length) {
                for (int i = this.usuarios.size(); i < arr.length; i++) {
                    this.usuarios.add(arr[i]);
                }
            } else if (this.usuarios.size() > arr.length) {
                for (int i = this.usuarios.size(); i > arr.length; i--) {
                    this.usuarios.remove(i - 1);
                }
            }
        } catch (Exception err) {
            System.out.println(err);
            this.usuarios = new ArrayList<>();
        }
    }

    public void obtenerProveedores() {
        try {
            String path = new File(".").getAbsolutePath();
            Gson gson = new Gson();

            JsonReader archivo = new JsonReader(new FileReader(path + "\\src\\database\\proveedores.json"));

            Proveedor[] arr = gson.fromJson(archivo, Proveedor[].class);

            if (this.proveedores.size() < arr.length) {
                for (int i = this.proveedores.size(); i < arr.length; i++) {
                    this.proveedores.add(arr[i]);
                }
            } else if (this.proveedores.size() > arr.length) {
                for (int i = this.proveedores.size(); i > arr.length; i--) {
                    this.proveedores.remove(i - 1);
                }
            }
        } catch (Exception err) {
            System.out.println(err);
            this.proveedores = new ArrayList<>();
        }
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }

    public ArrayList<MaterialMedico> getMaterialesMedicos() {
        return materialesMedicos;
    }

    public void setMaterialesMedicos(ArrayList<MaterialMedico> materialesMedicos) {
        this.materialesMedicos = materialesMedicos;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
