package interfaces.entities;

import java.time.LocalDate;

public class ServicoContrato {
    private ServicoPagamentoOnline servicoPagamentoOnline;

    public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
        this.servicoPagamentoOnline = servicoPagamentoOnline;
    }

    public void processoContratual(Contrato  contrato,int meses) {

        double cotaBasica = contrato.getValorTotal() / meses;

        for (int i=1; i <= meses; i++) {
            LocalDate vencimento = contrato.getData().plusMonths(i);

            double juro = servicoPagamentoOnline.juros(cotaBasica,i);
            double taxa = servicoPagamentoOnline.taxaPagamento(cotaBasica + juro);
            double cota = cotaBasica + juro + taxa;

            contrato.getParcelamentos().add(new Parcelamento(vencimento,cota));
        }
    }


}
