import java.time.LocalDate;
public class App {
    public static void main(String[] args) throws Exception {
        LocalDate date = LocalDate.now();
        String mes = "Erro";
        if (date.getMonthValue() == 1) {
            mes = "Janeiro";
        };
        if (date.getMonthValue() == 2) {
            mes = "Fevereiro";
        };
        if (date.getMonthValue() == 3) {
            mes = "Março";
        };
        if (date.getMonthValue() == 4) {
            mes = "Abril";
        };
        if (date.getMonthValue() == 5) {
            mes = "Maio";
        };
        if (date.getMonthValue() == 6) {
            mes = "Junho";
        };
        if (date.getMonthValue() == 7) {
            mes = "Julho";
        };
        if (date.getMonthValue() == 8) {
            mes = "Agosto";
        };
        if (date.getMonthValue() == 9) {
            mes = "Setembro";
        };
        if (date.getMonthValue() == 10) {
            mes = "Outubro";
        };
        if (date.getMonthValue() == 11) {
            mes = "Novembro";
        };
        if (date.getMonthValue() == 12) {
            mes = "Dezembro";
        };
        System.out.println(String.format("Hoje é dia %d de %s de %d", date.getDayOfMonth(), mes, date.getYear()));
    }
}
