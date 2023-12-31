package String.String_1213;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);

		int T = 10;
		for (int t = 1; t <= T; t++) {
			sc.nextInt();
			String ptn = sc.next();
			String txt = sc.next();
			int cnt = 0;
			int idxT = 0;
			while (idxT < txt.length()) {
				int idxP = 0;
				boolean flag = true;
				if (idxT > 1) {
					if (txt.charAt(idxT - 1) == ptn.charAt(0) && idxP == 0) {
						idxT--;
					}
				}
				while (idxP < ptn.length()) {
//					System.out.println(String.format("idxT, idxP: %d, %d", idxT, idxP));
					char p = ptn.charAt(idxP);
					char x = txt.charAt(idxT);
//					System.out.println(String.format("idxP, p, idxT, x: %d, %c, %d, %c", idxP, p, idxT, x));
					if (ptn.charAt(idxP++) != txt.charAt(idxT++)) {
						flag = false;
						break;
					}
					if (idxT == txt.length()) {
						if (idxP != ptn.length())
							flag = false;
						break;
					}
				}
				if (flag) {
					cnt++;
//					System.out.println(String.format("idxT, idxP: %d, %d", idxT, idxP));
//					for (int i = 0; i < ptn.length(); i++) {
//						System.out.print(txt.charAt(idxT - ptn.length() + i));
//					}
//					System.out.println();

				}

			}

			System.out.println(String.format("#%d %d", t, cnt));
//			break;
		}

		sc.close();
	}

	public static String input = "1\r\n" + "ti\r\n"
			+ "Starteatingwellwiththeseeighttipsforhealthyeating,whichcoverthebasicsofahealthydietandgoodnutrition\r\n"
			+ "2\r\n" + "ing\r\n"
			+ "Thedoublehelixformsthestructuralbasisofsemi-conservativeDNAreplication.1,2Lessintuitively,italsohasimplicationsontheinformationcontentofDNAfordouble-strandedDNAassuchonlyhasabouthalfthestoragecapacityofsingle-strandedDNA.Thisisbecauseagivensequenceanditsreversecomplement,whilethesameinthedouble-strandedform,aredifferententitiesinsingle-strandedDNA?exceptforthosesequenceswhichareidenticaltotheirreversecomplement\r\n"
			+ "3\r\n" + "th\r\n"
			+ "Lemierresyndromeiscausedbyaninfectionintheoropharyngealregionwithsubsequentthrombophlebitisintheinternaljugularvein.Thethrombusfromthethrombophlebitiscaninvadeothervitalorgans,suchasliver,lungs,orjoints,resultinginsecondaryinfection,whichfurtherexacerbatesthefatalprognosisofthissyndrome.Lemierresyndrome,alsocalledpostanginalsepsisornecrobacillosis,wasfirstreportedbyDr.Lemierrein1936.Inhisreport,Lemierrementionedthatoutof20patientswhosufferedfromthissyndrome,onlytwosurvived.Healsostatedthatallofthe20patientscomplainedofinfectionsinthepalatinetonsilsanddevelopedsepsisandthrombophlebitisintheinternaljugularvein.Oncecalleda\"forgottendisease,\"thissyndromeshowedaveryhighmortalityrateuntilusageofantibioticsbecameprevalent\r\n"
			+ "4\r\n" + "tion\r\n"
			+ "Non-applicationdecreasedshootlengthandreducednumberofunnecessarysecondaryshootsby39%comparedwiththeconventionalrate,notaffectingyieldandweight,color,firmness,andsolublesolidsoffruits.Nosignificantdifferencewasalsofoundintheyieldandthefruitcharacteristicsamongthetreesfertilizedwithdifferentrates.Concentrationsofsolublesugars,starch,N,andKofdormantshootsinMarchofthefollowingyearwerenotsignificantlychangedbythedifferenttreatmentsofthepreviousyear.Therewasnosignificantdifferenceofshootgrowthandyieldamongthetreatmentsthefollowingyearwhenthesamefertilizationratewassuppliedtoallthetrees\r\n"
			+ "5\r\n" + "to\r\n"
			+ "Duetoincreasedinterestincharactercostumes,thefieldofanimationcharactercostumedesignisgraduallydevelopingintoaspecializeddomain.Thecostume-makingprocessforanimationcharacterspresentsmanydifferencesfromthecostume-makingprocessforregularapparel.However,thereremainsinsufficientresearchontheactualprocessofmakingthecharactercostumesusedinstopmotionvideosbothinKoreaandabroad.Thepurposeofthisstudyistoestablishacostumedesignprocessforanimationcharacters.Furthermore,thisstudypresentsacasestudyonthecostumeplanningandmakingprocessfor3Dstopmotionanimationcharacters.Thecharactercostume-makingprocesswassegmentalizedintothefollowingstages:characteranalysisstage,charactermodelingstage,andcharactercostumemakingstage\r\n"
			+ "6\r\n" + "by\r\n"
			+ "InKorea,noinstitutionaltoolorregulationexistsbywhicharetailbusinessinchargeofgatheringandmaintainingsubscriberscanbeguaranteedindependencefromthewholesalebusinessdivisionofafixedincumbentproviderofessentialfacilitiessuchasducts,polesandcopperorfibercables,whichmayalsobeofferingthesameproductstoitsrivals.Forthatreason,awholesaledivisionmayhaveanincentivetointentionallydisruptthesharingoffacilitiesrequestedbycompetitiveoperatorsincooperationwiththeretaildivision.Ultimately,thefacilitysharingprocesswillremaininactivewhenthereisalackofequivalentaccesstothefixedaccessnetwork\r\n"
			+ "7\r\n" + "as\r\n"
			+ "Theaimofthisstudywastofindtypologyoffashion-relatedmobileapplicationsthroughexploratoryinvestigationandtoinvestigatedifferencesinKoreaandU.S.Appstores.Andthen,throughthequalitativeevaluationaboutfashionmobileapplications,thisstudyproposesfashionmobileapplication'sdesignandcontentswhichcanbepreferredbyusers.Byconductingkeywordsearchineachstore,122Koreanapplicationsand150USapplicationswereanalyzed.Empiricalfindingsrevealedthatthereweresevenmajortypesoffashionmobileapplications:brand,magazine,information,SNS,game,shoppingandcoordination.Informationtypeapplicationstookupthelargestportion,andSNSandgametypeapplicationsshowedhigherrankingamongcustomers\r\n"
			+ "8\r\n" + "the\r\n"
			+ "rimaryvaricellainfectionusuellyrunsabenignclinicalcourseinthehelthypopulation.However,hemorrhagicchickenpoxpresentswithaveryextensiveeruptionofhemorrhagicvesiclesinpatientswithdecreaedplateletsorimpairedimmunityandisaccompaniedbysevereconstitutionalsymptoms.A7-year-oldmalewasadmiduetoabdompalpainfor1dayandpeneralizedvesiculareruptionfor5days.Theeruptionfirstappearedonthetrunkandthenspreadtoinvolvedface,scalpandextrsmities.Theskinrashwascompatablewithvaricellabutdespitetheadministrationofacclovirintravenously,thevesiculareruptionbecamehemorrhagic.Tendaysafteradmission,havingexperiencedcardiscarresttwiceandwithhismentalstateincoms,hewasdisehargedashissituationwashopelesa\r\n"
			+ "9\r\n" + "of\r\n"
			+ "Thebookconsistsofthirteenchaptersinfiveparts.InthefirstpartHarmlessdescribessomeofthegeneralandreligiousbackgroundtofourth-andfifth-centuryEgypt,whichhelpstoplacewhatfollowsinabroadercontext.InhissecondparthediscussesAntonyandPachomius,althoughheacknowledgesthatAntonyisnotthehistoricalbeginningofmonasticism.HemovesnexttodiscusstheDesertFathers,exploringsomeofthetexts,characters,themes,locations,andhistories.Thisleadsthewayforreflectionsonthetheologyandworksoftwomonastictheologians,EvagriusPonticusandJohnCassian.Itmayseemoddatfirstglancethatthefinalsectionofthebook(?쁒eflections??shouldaddresstheoriginsofmonasticism,butHarmlessjustifiesthisfromhisexperienceasaneducator;peoplefinditeasiertoengagewithscholarlydiscussionsconcerningmonasticoriginsoncetheyarefamiliarwiththecharacters,texts,andthemes\r\n"
			+ "10\r\n" + "es\r\n"
			+ "Intheinitialstage,domesticgamesbasedonlineconcentratedongamedevelopmentfocusingonincomeforsomegenres.However,variouscontentsfocusingonsmartenvironmentandsocialnetworkareexpandedatpresentandgamematerialsaredevelopedformorevariousobjects.So,thisstudyintendstoexaminenewcategory,positivegame,fromtheaspectofgamedesignerforgameapproachbasedonvariousobjects.And,gameapproachingprocessinthecategorybasedonpleasurewasorganizedfromthestandpointofdesigner,forthedesignerapproachintheprecedentstageofpositivegamedevelopment.Fromtheaspectofdesigner,systemicityofgamecategoryanddesignapproacharenecessarytoexpandwire-wirelessenvironmentandnewenvironmentbasedontheconvergencemediatointeractivecontentsfocusingongames\r\n"
			+ "";

}
