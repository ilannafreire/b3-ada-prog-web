package tech.freire.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tech.freire.model.TipoTransacao;
import tech.freire.model.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Controller
public class TransacaoController {

    @RequestMapping("transacao")
    @ResponseBody
    public Transacao obtemTransacao() {
        Transacao transacao = new Transacao();
        transacao.setDescricao("Minha primeira transacao");
        transacao.setValor(new BigDecimal("100.00"));
        transacao.setHorario(LocalDateTime.now());
        transacao.setTipo(TipoTransacao.OUTROS);
        return transacao;
    }
}