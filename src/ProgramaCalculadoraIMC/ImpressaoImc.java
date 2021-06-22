package ProgramaCalculadoraIMC;
import java.util.ArrayList;

import java.util.Scanner;

public class ImpressaoImc {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		ClasseCadastro cad1 = new ClasseCadastro();
		calculadoraImc Imc = new calculadoraImc();
		int lista;
	    int endereco =  1;
	    ClasseCadastro L = new ClasseCadastro();
		ArrayList<String> SL = new ArrayList<>();
		ArrayList<String> ZN = new ArrayList<>();
		ArrayList<String> ZO = new ArrayList<>();
		ArrayList<String> ZL = new ArrayList<>();
		ArrayList<String> CE = new ArrayList<>();
		
		SL.add("Associação beneficente guilhermina maria de jesus	\"Abegui Av Paulo Guilguer Reimberg, 7003 Chácara Santo Amaro - São Paulo 04858-570	Sul\r\n"
				+ "Associação de Pais Amigos dos Excepcionais de São Paulo (Apae)	Rua Loefgren, 2109 — Vila Clementino, em São Paulo/SP	04040-033	Sul\r\n"
				+ "Unidade Cidade Ademar	Rua Yervant Kissajikian, 3.101	04428-010	Sul\r\n"
				+ "Unidade Grajaú	Avenida Dona Belmira Marin, 1.959	04846-010	Sul\r\n"
				+ "Unidade Heliópolis	Estrada das Lágrimas, 2.608	04244-000	Sul\r\n"
				+ "Unidade Santo Amaro	Avenida Mario Lopes Leão, 685	04754-010	Sul\r\n"
				+ "Alimentos Zaeli	R. Olimpíadas, 200 - Vila Olímpia, São Paulo - SP	04551-000 Sul\n");
				
		
		
		ZN.add(" Creche Imaculada Coração de Maria do Jardim Princesa	Rua Antônio Susini, 19 — Jardim Princesa, em São Paulo/SP	02856-100	Norte\r\n"
				+ "Unidade Brasilândia	Avenida Parapuã, 1.479	02675-031	Norte\r\n"
				+ "Unidade Limão Avenida Professor Celestino Bourroul, 779	02710-001	Norte\r\n"
				+ "Unidade Santana	Rua Dr. Zuquim, 532	02035-020 Norte\r\n"
				+ "Unidade Tucuruvi	Avenida Mazzei, 495	02331-003 Norte\r\n"
				+ "Unidade Vila Nova Cachoeirinha Avenida Dep. Cantídio Sampaio, 140	02860-001	Norte\r\n"
				+ "Unidade Franca	Rua General Carneiro, 1317	02331-003	Norte\r\n"
				+ "Prefeitura Banco de Alimentos Sp	R. Sobral Júnior, 264 - Vila Maria Alta, São Paulo	02130-020	Norte\r\n"
				+ "CRESAN - Centro de Referência em Segurança Alimentar e Nutricional	Gastão Madeira, 150 - Vila Maria Alta, São Paulo - SP	02131-080	Norte\r\n");
				
		ZO.add("Unidade Campo Limpo	Estrada de Itapecerica, 4.728	05858-000 Oeste\r\n"
				+ "Unidade Capão Redondo Avenida Atos Tomás Ferraciú, 318 05861-240	Oeste\r\n"
				+ "Unidade Lapa	Rua Afonso Sardinha, 245 05076-000 Oeste\r\n"
				+ "Unidade Paraisópolis	Rua Ernest Renan, 1.000	05659-020 Oeste\r\n"
				+ "Unidade Perus Rua Antônio Maia, 652	05204-110 Oeste\r\n"
				+ "Unidade Carapicuiba	Avenida Miriam, 385	06320-060 Oeste\r\n"
				+ "Unidade Osasco Rua João Colino, 240	06013-020 Oeste\r\n"
				+ "anco de Alimentos de Osasco	Av. Gen. Pedro Pinho, 1340 - Pestana, Osasco - SP	06122-160	Oeste\r\n");
		
		
		ZL.add("Comunidade da Graça	Rua Eponina, 390 — Vila Carrão, em São Paulo/SP	03426-010 Leste\r\n"
				+ "Comunidade Evangélica Casa de Oração	Rua Francisco Coimbra, 870 — Penha, em São Paulo/SP	03639-000	Leste\r\n"
				+ "Associação Alfa e Omega	Rua Augusto Giorgio, 222 — São Mateus, em São Paulo/SP	03965-050	Leste\r\n"
				+ "Unidade Brás	Avenida Rangel Pestana, 2.327,Sp 03001-000 Leste\r\n"
				+ "Unidade Guaianases	Estrada de Poá, 13, Jardim Soares, São Paulo 08460-000	Leste\r\n"
				+ "Unidade Itaim Paulista	Rua Alfredo Moreira Pinto, 87 08110-220	Leste\r\n"
				+ "Unidade Itaquera	Rua Victorio Santim, 247 08290-000	Leste\r\n"
				+ "Unidade São Mateus	Avenida Mateo Bei, 2.604 03949-200 Leste\r\n"
				+ "Unidade São Miguel Paulista	Rua José Otoni, 256	08010-290 Leste\r\n");
		
		CE.add("Unidade 25 de Março	Rua 25 de Março, 166, - Centro Histórico de São Paulo 01021-000	Centro\r\n"
				+"Unidade Campos Elíseos	 R. Gen. Júlio Marcondes Salgado, 56 - Campos Elíseos	01226-010 Centro\r\n"
				+"Unidade Limeira	Rua 13 de Maio, 527	01021-000	Centro\r\n"
				+"Unidade Sorocaba	Rua dos Andradas, 115 - Centro Histórico de São Paulo, São Paulo - SP 01021-000 Centro\r\n"
				+"ONG Banco de Alimentos	Rua Atibaia, 218 - Perdizes, São Paulo - SP	01235-010	Centro\r\n");

		
		
		System.out.println("Digite o Nome: ");
		cad1.setNome(scan.nextLine());
		
		System.out.println("Digite o Gênero:");
		cad1.setGênero(scan.nextLine());
		
		System.out.println("Digite a Idade:");
		cad1.setIdade(scan.nextInt());
		
		cad1.Impressao();
        
		System.out.println("Digite o peso em kg e a altura em metros: ");
		Imc.setCalculoImc(scan.nextDouble(),scan.nextDouble());
		
		
		Thread.sleep(1000);
		System.out.println("Aguarde enquanto fazemos o cálculo do IMC...........");
		Thread.sleep(13000);
		
		System.out.println("\nO seu IMC é: " + Imc.getCalculoImc());
	    System.out.println();
	    System.out.println("=======================================================================================");
	    System.out.println("LEIA À SEGUIR AS RECOMENDAÇÕES NUTRICIONAIS BASEADAS NO RESULTADO DO CÁLCULO DO SEU IMC");
	    System.out.println("=======================================================================================");

	    if (Imc.getCalculoImc() < 18.5) {
			System.out.println("Usuario está abaixo do peso ideal (IMC < 18.5)");
			System.out.println("Procurar ajuda nutricional para dar início a uma dieta rica em vitaminas, \nnutrientes e sais minerais.");
			
		}else if(Imc.getCalculoImc() >= 18.5 && Imc.getCalculoImc() <25 ) {
			System.out.println("Usuario está dentro do peso ideal (IMC >= 18.5 e < 25)");
			System.out.println("Para manter-se com o IMC saudável, é importante investir também em atividades físicas diárias e \nno consumo de todos os nutrientes necessários para o corpo manter-se em equilíbrio.");

			
		}else if(Imc.getCalculoImc() >=25 && Imc.getCalculoImc() <30 ) {
			System.out.println("Usuario está em sobrepeso (IMC >= 25 e <30)");
			System.out.println("Converse com uma nutricionista e adote uma prática de exercícios aeróbicos");

			
			
		}else if(Imc.getCalculoImc() >=30 && Imc.getCalculoImc() <35 ) {
			System.out.println("Usuario está com Obesidade Grau I (IMC >=30 e <35)");
			System.out.println("Isso se deve ao excesso de gordura que leva à falta de preparo físico \ne que acaba otimizando os fatores sedentários e aumentando a obesidade. \nÉ preciso procurar ajuda médica com urgência (Tratamentos de Obesidade) \npara que o quadro não se agrave.");
			
			
		}else if(Imc.getCalculoImc() >=35 && Imc.getCalculoImc() <40 ) {
			System.out.println("Usuario está com Obesidade Grau II (IMC >= 35 e <40)");
			System.out.println("O excesso de gordura coloca em alto risco o bem-estar e a vida do paciente, \npodendo levar ao desenvolvimento de diversas doenças, dentre elas a \ndiabetes, a hipertensão, ataques do coração, infarto, derrames cerebrais, \nartrite, má circulação e muitas outras.");
			
			
		}else if(Imc.getCalculoImc() >=40 ) {
			System.out.println("Usuario está com Obesidade Grau III (IMC >= 40)");
			System.out.println("O excesso de gordura coloca em alto risco o bem-estar e a vida do paciente, \npodendo levar ao desenvolvimento de diversas doenças, dentre elas a \ndiabetes, a hipertensão, ataques do coração, infarto, derrames cerebrais, \nartrite, má circulação e muitas outras.");
		}
	    System.out.println("=======================================================================================");
	    
	    
	    
	     Thread.sleep(5000);
	   
	 	 L.limpa();
	     
	    Thread.sleep(3000);
	    
	     System.out.println("Qual é a zona da cidade de São Paulo onde o paciente mora ([1]-sul, [2]-norte,[3]- oeste, [4]-leste,[5]- centro):" );
	     System.out.println();
	     endereco=scan.nextInt();
	     
	     System.out.println("========================================================================================================================");
	     System.out.println("SEGUE A LISTA DE UBS, BANCO DE ALIMENTOS E UNIDADES DA REDE BOM PRATO, MAIS PRÓXIMAS DA SUA RESIDÊNCIA PARA OBTER AJUDA");
	     System.out.println("=========================================================================================================================");
	     
		 if (endereco == 1) {
	    
	   
	     System.out.println("Zona Sul\n" + SL);
			
		} 
    
		 else if(endereco == 2) {
		 
			 System.out.println("Zona Norte\n" + ZN);
	    } 
		 

	     else if(endereco == 3) {
	 
		 System.out.println("Zona Oeste\n" + ZO);
        } 
	 
		 
         else if(endereco == 4) {
	 
	     System.out.println("Zona Leste\n" + ZL);
       } 

		 
         else if(endereco == 5) {
    		 
 	     System.out.println("Centro\n" + CE);
        } 
        
		System.out.println("==============================================================================================================================");
        System.out.println(" \n\nDigite [1] para imprimir a lista e finalizar atendimento ===== Digite [2] Para Finalizar e ir para o próximo atendimento:");
        lista=scan.nextInt();
        
        if(lista==1) {
        	
        	System.out.println("Imprimindo a lista e finalizando atendimento...");
        }
    
        else if(lista==2) {
        	System.out.println("Atendimento finalizado");
        	
        }
        
	    scan.close();
        
	}
}

	




