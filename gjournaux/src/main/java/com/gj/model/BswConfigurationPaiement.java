package com.gj.model;
import java.util.HashSet;
import java.util.Set;



/**
 * BswConfigurationPaiement generated by hbm2java
 */
public class BswConfigurationPaiement   {

	private Integer idReferenceSystemeBancaire;
	private BswJournal bswJournal;
	private boolean globalEnProd;
	private String globalInterfaceBancaire;
	private String globalDevise;
	private String globalDeviseLettre;
	private String globalLangue;
	private String globalEmailMarchand;
	private String globalUnixPathLogFile;
	private String atosIdentifiantMarchandTest;
	private String atosNomLogoMarchand;
	private String atosIdentifiantMarchand;
	private String atosUrlNormalReturn;
	private String atosUrlCancelReturn;
	private String atosUrlAutomaticResponse;
	private String atosUnixPathFolderBinaires;
	private String atosUnixPathFile;
	private String spplusUrlRetour;
	private String spplusUrlCgiHmac;
	private String cybermutSociete;
	private String cybermutUrlbankTest;
	private String cybermutUrlbank;
	private String cybermutUrlRetourOk;
	private String cybermutUrlRetourKo;
	private String cybermutPassPhrase;
	private String cybermutTpe;
	private String cybermutKey;
	private String urlFormulaireAbonnementParCourrier;
	private Set<BswModePaiement> bswModePaiements = new HashSet<BswModePaiement>(
			0);

	public BswConfigurationPaiement() {
	}

	public BswConfigurationPaiement(BswJournal bswJournal,
			boolean globalEnProd, String globalDevise,
			String globalDeviseLettre, String globalLangue,
			String globalEmailMarchand) {
		this.bswJournal = bswJournal;
		this.globalEnProd = globalEnProd;
		this.globalDevise = globalDevise;
		this.globalDeviseLettre = globalDeviseLettre;
		this.globalLangue = globalLangue;
		this.globalEmailMarchand = globalEmailMarchand;
	}

	public BswConfigurationPaiement(BswJournal bswJournal,
			boolean globalEnProd, String globalInterfaceBancaire,
			String globalDevise, String globalDeviseLettre,
			String globalLangue, String globalEmailMarchand,
			String globalUnixPathLogFile, String atosIdentifiantMarchandTest,
			String atosNomLogoMarchand, String atosIdentifiantMarchand,
			String atosUrlNormalReturn, String atosUrlCancelReturn,
			String atosUrlAutomaticResponse, String atosUnixPathFolderBinaires,
			String atosUnixPathFile, String spplusUrlRetour,
			String spplusUrlCgiHmac, String cybermutSociete,
			String cybermutUrlbankTest, String cybermutUrlbank,
			String cybermutUrlRetourOk, String cybermutUrlRetourKo,
			String cybermutPassPhrase, String cybermutTpe, String cybermutKey,
			String urlFormulaireAbonnementParCourrier,
			Set<BswModePaiement> bswModePaiements) {
		this.bswJournal = bswJournal;
		this.globalEnProd = globalEnProd;
		this.globalInterfaceBancaire = globalInterfaceBancaire;
		this.globalDevise = globalDevise;
		this.globalDeviseLettre = globalDeviseLettre;
		this.globalLangue = globalLangue;
		this.globalEmailMarchand = globalEmailMarchand;
		this.globalUnixPathLogFile = globalUnixPathLogFile;
		this.atosIdentifiantMarchandTest = atosIdentifiantMarchandTest;
		this.atosNomLogoMarchand = atosNomLogoMarchand;
		this.atosIdentifiantMarchand = atosIdentifiantMarchand;
		this.atosUrlNormalReturn = atosUrlNormalReturn;
		this.atosUrlCancelReturn = atosUrlCancelReturn;
		this.atosUrlAutomaticResponse = atosUrlAutomaticResponse;
		this.atosUnixPathFolderBinaires = atosUnixPathFolderBinaires;
		this.atosUnixPathFile = atosUnixPathFile;
		this.spplusUrlRetour = spplusUrlRetour;
		this.spplusUrlCgiHmac = spplusUrlCgiHmac;
		this.cybermutSociete = cybermutSociete;
		this.cybermutUrlbankTest = cybermutUrlbankTest;
		this.cybermutUrlbank = cybermutUrlbank;
		this.cybermutUrlRetourOk = cybermutUrlRetourOk;
		this.cybermutUrlRetourKo = cybermutUrlRetourKo;
		this.cybermutPassPhrase = cybermutPassPhrase;
		this.cybermutTpe = cybermutTpe;
		this.cybermutKey = cybermutKey;
		this.urlFormulaireAbonnementParCourrier = urlFormulaireAbonnementParCourrier;
		this.bswModePaiements = bswModePaiements;
	}

	public Integer getIdReferenceSystemeBancaire() {
		return this.idReferenceSystemeBancaire;
	}

	public void setIdReferenceSystemeBancaire(Integer idReferenceSystemeBancaire) {
		this.idReferenceSystemeBancaire = idReferenceSystemeBancaire;
	}

	public BswJournal getBswJournal() {
		return this.bswJournal;
	}

	public void setBswJournal(BswJournal bswJournal) {
		this.bswJournal = bswJournal;
	}

	public boolean isGlobalEnProd() {
		return this.globalEnProd;
	}

	public void setGlobalEnProd(boolean globalEnProd) {
		this.globalEnProd = globalEnProd;
	}

	public String getGlobalInterfaceBancaire() {
		return this.globalInterfaceBancaire;
	}

	public void setGlobalInterfaceBancaire(String globalInterfaceBancaire) {
		this.globalInterfaceBancaire = globalInterfaceBancaire;
	}

	public String getGlobalDevise() {
		return this.globalDevise;
	}

	public void setGlobalDevise(String globalDevise) {
		this.globalDevise = globalDevise;
	}

	public String getGlobalDeviseLettre() {
		return this.globalDeviseLettre;
	}

	public void setGlobalDeviseLettre(String globalDeviseLettre) {
		this.globalDeviseLettre = globalDeviseLettre;
	}

	public String getGlobalLangue() {
		return this.globalLangue;
	}

	public void setGlobalLangue(String globalLangue) {
		this.globalLangue = globalLangue;
	}

	public String getGlobalEmailMarchand() {
		return this.globalEmailMarchand;
	}

	public void setGlobalEmailMarchand(String globalEmailMarchand) {
		this.globalEmailMarchand = globalEmailMarchand;
	}

	public String getGlobalUnixPathLogFile() {
		return this.globalUnixPathLogFile;
	}

	public void setGlobalUnixPathLogFile(String globalUnixPathLogFile) {
		this.globalUnixPathLogFile = globalUnixPathLogFile;
	}

	public String getAtosIdentifiantMarchandTest() {
		return this.atosIdentifiantMarchandTest;
	}

	public void setAtosIdentifiantMarchandTest(
			String atosIdentifiantMarchandTest) {
		this.atosIdentifiantMarchandTest = atosIdentifiantMarchandTest;
	}

	public String getAtosNomLogoMarchand() {
		return this.atosNomLogoMarchand;
	}

	public void setAtosNomLogoMarchand(String atosNomLogoMarchand) {
		this.atosNomLogoMarchand = atosNomLogoMarchand;
	}

	public String getAtosIdentifiantMarchand() {
		return this.atosIdentifiantMarchand;
	}

	public void setAtosIdentifiantMarchand(String atosIdentifiantMarchand) {
		this.atosIdentifiantMarchand = atosIdentifiantMarchand;
	}

	public String getAtosUrlNormalReturn() {
		return this.atosUrlNormalReturn;
	}

	public void setAtosUrlNormalReturn(String atosUrlNormalReturn) {
		this.atosUrlNormalReturn = atosUrlNormalReturn;
	}

	public String getAtosUrlCancelReturn() {
		return this.atosUrlCancelReturn;
	}

	public void setAtosUrlCancelReturn(String atosUrlCancelReturn) {
		this.atosUrlCancelReturn = atosUrlCancelReturn;
	}

	public String getAtosUrlAutomaticResponse() {
		return this.atosUrlAutomaticResponse;
	}

	public void setAtosUrlAutomaticResponse(String atosUrlAutomaticResponse) {
		this.atosUrlAutomaticResponse = atosUrlAutomaticResponse;
	}

	public String getAtosUnixPathFolderBinaires() {
		return this.atosUnixPathFolderBinaires;
	}

	public void setAtosUnixPathFolderBinaires(String atosUnixPathFolderBinaires) {
		this.atosUnixPathFolderBinaires = atosUnixPathFolderBinaires;
	}

	public String getAtosUnixPathFile() {
		return this.atosUnixPathFile;
	}

	public void setAtosUnixPathFile(String atosUnixPathFile) {
		this.atosUnixPathFile = atosUnixPathFile;
	}

	public String getSpplusUrlRetour() {
		return this.spplusUrlRetour;
	}

	public void setSpplusUrlRetour(String spplusUrlRetour) {
		this.spplusUrlRetour = spplusUrlRetour;
	}

	public String getSpplusUrlCgiHmac() {
		return this.spplusUrlCgiHmac;
	}

	public void setSpplusUrlCgiHmac(String spplusUrlCgiHmac) {
		this.spplusUrlCgiHmac = spplusUrlCgiHmac;
	}

	public String getCybermutSociete() {
		return this.cybermutSociete;
	}

	public void setCybermutSociete(String cybermutSociete) {
		this.cybermutSociete = cybermutSociete;
	}

	public String getCybermutUrlbankTest() {
		return this.cybermutUrlbankTest;
	}

	public void setCybermutUrlbankTest(String cybermutUrlbankTest) {
		this.cybermutUrlbankTest = cybermutUrlbankTest;
	}

	public String getCybermutUrlbank() {
		return this.cybermutUrlbank;
	}

	public void setCybermutUrlbank(String cybermutUrlbank) {
		this.cybermutUrlbank = cybermutUrlbank;
	}

	public String getCybermutUrlRetourOk() {
		return this.cybermutUrlRetourOk;
	}

	public void setCybermutUrlRetourOk(String cybermutUrlRetourOk) {
		this.cybermutUrlRetourOk = cybermutUrlRetourOk;
	}

	public String getCybermutUrlRetourKo() {
		return this.cybermutUrlRetourKo;
	}

	public void setCybermutUrlRetourKo(String cybermutUrlRetourKo) {
		this.cybermutUrlRetourKo = cybermutUrlRetourKo;
	}

	public String getCybermutPassPhrase() {
		return this.cybermutPassPhrase;
	}

	public void setCybermutPassPhrase(String cybermutPassPhrase) {
		this.cybermutPassPhrase = cybermutPassPhrase;
	}

	public String getCybermutTpe() {
		return this.cybermutTpe;
	}

	public void setCybermutTpe(String cybermutTpe) {
		this.cybermutTpe = cybermutTpe;
	}

	public String getCybermutKey() {
		return this.cybermutKey;
	}

	public void setCybermutKey(String cybermutKey) {
		this.cybermutKey = cybermutKey;
	}

	public String getUrlFormulaireAbonnementParCourrier() {
		return this.urlFormulaireAbonnementParCourrier;
	}

	public void setUrlFormulaireAbonnementParCourrier(
			String urlFormulaireAbonnementParCourrier) {
		this.urlFormulaireAbonnementParCourrier = urlFormulaireAbonnementParCourrier;
	}

	public Set<BswModePaiement> getBswModePaiements() {
		return this.bswModePaiements;
	}

	public void setBswModePaiements(Set<BswModePaiement> bswModePaiements) {
		this.bswModePaiements = bswModePaiements;
	}

}
