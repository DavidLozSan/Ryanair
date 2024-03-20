package com.iesam.ryanair.features.tripulante.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.ryanair.features.tripulante.domain.Tripulante;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TripulanteFileLocalDataSource {

    private String nameFile = "tripulante.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Tripulante>>() {
    }.getType();

    public void save(Tripulante model) {
        List<Tripulante> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Tripulante> models) {
        saveToFile(models);
    }

    private void saveToFile(List<Tripulante> models) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(models));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }

    public Tripulante findByDni(String dni) {
        List<Tripulante> models = findAll();
        for (Tripulante model : models) {
            if (Objects.equals(model.getDni(), dni)) {
                return model;
            }
        }
        return null;
    }

    public List<Tripulante> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }

    public void delete(String modelDni) {
        List<Tripulante> newList = new ArrayList<>();
        List<Tripulante> models = findAll();
        for (Tripulante model : models) {
            if (model.getDni() != modelDni) {
                newList.add(model);
            }
        }
        saveList(newList);
    }
}
