package com.calculos.calculos.service;

import com.calculos.calculos.entity.Entrada;
import com.calculos.calculos.entity.Resultado;
import org.springframework.stereotype.Service;

@Service
public class CalculosService {

    public Resultado calcular(Entrada entrada){

        Resultado resultado = new Resultado();
        Integer soma = 0;

        if (entrada.getLista() != null)
            for(int i=0; i<entrada.getLista().size(); i++) {
                soma += entrada.getLista().get(i);
            }
        resultado.setSoma(soma);
        Double media = (double) (soma/entrada.getLista().size());
        resultado.setMedia(media);
        return resultado;
    }
}
