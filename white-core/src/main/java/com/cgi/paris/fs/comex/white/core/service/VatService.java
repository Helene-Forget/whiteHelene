package com.cgi.paris.fs.comex.white.core.service;


import org.springframework.stereotype.Component;

@Component//pour le déclarer dans Spring??
public class VatService {
    private double ComputeVat(final double i, double vat){
        return (double) Math.round(i*vat *100)/100;
    }

    public double ComputeFrenchVat(final double i){

        return (double) ComputeVat(i,0.2);


    }
    public double ComputeGermanVat(final double i){

        return (double) ComputeVat(i,0.19);


    }


}
