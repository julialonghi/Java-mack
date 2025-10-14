public class CofreDigital {
    private String senhaMestra;
    private String segredo;

    public CofreDigital(String senha, String segredo) {
        this.senhaMestra = senha;
        this.segredo = segredo;
    }

    public String revelarSegredo(String senhaFornecida) {
        if (senhaFornecida.equals(this.senhaMestra)) {
            return this.segredo;
        } else {
            return "senha incorreta";
        }
    }

    public void alterarSenha(String senhaAntiga, String senhaNova) {
        if (senhaAntiga.equals(this.senhaMestra)) {
            this.senhaMestra = senhaNova;
            System.out.println("senha alterada");
        } else {
            System.out.println("senha antiga incorreta");
        }
    }
}
