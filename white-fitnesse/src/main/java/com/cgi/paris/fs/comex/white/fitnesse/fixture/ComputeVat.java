package com.cgi.paris.fs.comex.white.fitnesse.fixture;


import com.cgi.paris.fs.comex.white.core.service.VatService;
import fit.ColumnFixture;

public class ComputeVat extends ColumnFixture {
    private final VatService vatService = FitnesseSpring.getBean(VatService.class);

    private double amount;


    public double frenchvat() {
        return this.vatService.ComputeFrenchVat(this.amount);
    }


    public double germanvat() {
        return this.vatService.ComputeGermanVat(this.amount);
    }




}
