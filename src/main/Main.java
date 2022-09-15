package main;

import main.factory.FamiliaFactory;
import main.model.Familia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Familia> familias = new ArrayList<>();
        familias.add(FamiliaFactory.gerarFamilia());
        familias.add(FamiliaFactory.gerarFamilia());
        familias.add(FamiliaFactory.gerarFamilia());
        familias.add(FamiliaFactory.gerarFamilia());
        familias.add(FamiliaFactory.gerarFamilia());
        familias.add(FamiliaFactory.gerarFamilia());
        familias.add(FamiliaFactory.gerarFamilia());

        System.out.println("Familias não ordenada:");
        System.out.println("# | Renda | Pt | Dependentes");
        for (Familia f : familias) {
            System.out.println(f);
        }

        System.out.println("------------------------");

        System.out.println("Familias ordenada:");
        System.out.println("# | Renda | Pt | Dependentes");
        Collections.sort(familias);
        for (Familia f : familias) {
            System.out.println(f);
        }
    }
}