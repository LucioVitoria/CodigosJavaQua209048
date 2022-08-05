package principal;

        import java.util.Locale;
		import java.util.Scanner;

		import herois.Herois;
		import viloes.Viloes;

/*Crie uma classe principal, uma classe herois, uma classe viloes;
classe herois / vilão:
identidadeSecreta;
universoPertence; (marvel, dc..)
nomeDeHeroi;
planetaNatal;
pertenceAoGrupoLiga; (liga da justiça, os batutinhas...)
cidadeNatal; (gothan, sambariSeive me...)
baseSecreta; (bat caverna, planeta diario...)
superPoderes; (raio-x, ser rico)
idade; (25 , indefinido)
estaNaAtiva; (verdadeiro ou Falso)

Você deve ser capaz de identificar os tipos de dado de cada atributo;
Voce deve criar os construtores necessarios (crie no minimo o padrão);
Faça os getter e setter dos atributos da classe que achar necessario (lembre-se dos atributos que podem e que não podem ser mudados);

opcional: Voce pode mostrar os dados pelo metodo get na classe principal, ou fazer o construtor toString nas classes heroi e vilão.

*/
public class TorreJustice {

	public static void main(String[] args) {
													
				Scanner sc = new Scanner(System.in).useLocale(Locale.US);
				Herois herois = new Herois();
				Viloes viloes = new Viloes();
				int cadastro = 0;
				String secretaria; 
				
				
				System.out.println("---------JusticeTower---------");
				
				System.out.print("\nBom Dia! Digite seu nome para começar: " );
				secretaria =sc.nextLine();
				
				System.out.println("\nMuito bem " + secretaria + ", Seu trabalho é identificar os novos herois que \nchegarem e ou os novo vilões presos. Bom trabalho!");
				
				System.out.print("\n\nComeçar o cadastro agora?\nDigite o Numero  ( 1 ) para Sim ou (2) para Não: ");
				cadastro = sc.nextInt();
				
				Cadastro(cadastro);
				
				sc.close();
			}
			public static void Cadastro(int cadastro) {
				Scanner leia= new Scanner(System.in).useLocale(Locale.US);
				Herois herois = new Herois();
				Viloes viloes = new Viloes();
				for (int i = 0; i < 2; i++) {
					if (cadastro == 1) {
						System.out.print("\nDigite ( 1 ) Para herói ou ( 2 ) Para Vilão: ");
						int digite = leia.nextInt();
						if(digite == 1) {
							
							leia.nextLine();
							
							System.out.print("\nNome de Herói: ");
							String nomeDeHeroi = leia.nextLine();
							herois.setNomeDeHeroi(nomeDeHeroi);
							
																
							System.out.print("\nIdentidade Secreta do Herói: ");
							String identidadeSecreta = leia.nextLine();
							herois.setIdentidadeSecreta(identidadeSecreta);
							
							System.out.print("\nNome do universo de origem: ");
							String universoPertence = leia.nextLine();
							herois.setUniversoPertence(universoPertence);
							
														
							System.out.print("\nPlaneta Natal: ");
							String planetaNatal = leia.nextLine();
							herois.setPlanetaNatal(planetaNatal);
							
							System.out.print("\nPertece ao Grupo/Liga: ");
							String pertenceAoGrupoLiga = leia.nextLine();
							herois.setPertenceAoGrupoLiga(pertenceAoGrupoLiga);
							
							System.out.print("\nCidade Natal: ");
							String cidadeNatal = leia.nextLine();
							herois.setCidadeNatal(cidadeNatal);
							
							System.out.print("\nBase Secreta: ");
							String baseSecreta = leia.nextLine();
							herois.setBaseSecreta(baseSecreta);
							
							System.out.print("\nSuper Poderes: ");
							String superPoderes = leia.nextLine();
							herois.setSuperPoderes(superPoderes);
							
							System.out.print("\nIdade: ");
							int idade = leia.nextInt();
							herois.setIdade(idade);
							
							System.out.print("\nEsta na Ativa ainda?: ");
							String estaNaAtiva = leia.next();
							herois.setEstaNaAtiva(estaNaAtiva);
							
														
							System.out.println(herois);
							
							
							
						}else if(digite == 2) {
							leia.nextLine();
							
							System.out.print("\nNome de Vilão: ");
							String nomeDeVilao = leia.nextLine();
							viloes.setNomeDeVilao(nomeDeVilao);
							
							
							System.out.print("\nIdentidade Secreta do Vilão: ");
							String identidadeSecreta = leia.nextLine();
							viloes.setIdentidadeSecreta(identidadeSecreta);
							
							System.out.print("\nNome do universo de Origem: ");
							String universoPertence = leia.nextLine();
							viloes.setUniversoPertence(universoPertence);
							
														
							System.out.print("\nPlaneta Natal: ");
							String planetaNatal = leia.nextLine();
							viloes.setPlanetaNatal(planetaNatal);
							
							System.out.print("\nPertece ao Grupo/Liga: ");
							String pertenceAoGrupoLiga = leia.nextLine();
							viloes.setPertenceAoGrupoLiga(pertenceAoGrupoLiga);
							
							System.out.print("\nCidade Natal: ");
							String cidadeNatal = leia.nextLine();
							viloes.setCidadeNatal(cidadeNatal);
							
							System.out.print("\nBase Secreta: ");
							String baseSecreta = leia.nextLine();
							viloes.setBaseSecreta(baseSecreta);
							
							System.out.print("\nSuper Poderes: ");
							String superPoderes = leia.nextLine();
							viloes.setSuperPoderes(superPoderes);
							
							System.out.print("\nIdade: ");
							int idade = leia.nextInt();
							viloes.setIdade(idade);
							
							System.out.print("Está na ativa ainda?: ");
							String estaNaAtiva = leia.next();
							viloes.setEstaNaAtiva(estaNaAtiva);
							
							System.out.println(viloes);
						}
						
					}else {
					
						System.out.println("E agora pode ? ( 1 ) para Sim ou (2) para Não:");
						cadastro = leia.nextInt();
					}
				}	
				
								
				leia.close();

	}

}
