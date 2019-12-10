package com.cgi.paris.fs.comex.white.core.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VatServiceTest {

    //exemple de TDD test driven developpement
    @Test
    public void ComputeFrenchVat(){
        final VatService vatService=new VatService();
        assertThat(vatService.ComputeFrenchVat(1000)).isEqualTo(200);
        assertThat(vatService.ComputeFrenchVat(2000)).isEqualTo(400);
        assertThat(vatService.ComputeFrenchVat(3000)).isEqualTo(600);
        assertThat(vatService.ComputeFrenchVat(352.52)).isEqualTo(70.50);
        assertThat(vatService.ComputeFrenchVat(352.54)).isEqualTo(70.51);
    }
    @Test
    public void ComputeGermanVat(){
        final VatService vatService=new VatService();
        assertThat(vatService.ComputeGermanVat(1000)).isEqualTo(190);
        assertThat(vatService.ComputeGermanVat(2000)).isEqualTo(380);
        assertThat(vatService.ComputeGermanVat(3000)).isEqualTo(570);
        assertThat(vatService.ComputeGermanVat(352.52)).isEqualTo(66.98);
        assertThat(vatService.ComputeGermanVat(352.54)).isEqualTo(66.98);
    }

}
