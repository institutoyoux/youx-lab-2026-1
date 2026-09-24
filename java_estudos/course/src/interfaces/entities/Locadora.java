package interfaces.entities;
import java.time.Duration;
import java.time.LocalDateTime;

public class Locadora {
    private String modelo;
    private LocalDateTime retirada;
    private LocalDateTime retorno;
    private Double valorPorHora;
    private Double valorPorDia;


    public Locadora(String modelo,
                    LocalDateTime retirada,
                    LocalDateTime retorno,
                    Double valorPorHora,
                    Double valorPorDia
                    ) {
        this.modelo = modelo;
        this.retirada = retirada;
        this.retorno = retorno;
        this.valorPorHora = valorPorHora;
        this.valorPorDia = valorPorDia;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDateTime getRetirada() {
        return retirada;
    }

    public LocalDateTime getRetorno() {
        return retorno;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public Double getValorPorDia() {
        return valorPorDia;
    }


    public Double Duracao() {
            Duration cronometro = Duration.between(retirada, retorno);
            Double horas = Double.valueOf(cronometro.toHours());
            long minutos = (cronometro.toMinutes());

            if ((minutos % 60) > 0) {
                horas += 1.0;
            }

            return horas;
        }

        public double  calcularValorBruto() {
            Double horasTotais = Duracao();
            if (horasTotais <= 12.0) {
                return horasTotais * valorPorHora;
            }
            else {
                double dias = Math.ceil(horasTotais / 24.0);

                return dias * valorPorDia;
            }

        }

        public String notaFiscal() {
            Double pagamentoBasico = calcularValorBruto();
            ImpostoBrasileiro Imposto = new ImpostoBrasileiro();
            Double valorImposto = Imposto.calcularImposto(pagamentoBasico);
            Double pagamentoTotal = pagamentoBasico + valorImposto;

            return new StringBuilder()
                    .append("Pagamento Basico: ").append(pagamentoBasico).append("\n")
                    .append("Imposto: ").append(valorImposto).append("\n")
                    .append("Pagamento Total: ").append(pagamentoTotal)
                    .toString();
        }

        }









