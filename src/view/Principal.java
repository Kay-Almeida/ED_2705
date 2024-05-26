package view;

import javax.swing.JOptionPane;

import controller.TelefonicaController;
import models.ListaTelefonica;

public class Principal {
	public static void main(String[] args) throws Exception {
		
		TelefonicaController tc = new TelefonicaController(); 
		String [] VetorNumero = {"6078347269", "9888443460", "7310764414", "5989530974", "8997788712", "9916036955", "5425612994", "5964693077", "1160723572", "8349857059", "2524682057", "2363420303", "4013514303", "4453267467", "4614444363", "1663015283", "6366166436", "8116982561", "5662690885", "6545836179", "3915215883", "8996950152", "3633434931", "2586857247", "8710519618", "2579496486", "8232392935", "9459548009", "9510390159", "4247133575", "4778395309", "3226455353", "6092794571", "6576524277", "7752440170", "1326663943", "8678885362", "7752457944", "1948201761", "3575881649", "7450397445", "6220360469", "2475056300", "6693418303", "5087046726", "2589938291", "2986023175", "9138447123", "3598456007", "7454200170", "1668362192", "8561343994", "2558996953", "9717505035", "2126153437", "8447599470", "3231272178", "3282180255", "2815611100", "9746947084", "1290106922", "2553674220", "4930317935", "3661117223", "6746923501", "6089142584", "9913549402", "6185413206", "5717445529", "6544219931", "5731536274", "7793007831", "6594777305", "8223098977", "8270641042", "7386219912", "1925929574", "6331647612", "6369021773", "4926638758", "1126956116", "1416529749", "7570039434", "9650237506", "3869143724", "3149207222", "9896115871", "7027004779", "1490002467", "7335528766", "8829604772", "2557871403", "6281501138", "3358852511", "7915429715", "6337167506", "6356134188", "2655370779", "6136406195", "4621893455", "8681046882", "5399702435", "7059423304", "4139915404", "9010154933", "9777182746", "6257395242", "6659044145", "9686311304", "4240201321", "7230295550", "8633592163", "5266046060", "3774481793", "5045704904", "4481728064", "7218845865", "8564889405", "3751303251", "7079949776", "7585616888", "2051659168", "8876969855", "8741497721", "2557357402", "3966625260", "4567166961", "4883567966", "3272089579", "7028580472", "1850353303", "2356128283", "6433825005", "1221733293", "7989685874", "6329050875", "1145407697", "7130332731", "8786307392", "5713704107", "4237591029", "4164510871", "2262496084", "9432512372", "6678490332", "4789765029", "1272085611", "3518328216", "3577292742", "7511827814", "4351360583", "9626789398", "5179133650", "4699337206", "5663762797", "9357510458", "8367576024", "2697112532", "1732862434", "9726636492", "1740505622", "4154020332", "2480458573", "9363467213", "7122058844", "9448321926", "3683884148", "6659832223", "8484259050", "5512183059", "7598798647", "2182769239", "2765452853", "3359136019", "2137975171", "6770022282"};
		String [] VetorNome = {"Marina Paloma", "Telma Giovanna", "Yasmin Marina", "Gustavo Yasmin", "Talita César", "Yolanda Simone", "Vicente Natália", "Wellington Francisco", "Renato Núbia", "Ulina Felipe", "Matheus Brenda", "Helena Kleber", "Humberto Wesley", "Letícia Walter", "Erika Arthur", "Yanna Samuel", "Thales Humberto", "Gláucia Vanessa", "Fernanda Letícia", "Arthur Zélia", "Yanna Ingrid", "Bruno César", "Luan Wilma", "Bernardo Bruno", "Patrício David", "Xena Amanda", "Daniela Xena", "Vítor Pietra", "Uriel Otto", "Giovanna Beatriz", "Paloma Xisto", "Eliane Oscar", "Bruna Gláucia", "Verônica Giovanna", "David Amanda", "Yolanda Leonardo", "Bruno Elisa", "Giovanna Maurício", "Yanna Ricardo", "Priscila Denise", "Quésia Zuleica", "Tereza Carolina", "Íris César", "Tatiana Xavier", "Rafael Leonardo", "Alberto Zoraide", "Xênia Tereza", "Nicolas Carolina", "Helena Ulina", "Thales Gabriel", "Bruna Olívia", "Sérgio Naiara", "Irina Vicente", "Tânia Zélia", "Yolanda Neuza", "Zoraide Marina", "Zeca Oscar", "Denise Vanessa", "Paulo David", "Larissa Kleber", "Leonardo Elisa", "Renato Zoraide", "Roberto Erika", "Wallace Valéria", "Zenon Priscila", "Oscar Guilherme", "Zuleika Yolanda", "Gustavo Thales", "Tânia Vinícius", "Joaquim Fabiana", "Emanuel Renato", "Fabiano Eduardo", "Bruno Helena", "Nina Carlos", "Camila Larissa", "Nicolas Ulina", "Débora Tiago", "Otávio Letícia", "Lara Omar", "Eliane Zeca", "Yuri Gláucia", "Cauã Fernanda", "Diego Olívia", "Quésia Ivone", "Clarice Fernando", "José Sandra", "João Luan", "Diana César", "Orlando Heloísa", "Pietra Otto", "Pâmela Yann", "Eliane José", "Wilma Amanda", "Wellington Clarice", "Nicolas Heitor", "Nelson Giovanni", "Hugo Quésia", "Eduardo Ricardo", "Carolina Marcos", "Heloísa Zoraide", "Zeca Larissa", "Elias Joaquim", "Silvana Simone", "Matheus Alberto", "Henrique Arthur", "Tatiana Luan", "Wesley Marcos", "Bianca Telma", "Bernardo Samuel", "Letícia César", "Simone Patrício", "Miguel Wellington", "Patrício Ulisses", "Letícia Zoraide", "Yasmin Danilo", "Xena Beatriz", "Diana Leila", "Natália Natália", "Telma Gisele", "Vânia Olívia", "Alex Giovanni", "Heloísa Alex", "Fabiano Mário", "Helena Xena", "Tiago Leonardo", "Amanda Naiara", "Vinícius Olívia", "Otto Débora", "Júlio Natália", "Diana Nina", "Beatriz Henrique", "Irina David", "Larissa Pâmela", "Silvana Lara", "Melissa Rogério", "Humberto Paloma", "Diana Verônica", "Fernando Priscila", "Bernardo Ulina", "Talita Danilo", "Eduardo Jonas", "Fabiano Zuleica", "Kelly Sérgio", "Joaquim Núbia", "Amanda Yasmin", "Telma Júlio", "Paulo Denise", "Tereza Otávio", "Miguel Paloma", "Zeca Bárbara", "Elisa Humberto", "Natália Eliane", "Nicolas Guilherme", "Orlando Melissa", "Leonardo Erick", "Nina Xênia", "Zuleica Beatriz", "Simone Diego", "Helena Yolanda", "Natália Francisco", "Telma Yasmin", "Yolanda Patrício", "Leila Patrícia", "Olívia Pietra", "Tiago Valéria", "Wesley Cristiano", "Alberto Bernardo", "Rogério Yanna", "Júlio Pietra", "Íris Lara", "Ricardo Talita", "Íris Alex", "Ulisses Telma", "Ursula Henrique", "Camila Hugo", "Bruno Luan"};

		int opc = 0; 
		
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Lista\n 1 - Adicionar Número \n 2 - Listar Números\n 9 - Finalizar Programa "));
			switch(opc){
			case 1: 
				int tamanhoNome = VetorNome.length; 
				for(int i=0; i<tamanhoNome; i++) {
					ListaTelefonica LT = new ListaTelefonica(); 
					LT.nome = VetorNome[i]; 
					LT.numero = VetorNumero[i];
					tc.adicionarNumero(LT);
				}
				JOptionPane.showMessageDialog(null, "Lista telefonica inserida com sucesso!. ");
				break; 
			case 2:
				tc.listarNumeros();
				break; 
			case 9: JOptionPane.showMessageDialog(null, "Encerrando programa...");
				break; 
				default: JOptionPane.showMessageDialog(null, "Opção Inválida!!");
			}
			
		}
		
	}

}
