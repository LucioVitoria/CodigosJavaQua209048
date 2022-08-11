package herois;

public class Herois {
	
	private String identidadeSecreta,universoPertence,nomeDeHeroi,planetaNatal,pertenceAoGrupoLiga,cidadeNatal,baseSecreta,superPoderes; 
	private int idade; 
	private boolean estaNaAtiva;
	 
		public Herois() {
		
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

	public String getNomeDeHeroi() {
		return nomeDeHeroi;
	}

	public void setNomeDeHeroi(String nomeDeHeroi) {
		this.nomeDeHeroi = nomeDeHeroi;
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

		return  "\n-----HEROI-----"  + "\nIdentidade Secreta: " + identidadeSecreta + "\nUniverso: " + universoPertence + 
				"\nNome Do Heroi: " + nomeDeHeroi + "\nPlaneta Natal: " + planetaNatal+ 
				"\nPertence ao grupo: " + pertenceAoGrupoLiga + "\nCidade Natal : " + cidadeNatal + 
				"\nBase Secreta:"  + baseSecreta + "\nSuper poderes: " + superPoderes + "\nIdade: " + idade + "\nEsta Na Ativa?: " + estaNaAtiva ;
	}
}
