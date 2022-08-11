package viloes;

public class Viloes {

	
	private String identidadeSecreta,universoPertence,nomeDeVilao,planetaNatal,pertenceAoGrupoLiga,cidadeNatal,baseSecreta,superPoderes;
	private boolean estaNaAtiva;  
	private int idade; 
	  
	
	public Viloes() {
		
	}

	public String getIdentidadeSecreta() {
		return identidadeSecreta;
	}

	public void setIdentidadeSecreta(String identidadeSecreta) {
		this.identidadeSecreta = identidadeSecreta;
	}

	public String getUniversoPertence() {
		return universoPertence;
	}

	public void setUniversoPertence(String universoPertence) {
		this.universoPertence = universoPertence;
	}

	public String getNomeDeVilao() {
		return nomeDeVilao;
	}

	public void setNomeDeVilao(String nomeDeHeroi) {
		this.nomeDeVilao = nomeDeHeroi;
	}

	public String getPlanetaNatal() {
		return planetaNatal;
	}

	public void setPlanetaNatal(String planetaNatal) {
		this.planetaNatal = planetaNatal;
	}

	public String getPertenceAoGrupoLiga() {
		return pertenceAoGrupoLiga;
	}

	public void setPertenceAoGrupoLiga(String pertenceAoGrupoLiga) {
		this.pertenceAoGrupoLiga = pertenceAoGrupoLiga;
	}

	public String getCidadeNatal() {
		return cidadeNatal;
	}

	public void setCidadeNatal(String cidadeNatal) {
		this.cidadeNatal = cidadeNatal;
	}

	public String getBaseSecreta() {
		return baseSecreta;
	}

	public void setBaseSecreta(String baseSecreta) {
		this.baseSecreta = baseSecreta;
	}

	public String getSuperPoderes() {
		return superPoderes;
	}

	public void setSuperPoderes(String superPoderes) {
		this.superPoderes = superPoderes;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean getEstaNaAtiva() {
		return estaNaAtiva;
	}

	public void setEstaNaAtiva(boolean estaNaAtiva) {
		this.estaNaAtiva = estaNaAtiva;
	}
	
	@Override
	public String toString() {

		return "\n-----VILÃO-----" + "Identidade Secreta: " + identidadeSecreta + "\nUniverso: " + universoPertence + 
				"\nNome do Vilão: " + nomeDeVilao + "\nPlaneta Natal: " + planetaNatal + "\nPertence ao Grupo: "
				+ pertenceAoGrupoLiga + "\nCidade Natal" + cidadeNatal + "\nBase Secreta: " + baseSecreta +
				"\nSuper Poderes: " + superPoderes + "\nIdade: " + idade + "Está na Ativa?: " + estaNaAtiva;
	}
	
}
