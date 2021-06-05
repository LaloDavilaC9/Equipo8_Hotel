/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victor;

import consultas.baseDeDatos;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author luis
 */
public class Ocupacion {

    public Ocupacion() {
        //Llenado de vector para habitaciones disponibles
        baseDeDatos b = new baseDeDatos();
        boolean ocupada[] = new boolean [45];
        int ocupadas=0, disponibles=0;
        int n = 0;
        int aux = 101;
        for (int i = aux; i <= 115; i++) {
            String h = Integer.toString(i);
            try{
                ocupada[n] = b.habOcupada(h);
                if (!ocupada[n]){
                    System.out.println(i +") - Ocupada");
                    ocupadas ++;
                }else{
                    System.out.println(i +") - Disponible");
                    disponibles ++;
                }
            }catch(Exception e){
                System.out.println(i +") Error UnU");
            }
            n++;
        }
        aux = 201;
        for (int i = aux; i <= 215; i++) {
            String h = Integer.toString(i);
            try {
                ocupada[n] = b.habOcupada(h);
                if (!ocupada[n]) {
                    System.out.println(i + ") - Ocupada");
                    ocupadas ++;
                } else {
                    System.out.println(i + ") - Disponible");
                    disponibles ++;
                }
            } catch (Exception e) {
                System.out.println(i + ") Error UnU");
            }
            n++;
        }
        aux = 301;
        for (int i = aux; i <= 315; i++) {
            String h = Integer.toString(i);
            try {
                ocupada[n] = b.habOcupada(h);
                if (!ocupada[n]) {
                    System.out.println(i + ") - Ocupada");
                    ocupadas ++;
                } else {
                    System.out.println(i + ") - Disponible");
                    disponibles ++;
                }
            } catch (Exception e) {
                System.out.println(i + ") Error UnU");
            }
            n++;
        }
        System.out.println();
        System.out.println("Total ocupado: " +disponibles);
        System.out.println("Total disponible: " +ocupadas);
        System.out.println();
        
        grafica(disponibles, ocupadas);
    }

    private static void grafica(int disponibles, int ocupadas) {
        float porcentaje = 0;
        baseDeDatos b = new baseDeDatos();
        porcentaje = b.consultarPorcentajeTotalOcupacion();     
        DefaultPieDataset graf1 = new DefaultPieDataset();
        
        graf1.setValue("Total ocupado: "+porcentaje+"%", disponibles);
        graf1.setValue("Total disponible: "+(100-porcentaje)+"%", ocupadas);

        JFreeChart chart = ChartFactory.createPieChart("OCUPACION DEL HOTEL\nCalifornia Suite", graf1, true, true, false);

        ChartFrame frame = new ChartFrame("Ocupacion total", chart);
        frame.pack();
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
