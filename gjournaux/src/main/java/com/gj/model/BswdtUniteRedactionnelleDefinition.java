package com.gj.model;

// Generated 4 mars 2014 09:23:20 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;



/**
 * BswdtUniteRedactionnelleDefinition generated by hbm2java
 */
public class BswdtUniteRedactionnelleDefinition  {

	private Integer idUniteRedactionnelleDefinition;
	private BswdtModelPage bswdtModelPage;
	private String type;
	private String numero;
	private int nombreSigneTexte;
	private int nombreSigneTitre;
	private Float largeur;
	private Float hauteur;
	private Boolean modifiable;
	private String reference;
	private boolean miseEnPage;
	private Integer margeBasse;
	private Integer margeHaute;
	private int nombreSigneSurTitre;
	private int nombreSigneEncadrerUn;
	private int nombreSigneEncadrerDeux;
	private int nombreSigneEncadrerTrois;
	private int nombreSigneEncadrerQuatre;
	private int margeHauteTitre;
	private int margeBasseTitre;
	private int nombreSigneChapo;
	private Integer signeMinChapo;
	private Integer signeMaxChapo;
	private int nombreSigneExergue;
	private int signeMinExergue;
	private int signeMaxExergue;
	private int nombreSigneLegende;
	private int nombreSigneCredit;
	private Set<BswdtUniteRedactionnelle> bswdtUniteRedactionnelles = new HashSet<BswdtUniteRedactionnelle>(
			0);

	public BswdtUniteRedactionnelleDefinition() {
	}

	public BswdtUniteRedactionnelleDefinition(int nombreSigneTexte,
			int nombreSigneTitre, boolean miseEnPage, int nombreSigneSurTitre,
			int nombreSigneEncadrerUn, int nombreSigneEncadrerDeux,
			int nombreSigneEncadrerTrois, int nombreSigneEncadrerQuatre,
			int margeHauteTitre, int margeBasseTitre, int nombreSigneChapo,
			int nombreSigneExergue, int signeMinExergue, int signeMaxExergue,
			int nombreSigneLegende, int nombreSigneCredit) {
		this.nombreSigneTexte = nombreSigneTexte;
		this.nombreSigneTitre = nombreSigneTitre;
		this.miseEnPage = miseEnPage;
		this.nombreSigneSurTitre = nombreSigneSurTitre;
		this.nombreSigneEncadrerUn = nombreSigneEncadrerUn;
		this.nombreSigneEncadrerDeux = nombreSigneEncadrerDeux;
		this.nombreSigneEncadrerTrois = nombreSigneEncadrerTrois;
		this.nombreSigneEncadrerQuatre = nombreSigneEncadrerQuatre;
		this.margeHauteTitre = margeHauteTitre;
		this.margeBasseTitre = margeBasseTitre;
		this.nombreSigneChapo = nombreSigneChapo;
		this.nombreSigneExergue = nombreSigneExergue;
		this.signeMinExergue = signeMinExergue;
		this.signeMaxExergue = signeMaxExergue;
		this.nombreSigneLegende = nombreSigneLegende;
		this.nombreSigneCredit = nombreSigneCredit;
	}

	public BswdtUniteRedactionnelleDefinition(BswdtModelPage bswdtModelPage,
			String type, String numero, int nombreSigneTexte,
			int nombreSigneTitre, Float largeur, Float hauteur,
			Boolean modifiable, String reference, boolean miseEnPage,
			Integer margeBasse, Integer margeHaute, int nombreSigneSurTitre,
			int nombreSigneEncadrerUn, int nombreSigneEncadrerDeux,
			int nombreSigneEncadrerTrois, int nombreSigneEncadrerQuatre,
			int margeHauteTitre, int margeBasseTitre, int nombreSigneChapo,
			Integer signeMinChapo, Integer signeMaxChapo,
			int nombreSigneExergue, int signeMinExergue, int signeMaxExergue,
			int nombreSigneLegende, int nombreSigneCredit,
			Set<BswdtUniteRedactionnelle> bswdtUniteRedactionnelles) {
		this.bswdtModelPage = bswdtModelPage;
		this.type = type;
		this.numero = numero;
		this.nombreSigneTexte = nombreSigneTexte;
		this.nombreSigneTitre = nombreSigneTitre;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.modifiable = modifiable;
		this.reference = reference;
		this.miseEnPage = miseEnPage;
		this.margeBasse = margeBasse;
		this.margeHaute = margeHaute;
		this.nombreSigneSurTitre = nombreSigneSurTitre;
		this.nombreSigneEncadrerUn = nombreSigneEncadrerUn;
		this.nombreSigneEncadrerDeux = nombreSigneEncadrerDeux;
		this.nombreSigneEncadrerTrois = nombreSigneEncadrerTrois;
		this.nombreSigneEncadrerQuatre = nombreSigneEncadrerQuatre;
		this.margeHauteTitre = margeHauteTitre;
		this.margeBasseTitre = margeBasseTitre;
		this.nombreSigneChapo = nombreSigneChapo;
		this.signeMinChapo = signeMinChapo;
		this.signeMaxChapo = signeMaxChapo;
		this.nombreSigneExergue = nombreSigneExergue;
		this.signeMinExergue = signeMinExergue;
		this.signeMaxExergue = signeMaxExergue;
		this.nombreSigneLegende = nombreSigneLegende;
		this.nombreSigneCredit = nombreSigneCredit;
		this.bswdtUniteRedactionnelles = bswdtUniteRedactionnelles;
	}

	public Integer getIdUniteRedactionnelleDefinition() {
		return this.idUniteRedactionnelleDefinition;
	}

	public void setIdUniteRedactionnelleDefinition(
			Integer idUniteRedactionnelleDefinition) {
		this.idUniteRedactionnelleDefinition = idUniteRedactionnelleDefinition;
	}

	public BswdtModelPage getBswdtModelPage() {
		return this.bswdtModelPage;
	}

	public void setBswdtModelPage(BswdtModelPage bswdtModelPage) {
		this.bswdtModelPage = bswdtModelPage;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getNombreSigneTexte() {
		return this.nombreSigneTexte;
	}

	public void setNombreSigneTexte(int nombreSigneTexte) {
		this.nombreSigneTexte = nombreSigneTexte;
	}

	public int getNombreSigneTitre() {
		return this.nombreSigneTitre;
	}

	public void setNombreSigneTitre(int nombreSigneTitre) {
		this.nombreSigneTitre = nombreSigneTitre;
	}

	public Float getLargeur() {
		return this.largeur;
	}

	public void setLargeur(Float largeur) {
		this.largeur = largeur;
	}

	public Float getHauteur() {
		return this.hauteur;
	}

	public void setHauteur(Float hauteur) {
		this.hauteur = hauteur;
	}

	public Boolean getModifiable() {
		return this.modifiable;
	}

	public void setModifiable(Boolean modifiable) {
		this.modifiable = modifiable;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public boolean isMiseEnPage() {
		return this.miseEnPage;
	}

	public void setMiseEnPage(boolean miseEnPage) {
		this.miseEnPage = miseEnPage;
	}

	public Integer getMargeBasse() {
		return this.margeBasse;
	}

	public void setMargeBasse(Integer margeBasse) {
		this.margeBasse = margeBasse;
	}

	public Integer getMargeHaute() {
		return this.margeHaute;
	}

	public void setMargeHaute(Integer margeHaute) {
		this.margeHaute = margeHaute;
	}

	public int getNombreSigneSurTitre() {
		return this.nombreSigneSurTitre;
	}

	public void setNombreSigneSurTitre(int nombreSigneSurTitre) {
		this.nombreSigneSurTitre = nombreSigneSurTitre;
	}

	public int getNombreSigneEncadrerUn() {
		return this.nombreSigneEncadrerUn;
	}

	public void setNombreSigneEncadrerUn(int nombreSigneEncadrerUn) {
		this.nombreSigneEncadrerUn = nombreSigneEncadrerUn;
	}

	public int getNombreSigneEncadrerDeux() {
		return this.nombreSigneEncadrerDeux;
	}

	public void setNombreSigneEncadrerDeux(int nombreSigneEncadrerDeux) {
		this.nombreSigneEncadrerDeux = nombreSigneEncadrerDeux;
	}

	public int getNombreSigneEncadrerTrois() {
		return this.nombreSigneEncadrerTrois;
	}

	public void setNombreSigneEncadrerTrois(int nombreSigneEncadrerTrois) {
		this.nombreSigneEncadrerTrois = nombreSigneEncadrerTrois;
	}

	public int getNombreSigneEncadrerQuatre() {
		return this.nombreSigneEncadrerQuatre;
	}

	public void setNombreSigneEncadrerQuatre(int nombreSigneEncadrerQuatre) {
		this.nombreSigneEncadrerQuatre = nombreSigneEncadrerQuatre;
	}

	public int getMargeHauteTitre() {
		return this.margeHauteTitre;
	}

	public void setMargeHauteTitre(int margeHauteTitre) {
		this.margeHauteTitre = margeHauteTitre;
	}

	public int getMargeBasseTitre() {
		return this.margeBasseTitre;
	}

	public void setMargeBasseTitre(int margeBasseTitre) {
		this.margeBasseTitre = margeBasseTitre;
	}

	public int getNombreSigneChapo() {
		return this.nombreSigneChapo;
	}

	public void setNombreSigneChapo(int nombreSigneChapo) {
		this.nombreSigneChapo = nombreSigneChapo;
	}

	public Integer getSigneMinChapo() {
		return this.signeMinChapo;
	}

	public void setSigneMinChapo(Integer signeMinChapo) {
		this.signeMinChapo = signeMinChapo;
	}

	public Integer getSigneMaxChapo() {
		return this.signeMaxChapo;
	}

	public void setSigneMaxChapo(Integer signeMaxChapo) {
		this.signeMaxChapo = signeMaxChapo;
	}

	public int getNombreSigneExergue() {
		return this.nombreSigneExergue;
	}

	public void setNombreSigneExergue(int nombreSigneExergue) {
		this.nombreSigneExergue = nombreSigneExergue;
	}

	public int getSigneMinExergue() {
		return this.signeMinExergue;
	}

	public void setSigneMinExergue(int signeMinExergue) {
		this.signeMinExergue = signeMinExergue;
	}

	public int getSigneMaxExergue() {
		return this.signeMaxExergue;
	}

	public void setSigneMaxExergue(int signeMaxExergue) {
		this.signeMaxExergue = signeMaxExergue;
	}

	public int getNombreSigneLegende() {
		return this.nombreSigneLegende;
	}

	public void setNombreSigneLegende(int nombreSigneLegende) {
		this.nombreSigneLegende = nombreSigneLegende;
	}

	public int getNombreSigneCredit() {
		return this.nombreSigneCredit;
	}

	public void setNombreSigneCredit(int nombreSigneCredit) {
		this.nombreSigneCredit = nombreSigneCredit;
	}

	public Set<BswdtUniteRedactionnelle> getBswdtUniteRedactionnelles() {
		return this.bswdtUniteRedactionnelles;
	}

	public void setBswdtUniteRedactionnelles(
			Set<BswdtUniteRedactionnelle> bswdtUniteRedactionnelles) {
		this.bswdtUniteRedactionnelles = bswdtUniteRedactionnelles;
	}

}