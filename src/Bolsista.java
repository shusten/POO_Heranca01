public class Bolsista extends Aluno {
    public void RenovarBolsa() {
        System.out.println("Renovando Bolsa de " + this.getNome());
    }

    @Override
    public void PagarMensalidade() {
        System.out.println(this.getNome() + " é Bolsista! Pagamento facilitado!");
    }
}
