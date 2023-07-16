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
import java.io.FileWriter;
import java.io.IOException;
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
    ArrayList<CompraMaterialMedico> comprasMaterialMedico;

    public BaseDeDatos() {
        this.facturas = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.citas = new ArrayList<>();
        this.materialesMedicos = new ArrayList<>();
        this.proveedores = new ArrayList<>();
        this.comprasMaterialMedico = new ArrayList<>();

        this.obtenerPacientes();
        this.obtenerFacturas();
        this.obtenerCitas();
        this.obtenerMaterialesMedicos();
        this.obtenerProveedores();
        this.obtenerComprasMaterialMedico();
    }

    public void obtenerPacientes() {
        try {
            String path = new File(".").getAbsolutePath();
            Gson gson = new Gson();

            JsonReader archivo = new JsonReader(new FileReader(path + "\\src\\database\\pacientes.json"));

            Paciente[] arr = gson.fromJson(archivo, Paciente[].class);

            this.pacientes.clear();
            this.pacientes = new ArrayList<>();

            for (Paciente paciente : arr) {
                this.pacientes.add(paciente);
            }
        } catch (Exception err) {
            pacientes = new ArrayList();
        }
    }

    public void escribirNuevoPaciente(Paciente paciente) {
        Gson gson = new Gson();

        try {
            ArrayList<Paciente> temp = new ArrayList<>();
            for (Paciente pac : this.pacientes) {
                temp.add(pac);
            }

            temp.add(paciente);
            // Convertimos el array de pacientes modificado a formato JSON
            String jsonModificado = gson.toJson(temp.toArray());
            String path = new File(".").getAbsolutePath();

            // Sobrescribimos el archivo JSON con el nuevo JSON modificado
            try ( FileWriter writer = new FileWriter(path + "\\src\\database\\pacientes.json")) {
                writer.write(jsonModificado);
                this.pacientes.add(paciente);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Escribir nuevo Paciente");
            e.printStackTrace();
        }
    }

    public void escribirNuevaFactura(Factura factura) {
        Gson gson = new Gson();

        try {
            ArrayList<Factura> temp = new ArrayList<>();
            for (Factura fac : this.facturas) {
                temp.add(fac);
            }

            temp.add(factura);
            // Convertimos el array de facturas modificado a formato JSON
            String jsonModificado = gson.toJson(temp.toArray());
            String path = new File(".").getAbsolutePath();

            // Sobrescribimos el archivo JSON con el nuevo JSON modificado
            try ( FileWriter writer = new FileWriter(path + "\\src\\database\\facturas.json")) {
                writer.write(jsonModificado);
                this.facturas.add(factura);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Escribir nueva Factura");
            e.printStackTrace();
        }
    }

    public void modificarPaciente(Paciente paciente) {
        Gson gson = new Gson();

        try {
            ArrayList<Paciente> temp = new ArrayList<>();

            for (Paciente pac : this.pacientes) {
                temp.add(pac);
            }

            int x = -1;
            for (int i = 0; i < temp.size(); i++) {
                if (temp.get(i).getId() == paciente.getId()) {
                    x = i;
                }
            }

            if (x != -1) {
                temp.set(x, paciente);

                // Convertimos el array de pacientes modificado a formato JSON
                String jsonModificado = gson.toJson(temp.toArray());
                String path = new File(".").getAbsolutePath();

                // Sobrescribimos el archivo JSON con el nuevo JSON modificado
                try ( FileWriter writer = new FileWriter(path + "\\src\\database\\pacientes.json")) {
                    writer.write(jsonModificado);
                    this.pacientes.set(x, paciente);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            System.out.println("Modificar Paciente");
            e.printStackTrace();
        }
    }

    public void modificarCita(Cita cita) {
        Gson gson = new Gson();

        try {
            ArrayList<Cita> temp = new ArrayList<>();

            for (Cita cit : this.citas) {
                temp.add(cit);
            }

            int x = -1;
            for (int i = 0; i < temp.size(); i++) {
                if (temp.get(i).getId() == cita.getId()) {
                    x = i;
                }
            }

            if (x != -1) {
                temp.set(x, cita);

                // Convertimos el array de citas modificado a formato JSON
                String jsonModificado = gson.toJson(temp.toArray());
                String path = new File(".").getAbsolutePath();

                // Sobrescribimos el archivo JSON con el nuevo JSON modificado
                try ( FileWriter writer = new FileWriter(path + "\\src\\database\\citas.json")) {
                    writer.write(jsonModificado);
                    this.citas.set(x, cita);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            System.out.println("Modificar Cita");
            e.printStackTrace();
        }
    }

    public void modificarProveedor(Proveedor proveedor) {
        Gson gson = new Gson();

        try {
            ArrayList<Proveedor> temp = new ArrayList<>();
            for (Proveedor p : this.proveedores) {
                temp.add(p);
            }

            int x = -1;
            for (int i = 0; i < temp.size(); i++) {
                if (temp.get(i).getId() == proveedor.getId()) {
                    x = i;
                }
            }

            if (x != -1) {
                temp.set(x, proveedor);

                // Convertimos el array de proveedores modificado a formato JSON
                String jsonModificado = gson.toJson(temp.toArray());

                // Sobrescribimos el archivo JSON con el nuevo JSON modificado
                String path = new File(".").getAbsolutePath() + "\\src\\database\\proveedores.json";
                try ( FileWriter writer = new FileWriter(path)) {
                    writer.write(jsonModificado);
                    this.proveedores.set(x, proveedor);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            System.out.println("Modificar Proveedor");
            e.printStackTrace();
        }
    }

    public void modificarMaterialMedico(MaterialMedico material) {
        Gson gson = new Gson();

        try {
            ArrayList<MaterialMedico> temp = new ArrayList<>();
            for (MaterialMedico m : this.materialesMedicos) {
                temp.add(m);
            }

            int x = -1;
            for (int i = 0; i < temp.size(); i++) {
                if (temp.get(i).getId() == material.getId()) {
                    x = i;
                }
            }

            if (x != -1) {
                temp.set(x, material);

                // Convertimos el array de materiales médicos modificado a formato JSON
                String jsonModificado = gson.toJson(temp.toArray());

                // Sobrescribimos el archivo JSON con el nuevo JSON modificado
                String path = new File(".").getAbsolutePath() + "\\src\\database\\materialesmedicos.json";
                try ( FileWriter writer = new FileWriter(path)) {
                    writer.write(jsonModificado);
                    this.materialesMedicos.set(x, material);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            System.out.println("Modificar material médico");
            e.printStackTrace();
        }
    }

    public void escribirNuevaCita(Cita cita) {
        Gson gson = new Gson();

        try {
            ArrayList<Cita> temp = new ArrayList<>();
            for (Cita pac : this.citas) {
                temp.add(pac);
            }
            temp.add(cita);

            // Convertimos el array de pacientes modificado a formato JSON
            String jsonModificado = gson.toJson(temp.toArray());
            String path = new File(".").getAbsolutePath();

            // Sobrescribimos el archivo JSON con el nuevo JSON modificado
            try ( FileWriter writer = new FileWriter(path + "\\src\\database\\citas.json")) {
                writer.write(jsonModificado);
                this.citas.add(cita);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Escribir nueva Cita");
            e.printStackTrace();
        }
    }

    public void escribirNuevoProveedor(Proveedor proveedor) {
        Gson gson = new Gson();

        try {
            ArrayList<Proveedor> temp = new ArrayList<>();
            for (Proveedor p : this.proveedores) {
                temp.add(p);
            }
            temp.add(proveedor);

            // Convertimos el array de proveedores modificado a formato JSON
            String jsonModificado = gson.toJson(temp.toArray());

            // Sobrescribimos el archivo JSON con el nuevo JSON modificado
            String path = new File(".").getAbsolutePath() + "\\src\\database\\proveedores.json";
            try ( FileWriter writer = new FileWriter(path)) {
                writer.write(jsonModificado);
                this.proveedores.add(proveedor);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Escribir nuevo Proveedor");
            e.printStackTrace();
        }
    }

    public void escribirNuevaCompraMaterialMedico(CompraMaterialMedico compra) {
        Gson gson = new Gson();

        try {
            ArrayList<CompraMaterialMedico> temp = new ArrayList<>();
            for (CompraMaterialMedico c : this.comprasMaterialMedico) {
                temp.add(c);
            }
            temp.add(compra);

            // Convertimos el array de compras modificado a formato JSON
            String jsonModificado = gson.toJson(temp.toArray());

            // Sobrescribimos el archivo JSON con el nuevo JSON modificado
            String path = new File(".").getAbsolutePath() + "\\src\\database\\comprasmaterialesmedicos.json";
            try ( FileWriter writer = new FileWriter(path)) {
                writer.write(jsonModificado);
                this.comprasMaterialMedico.add(compra);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Escribir nueva compra de material médico");
            e.printStackTrace();
        }
    }

    public void escribirNuevoMaterialMedico(MaterialMedico material) {
        Gson gson = new Gson();

        try {
            ArrayList<MaterialMedico> temp = new ArrayList<>();
            for (MaterialMedico m : this.materialesMedicos) {
                temp.add(m);
            }

            temp.add(material);
            // Convertimos el array de materiales médicos modificado a formato JSON
            String jsonModificado = gson.toJson(temp.toArray());
            String path = new File(".").getAbsolutePath();

            // Sobrescribimos el archivo JSON con el nuevo JSON modificado
            try ( FileWriter writer = new FileWriter(path + "\\src\\database\\materialesmedicos.json")) {
                writer.write(jsonModificado);
                this.materialesMedicos.add(material);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Escribir nuevo material médico");
            e.printStackTrace();
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

            File file = new File(path + "\\src\\database\\citas.json");

            if (file.exists()) {
                FileReader lector = new FileReader(file);

                JsonReader archivo = new JsonReader(lector);

                Cita[] arr = gson.fromJson(archivo, Cita[].class);

                this.citas.clear();
                this.citas = new ArrayList<>();

                for (Cita cita : arr) {
                    this.citas.add(cita);
                }

                lector.close();
                archivo.close();
            } else {
                System.out.println("El archivo no existe");
                this.citas = new ArrayList<>();
            }
        } catch (Exception err) {
            System.out.println("Obtener Cita");
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

            File file = new File(path + "\\src\\database\\proveedores.json");

            if (file.exists()) {
                FileReader lector = new FileReader(file);

                JsonReader archivo = new JsonReader(lector);

                Proveedor[] arr = gson.fromJson(archivo, Proveedor[].class);

                this.proveedores.clear();
                this.proveedores = new ArrayList<>();

                for (Proveedor proveedor : arr) {
                    this.proveedores.add(proveedor);
                }

                lector.close();
                archivo.close();
            } else {
                System.out.println("El archivo no existe");
                this.proveedores = new ArrayList<>();
            }
        } catch (Exception err) {
            System.out.println("Obtener Proveedor");
            System.out.println(err);
            this.proveedores = new ArrayList<>();
        }
    }

    public void obtenerComprasMaterialMedico() {
        try {
            String path = new File(".").getAbsolutePath();
            Gson gson = new Gson();

            File file = new File(path + "\\src\\database\\comprasmaterialesmedicos.json");

            if (file.exists()) {
                FileReader lector = new FileReader(file);

                JsonReader archivo = new JsonReader(lector);

                CompraMaterialMedico[] arr = gson.fromJson(archivo, CompraMaterialMedico[].class);

                this.comprasMaterialMedico.clear();
                this.comprasMaterialMedico = new ArrayList<>();

                for (CompraMaterialMedico compra : arr) {
                    this.comprasMaterialMedico.add(compra);
                }

                lector.close();
                archivo.close();
            } else {
                System.out.println("El archivo no existe");
                this.comprasMaterialMedico = new ArrayList<>();
            }
        } catch (Exception err) {
            System.out.println("Obtener Compras de Material Médico");
            System.out.println(err);
            this.comprasMaterialMedico = new ArrayList<>();
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

    public ArrayList<CompraMaterialMedico> getComprasMaterialMedico() {
        return comprasMaterialMedico;
    }

    public void setComprasMaterialMedico(ArrayList<CompraMaterialMedico> comprasMaterialMedico) {
        this.comprasMaterialMedico = comprasMaterialMedico;
    }

}
