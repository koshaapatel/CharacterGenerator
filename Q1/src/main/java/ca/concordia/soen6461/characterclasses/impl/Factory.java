package ca.concordia.soen6461.characterclasses.impl;

import ca.concordia.soen6461.abilityclasses.ICharisma;
import ca.concordia.soen6461.abilityclasses.IConstitution;
import ca.concordia.soen6461.abilityclasses.IDexterity;
import ca.concordia.soen6461.abilityclasses.IIntelligence;
import ca.concordia.soen6461.abilityclasses.IStrength;
import ca.concordia.soen6461.abilityclasses.IWisdom;
import ca.concordia.soen6461.abilityclasses.impl.AwkwardCharisma;
import ca.concordia.soen6461.abilityclasses.impl.AwkwardDexterity;
import ca.concordia.soen6461.abilityclasses.impl.BurlyStrength;
import ca.concordia.soen6461.abilityclasses.impl.ClumsyDexterity;
import ca.concordia.soen6461.abilityclasses.impl.ConfidenceCharisma;
import ca.concordia.soen6461.abilityclasses.impl.EmpathyWisdom;
import ca.concordia.soen6461.abilityclasses.impl.FitStrength;
import ca.concordia.soen6461.abilityclasses.impl.FoolishWisdom;
import ca.concordia.soen6461.abilityclasses.impl.ForgetfulIntelligence;
import ca.concordia.soen6461.abilityclasses.impl.FrailConstitution;
import ca.concordia.soen6461.abilityclasses.impl.GoodJudgementWisdom;
import ca.concordia.soen6461.abilityclasses.impl.HealthyConstitution;
import ca.concordia.soen6461.abilityclasses.impl.InquisitiveIntelligence;
import ca.concordia.soen6461.abilityclasses.impl.InvincibleConstitution;
import ca.concordia.soen6461.abilityclasses.impl.LeadershipCharisma;
import ca.concordia.soen6461.abilityclasses.impl.ObliviousWisdom;
import ca.concordia.soen6461.abilityclasses.impl.PlumpStrength;
import ca.concordia.soen6461.abilityclasses.impl.ScrawnyStrength;
import ca.concordia.soen6461.abilityclasses.impl.SickConstitution;
import ca.concordia.soen6461.abilityclasses.impl.SimpleIntelligence;
import ca.concordia.soen6461.abilityclasses.impl.SlimDexterity;
import ca.concordia.soen6461.abilityclasses.impl.SneakyDexterity;
import ca.concordia.soen6461.abilityclasses.impl.StrongConstitution;
import ca.concordia.soen6461.abilityclasses.impl.StudiousIntelligence;
import ca.concordia.soen6461.abilityclasses.impl.TimidCharisma;

public class Factory {
	private static class FactoryUniqueInstanceHolder {
		private static Factory THE_UNIQUE_FACTORY = new Factory();
	}

	public static Factory getInstance() {
		return FactoryUniqueInstanceHolder.THE_UNIQUE_FACTORY;
	}
	
	public static Character getCharacter(String getCharacter, IStrength strength, IDexterity dexterity, IConstitution constitution, IIntelligence intelligence, IWisdom wisdom, ICharisma charisma) { 
		getCharacter=getCharacter.toLowerCase();
		Character character=null;
		if(getCharacter=="ranger") {
			character=new Ranger(strength, dexterity, constitution, intelligence, wisdom, charisma);
		}else if(getCharacter=="barbarian") {
			character=new Barbarian(strength, dexterity, constitution, intelligence, wisdom, charisma);
		}
		else if(getCharacter=="druid") {
			character=new Druid(strength, dexterity, constitution, intelligence, wisdom, charisma);
		}
		else if(getCharacter=="wizard") {
			character=new Wizard(strength, dexterity, constitution, intelligence, wisdom, charisma);
		}
		return character;
	}
	
	public static IStrength getStrength(String getStrength) { 
		getStrength=getStrength.toLowerCase();
		IStrength strength=null;
		if(getStrength=="burly") {
			strength=new BurlyStrength();
		}else if(getStrength=="fit") {
			strength=new FitStrength();
		}
		else if(getStrength=="scrawny") {
			strength=new ScrawnyStrength();
		}
		else if(getStrength=="plump") {
			strength=new PlumpStrength();
		}
		return strength;
	}
	
	public static IDexterity getDexterity(String getDexterity) { 
		getDexterity=getDexterity.toLowerCase();
		IDexterity dexterity=null;
		if(getDexterity=="slim") {
			dexterity=new SlimDexterity();
		}else if(getDexterity=="sneaky") {
			dexterity=new SneakyDexterity();
		}
		else if(getDexterity=="awkward") {
			dexterity=new AwkwardDexterity();
		}
		else if(getDexterity=="clumsy") {
			dexterity=new ClumsyDexterity();
		}
		return dexterity;
	}
	
	public static IConstitution getConstitution(String getConstitution) {
		getConstitution=getConstitution.toLowerCase();
		IConstitution constitution=null;
		if(getConstitution=="strong") {
			constitution=new StrongConstitution();
		}else if(getConstitution=="healthy") {
			constitution=new HealthyConstitution();
		}
		else if(getConstitution=="frail") {
			constitution=new FrailConstitution();
		}
		else if(getConstitution=="sick") {
			constitution=new SickConstitution();
		}
		else if(getConstitution=="invincible") {
			constitution=new InvincibleConstitution();
		}
		return constitution;
	}
	
	public static IIntelligence getIntelligence(String getIntelligence) {
		getIntelligence=getIntelligence.toLowerCase();
		IIntelligence intelligence=null;
		if(getIntelligence=="inquisitive") {
			intelligence=new InquisitiveIntelligence();
		}else if(getIntelligence=="studious") {
			intelligence=new StudiousIntelligence();
		}
		else if(getIntelligence=="simple") {
			intelligence=new SimpleIntelligence();
		}
		else if(getIntelligence=="forgetful") {
			intelligence=new ForgetfulIntelligence();
		}
		return intelligence;
	}
	
	public static IWisdom getWisdom(String getWisdom) { 
		getWisdom=getWisdom.toLowerCase();
		IWisdom wisdom=null;
		if(getWisdom=="good judgement") {
			wisdom=new GoodJudgementWisdom();
		}else if(getWisdom=="empathy") {
			wisdom=new EmpathyWisdom();
		}
		else if(getWisdom=="foolish") {
			wisdom=new FoolishWisdom();
		}
		else if(getWisdom=="oblivious") {
			wisdom=new ObliviousWisdom();
		}
		return wisdom;
	}
	
	public static ICharisma getCharisma(String getCharisma) {
		getCharisma=getCharisma.toLowerCase();
		ICharisma charisma=null;
		if(getCharisma=="leadership") {
			charisma=new LeadershipCharisma();
		}else if(getCharisma=="confidence") {
			charisma=new ConfidenceCharisma();
		}
		else if(getCharisma=="timid") {
			charisma=new TimidCharisma();
		}
		else if(getCharisma=="awkward") {
			charisma=new AwkwardCharisma();
		}
		return charisma;
	}

}
